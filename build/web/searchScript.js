/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function refineSearch(id)
{
   document.getElementById("search-div2").innerHTML="";
   document.getElementById("search-button").innerHTML="";
    if(id==="enrollment-vise")
    {
        var element1 = document.createElement("textarea");
        element1.setAttribute("name","enrollmentno");
        element1.setAttribute("id","enrollment");
        element1.setAttribute("placeholder","Enter Enrollment No");
        element1.setAttribute("value","");
        document.getElementById("search-div2").appendChild(element1);
        
        
        
    }
    else if(id==="branch-vise")
    {
        var element1 = document.createElement("select");
        var option1 = document.createElement("option");
        option1.setAttribute("value","IT");
        option1.appendChild(document.createTextNode("IT"));
        
        var option2 = document.createElement("option");
        option2.setAttribute("value","CS");
        option2.appendChild(document.createTextNode("CS"));

        var option3 = document.createElement("option");
        option3.setAttribute("value","ME");
        option3.appendChild(document.createTextNode("ME"));

                var option4 = document.createElement("option");
        option4.setAttribute("value","CE");
        option4.appendChild(document.createTextNode("CE"));

                var option5 = document.createElement("option");
        option5.setAttribute("value","EC");
        option5.appendChild(document.createTextNode("EC"));
        
                var option6 = document.createElement("option");
        option6.setAttribute("value","MCA");
        option6.appendChild(document.createTextNode("MCA"));


        
        element1.appendChild(option1);
        
        
        element1.appendChild(option2);
        
        element1.appendChild(option3);
        
        element1.appendChild(option4);
        
        element1.appendChild(option5);
        
        element1.appendChild(option6);
        document.getElementById("search-div2").appendChild(element1);
    }
    else if(id==="year-vise")
    {
        var element1 = document.createElement("select");
        var option1 = document.createElement("option");
        option1.setAttribute("value","1");
        option1.appendChild(document.createTextNode("1"));
        
        var option2 = document.createElement("option");
        option2.setAttribute("value","2");
        option2.appendChild(document.createTextNode("2"));

        var option3 = document.createElement("option");
        option3.setAttribute("value","3");
        option3.appendChild(document.createTextNode("3"));

                var option4 = document.createElement("option");
        option4.setAttribute("value","4");
        option4.appendChild(document.createTextNode("4"));
        
        element1.appendChild(option1);
        
        
        element1.appendChild(option2);
        
        element1.appendChild(option3);
        
        element1.appendChild(option4);
        
        document.getElementById("search-div2").appendChild(element1);

                
    
    }
        var element2 = document.createElement("select");
        var option1 = document.createElement("option");
        option1.setAttribute("value","Personal Detail");
        option1.appendChild(document.createTextNode("Personal Detail"));
        
        var option2 = document.createElement("option");
        option2.setAttribute("value","Academic Detail");
        option2.appendChild(document.createTextNode("Academic Detail"));
        
        element2.appendChild(option1);
        element2.appendChild(option2);
        document.getElementById("search-div2").appendChild(element2);
        
        var searchButton = document.createElement("button");
        searchButton.setAttribute("name","search-button");
        searchButton.appendChild(document.createTextNode("Search"));
        document.getElementById("search-button").appendChild(searchButton);
        
        
    
}


