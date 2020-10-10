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
                var baseurl = window.location.protocol+"//" + window.location.hostname;
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
                                    if (field.attributes['int_field'] != null && field.attributes['int_field'].value == "true") {
                                        if ((field.value == null) || field.value == "") {
                                            resource[fieldArray[i]] = 2147483647;
                                        } else {
                                            resource[fieldArray[i]] = field.value;
                                        }
                                    } else if (field.attributes['long_field'] != null && field.attributes['long_field'].value == "true") {
                                         if ((field.value == null) || field.value == "") {
                                             resource[fieldArray[i]] = "9223372036854775807";
                                         } else {
                                             resource[fieldArray[i]] = field.value;
                                         }
                                     } else if (field.attributes['double_field'] != null && field.attributes['double_field'].value == "true") {
                                       if ((field.value == null) || field.value == "") {
                                           resource[fieldArray[i]] = "1.7976931348623157E308";
                                       } else {
                                           resource[fieldArray[i]] = field.value;
                                       }
                                    } else {
                                        resource[fieldArray[i]] = field.value;
                                    }
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
                            var baseurl = window.location.protocol+"//" + window.location.hostname;
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


     this.visible_block = function (source_field,target_block,value) {
             source_value =  $("#"+source_field).val();
             if (source_value == value)  {
                 $('#'+target_block).show();
             } else{
                 $('#'+target_block).hide();
             }
             $('#'+source_field).change(function() {
                source_value =  $("#"+source_field).val();
                if (source_value == value)  {
                     $('#'+target_block).show();
                 } else{
                     $('#'+target_block).hide();
                 }
             });
    }

    this.invisible_block = function (source_field,target_block,value) {
                 source_value =  $("#"+source_field).val();
                 if (source_value == value)  {
                     $('#'+target_block).hide();
                 } else{
                     $('#'+target_block).show();
                 }
                 $('#'+source_field).change(function() {
                    source_value =  $("#"+source_field).val();
                    if (source_value == value)  {
                         $('#'+target_block).hide();
                     } else{
                         $('#'+target_block).show();
                     }
                 });
    }
    this.populate_dependent = function (resource,queryId,source_field,target_field) {
                    var baseurl = window.location.protocol+"//" + window.location.hostname;
                    if (window.location.port != 80) {
                        baseurl = baseurl + ":" + window.location.port;
                    }
                    args = source_field+":"+$("#"+source_field).val();
                    var url = baseurl+"/api"+"/"+resource+"?queryId="+queryId+"&args="+args;
                    parameters = "";
                    var target_field = target_field;
                    var handler = new framework.ajax_handler(url, function (response) {
                        if (response.errCode == 0) {
                            value = $('#'+target_field).val();
                            $('#'+target_field).empty();
                            for(var i=0; i< response.resource.length;i++)
                            {
                                 var newOption = new Option(response.resource[i].name, response.resource[i].id, false, false);
                                 $('#'+target_field).append(newOption);
                            }
                            $('#'+target_field).val(value);
                            $('#'+target_field).trigger('change');
                        } else {
                            alert(response.message);
                        }
                    }, parameters, "GET");
                    handler.send();
                    return false;
        }
}