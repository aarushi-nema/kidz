//AJAX Utility function
function get_request_object()
{
    if(window.XMLHttpRequest)
        return new XMLHttpRequest();
    else if(window.ActiveXObject)
        return new ActiveXObject("Microsoft.XMLHTTP");
}

//Generic AJAX request handler - used in many places
var framework = new Object();
framework.ajax_handler = function(url, onsuccess, params, method, async, onerror) {
    this.url = url;
    this.req = get_request_object();
    this.onsuccess = (onsuccess) ? onsuccess : this.onsuccess_default;
    this.params = (params) ? params : null;
    this.method = (method) ? method : "GET";
    this.async = (async == null) ? true : async;
    this.onerror = (onerror) ? onerror : this.onerror_default;
}

framework.ajax_handler.prototype.send = function() {
    try
    {
        var handler = this;
        this.req.onreadystatechange = function () {
            handler.onready_state.call(handler);
        }
        this.req.open(this.method, this.url, this.async);
        if(this.method == "POST") {
            this.req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
    
        }
        //Hack to avoid IE caching issue
        this.req.setRequestHeader("If-Modified-Since", new Date(0));
        this.req.send(this.params);
    }
    catch(err)
    {
        this.onerror.call(this);
    }
}

framework.ajax_handler.prototype.onready_state = function() {
    if(this.req.readyState == 4)
    {
        try
        {
            this.req.status;
            //In IE, on network error, status is greater than 12000
            //Refer http://msdn.microsoft.com/en-us/library/aa385465.aspx
            switch(this.req.status)
            {
                case 0:     //In Mozilla - network error
                case 12002: //The request has timed out.
                case 12007: //The server name could not be resolved.
                case 12029: //The attempt to connect to the server failed.
                case 12030: //The connection with the server has been terminated.
                case 12031: //The connection with the server has been reset.
                case 12152: //The server response could not be parsed.
                case 12159: //The required protocol stack is not loaded and the application cannot start WinSock.
                    throw "";
            }
        }
        catch(err)
        {
            this.req.abort();
            return;
        }
        if(this.req.status == 200 || this.req.status == 0)
        {
            var result = JSON.parse(this.req.responseText);
            this.onsuccess.call(this, result);
        }
        else
            this.onerror.call(this);
    }
}

framework.ajax_handler.prototype.onsuccess_default = function() {
}

framework.ajax_handler.prototype.onerror_default = function() {
    this.req.abort();
}