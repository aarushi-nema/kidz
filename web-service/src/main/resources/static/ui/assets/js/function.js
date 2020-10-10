function trim(str) {
   return str.replace(/^\s+|\s+$/g,"");
}

function getValue(fldname) {
	var fld = $('#'+fldname);
	 if (fld != null) {
		 return fld.val();
	 }
	 return null;
}

function showCount(divName,field, maxlenth) {
	 var div = $('#'+divName);
	 if (div != null) {
	 	 var len = field.value.length;	
          div.text("Remaining Characters "+ (maxlenth - len)+" ...");   
	 }
}

function validateEmpty(fldname, fieldname) {
        var error = "";
        var fld = $('#'+fldname);
        if (fld != null) {
            if ((fld.val() == null) || (fld.val().length == 0)) {
                fld.andSelf().css('border','2px solid red');
                error = "The required field has not been filled in - "+fieldname+".\n"
            } else {
                fld.andSelf().css('border','1px solid gray');
            }
        }
        return error;
 }
 
 function validateEmptySDP(fldname, fieldname, isNum) {
        var error = "";
        var fld = $('#'+fldname);
        if (fld != null) {
            if ((fld.val() == null) || (fld.val().length == 0)) {
                fld.andSelf().css('border','2px solid red');
                error = "The required field has not been filled in - <b>"+fieldname+"</b>.<br>"
            }
            else if((isNum != null) && (isNaN(fld.val()) == true)) {
                error = "Please Enter Number only in - <b>"+fieldname+"</b>.<br>"
            }
            else {
                fld.andSelf().css('border','1px solid gray');
            }
        }
        return error;
    }
     
function validateMinLength(fldname, fieldname,minLength) {
        var error = "";
        fld = document.getElementById(fldname);
        if (fld != null) {
             if ((fld.value == null) || (fld.value.length < minLength)) {
                fld.style.background = "Yellow";
                error = fieldname+" should be minimum "+ minLength+" characters.\n";
            } else {
                fld.style.background = "White";
            }
        }
        return error;
 }
 
 function validateMaxLength(fldname, fieldname,maxLength) {
        var error = "";
        fld = document.getElementById(fldname);
        if (fld != null) {
             if ((fld.value == null) || (fld.value.length > maxLength)) {
                fld.style.background = "Yellow";
                error = fieldname+" should be maximum "+ minLength+" characters.\n";
            } else {
                fld.style.background = "White";
            }
        }
        return error;
 }
 
function validateNumber(fldname, fieldname) {
        var error = "";
        fld = document.getElementById(fldname);
        if (fld != null) { 
            if (isNumeric(fld.value)) {
                fld.style.background = "White";
            } else {
                fld.style.background = "Yellow";
                error = "Field should have numeric value  - "+fieldname+".\n"
            }
         }
        return error;
}

function validateInteger(fldname, fieldname) {
    var error = "";
    fld = document.getElementById(fldname);
    if (fld != null) { 
        if (isInteger(fld.value)) {
            fld.style.background = "White";
        } else {
            fld.style.background = "Yellow";
            error = "Field should have numeric value  - "+fieldname+".\n"
        }
     }
    return error;
}

function validateSameValue(fldname1, fieldname1,fldname2, fieldname2) {
        var error = "";
        fld1 = document.getElementById(fldname1);
        fld2 = document.getElementById(fldname2);
        if (fld1.value  != fld2.value) { 
                fld.style.background = "Yellow";
                error = "Field should have same value  - "+fieldname1+","+fieldname2+".\n";
        } else {
            fld.style.background = "White";
        }
        return error;
}
function validateEmail(fldname, fieldname){
        var error = "";
        fld = document.getElementById(fldname);
        if ((fld.value == "") || (fld.value == null))  return error;
        var filter=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i
        if (filter.test(fld.value)) {
            fld.style.background = "White";
        }
        else{
            fld.style.background = "Yellow";
            error = "Invalid Email Id  - "+fieldname+".\n";
        }
        return error;
}
 
function isNumeric(value) {
      if (value == null || !value.toString().match(/^[-]?\d*\.?\d*$/)) return false;
      return true;
}

function isInteger(value) {
    if (value == null || !value.toString().match(/^[-]?\d*$/)) return false;
    return true;
}

function closeMenu() {
  if ($('#left-column').width() == 0) {
 	   $('#left-column').width("18%");  
	   $('#content').width("79%");   
	   $('#open-menu-image-id').attr("src","/ui/images/close-menu.png");
  } else {
	   $('#left-column').width(0);  
	   $('#content').width("90%");  
	   $('#open-menu-image-id').attr("src","/ui/images/open-menu.png");
  }
}
