/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
ArrivalEntryHandler = new function() {
    this.previous_url = null;
    this.onion_arrival_submit_call = function() {
    	
        var baseurl = "http://"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+"/c4t/community";
        var parameters= "";
        var resource = {}; 
        
        var field = document.getElementById("onion_community_id");
        if (field && field.value != null) {
        	resource.id = field.value;
        }
               
        var field = document.getElementById("onion_arrivals");
        if (field && field.value != null) {
        	resource.onion_arrivals = field.value;
        }
        var field = document.getElementById("onion_unsold");
        if (field && field.value != null) {
        	resource.onion_unsold = field.value;
        }
        
        var field = document.getElementById("onion_min_rate");
        if (field && field.value != null) {
        	resource.onion_min_rate = field.value;
        }
        
         var field = document.getElementById("onion_max_rate");
        if (field && field.value != null) {
        	resource.onion_max_rate = field.value;
        }
        
        var resource_string = Base64.encode(JSON.stringify(resource));
        resource_string = resource_string.replace(/\&/g, "%26").replace(/\+/g, "%2B").replace(/%/g, "%25");
        parameters= "resource="+resource_string+"&action=UPDATE_ONION_ARRIVAL_ENTRIES";
        var handler = new framework.ajax_handler(url, this.onion_arrival_submit_callback, parameters, "POST");
        handler.send();
        return false;
    }
    
     this.onion_arrival_submit_callback = function(response) {
        if (response.errCode == 0) {
            if (this.previous_url != null) {
                window.location =  this.previous_url;                                
            } else {
               alert("Successfully Saved entries");
            }
        } else {
        	alert(response.message);
        }
    }
    
    this.potato_arrival_submit_call = function() {
    	
        var baseurl = "http://"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+"/c4t/community";
        var parameters= "";
        var resource = {};        
        
        var field = document.getElementById("potato_community_id");
        if (field && field.value != null) {
        	resource.id = field.value;
        }
        
        var field = document.getElementById("potato_arrivals");
        if (field && field.value != null) {
        	resource.onion_arrivals = field.value;
        }
        var field = document.getElementById("potato_unsold");
        if (field && field.value != null) {
        	resource.onion_unsold = field.value;
        }
        
        var field = document.getElementById("potato_min_rate");
        if (field && field.value != null) {
        	resource.onion_min_rate = field.value;
        }
        
         var field = document.getElementById("potato_max_rate");
        if (field && field.value != null) {
        	resource.onion_max_rate = field.value;
        }
        
        var resource_string = Base64.encode(JSON.stringify(resource));
        resource_string = resource_string.replace(/\&/g, "%26").replace(/\+/g, "%2B").replace(/%/g, "%25");
        parameters= "resource="+resource_string+"&action=UPDATE_POTATO_ARRIVAL_ENTRIES";
        var handler = new framework.ajax_handler(url, this.potato_arrival_submit_callback, parameters, "POST");
        handler.send();
        return false;
    }
    
     this.potato_arrival_submit_callback = function(response) {
        if (response.errCode == 0) {
            if (this.previous_url != null) {
                window.location =  this.previous_url;                                
            } else {
               alert("Successfully Saved entries");
            }
        } else {
        	alert(response.message);
        }
    }
}