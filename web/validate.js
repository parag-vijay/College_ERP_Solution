var ck_name = /^[A-Za-z\s]{3,20}$/;
var ck_email = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
var ck_enroll=/^0827[A-Za-z]{2}[0-9]{6}$/;
var ck_date = /^(19|20)[0-9][0-9]-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$/;
 var ck_mobile=/^[789]{1}[0-9]{9}$/;
var ck_bus=/^[Gg][0-9]{2}$/;
var ck_pin=/^[0-9]{3,6}$/;
var ck_num=/^[0-9]{2,9}$/;
 var id = new Array("Student_Name","Student_Enroll_No","Student_dob","College_email_id","Student_mobile_no_1");
function textValidation(id){
    var val = document.getElementById(id).value;
    
    if(id==="Student_Name"){
        if(!ck_name.test(val)){
            document.getElementById(id).value="";
            alert("Enter valid Student Name");
        }
    }
    else if(id==="Student_Enroll_No"){
            if(!ck_enroll.test(val)){
                document.getElementById(id).value="";
                alert("Enter valid Enrollment No");      
            }       
        }
    else if(id==="Student_dob"){
            if(!ck_date.test(val)){
                document.getElementById(id).value="";
                    alert("Enter valid Date of Birth");
            }
    }
    else if(id==="College_email_id"){
            if(!ck_email.test(val)){
                document.getElementById(id).value="";
                    alert("Enter a valid college email id");
            }
    }
     else if(id==="Personal_email_id"){
            if(!ck_email.test(val)){
                document.getElementById(id).value="";
                    alert("Enter a valid personal email id");
            }
    }
     else if(id==="Student_mobile_no_1"){
            if(!ck_mobile.test(val)){
                document.getElementById(id).value="";
                    alert("Enter a valid student mobile no 1");
            }
    }
    else if(id==="Student_mobile_no_2"){
            if(!ck_mobile.test(val)){
                document.getElementById(id).value="";
                    alert("Enter a valid student mobile no 2");
            }
    }
    else if(id==="Bus_no"){
            if(!ck_bus.test(val)){
                document.getElementById(id).value="";
                    alert("Enter a valid bus number e.g. G05 or g11");
            }
    }
    else if(id==="La_city"||id==="Pa_city"){
            if(!ck_name.test(val)){
                document.getElementById(id).value="";
                    alert("Enter a valid City name");
            }
    }

    else if(id==="La_state"||id==="Pa_state"){
            if(!ck_name.test(val)){
                document.getElementById(id).value="";
                    alert("Enter a valid State name");
            }
    }
    else if(id==="Pa_pin_code"||id==="La_pin_code"){
            if(!ck_pin.test(val)){
                document.getElementById(id).value="";
                alert("Enter a valid pin code");
            }        
    }
    else if(id==="Cast"){
            if(!ck_name.test(val)){
                document.getElementById(id).value="";
                alert("Enter a valid cast");
            }        
    }
    else if(id==="Religion"){
            if(!ck_name.test(val)){
                document.getElementById(id).value="";
                alert("Enter a valid religion");
            }        
    }
    else if(id==="Father_name"||id==="Mother_name"){
        if(!ck_name.test(val)){
            document.getElementById(id).value="";
            alert("Enter a valid name");
        }
    }
    else if(id==="Father_dob"||id==="Mother_dob"||id==="Anniversary"){
        if(!ck_date.test(val)){
            document.getElementById(id).value="";
            alert("Enter a valid date");
        }
    }
    
   else if(id==="Father_occupation"||id==="Mother_occupation"){
        if(!ck_name.test(val)){
            document.getElementById(id).value="";
            alert("Enter a valid date");
        }
    }
    
   else if(id==="Father_mobile"||id==="Mother_mobile"||id==="Guardian_mobile"){
        if(!ck_mobile.test(val)){
            document.getElementById(id).value="";
            alert("Enter a valid mobile no.");
        }
    }
    
   else if(id==="Father_email"||id==="Mother_email"){
        if(!ck_email.test(val)){
            document.getElementById(id).value="";
            alert("Enter a valid email address.");
        }
    }
   else if(id==="Income"||id==="Vehicle"){
        if(!ck_num.test(val)){
            document.getElementById(id).value="";
            alert("Invalid input for this field.");
        }
    }
   else if(id==="Sibling_name_1"||id==="Sibling_name_2"||id==="Sibling_name_3"||id==="Guardian_name"){
        if(!ck_name.test(val)){
            document.getElementById(id).value="";
            alert("Enter a valid name.");
        }
    }
     
    
     
     
     
    
}
    var ids = ["Student_Name","Student_Enroll_No","Student_dob","College_email_id","Student_mobile_no_1","Local_address","La_city","La_state","Perma_address","Pa_city","Pa_state","Pa_pin_code","La_pin_code","Cast","Mother_tongue","Religion","Nationality","Father_name","Father_dob","Father_occupation","Father_mobile","Mother_name","Mother_dob","Mother_occupation","Mother_mobile","Guardian_name","Guardian_mobile","Guardian_address"];

function checkReq()
{
    
var rVal;
for(var i=0;i<ids.length;i++){
    rVal = document.getElementById(ids[i]).value;
    
    if(rVal == null||rVal == "")
    {
        alert(ids[i]+" field cannot be empty");
        return false;
    }
    
}
}
var strCount=1; 
function addStrength(){
    strCount++;
    var list = document.getElementById("str_list");
    
    //list.innerHTML += '<li id="strength'+strCount+'"><span class="minusButton" id="Str_minusButton" onclick="minusStrength()">X</span><label>Strength:</label><input type="text" maxlength="20" name="strength'+strCount+'"></li>';
   
    var listEle = document.createElement("li");
    listEle.setAttribute("id","strength"+strCount);
    var minBut = document.createElement("span");
    minBut.setAttribute("class","minusButton");
    minBut.setAttribute("id","Str_minusButton");
    minBut.setAttribute("onclick","minusStrength()");
    var cross="X";
    var crs = document.createTextNode(cross);
    var lbl = document.createElement("label");
    var lblText = "Strength:";
    var lblT = document.createTextNode(lblText);
    var inpt = document.createElement("input");
    inpt.setAttribute("type","text");
    inpt.setAttribute("maxlength","20");
    inpt.setAttribute("name","strength"+strCount);
    
    minBut.appendChild(crs);
    listEle.appendChild(minBut);
    lbl.appendChild(lblT);
    listEle.appendChild(lbl);
    listEle.appendChild(inpt);
    list.appendChild(listEle);
    
    
    
    if(strCount>=5){
        document.getElementById("Str_addButton").style.visibility="hidden";
        
        
    }

}

var weakCount=1;
function addWeakness(){
    weakCount++;
    var list2=document.getElementById("weak_list");
    // list2.innerHTML += '<li id="weakness'+weakCount+'"><span class="minusButton" id="Weak_minusButton" onclick="minusWeakness()">X</span><label>Weakness:</label><input type="text" maxlength="20" name="weakness'+weakCount+'" id="weakness"></li>';
    var listEle = document.createElement("li");
    listEle.setAttribute("id","weakness"+weakCount);
    var minBut = document.createElement("span");
    minBut.setAttribute("class","minusButton");
    minBut.setAttribute("id","Weak_minusButton");
    minBut.setAttribute("onclick","minusWeakness()");
    var cross="X";
    var crs = document.createTextNode(cross);
    var lbl = document.createElement("label");
    var lblText = "Weakness:";
    var lblT = document.createTextNode(lblText);
    var inpt = document.createElement("input");
    inpt.setAttribute("type","text");
    inpt.setAttribute("maxlength","20");
    inpt.setAttribute("name","weakness"+weakCount);
    
    minBut.appendChild(crs);
    listEle.appendChild(minBut);
    lbl.appendChild(lblT);
    listEle.appendChild(lbl);
    listEle.appendChild(inpt);
    list2.appendChild(listEle);
    
    if(weakCount>=5){
        document.getElementById("Weak_addButton").style.visibility="hidden";
        
        
    }

}

function minusStrength(){
    
    var elemnt=document.getElementById("strength"+strCount);
    elemnt.parentNode.removeChild(elemnt);
    strCount--;
    if(strCount<5)
    {
        document.getElementById("Str_addButton").style.visibility="visible";
    }
}
function minusWeakness(){
    
    var elemnt=document.getElementById("weakness"+weakCount);
    elemnt.parentNode.removeChild(elemnt);
    weakCount--;
    if(weakCount<5)
    {
        document.getElementById("Weak_addButton").style.visibility="visible";
    }
}
