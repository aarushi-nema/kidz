/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
   $( "#payment_method" ).change(function() {
   		payment_method = $("#payment_method").val();
   		if (payment_method == "CASH") {
  			$("#bank_name_row").hide();
  			$("#cheque_date_row").hide();
  			$("#cheque_no_row").hide();
  			$("#cheque_status_row").hide();
  		}
  		if (payment_method == "CHEQUE") {
  			$("#bank_name_row").show();
  			$("#cheque_date_row").show();
  			$("#cheque_no_row").show();
  			$("#cheque_status_row").show();
  		}
  		if (payment_method == "OTHER") {
  			$("#bank_name_row").show();
  			$("#cheque_date_row").show();
  			$("#cheque_no_row").show();
  			$("#cheque_status_row").show();
  		}
    });
});