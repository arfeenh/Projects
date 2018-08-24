
var form;

function validate(){
	form = document.getElementById("register").elements;
	if(validateForm() && checkDate()){
		console.log(form.full_name.value);
		console.log(form.date.value);
		document.getElementById("register").submit();
		return true;
		}
	else{
		return false;
	}



}

function validateForm() {
    var TCode = form.full_name.value;
	var split = TCode.split(" ");
    if( /[^a-zA-Z0-9 ]/.test(TCode) || split[0].length>20 || split[1].length>20 ) {
       alert('Name is not alphanumeric');
	   console.log("greater date")
	   form.full_name.focus();
       return false;
    }
    console.log("greater date")
    return true;     
 }
 
 function checkDate(){
	var current_date = new Date();
	var entered_date = Date.parse(form.bday.value);
	if(entered_date>current_date ){
		alert('Date entered is greater then current date');
	    form.bday.focus();
	    console.log("greater date")
		return false;
	}
    console.log("good date")
	return true;
 }