<%-- 
    Document   : index
    Created on : Sep 4, 2014, 11:43:00 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>jQuery UI Example Page</title>
	<link href="jquery-ui.css" rel="stylesheet">
	<style>
	body{
		font: 62.5% "Trebuchet MS", sans-serif;
		margin: 50px;
	}
	.demoHeaders {
		margin-top: 2em;
	}
	#dialog-link {
		padding: .4em 1em .4em 20px;
		text-decoration: none;
		position: relative;
	}
	#dialog-link span.ui-icon {
		margin: 0 5px 0 0;
		position: absolute;
		left: .2em;
		top: 50%;
		margin-top: -8px;
	}
	#icons {
		margin: 0;
		padding: 0;
	}
	#icons li {
		margin: 2px;
		position: relative;
		padding: 4px 0;
		cursor: pointer;
		float: left;
		list-style: none;
	}
	#icons span.ui-icon {
		float: left;
		margin: 0 4px;
	}
	.fakewindowcontain .ui-widget-overlay {
		position: absolute;
	}
	select {
		width: 200px;
	}
	</style>
<style type="text/css">
body {
	background-color: white;
}
#login_box .name {
	text-align: left;
	height: auto;
	width: 100%;
	font-family: Arial, Helvetica, sans-serif;
	color: rgb(255,255,255);
	text-transform: capitalize;
	font-size:120%;	
}
.usernamee {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	color: rgb(85,85,85);
	text-align: left;
	width: 55%;
	height: 10%;
	margin-top: 3px;
}
.main_body {
	}
#login_box {
	height: auto;
	width: auto;
	}
.cheackbox {
	width: 90%;
	height: 30px;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	line-height: 30px;
	text-transform: capitalize;
	color: rgb(255,255,255);
}
form .rado {
	float: left;
	height: 20px;
	width: 20px;
	margin-left: 8px;
}
.heading {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 14px;
	color: rgb(204,204,51);
	text-align: center;
	width: 90%;
	height: 30px;
	line-height: 30px;
	text-transform: capitalize;
}
form .radoo {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	text-align: center;
	height: 40px;
	width: 100px;
	line-height:40px;
}

</style>

</head>

<body>
<div id="tabs" class="ui-tabs ui-widget ui-widget-content ui-corner-all">
	<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
		<li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-1" aria-labelledby="ui-id-8" aria-selected="false" aria-expanded="false"><a href="#tabs-1" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-8">Register</a></li>
		<li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-2" aria-labelledby="ui-id-9" aria-selected="true" aria-expanded="true"><a href="#tabs-2" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-9">Login</a></li>
		<li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-3" aria-labelledby="ui-id-10" aria-selected="false" aria-expanded="false"><a href="#tabs-3" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-10">Forget Password</a></li>
	</ul>
    <div id="tabs-1" aria-labelledby="ui-id-8" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="true" style="display: none;">  
            <div id="login_box" class="main_body">        
                <form method="post" action="Register">
                    <div class="name">Name</div>     
                    <input type="text" name="name" class="usernamee" onchange="textValidation(id)"></br>
                    <div class="name">User Name</div>     
                    <input type="text" name="user_name" class="usernamee" onchange="textValidation(id)"></br>
                    <div class="name">Account Type:</div>
                    <table class="name radio"> <tr> 
                    <td>Admin<input type =radio name="AccountType" value="Admin" class="usernamee"></td></tr>
                    <tr><td>Faculty<input type =radio name="AccountType" value="Faculty" class="usernamee"></td></tr>
                    <tr><td>Student<input type =radio name="AccountType" value="Student" required checked="checked" class="usernamee"></td>
                    </tr></table>
                    <div class="name">Your Email</div>     
                    <input type="email" name="uemail" class="usernamee">  </br>   
                    <div class="name">Password</div>    
                    <input type="password" name="upassword" class="usernamee"></br>
                    <div class="name">Confirm Password</div>    
                    <input type="password" name="ucpassword" class="usernamee"></br>
	  </br>
	   <input type="submit"  name="register"  value="Register" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only">
                </form>
            </div>
    </div>
	<div id="tabs-2" aria-labelledby="ui-id-9" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="false" style="display: block;">
            <div id="login_box" class="main_body">     
                <form action="Login" method="post">
                    <div class="name">User Name</div>
                    <input type="text" name="lusername" class="usernamee"> </br>   
                    <div class="name">Password</div>    
                    <input type="password" name="lpassword" class="usernamee"></br>
                  </br>  
	<input type="submit"  name="login"  value="Login" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only">
                </form>
            </div> 
        </div>
	<div id="tabs-3" aria-labelledby="ui-id-10" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="true" style="display: none;">
                <div id="login_box" class="main_body">        
                <form>
                    <div class="name">User Name</div>     
                    <input type="text" name="rusername" class="usernamee">     </br>
                    <div class="name">Your Email</div>     
                    <input type="email" name="remail" class="usernamee">  </br>   
	</br>
	  <input type="submit"  name="submit"  value="Submit" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only">
                  </form>
                </div> 
        </div>
</div>	

<script src="external/jquery/jquery.js"></script>
<script src="jquery-ui.js"></script>
<script>

$( "#accordion" ).accordion();



var availableTags = [
	"ActionScript",
	"AppleScript",
	"Asp",
	"BASIC",
	"C",
	"C++",
	"Clojure",
	"COBOL",
	"ColdFusion",
	"Erlang",
	"Fortran",
	"Groovy",
	"Haskell",
	"Java",
	"JavaScript",
	"Lisp",
	"Perl",
	"PHP",
	"Python",
	"Ruby",
	"Scala",
	"Scheme"
];
$( "#autocomplete" ).autocomplete({
	source: availableTags
});



$( "#button" ).button();
$( "#radioset" ).buttonset();



$( "#tabs" ).tabs();



$( "#dialog" ).dialog({
	autoOpen: false,
	width: 400,
	buttons: [
		{
			text: "Ok",
			click: function() {
				$( this ).dialog( "close" );
			}
		},
		{
			text: "Cancel",
			click: function() {
				$( this ).dialog( "close" );
			}
		}
	]
});

// Link to open the dialog
$( "#dialog-link" ).click(function( event ) {
	$( "#dialog" ).dialog( "open" );
	event.preventDefault();
});



$( "#datepicker" ).datepicker({
	inline: true
});



$( "#slider" ).slider({
	range: true,
	values: [ 17, 67 ]
});



$( "#progressbar" ).progressbar({
	value: 20
});



$( "#spinner" ).spinner();



$( "#menu" ).menu();



$( "#tooltip" ).tooltip();



$( "#selectmenu" ).selectmenu();


// Hover states on the static widgets
$( "#dialog-link, #icons li" ).hover(
	function() {
		$( this ).addClass( "ui-state-hover" );
	},
	function() {
		$( this ).removeClass( "ui-state-hover" );
	}
);
</script>

</body>

</html>