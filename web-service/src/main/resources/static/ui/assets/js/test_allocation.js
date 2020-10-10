/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
   $( "#immediate_result" ).change(function() {
   		immediate_result = $("#immediate_result").val();
   		if (immediate_result == "Y") {
  			$("#result_date_s_row").hide();
  			$("#result_time_s_row").hide();
  		}
  		if (immediate_result == "N") {
  			$("#result_date_s_row").show();
  			$("#result_time_s_row").show();
  		}
    });
});