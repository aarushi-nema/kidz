/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {

 var complaint_type  = $("#complaint_type_id")
 var assign_to_id = $("#assign_to_id")
 var complaint_type_selected_id = $("#complaint_type_selected_id").val();
 var assign_to_selected_id = $("#assign_to_selected_id").val();
 var baseurl = window.location.protocol+"//"+window.location.hostname;
 if (window.location.port != 80) {
             baseurl = baseurl + ":"+ window.location.port;
         }
  category_id = $("#complaint_category_id").val();
        complaint_type.empty();
         assign_to_id.empty();
    		$.ajax(
             {
                 type: 'POST',
                 url:baseurl+'/get_complaint_type/',
                 data:'category_id='+ category_id,
                 success: function(jsonString){

                 var jsonobj = JSON.parse(jsonString);
                  $(jsonobj.resource).each(function () {
                   var option =   $('<option>');
                   option.html(this.name);
                   option.val(this.id);
                  complaint_type.append(option);
                  if(complaint_type_selected_id==this.id){
                   $('#complaint_type_id option[value="'+complaint_type_selected_id+'"]').attr("selected", "selected");
                  }
                   });



             }
         });
         $.ajax(
                     {
                         type: 'POST',
                         url:baseurl+'/get_service_staff/',
                         data:'category_id='+ category_id,
                         success: function(jsonString){

                         var jsonobj = JSON.parse(jsonString);
                          $(jsonobj.resource).each(function () {
                           var option =   $('<option>');
                           option.html(this.name);
                           option.val(this.id);
                          assign_to_id.append(option);
                           if(assign_to_selected_id==this.id){
                                    $('#assign_to_id option[value="'+assign_to_selected_id+'"]').attr("selected", "selected");
                               }
                           });



                     }
                 });




   $( "#complaint_category_id" ).change(function() {
   	  category_id = $("#complaint_category_id").val();
       complaint_type.empty();
        assign_to_id.empty();
   		$.ajax(
            {
                type: 'POST',
                url:baseurl+'/get_complaint_type/',
                data:'category_id='+ category_id,
                success: function(jsonString){

                var jsonobj = JSON.parse(jsonString);
                 $(jsonobj.resource).each(function () {
                  var option =   $('<option>');
                  option.html(this.name);
                  option.val(this.id);
                 complaint_type.append(option);
                  });



            }
        });
        $.ajax(
                    {
                        type: 'POST',
                        url:baseurl+'/get_service_staff/',
                        data:'category_id='+ category_id,
                        success: function(jsonString){

                        var jsonobj = JSON.parse(jsonString);
                         $(jsonobj.resource).each(function () {
                          var option =   $('<option>');
                          option.html(this.name);
                          option.val(this.id);
                         assign_to_id.append(option);
                          });



                    }
                });

    });
});