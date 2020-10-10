/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
ActionHandler = new function() {
    this.previous_url = null;
    this.callback_url = null;
    this.callback = 
    
    this.call = function(curl,id,action) {
    	var baseurl = "http://"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+curl;
        var parameters= "";
        var resource = {};
        resource.id = id;
        var resource_string = Base64.encode(JSON.stringify(resource));
        resource_string = resource_string.replace(/\&/g, "%26").replace(/\+/g, "%2B").replace(/%/g, "%25");
        parameters= "resource="+resource_string+"&action="+action;
        var handler = new framework.ajax_handler(url, function(response) {
            if (response.errCode == 0) {
            	alert("SuccessFully sent Request");
            } else {
                alert(response.message);
            } 
        }, parameters, "POST");
        handler.send();
        return false;
    };
    
    this.callResource = function(curl,resource,action) {
    	var baseurl = "http://"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+curl;
        var parameters= "";
        var resource_string = Base64.encode(JSON.stringify(resource));
        resource_string = resource_string.replace(/\&/g, "%26").replace(/\+/g, "%2B").replace(/%/g, "%25");
        parameters= "resource="+resource_string+"&action="+action;
        var handler = new framework.ajax_handler(url, function(response) {
            if (response.errCode == 0) {
            	alert("SuccessFully sent Request");
            } else {
                alert(response.message);
            } 
        }, parameters, "POST");
        handler.send();
        return false;
    }
    
    this.callDelete = function(curl,id,return_url) {
    	var r = confirm("Confirm for delete ?");
    	if (r == false) {
    	   return false;
    	}
    	var baseurl = "http://"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+curl;
        var parameters= "";
        var resource = {};
        resource.id = id;
        var resource_string = Base64.encode(JSON.stringify(resource));
        resource_string = resource_string.replace(/\&/g, "%26").replace(/\+/g, "%2B").replace(/%/g, "%25");
        parameters= "resource="+resource_string+"&action=DELETE";
        var _return_url = return_url;
        var handler = new framework.ajax_handler(url, function(response) {
            if (response.errCode == 0) {
            	if (_return_url == null) {
            		window.location.reload();
            	} else {
            		window.location = baseurl + _return_url;
            	}
            } else {
                alert(response.message);
            } 
        }, parameters, "POST");
        handler.send();
        return false;
    }
}