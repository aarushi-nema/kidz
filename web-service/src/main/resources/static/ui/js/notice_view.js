/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
   $( "#type" ).change(function() {
   		type = $("#type").val();
   		if (type == "SCHOOL") {
  			$("#section_name_row").hide();
  			$("#class_name_row").hide();
  			$("#batch_id_row").hide();
  		}
  		if (type == "CLASS") {
  			$("#section_name_row").hide();
  			$("#class_name_row").show();
  			$("#batch_id_row").hide();
  		}
  		if (type == "SECTION") {
  			$("#section_name_row").show();
  			$("#class_name_row").show();
  			$("#batch_id_row").hide();
  		}
  		if (type == "BATCH") {
  			$("#section_name_row").hide();
  			$("#class_name_row").hide();
  			$("#batch_id_row").show();
  		}
    });
});