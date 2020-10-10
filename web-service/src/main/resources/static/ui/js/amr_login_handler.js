/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
LoginHandler = new function() {
    this.previous_url = null;
    this.callback = function(response) {
        if (response.errCode == 0) {
            if (this.previous_url != null) {
                window.location =  this.previous_url;                                
            } else {
                var baseurl = window.location.protocol+"//"+window.location.hostname;
                if (window.location.port != 80) {
                    baseurl = baseurl + ":"+ window.location.port;
                }
                document.cookie = "session_id="+response.resource[0].session_id+";path=/";
                if(response.resource[0].type == "SIMULATOR"){
                    baseurl =   baseurl +"/ui/simulator";
                } else{
                    baseurl =   baseurl +"/ui/dashboard";
                }
                window.location =  baseurl;
            }
        } else {
        		alert(response.message);
        } 
    }
    
    this.call = function() {
    	if (!validation())
    		return false;
        var baseurl = window.location.protocol+"//"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+"/api/login";
        var parameters= "";
        var resource = {};
        
        var field = document.getElementById("username");
        if (field && field.value != null) {
        	resource.email_id = field.value;
        }
        field = document.getElementById("password");
        if (field && field.value != null) {
            resource.password = field.value;
        }
        var resource_string = Base64.encode(JSON.stringify(resource));
        resource_string = resource_string.replace(/\&/g, "%26").replace(/\+/g, "%2B").replace(/%/g, "%25");
        parameters= "resource="+resource_string;
        var handler = new framework.ajax_handler(url, this.callback, parameters, "POST");
        handler.send();
        return false;
    }
    this.call_ci_register = function() {
    	if (!validation())
    		return false;
        var baseurl = window.location.protocol+"//"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+"/c4t/ci_register";
        var parameters= "";
        var resource = {};
        var field = document.getElementById("email_id");
        if (field && field.value != null) {
        	resource.email_id = field.value;
        }
        field = document.getElementById("mobile_no");
        if (field && field.value != null) {
        	resource.mobile_no = field.value;
        }
        field = document.getElementById("name");
        if (field && field.value != null) {
        	resource.name = field.value;
        } 
        field = document.getElementById("r_password");
        if (field && field.value != null) {
            resource.password = field.value;
        }
        var resource_string = Base64.encode(JSON.stringify(resource));
        resource_string = resource_string.replace(/\&/g, "%26").replace(/\+/g, "%2B").replace(/%/g, "%25");
        parameters= "resource="+resource_string;
        var handler = new framework.ajax_handler(url, this.register_callback, parameters, "POST");
        handler.send();
        return false;
    }
    
    this.register_callback = function(response) {
        if (response.errCode == 0) {
        	alert("Successfully Register the Institute....");
            if (this.previous_url != null) {
                window.location =  this.previous_url;                                
            } else {
                var baseurl = window.location.protocol+"//"+window.location.hostname;
                if (window.location.port != 80) {
                    baseurl = baseurl + ":"+ window.location.port;
                }
                
                window.location =  baseurl;
            }
        }  else {
        	alert(response.message);
        }     
    }
    
    this.mcall = function() {
    	
        var baseurl = window.location.protocol+"//"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+"/c4t/login";
        var parameters= "";
        var resource = {};
        
        var field = document.getElementById("username");
        if (field && field.value != null) {
        	resource.email_id = field.value;
        }
        field = document.getElementById("password");
        if (field && field.value != null) {
            resource.password = field.value;
        }
        var resource_string = Base64.encode(JSON.stringify(resource));
        resource_string = resource_string.replace(/\&/g, "%26").replace(/\+/g, "%2B").replace(/%/g, "%25");
        parameters= "resource="+resource_string;
        var handler = new framework.ajax_handler(url, this.mcallback, parameters, "POST");
        handler.send();
        return false;
    }
    
     this.mcallback = function(response) {
        if (response.errCode == 0) {
            if (this.previous_url != null) {
                window.location =  this.previous_url;                                
            } else {
                var baseurl = window.location.protocol+"//"+window.location.hostname;
                if (window.location.port != 80) {
         		  baseurl = baseurl + ":"+ window.location.port;
        		}
            	baseurl =   baseurl +"/ui/m_home";
                window.location =  baseurl;
            }
        } else {
        	alert(response.message);
        }
    }
    
}