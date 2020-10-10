/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {

 var ticket_type  = $("#ticket_type_id")
  var ticket_type_selected_id  = $("#ticket_type_selected_id").val()
 var baseurl = window.location.protocol+"//"+window.location.hostname;
 if (window.location.port != 80) {
             baseurl = baseurl + ":"+ window.location.port;
         }
  ticket_category_id = $("#ticket_category_id").val();
  ticket_type.empty();

    		$.ajax(
             {
                 type: 'POST',
//               url:baseurl+'/api/ticket_type?queryId=QUERY_BY_TICKET_CATEGORY&agrs=ticket_category_id:'+ticket_category_id
                 url:baseurl+'/get_ticket_type/',
                 data:'ticket_category_id='+ ticket_category_id,
                 success: function(jsonString){

                 var jsonobj = JSON.parse(jsonString);
                  $(jsonobj.resource).each(function () {
                   var option =   $('<option>');
                   option.html(this.name);
                   option.val(this.id);
                   ticket_type.append(option);
                   if(ticket_type_selected_id==this.id){
                            $('#ticket_type_id option[value="'+ticket_type_selected_id+'"]').attr("selected", "selected");
                       }
                   });



             }
         });

   $( "#ticket_category_id" ).change(function() {
   	  ticket_category_id = $("#ticket_category_id").val();
       ticket_type.empty();

   		$.ajax(
            {
                type: 'POST',
//              url:baseurl+'/api/ticket_type?queryId=QUERY_BY_TICKET_CATEGORY&agrs=ticket_category_id:'+ticket_category_id,
//              data:'queryId=QUERY_BY_TICKET_CATEGORY&agrs=ticket_category_id:'+ticket_category_id,
                url:baseurl+'/get_ticket_type/',
                data:'ticket_category_id='+ ticket_category_id,
                success: function(jsonString){

                var jsonobj = JSON.parse(jsonString);
                 $(jsonobj.resource).each(function () {
                  var option =   $('<option>');
                  option.html(this.name);
                  option.val(this.id);
                 ticket_type.append(option);
                  });



            }
        });


    });
});