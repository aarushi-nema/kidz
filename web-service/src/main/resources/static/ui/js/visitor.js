/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {

$( "#mobile_no" ).change(function() {
        mobile_no = $("#mobile_no").val();
        var baseurl = window.location.protocol+"//"+window.location.hostname;
        if (window.location.port != 80) {
            baseurl = baseurl + ":"+ window.location.port;
        }
        $.ajax({
            type: 'POST',
            url: baseurl+"/v1/api/visitor?queryId=QUERY_BY_MOBUILE_NO&agrs=mobile_no:"+mobile_no,
            data:'mobile_no='+ mobile_no,
            success: function(jsonString) {
                var jsonobj = JSON.parse(jsonString);
                $("#name").val(jsonobj.resource[0].name);
                $("#address").val(jsonobj.resource[0].address);
                $("#area").val(jsonobj.resource[0].area);
                $("#city").val(jsonobj.resource[0].city);
                $("#state").val(jsonobj.resource[0].state);
                $("#country").val(jsonobj.resource[0].country);
                $("#pin_code").val(jsonobj.resource[0].pin_code);
             }
        });
    });
});


