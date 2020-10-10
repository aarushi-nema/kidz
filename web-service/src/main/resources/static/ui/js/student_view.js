/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
  $( "#fees_manual" ).change(function() {
   		fees_manual = $("#fees_manual").val();
   		if (fees_manual == "Y") {
  			$("#fees_master_id_row").show();
  		}
  		else {
  			$("#fees_master_id_row").hide();
  		}
    });
   
});