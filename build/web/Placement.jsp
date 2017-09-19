<%-- 
    Document   : Placement
    Created on : Sep 14, 2014, 12:06:58 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>  <center><h3>PLACEMENT</h3></center></title>
	<script type="text/javascript">
function isCountry() {

      if( document.myForm.Country.value == "-1" )
   {
     alert( "Please provide your country!" );
	 document.myForm.Country.focus();
     return false;
   }

  return( true );   
  
}
 
   function isString(id)
  {
    var stringOnly = /^[A-Za-z]+$/;
    var x=document.getElementById(id).value;
      if(!stringOnly.test(x))
        {
         alert("please enter the string only !");     
           }

 } 
         
       function isNumber(id)
  {
        var numbersOnly = /^\d+$/;
    var x=document.getElementById(id).value;
      if(!numbersOnly.test(x))
        {
         alert("please enter the numbers only !");     
           }

 }

     function isChar(id)
  {
     
    var uppercaseOnly = /^[A-F]+$/;
     var x=document.getElementById(id).value;
      if(!uppercaseOnly.test(x))
        {
         alert("please enter the uppercase Char only !");     
           }

 } 
 
     function isDate(id)
{
var pattern = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;
var x = document.getElementById(id).value;
 if(!pattern.test(x))
   {
 alert("invalid date format");
}
 }

</script>
         </head>
<body> 
<form action="Placement" name="myForm" method="post">
  
       <table border="1" align="center">
            <tr>
                <th>Date</th>
                <th width="8">Company Name</th>
                <th width="5">Designation/Job Title</th>
                <th>Job Type</th>
                <th width="5">Annual Package</th>
                <th>Office Letter</th>
                <th width="5">Open/Close campus</th>
                <th>Remarks</th>
            </tr>
            <tr>
            <td>  <input type="text" name="t11" size="5" id="101" onblur="isDate(id)">  </td>    
            <td>  <input type="text" name="t12" size="18">  </td>    
            <td> <input type="text" name="t13" size="12">    </td>
            <td> <input type="text" name="t14" size="12">   </td>
            <td>  <input type="text" name="t15" size="5" id="501" onblur="isNumber('501')">  </td>
            <td>  <input type="text" name="t16" size="10">  </td>
            <td>  <input type="text" name="t17" size="10">  </td>
            <td>  <input type="text" name="t18" size="12">   </td>
            
            
            </tr>
             <tr>
            <td>  <input type="text" id="102" onblur="isDate(id)" name="t21" size="5">  </td>    
            <td> <input type="text" name="t22" size="18">   </td>    
            <td> <input type="text" name="t23" size="12">    </td>
            <td>  <input type="text" name="t24" size="12">  </td>
            <td>  <input type="text" name="t25" size="5" id="502" onblur="isNumber('502')">  </td>
            <td> <input type="text" name="t26" size="10">   </td>
            <td> <input type="text" name="t27" size="10">   </td>
            <td> <input type="text" name="t28" size="12">    </td>
            </tr>
              <tr>
            <td>  <input type="text" id="103" onblur="isDate(id)" name="t31" size="5">  </td>    
            <td> <input type="text" name="t32" size="18">   </td>    
            <td> <input type="text" name="t33" size="12">    </td>
            <td> <input type="text" name="t34" size="12">   </td>
            <td> <input type="text" name="t35" size="5" id="503" onblur="isNumber('503')">   </td>
            <td> <input type="text" name="t36" size="10">   </td>
            <td>  <input type="text" name="t37" size="10">  </td>
            <td> <input type="text" name="t38" size="12">    </td>
            </tr>
              <tr>
            <td>  <input type="text" id="104" onblur="isDate(id)" name="t41" size="5">  </td>    
            <td> <input type="text" name="t42" size="18">   </td>    
            <td>   <input type="text" name="t43" size="12">  </td>
            <td>  <input type="text" name="t44" size="12">  </td>
            <td>  <input type="text" name="t45" size="5" id="504" onblur="isNumber('504')">  </td>
            <td>  <input type="text" name="t46" size="10">  </td>
            <td>  <input type="text" name="t47" size="10">  </td>
            <td>  <input type="text" name="t48" size="12">   </td>
            </tr>
              <tr>
                  <td><input type="text" id="105" onblur="isDate(id)" name="t51" size="5"></td>    
            <td><input type="text" name="t52" size="18"></td>    
            <td><input type="text" name="t53" size="12"></td>
            <td>   <input type="text" name="t54" size="12"> </td>
            <td>  <input type="text" name="t55" size="5" id="505" onblur="isNumber('505')">  </td>
            <td>  <input type="text" name="t56" size="10">  </td>
            <td>  <input type="text" name="t57" size="10">  </td>
            <td>  <input type="text" name="t58" size="12">   </td>
            </tr>
              <tr>
            <td>   <input type="text" id="106" onblur="isDate(id)" name="t61" size="5"> </td>    
            <td>  <input type="text" name="t62" size="18">  </td>    
            <td>  <input type="text" name="t63" size="12">   </td>
            <td>  <input type="text" name="t64" size="12">  </td>
            <td>  <input type="text" name="t65" size="5" id="506" onblur="isNumber('506')">  </td>
            <td> <input type="text" name="t66" size="10">   </td>
            <td>  <input type="text" name="t67" size="10">  </td>
            <td>  <input type="text" name="t68" size="12">   </td>
            </tr>
        </table></br></br>    
<div align="center">
        Joint In :<input type="text" name="joint">
        City :<input type="text" name="city" maxlength="20" id="c" onblur="isString(id)">
        Country :<select name="Country" id="c1" onblur="isCountry()">
   <option value="-1" selected>[choose yours]</option>
   <option value="1">INDIA</option>
   <option value="2">NEPAL</option>
   <option value="3">U.A.E</option>
 </select>
        Year :<input type="text" name="year" maxlength="10" id="y" onblur="isNumber(id)"></br></br></br></br></br></div>


    <div align="center"><p><h3>TRAINING & CERTIFICATION DETAILS</h3></p> </div>
 

                  
       <div> <table border="1" align="center">
            <tr>
                <th>Date</th>
                <th width="8">Course & Certificate Name</th>
                <th>Company</th>
                <th width="5">Marks Obtained</th>
                <th width="5">Max. Marks</th>
                <th width="5">Marks Percentage</th>
                <th width="3">Grade</th>
                <th width="5">Total Attendance</th>
                <th>Attendance</th>
                <th width="1">Pass</th>
                <th>Remarks</th>
                
            </tr>
            <tr>
            <td>  <input type="text" id="01" onblur="isDate(id)" name="c11" size="5">  </td>    
            <td>  <input type="text" name="c12" size="18">  </td>    
            <td> <input type="text" name="c13" size="12">    </td>
            <td> <input type="text" name="c14" size="12" id="31" onblur="isNumber('31')">   </td>
            <td>  <input type="text" name="c15" size="5" id="41" onblur="isNumber('41')" >  </td>
            <td>  <input type="text" name="c16" size="10" id="51" onblur="isNumber('51')">  </td>
            <td>  <input type="text" name="c17" size="3" id="61" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c18" size="7" id="71" onblur="isNumber('71')">   </td>
            <td>  <input type="text" name="c19" size="7" id="81" onblur="isNumber('81')">   </td>
            <td>  <input type="text" name="c110" size="1">   </td>
            <td>  <input type="text" name="c111" size="12">   </td>
            </tr>
        <tr>
            <td>  <input type="text" id="02" onblur="isDate(id)" name="c21" size="5">  </td>    
            <td>  <input type="text" name="c22" size="18">  </td>    
            <td> <input type="text" name="c23" size="12" >    </td>
            <td> <input type="text" name="c24" size="12" id="32" onblur="isNumber('32')">   </td>
            <td>  <input type="text" name="c25" size="5" id="42" onblur="isNumber('42')">  </td>
            <td>  <input type="text" name="c26" size="10" id="52" onblur="isNumber('52')">  </td>
            <td>  <input type="text" name="c27" size="3" id="62" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c28" size="7" id="72" onblur="isNumber('72')">   </td>
            <td>  <input type="text" name="c29" size="7" id="82" onblur="isNumber('82')">   </td>
            <td>  <input type="text" name="c210" size="1">   </td>
            <td>  <input type="text" name="c211" size="12">   </td>
            </tr>
    <tr>
            <td>  <input type="text" id="03" onblur="isDate(id)" name="c31" size="5">  </td>    
            <td>  <input type="text" name="c32" size="18">  </td>    
            <td> <input type="text" name="c33" size="12">    </td>
            <td> <input type="text" name="c34" size="12" id="33" onblur="isNumber('33')">   </td>
            <td>  <input type="text" name="c35" size="5" id="43" onblur="isNumber('43')">  </td>
            <td>  <input type="text" name="c36" size="10" id="53" onblur="isNumber('53')">  </td>
            <td>  <input type="text" name="c37" size="3" id="63" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c38" size="7" id="73" onblur="isNumber('73')">   </td>
            <td>  <input type="text" name="c39" size="7" id="83" onblur="isNumber('83')">   </td>
            <td>  <input type="text" name="c310" size="1">   </td>
            <td>  <input type="text" name="c311" size="12">   </td>
            </tr>

    <tr>
            <td>  <input type="text" id="04" onblur="isDate(id)" name="c41" size="5">  </td>    
            <td>  <input type="text" name="c42" size="18">  </td>    
            <td> <input type="text" name="c43" size="12">    </td>
            <td> <input type="text" name="c44" size="12" id="34" onblur="isNumber('34')">   </td>
            <td>  <input type="text" name="c45" size="5" id="44" onblur="isNumber('44')">  </td>
            <td>  <input type="text" name="c46" size="10" id="54" onblur="isNumber('54')">  </td>
            <td>  <input type="text" name="c47" size="3" id="64" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c48" size="7" id="74" onblur="isNumber('74')">   </td>
            <td>  <input type="text" name="c49" size="7" id="84" onblur="isNumber('84')">   </td>
            <td>  <input type="text" name="c410" size="1">   </td>
            <td>  <input type="text" name="c411" size="12">   </td>
            </tr>

    <tr>
            <td>  <input type="text" id="05" onblur="isDate(id)" name="c51" size="5">  </td>    
            <td>  <input type="text" name="c52" size="18">  </td>    
            <td> <input type="text" name="c53" size="12">    </td>
            <td> <input type="text" name="c54" size="12" id="35" onblur="isNumber('35')">   </td>
            <td>  <input type="text" name="c55" size="5" id="45" onblur="isNumber('45')">  </td>
            <td>  <input type="text" name="c56" size="10" id="55" onblur="isNumber('55')">  </td>
            <td>  <input type="text" name="c57" size="3" id="65" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c58" size="7" id="75" onblur="isNumber('75')">   </td>
            <td>  <input type="text" name="c59" size="7" id="85" onblur="isNumber('85')">   </td>
            <td>  <input type="text" name="c510" size="1">   </td>
            <td>  <input type="text" name="c511" size="12">   </td>
            </tr>

    <tr>
            <td>  <input type="text" id="06" onblur="isDate(id)" name="c61" size="5">  </td>    
            <td>  <input type="text" name="c62" size="18">  </td>    
            <td> <input type="text" name="c63" size="12">    </td>
            <td> <input type="text" name="c64" size="12" id="36" onblur="isNumber('36')">   </td>
            <td>  <input type="text" name="c65" size="5" id="46" onblur="isNumber('46')">  </td>
            <td>  <input type="text" name="c66" size="10" id="56" onblur="isNumber('56')">  </td>
            <td>  <input type="text" name="c67" size="3" id="66" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c68" size="7" id="76" onblur="isNumber('76')">   </td>
            <td>  <input type="text" name="c69" size="7" id="86" onblur="isNumber('86')">   </td>
            <td>  <input type="text" name="c610" size="1">   </td>
            <td>  <input type="text" name="c611" size="12">   </td>
            </tr>
    <tr>
            <td>  <input type="text" id="07" onblur="isDate(id)" name="c71" size="5"> </td>    
            <td>  <input type="text" name="c72" size="18">  </td>    
            <td> <input type="text" name="c73" size="12">    </td>
            <td> <input type="text" name="c74" size="12" id="37" onblur="isNumber('37')">   </td>
            <td>  <input type="text" name="c75" size="5" id="47" onblur="isNumber('47')">  </td>
            <td>  <input type="text" name="c76" size="10" id="57" onblur="isNumber('57')">  </td>
            <td>  <input type="text" name="c77" size="3" id="67" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c78" size="7" id="77" onblur="isNumber('77')">   </td>
            <td>  <input type="text" name="c79" size="7" id="87" onblur="isNumber('87')">   </td>
            <td>  <input type="text" name="c710" size="1">   </td>
            <td>  <input type="text" name="c711" size="12">   </td>
            </tr>

    <tr>
            <td>  <input type="text" id="08" onblur="isDate(id)" name="c81" size="5">  </td>    
            <td>  <input type="text" name="c82" size="18">  </td>    
            <td> <input type="text" name="c83" size="12">    </td>
            <td> <input type="text" name="c84" size="12" id="38" onblur="isNumber('38')">   </td>
            <td>  <input type="text" name="c85" size="5" id="48" onblur="isNumber('48')">  </td>
            <td>  <input type="text" name="c86" size="10" id="58" onblur="isNumber('58')">  </td>
            <td>  <input type="text" name="c87" size="3" id="68" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c88" size="7" id="78" onblur="isNumber('78')">   </td>
            <td>  <input type="text" name="c89" size="7" id="88" onblur="isNumber('88')">   </td>
            <td>  <input type="text" name="c810" size="1">   </td>
            <td>  <input type="text" name="c811" size="12">   </td>
            </tr>

    <tr>
            <td> <input type="text" id="09" onblur="isDate(id)" name="c91" size="5">  </td>    
            <td>  <input type="text" name="c92" size="18">  </td>    
            <td> <input type="text" name="c93" size="12">    </td>
            <td> <input type="text" name="c94" size="12" id="39" onblur="isNumber('39')">   </td>
            <td>  <input type="text" name="c95" size="5" id="49" onblur="isNumber('49')">  </td>
            <td>  <input type="text" name="c96" size="10" id="59" onblur="isNumber('59')">  </td>
            <td>  <input type="text" name="c97" size="3" id="69" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c98" size="7" id="79" onblur="isNumber('79')">   </td>
            <td>  <input type="text" name="c99" size="7" id="89" onblur="isNumber('89')">   </td>
            <td>  <input type="text" name="c910" size="1">   </td>
            <td>  <input type="text" name="c911" size="12">   </td>
            </tr>

    <tr>
            <td>  <input type="text" id="010" onblur="isDate(id)" name="c101" size="5">  </td>    
            <td>  <input type="text" name="c102" size="18">  </td>    
            <td> <input type="text" name="c103" size="12">    </td>
            <td> <input type="text" name="c104" size="12" id="40" onblur="isNumber('40')">   </td>
            <td>  <input type="text" name="c105" size="5" id="50" onblur="isNumber('50')">  </td>
            <td>  <input type="text" name="c106" size="10" id="60" onblur="isNumber('60')">  </td>
            <td>  <input type="text" name="c107" size="3" id="70" onblur="isChar(id)" maxlength="3">  </td>
            <td>  <input type="text" name="c108" size="7" id="80" onblur="isNumber('80')">   </td>
            <td>  <input type="text" name="c109" size="7" id="90" onblur="isNumber('90')">   </td>
            <td>  <input type="text" name="c1010" size="1">   </td>
            <td>  <input type="text" name="c1011" size="12">   </td>
            </tr> 
     </table>
           <input type="submit" value="Insert" align="right"  size="10">
 </div>
</form>
</body>

      
</html>




