/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
FormHandler = new function () {
    this.previous_url = null;
    this.callback_url = null;
    this.callback =
            this.call = function (url, fields, callbackurl, action) {
                if (!validation())
                    return false;
                $.blockUI();
                var baseurl = "http://" + window.location.hostname;
                if (window.location.port != 80) {
                    baseurl = baseurl + ":" + window.location.port;
                }
                var url = baseurl + url;
                var parameters = "";
                var resource = {};
                if (fields != null) {
                    var fieldArray = fields.split(",");
                    for (var i = 0; i < fieldArray.length; i++) {
                        if (typeof nicEditors !== 'undefined') {
                            var editor = nicEditors.findEditor(fieldArray[i]);
                            if (editor != null) {
                                editor.saveContent();
                                resource[fieldArray[i]] = editor.getContent();
                            } else {
                                var field = document.getElementById(fieldArray[i]);
                                if (field == null)
                                    continue;
                                if ((field.type != null) && field.type == "checkbox") {
                                    if (field.checked) {
                                        resource[fieldArray[i]] = field.value;
                                    } else {
                                        resource[fieldArray[i]] = "";
                                    }
                                } else {
                                    if (field && field.value != null) {
                                        resource[fieldArray[i]] = field.value;
                                    }
                                }
                            }
                        } else {
                            var field = document.getElementById(fieldArray[i]);
                            if (field == null)
                                    continue;
                            if ((field.type != null) && field.type == "checkbox") {
                                if (field.checked) {
                                    resource[fieldArray[i]] = field.value;
                                } else {
                                    resource[fieldArray[i]] = "";
                                }
                            } else {
                                if (field && field.value != null) {
                                    resource[fieldArray[i]] = field.value;
                                }
                            }
                        }
                    }
                }
                var resource_string = Base64.encode(JSON.stringify(resource));
                resource_string = resource_string.replace(/%/g, "%25").replace(/\&/g, "%26").replace(/\+/g, "%2B");
                parameters = "resource=" + resource_string + "&action=" + action;
                var _callbackurl = callbackurl;

                var handler = new framework.ajax_handler(url, function (response) {
                    $.unblockUI();
                    if (response.errCode == 0) {
                        if (this.previous_url != null) {
                            window.location = this.previous_url;
                        } else {
                            var baseurl = "http://" + window.location.hostname;
                            if (window.location.port != 80) {
                                baseurl = baseurl + ":" + window.location.port;
                            }
                            if (_callbackurl != null) {
                                baseurl = baseurl + _callbackurl;
                                window.location = baseurl;
                            } else {
                                alert("SuccessFully Sent Request ...");
                            }
                        }
                    } else {
                        alert(response.message);
                    }
                }, parameters, "POST");
                handler.send();
                return false;
            }
}