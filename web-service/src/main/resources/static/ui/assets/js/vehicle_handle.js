/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
VehicleHandler = new function() {
    this.previous_url = null;
    this.callback = function(response) {
        if (response.errCode == 0) {
            if (this.previous_url != null) {
                window.location =  this.previous_url;                                
            } else {
                var baseurl = "http://"+window.location.hostname;
                if (window.location.port != 80) {
                    baseurl = baseurl + ":"+ window.location.port;
                }
                baseurl =   baseurl +"/ui/configuration";
                window.location =  baseurl;
            }
        } else {
            alert(response.message);
        } 
    }
    
    this.call = function() {
        var reason = "";
        reason += validateEmpty("name","Name");
        reason += validateEmpty("vin","VIN");
        if (reason != "") {
            alert(reason);
            return false;
        }
        
        var baseurl = "http://"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+"/c4t/appliance";
        var parameters= "";
        var resource = {};
        
        var field = document.getElementById("id");
        if (field && field.value != null) {
        	resource.id = field.value;
        }
        
        var field = document.getElementById("name");
        if (field && field.value != null) {
        	resource.name = field.value;
        }
        
        var field = document.getElementById("vin");
        if (field && field.value != null) {
        	resource.vin = field.value;
        }
        
        var field = document.getElementById("make_id");
        if (field && field.value != null) {
        	resource.make_id = field.value;
        }
        
        var field = document.getElementById("serial_number");
        if (field && field.value != null) {
        	resource.make_id = field.value;
        }
        
        var field = document.getElementById("model_id");
        if (field && field.value != null) {
        	resource.name = field.value;
        }
        parameters= "resource="+JSON.stringify(resource);
        var handler = new framework.ajax_handler(url, this.callback, parameters, "POST");
        handler.send();
        return false;
    }
}