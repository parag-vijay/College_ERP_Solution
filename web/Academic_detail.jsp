<%-- 
    Document   : Academic_detail
    Created on : Nov 23, 2014, 4:07:59 PM
    Author     : lenovo
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="javap.Compitive_exam"%>
<%@page import="javap.Higher_study"%>
<%@page import="javap.Acedemic_record"%>
<%@page import="javap.Student_record"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="java.awt.geom.QuadCurve2D"%>

<%@page import="javap.Convert"%>
<%@page import="java.io.IOException" %>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <script type="text/javascript" src="validate.js"></script>
        <script type="text/javascript" src="city_state.js"></script>
        <title></title>
    </head>
    <body>
       
        <%! public List<javap.Acedemic_record> lt=new ArrayList<Acedemic_record>();%>
             <%! public Acedemic_record e[]=new Acedemic_record[8]; %>
     <%! public int f=0;%>
     <%! public SessionFactory sf;%>
     <%! public Session s ;%>
  <%  HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
  
  try {
      
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Acedemic_record.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Acedemic_record where user_name='"+pa+"'");
lt=q.list();

if(lt.isEmpty())
    { 
    for(int j=0;j<8;j++)
    {
    e[j]=new Acedemic_record();
    e[j].setS_no(j+1);
    e[j].setUser_name(pa);
    s.save(e[j]);
       }
   f=1;
    }
else{%> <%!int i=0;%>
<%for(Iterator t=lt.iterator();t.hasNext();)  
{
   e[i]=( Acedemic_record)t.next();  
    i++;    
}    
 i=0;
} 
tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
  <form class="student-form" onsubmit="return checkReq()" action="Academic" method="post">
        <fieldset>
            <legend>Academic Performance Detail</legend>
            <table>
                <tr>
                    <th>Semester</th>
                    <th>Session</th>
                    <th>Marks Obtained</th>
                    <th>Max Mark</th>
                    <th>Result</th>
                    <th>Division</th>
                    <th>Grade</th>
                    <th>Due Paper(if any)</th>
                    <th>Remarks</th>
                    
                </tr>
                
                <tr class="tableTxt">
                    <td><input type="text" name="t11" size="1" id="tableSem" required onchange="textValidation(id)" value="<%= e[0].getSem()%>"></td>    
                     <td><input type="text" name="t12" size="9" id="tableSession" required onchange="textValidation(id)" value="<%= e[0].getSession()%>"></td>    
                        <td> <input type="text" name="t13" size="3" id="tableMarksObtained" required onchange="textValidation(id)" value="<%= e[0].getMarks_obtnd()%>">    </td>
                        <td> <input type="text" name="t14" size="3" required id="tableMaxMarks" onchange="textValidation(id)" value="<%= e[0].getMax_mrks()%>">   </td>
                        <td>  <input type="text" name="t15" size="4" required id="tableResult" onchange="textValidation(id)" value="<%= e[0].getResul()%>">  </td>
                        <td>  <input type="text" name="t16" size="1" required id="tableDivision" onchange="textValidation(id)" value="<%= e[0].getDivision()%>">  </td>
                        <td>  <input type="text" name="t17" size="1" required id="tableGrade" onchange="textValidation(id)" value="<%= e[0].getGrade()%>">  </td>
                        <td>  <input type="text" name="t18" size="20" required id="tableDuePaper" onchange="textValidation(id)" value="<%=e[0].getDue_paper()%>">  </td>            
                        <td>  <input type="text" name="t19" size="20" required id="tableRemarks" onchange="textValidation(id)" value="<%=e[0].getRemarks()%>">  </td>
                        
                </tr>
                
                <tr class="tableTxt">
                    <td><input type="text" name="t21" size="1" id="tableSem" required onchange="textValidation(id)" value="<%=e[1].getSem()%>"></td>    
                     <td><input type="text" name="t22" size="9" id="tableSession" required onchange="textValidation(id)" value="<%= e[1].getSession()%>"></td>    
                        <td> <input type="text" name="t23" size="3" id="tableMarksObtained" required onchange="textValidation(id)" value="<%= e[1].getMarks_obtnd()%>">    </td>
                        <td> <input type="text" name="t24" size="3" required id="tableMaxMarks" onchange="textValidation(id)" value="<%= e[1].getMax_mrks()%>">   </td>
                        <td>  <input type="text" name="t25" size="4" required id="tableResult" onchange="textValidation(id)" value="<%= e[1].getResul()%>">  </td>
                        <td>  <input type="text" name="t26" size="1" required id="tableDivision" onchange="textValidation(id)" value="<%= e[1].getDivision()%>">  </td>
                        <td>  <input type="text" name="t27" size="1" required id="tableGrade" onchange="textValidation(id)" value="<%= e[1].getGrade()%>">  </td>
                        <td>  <input type="text" name="t28" size="20" required id="tableDuePaper" onchange="textValidation(id)" value="<%=e[1].getDue_paper()%>">  </td>            
                        <td>  <input type="text" name="t29" size="20" required id="tableRemarks" onchange="textValidation(id)" value="<%=e[1].getRemarks()%>">  </td>
                        
                </tr>
                <tr class="tableTxt">
                    <td><input type="text" name="t31" size="1" id="tableSem" required onchange="textValidation(id)" value="<%=e[2].getSem()%>"></td>    
                     <td><input type="text" name="t32" size="9" id="tableSession" required onchange="textValidation(id)" value="<%= e[2].getSession()%>"></td>    
                        <td> <input type="text" name="t33" size="3" id="tableMarksObtained" required onchange="textValidation(id)" value="<%=e[2].getMarks_obtnd()%>">    </td>
                        <td> <input type="text" name="t34" size="3" required id="tableMaxMarks" onchange="textValidation(id)" value="<%=e[2].getMax_mrks()%>">   </td>
                        <td>  <input type="text" name="t35" size="4" required id="tableResult" onchange="textValidation(id)" value="<%=e[2].getResul()%>">  </td>
                        <td>  <input type="text" name="t36" size="1" required id="tableDivision" onchange="textValidation(id)" value="<%= e[2].getDivision()%>">  </td>
                        <td>  <input type="text" name="t37" size="1" required id="tableGrade" onchange="textValidation(id)" value="<%= e[2].getGrade()%>">  </td>
                        <td>  <input type="text" name="t38" size="20" required id="tableDuePaper" onchange="textValidation(id)" value="<%=e[2].getDue_paper()%>">  </td>            
                        <td>  <input type="text" name="t39" size="20" required id="tableRemarks" onchange="textValidation(id)" value="<%= e[2].getRemarks()%>">  </td>
                        
                </tr>
                <tr class="tableTxt">
                    <td><input type="text" name="t41" size="1" id="tableSem" required onchange="textValidation(id)" value="<%=e[3].getSem()%>"></td>    
                     <td><input type="text" name="t42" size="9" id="tableSession" required onchange="textValidation(id)" value="<%= e[3].getSession()%>"></td>    
                        <td> <input type="text" name="t43" size="3" id="tableMarksObtained" required onchange="textValidation(id)" value="<%= e[3].getMarks_obtnd()%>">    </td>
                        <td> <input type="text" name="t44" size="3" required id="tableMaxMarks" onchange="textValidation(id)" value="<%= e[3].getMax_mrks()%>" >   </td>
                        <td>  <input type="text" name="t45" size="4" required id="tableResult" onchange="textValidation(id)" value="<%=e[3].getResul()%>">  </td>
                        <td>  <input type="text" name="t46" size="1" required id="tableDivision" onchange="textValidation(id)" value="<%= e[3].getDivision()%>">  </td>
                        <td>  <input type="text" name="t47" size="1" required id="tableGrade" onchange="textValidation(id)" value="<%=e[3].getGrade()%>">  </td>
                        <td>  <input type="text" name="t48" size="20" required id="tableDuePaper" onchange="textValidation(id)" value="<%=e[3].getDue_paper()%>">  </td>            
                        <td>  <input type="text" name="t49" size="20" required id="tableRemarks" onchange="textValidation(id)" value="<%=e[3].getRemarks()%>">  </td>
                        
                </tr>
                <tr class="tableTxt">
                    <td><input type="text" name="t51" size="1" id="tableSem" required onchange="textValidation(id)" value="<%=e[4].getSem()%>"></td>    
                     <td><input type="text" name="t52" size="9" id="tableSession" required onchange="textValidation(id)" value="<%= e[4].getSession()%>"></td>    
                        <td> <input type="text" name="t53" size="3" id="tableMarksObtained" required onchange="textValidation(id)" value="<%= e[4].getMarks_obtnd()%>">    </td>
                        <td> <input type="text" name="t54" size="3" required id="tableMaxMarks" onchange="textValidation(id)" value="<%= e[4].getMax_mrks()%>">   </td>
                        <td>  <input type="text" name="t55" size="4" required id="tableResult" onchange="textValidation(id)" value="<%=e[4].getResul()%>">  </td>
                        <td>  <input type="text" name="t56" size="1" required id="tableDivision" onchange="textValidation(id)" value="<%= e[4].getDivision()%>" >  </td>
                        <td>  <input type="text" name="t57" size="1" required id="tableGrade" onchange="textValidation(id)" value="<%=e[4].getGrade()%>">  </td>
                        <td>  <input type="text" name="t58" size="20" required id="tableDuePaper" onchange="textValidation(id)" value="<%=e[4].getDue_paper()%>">  </td>            
                        <td>  <input type="text" name="t59" size="20" required id="tableRemarks" onchange="textValidation(id)" value="<%=e[4].getRemarks()%>">  </td>
                        
                </tr>
                <tr class="tableTxt">
                    <td><input type="text" name="t61" size="1" id="tableSem" required onchange="textValidation(id)" value="<%=e[5].getSem()%>"></td>    
                     <td><input type="text" name="t62" size="9" id="tableSession" required onchange="textValidation(id)" value="<%= e[5].getSession()%>"></td>    
                        <td> <input type="text" name="t63" size="3" id="tableMarksObtained" required onchange="textValidation(id)" value="<%= e[5].getMarks_obtnd()%>">    </td>
                        <td> <input type="text" name="t64" size="3" required id="tableMaxMarks" onchange="textValidation(id)" value="<%= e[5].getMax_mrks()%>">   </td>
                        <td>  <input type="text" name="t65" size="4" required id="tableResult" onchange="textValidation(id)" value="<%=e[5].getResul()%>">  </td>
                        <td>  <input type="text" name="t66" size="1" required id="tableDivision" onchange="textValidation(id)" value="<%= e[5].getDivision()%>">  </td>
                        <td>  <input type="text" name="t67" size="1" required id="tableGrade" onchange="textValidation(id)" value="<%=e[5].getGrade()%>">  </td>
                        <td>  <input type="text" name="t68" size="20" required id="tableDuePaper" onchange="textValidation(id)" value="<%=e[5].getDue_paper()%>">  </td>            
                        <td>  <input type="text" name="t69" size="20" required id="tableRemarks" onchange="textValidation(id)" value="<%=e[5].getRemarks()%>">  </td>
                        
                </tr>
                <tr class="tableTxt">
                    <td><input type="text" name="t71" size="1" id="tableSem" required onchange="textValidation(id)" value="<%=e[6].getSem()%>"></td>    
                     <td><input type="text" name="t72" size="9" id="tableSession" required onchange="textValidation(id)" value="<%= e[6].getSession()%>"></td>    
                        <td> <input type="text" name="t73" size="3" id="tableMarksObtained" required onchange="textValidation(id)" value="<%= e[6].getMarks_obtnd()%>">    </td>
                        <td> <input type="text" name="t74" size="3" required id="tableMaxMarks" onchange="textValidation(id)" value="<%= e[6].getMax_mrks()%>">   </td>
                        <td>  <input type="text" name="t75" size="4" required id="tableResult" onchange="textValidation(id)" value="<%=e[6].getResul()%>">  </td>
                        <td>  <input type="text" name="t76" size="1" required id="tableDivision" onchange="textValidation(id)" value="<%= e[6].getDivision()%>">  </td>
                        <td>  <input type="text" name="t77" size="1" required id="tableGrade" onchange="textValidation(id)" value="<%=e[6].getGrade()%>">  </td>
                        <td>  <input type="text" name="t78" size="20" required id="tableDuePaper" onchange="textValidation(id)" value="<%=e[6].getDue_paper()%>">  </td>            
                        <td>  <input type="text" name="t79" size="20" required id="tableRemarks" onchange="textValidation(id)" value="<%=e[6].getRemarks()%>">  </td>
                        
                </tr>
                <tr class="tableTxt">
                    <td><input type="text" name="t81" size="1" id="tableSem" required onchange="textValidation(id)" value="<%=e[7].getSem()%>"></td>    
                     <td><input type="text" name="t82" size="9" id="tableSession" required onchange="textValidation(id)" value="<%= e[7].getSession()%>"></td>    
                        <td> <input type="text" name="t83" size="3" id="tableMarksObtained" required onchange="textValidation(id)" value="<%= e[7].getMarks_obtnd()%>">    </td>
                        <td> <input type="text" name="t84" size="3" required id="tableMaxMarks" onchange="textValidation(id)" value="<%= e[7].getMax_mrks()%>">   </td>
                        <td>  <input type="text" name="t85" size="4" required id="tableResult" onchange="textValidation(id)" value="<%=e[7].getResul()%>">  </td>
                        <td>  <input type="text" name="t86" size="1" required id="tableDivision" onchange="textValidation(id)" value="<%= e[7].getDivision()%>">  </td>
                        <td>  <input type="text" name="t87" size="1" required id="tableGrade" onchange="textValidation(id)" value="<%=e[7].getGrade()%>">  </td>
                        <td>  <input type="text" name="t88" size="20" required id="tableDuePaper" onchange="textValidation(id)" value="<%=e[7].getDue_paper()%>">  </td>            
                        <td>  <input type="text" name="t89" size="20" required id="tableRemarks" onchange="textValidation(id)" value="<%=e[7].getRemarks()%>">  </td>
                        
                </tr>
               
            </table>
            
        </fieldset>
                        <%! public List<javap.Compitive_exam> lt1=new ArrayList<Compitive_exam>();%>
                          <%! public Compitive_exam e1[]=new Compitive_exam[4]; %>
     
  <% try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Compitive_exam.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx1=s.beginTransaction();
Query q1=s.createQuery("from javap.Compitive_exam where user_name='"+pa+"'");
lt1=q1.list();%>
<%!int count=0;%>
<%if(lt1.isEmpty())
    { 
    for( int j=0;j<4;j++)
    {
    e1[j]=new Compitive_exam();
    e1[j].setUser_name(pa);
    e1[j].setS_no(j+1);
    s.save(e1[j]);
     count++;
       }
   f=1;
    }
else{%> 
<%for(Iterator t=lt1.iterator();t.hasNext();)  
{
   e1[count]=(Compitive_exam)t.next();  
    count++;    
}    
 count=0;
} 
tx1.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
            
            <fieldset>
            <legend>Competitive Exam Performance</legend>
            <table>
                <tr>
                    <th>Date</th>
                    <th>Exam Name</th>
                    <th>Type</th>
                    <th>Marks Obtained</th>
                    <th>max Marks</th>
                    <th>%</th>
                    <th>Rank</th>
                    <th>Quota Name</th>
                    <th>Quota Rank</th>
                    <th>Remark</th>
                </tr>
                
                <tr class="tableTxt">
                    <td>  <input type="text" name="p11" size="6" id="ComDate" onchange="textValidation(id)" required value="<%=e1[0].getDate()%>">  </td>    
                     <td>  <input type="text" name="p12" size="20" id="ComExName" onchange="textValidation(id)" required value="<%=e1[0].getExam_name()%>">  </td>    
                        <td> <input type="text" name="p13" size="8" id="ComType" onchange="textValidation(id)" required value="<%=e1[0].getType()%>">    </td>
                        <td> <input type="text" name="p14" size="14" id="ComMarksObt" onchange="textValidation(id)" required value="<%=e1[0].getMarks_obtnd()%>">   </td>
                        <td>  <input type="text" name="p15" size="5" id="ComMaxMarks" onchange="textValidation(id)" required value="<%=e1[0].getMax_marks()%>">  </td>
                        <td>  <input type="text" name="p16" size="5" id="ComPercantage" onchange="textValidation(id)" required value="<%=e1[0].getPercentage()%>">  </td>
                        <td>  <input type="text" name="p17" size="10" id="ComRank" onchange="textValidation(id)" required value="<%=e1[0].getRank()%>">  </td>
                        <td>  <input type="text" name="p18" size="15" id="ComQuotaName" onchange="textValidation(id)" required value="<%=e1[0].getQuota_name()%>">  </td>            
                        <td>  <input type="text" name="p19" size="10" id="ComQuotaRank" onchange="textValidation(id)" required value="<%=e1[0].getQuota_rank()%>">  </td>
                        <td>  <input type="text" name="p110" size="10" id="ComRemark" onchange="textValidation(id)" required value="<%=e1[0].getRemark()%>">  </td>
                </tr>
                <tr class="tableTxt">
                    <td>  <input type="text" name="p21" size="6" id="ComDate" onchange="textValidation(id)" required value="<%=e1[1].getDate()%>">  </td>    
                     <td>  <input type="text" name="p22" size="20" id="ComExName" onchange="textValidation(id)" required value="<%=e1[1].getExam_name()%>">  </td>    
                        <td> <input type="text" name="p23" size="8" id="ComType" onchange="textValidation(id)" required value="<%=e1[1].getType()%>">    </td>
                        <td> <input type="text" name="p24" size="14" id="ComMarksObt" onchange="textValidation(id)" required value="<%=e1[1].getMarks_obtnd()%>">   </td>
                        <td>  <input type="text" name="p25" size="5" id="ComMaxMarks" onchange="textValidation(id)" required value="<%=e1[1].getMax_marks()%>">  </td>
                        <td>  <input type="text" name="p26" size="5" id="ComPercantage" onchange="textValidation(id)" required value="<%=e1[1].getPercentage()%>">  </td>
                        <td>  <input type="text" name="p27" size="10" id="ComRank" onchange="textValidation(id)" required value="<%=e1[1].getRank()%>">  </td>
                        <td>  <input type="text" name="p28" size="15" id="ComQuotaName" onchange="textValidation(id)" required value="<%=e1[1].getQuota_name()%>">  </td>            
                        <td>  <input type="text" name="p29" size="10" id="ComQuotaRank" onchange="textValidation(id)" required value="<%=e1[1].getQuota_rank()%>">  </td>
                        <td>  <input type="text" name="p210" size="10" id="ComRemark" onchange="textValidation(id)" required value="<%=e1[1].getRemark()%>">  </td>
                </tr>
                <tr class="tableTxt">
                    <td>  <input type="text" name="p31" size="6" id="ComDate" onchange="textValidation(id)" required value="<%=e1[2].getDate()%>">  </td>    
                     <td>  <input type="text" name="p32" size="20" id="ComExName" onchange="textValidation(id)" required value="<%=e1[2].getExam_name()%>">  </td>    
                        <td> <input type="text" name="p33" size="8" id="ComType" onchange="textValidation(id)" required value="<%=e1[2].getType()%>">    </td>
                        <td> <input type="text" name="p34" size="14" id="ComMarksObt" onchange="textValidation(id)" required value="<%=e1[2].getMarks_obtnd()%>">   </td>
                        <td>  <input type="text" name="p35" size="5" id="ComMaxMarks" onchange="textValidation(id)" required value="<%=e1[2].getMax_marks()%>">  </td>
                        <td>  <input type="text" name="p36" size="5" id="ComPercantage" onchange="textValidation(id)" required value="<%=e1[2].getPercentage()%>">  </td>
                        <td>  <input type="text" name="p37" size="10" id="ComRank" onchange="textValidation(id)" required value="<%=e1[2].getRank()%>">  </td>
                        <td>  <input type="text" name="p38" size="15" id="ComQuotaName" onchange="textValidation(id)" required value="<%=e1[2].getQuota_name()%>">  </td>            
                        <td>  <input type="text" name="p39" size="10" id="ComQuotaRank" onchange="textValidation(id)" required value="<%=e1[2].getQuota_rank()%>">  </td>
                        <td>  <input type="text" name="p310" size="10" id="ComRemark" onchange="textValidation(id)" required value="<%=e1[2].getRemark()%>">  </td>
                </tr>
                <tr class="tableTxt">
                    <td>  <input type="text" name="p41" size="6" id="ComDate" onchange="textValidation(id)" required value="<%=e1[3].getDate()%>">  </td>    
                     <td>  <input type="text" name="p42" size="20" id="ComExName" onchange="textValidation(id)" required value="<%=e1[3].getExam_name()%>">  </td>    
                        <td> <input type="text" name="p43" size="8" id="ComType" onchange="textValidation(id)" required value="<%=e1[3].getType()%>">    </td>
                        <td> <input type="text" name="p44" size="14" id="ComMarksObt" onchange="textValidation(id)" required value="<%=e1[3].getMarks_obtnd()%>">   </td>
                        <td>  <input type="text" name="p45" size="5" id="ComMaxMarks" onchange="textValidation(id)" required value="<%=e1[3].getMax_marks()%>">  </td>
                        <td>  <input type="text" name="p46" size="5" id="ComPercantage" onchange="textValidation(id)" required value="<%=e1[3].getPercentage()%>">  </td>
                        <td>  <input type="text" name="p47" size="10" id="ComRank" onchange="textValidation(id)" required value="<%=e1[3].getRank()%>">  </td>
                        <td>  <input type="text" name="p48" size="15" id="ComQuotaName" onchange="textValidation(id)" required value="<%=e1[3].getQuota_name()%>">  </td>            
                        <td>  <input type="text" name="p49" size="10" id="ComQuotaRank" onchange="textValidation(id)" required value="<%=e1[3].getQuota_rank()%>">  </td>
                        <td>  <input type="text" name="p410" size="10" id="ComRemark" onchange="textValidation(id)" required value="<%=e1[3].getRemark()%>">  </td>
                </tr>
                
            </table>
        </fieldset>
                        <%! public List<javap.Higher_study> lt2=new ArrayList<Higher_study>();%>
                          <%!public Higher_study e2=new Higher_study(); %>
     
  <% try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Higher_study.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx2=s.beginTransaction();
Query q2=s.createQuery("from javap.Higher_study where user_name='"+pa+"'");
lt2=q2.list();

if(lt2.isEmpty())
    { 
   e2=new Higher_study();
   e2.setUser_name(pa);
   s.save(e2);
   f=1;
    }
else{
Iterator t=lt2.iterator(); 
e2=(Higher_study)t.next();  
} 
tx2.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
        <fieldset>
            <legend>Higher Studies</legend>
            <table>
                <tr class="tableTxt">
                    <td class="txt"><span>Course Name</span></td><td class="in"><input type="text" name="H_course_name" value="<%=e2.getCourse_name()%>"></td>
                    <td class="txt"><span>Specialization</span></td><td class="in"><input type="text" name="H_specialization" value="<%=e2.getSpecialisation()%>"></td>
                    <td class="txt"><span>Year</span></td><td class="in"><input type="text" name="H_year" value="<%=e2.getYear()%>"></td>   
                </tr>
                <tr>
                    <td class="txt"><span>Institute Name:</span></td><td class="in"><input type="text" name="H_name" value="<%=e2.getInstitute_name()%>"></td>
                    <td class="txt"><span>University Name:</span></td><td class="in"><input type="text" name="H_university_name" value="<%=e2.getUniversity_name()%>"></td>
                </tr>
                <tr>
                    <td class="txt"><span>City</span></td><td class="in"><input type="text" name="H_city" value="<%=e2.getCity()%>"></td>
                    <td class="txt"><span>Country</span></td><td class="in"><input type="text" name="H_country" value="<%=e2.getCountry()%>"></td>
                </tr>
            </table>
            <span></span>
        </fieldset>
        <div>
            <% if(f==1)
                             {%>   
             <input type="submit" value="Insert" class="submit_btn">
             <%} 
               else
                 {%>
            <input type="submit" value="Update" class="submit_btn">
            <%}%>
            <input type="button" value="Next" class="reset_btn" onclick="document.location='Placement1.jsp'">
           <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
        </div>
        
        
        </form>
    </body>
</html>

