function TimeTable(ins)
{    
    for(var i=1;i<ins;i++)
        {
            if(Document.getElementById("t3"+ins).value==Document.getElementById("t3"+i).value)
                {
                    if(Document.getElementById("t2"+ins).value==Document.getElementById("t2"+i).value)
                        {
                            if(Document.getElementById("t6"+ins).value==Document.getElementById("t6"+i).value)
                                {
                                   Document.getElementById("t6"+ins).value="" ;
                                    alert("Enter valid Time their is collision in time");
                                }
                      else if(Document.getElementById("t4"+ins).value==Document.getElementById("t4"+i).value && Document.getElementById("t8"+ins).value==Document.getElementById("t8"+i).value ) 
                          {
                              Document.getElementById("t8"+ins).value="" ;
                                    alert("Enter valid Time their is collision in classes");
                          }
                          else if(Document.getElementById("t7"+ins).value==Document.getElementById("t7"+i).value) 
                          {
                              Document.getElementById("t7"+ins).value="" ;
                                    alert("Enter valid Time their is collision in classes");
                          }
                        }
                }
        }
}

