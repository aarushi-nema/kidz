/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
AutoRefreshHandler = new function() {
    this.interval = 5000;
    this.call = function(url,interval,units) {
        var baseurl = "http://"+window.location.hostname;
        if (window.location.port != 80) {
           baseurl = baseurl + ":"+ window.location.port;
        }
        var url = baseurl+url;
        var object = this;
        var _units = units;
        setInterval(function()
        {
        	var __units = _units;
        	
        	var handler = new framework.ajax_handler(url, function(response) {
                if (response.errCode == 0) {
                    var resources = response.resource;
                    if ((resources != null) && (resources.length > 0)) {
                        for(var i=0; i < resources.length ; i ++) {
                        	var resource = resources[i];
                        	var suffix = resource['id'];
                        	for (var key in resource) {
                        		var field_id = key+"_"+suffix;
                        		var field = document.getElementById(field_id);
                        		if (field != null) {
                        			if ((field.dataset != null) && (field.dataset.renderer != null)) {
                        				if (field.dataset.renderer == "ALERT_YES_NO") {
                        					if (resource[key] == "Y") {
                        						field.src = baseurl+"/ui/images/red-dot.png";
                        						field.title = "Yes";
                        					} else {
                        						field.src = baseurl+"/ui/images/green-dot.png";
                        						field.title = "NO";
                                    		}
                        				} else if (field.dataset.renderer == "YES_NO") {
                        					if (resource[key] == "Y") {
                        						field.src = baseurl+"/ui/images/green-dot.png";
                        						field.title = "Yes";
                        					} else {
                        						field.src = baseurl+"/ui/images/red-dot.png";
                        						field.title = "NO";
                                    		}
                        				} else if (field.dataset.renderer == "RUNNING") {
                        					if (resource[key] == "Y") {
                        						field.src = baseurl+"/ui/images/green-dot.png";
                        						field.title = "Running";
                        					} else {
                        						field.src = baseurl+"/ui/images/red-dot.png";
                        						field.title = "Not Running";
                                    		}
                        				}
                        			} else {
	                        			var unitstr = "";
	                        			if (__units != null && __units[key] != null) {
	                        				unitstr = __units[key];
	                        			}
	                        			field.innerHTML = resource[key] +" "+unitstr ;
                        			}
                        		}
                        	}
                        }
                    }
                } else {
                    alert(response.message);
                } 
            }, null, "GET");
	        handler.send();
	     },interval);
        return false;
    }
}