/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
    unit_id = $("#unit_id").val();
    if (unit_id == null) {
        $("#name_row").show();
    } else {
        $("#name_row").hide();
    }
});