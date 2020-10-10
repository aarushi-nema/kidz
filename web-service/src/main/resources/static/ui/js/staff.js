/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
    type = $("#type").val();
    if (type == "SERVICE") {
        $("#complaint_category_id_row").show();
    } else {
        $("#complaint_category_id_row").hide();
    }
   $( "#type" ).change(function() {
   		type = $("#type").val();
   		if (type == "SERVICE") {
  			$("#complaint_category_id_row").show();
  		} else {
  		    $("#complaint_category_id_row").hide();
  		}

    });
});