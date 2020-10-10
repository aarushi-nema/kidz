/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
    type = $("#type").val();
    if (type == "SUPPORT_ENGINEER") {
        $("#customer_id_row").hide();
        $("#super_user_row").hide();
        super_user
    } else {
        $("#customer_id_row").show();
          $("#super_user_row").show();
        super_user
    }
   $( "#type" ).change(function() {
   		type = $("#type").val();
   		if (type == "SUPPORT_ENGINEER") {
  			$("#customer_id_row").hide();
  			$("#super_user_row").hide();
  			super_user
  		} else {
  		    $("#customer_id_row").show();
  		    $("#super_user_row").show();

  		}

    });
});