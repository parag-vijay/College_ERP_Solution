<%-- 
    Document   : Placement
    Created on : Nov 22, 2014, 10:56:36 PM
    Author     : n()t Me
--%>

<%@page import="javap.Joining"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javap.Training_certificate"%>
<%@page import="javap.Placement1"%>
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
        <link type="text/css" rel="stylesheet" href="newcss.css">
        <script type="text/javascript" src="validate.js"></script>
        <title></title>
    </head>
    <body>
        <%! public List<javap.Placement1> lt=new ArrayList<javap.Placement1>();%>
     <%! public Placement1 e[]=new Placement1[5];%>
     <%! public int f=0;%>
     <%! public SessionFactory sf;%>
     <%! public Session s;%>
  <%
  HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
  try {
       
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Placement1.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Placement1 where user_name='"+pa+"'");
lt=q.list();

if(lt.isEmpty())
    { for(int j=0;j<5;j++)
                   {
        e[j]=new Placement1();
        e[j].setUser_name(pa);
        e[j].setS_no(j+1);
        s.save(e[j]);
               }
   f=1;
    }
else{%> <%! int i=0; %>
<%for(Iterator t=lt.iterator();t.hasNext();)
{
e[i]=(Placement1)t.next();
i++;
} 
 i=0;
   }
tx.commit();
s.close();}
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
 <form action="Placement2" name="myForm" method="post">
 <fieldset>
            <legend>PLACEMENT</legend>
            <table>
                <tr>
                    <th>Date</th>
                    <th>Company Name</th>
                    <th>Designation</th>
                    <th>Job Type</th>
                    <th>Annual Package</th>
                    <th>Office Letter</th>
                    <th>Open/Close Campus</th>
                    <th>Remarks</th>
                    
                    
                </tr>
                <tr class="tableTxt">
                    <td>  <input type="text" name="s11" size="13" id="pdate" required onchange="textValidation(id)"  value="<%=e[0].getDate1()%>">  </td>    
            <td>  <input type="text" name="s12" size="20" id="pCompName" required onchange="textValidation(id)" value="<%=e[0].getCompany_name()%>">  </td>    
            <td> <input type="text" name="s13" size="8" id="pDes" required onchange="textValidation(id)" value="<%=e[0].getDesignation_or_job_tile()%>">    </td>
            <td> <input type="text" name="s14" size="14" id="pJob" required onchange="textValidation(id)" value="<%=e[0].getJob_type()%>"> </td>
            <td>  <input type="text" name="s15" size="5" id="pAnnual" required onchange="textValidation(id)" value="<%=e[0].getAnnual_package()%>"></td>
            <td>  <input type="text" name="s16" size="5" id="pOffice" required onchange="textValidation(id)" value="<%=e[0].getOffice_letter()%>">  </td>
            <td>  <input type="text" name="s17" size="10" id="pOpen" required onchange="textValidation(id)" value="<%=e[0].getOpen_or_close_campus()%>">  </td>
            <td>  <input type="text" name="s18" size="15" id="pRemarks" required onchange="textValidation(id)" value="<%=e[0].getRemarks()%>">  </td>            
         </tr>
         <tr class="tableTxt">
                    <td>  <input type="text" name="s21" size="13" id="pdate" required onchange="textValidation(id)" value="<%=e[1].getDate1()%>">  </td>    
            <td>  <input type="text" name="s22" size="20" id="pCompName" required onchange="textValidation(id)" value="<%=e[1].getCompany_name()%>">  </td>    
            <td> <input type="text" name="s23" size="8" id="pDes" required onchange="textValidation(id)"  value="<%=e[1].getDesignation_or_job_tile()%>">    </td>
            <td> <input type="text" name="s24" size="14" id="pJob" required onchange="textValidation(id)" value="<%=e[1].getJob_type()%>"> </td>
            <td>  <input type="text" name="s25" size="5" id="pAnnual" required onchange="textValidation(id)" value="<%=e[1].getAnnual_package()%>"></td>
            <td>  <input type="text" name="s26" size="5" id="pOffice" required onchange="textValidation(id)" value="<%=e[1].getOffice_letter()%>">  </td>
            <td>  <input type="text" name="s27" size="10" id="pOpen" required onchange="textValidation(id)" value="<%=e[1].getOpen_or_close_campus()%>">  </td>
            <td>  <input type="text" name="s28" size="15" id="pRemarks" required onchange="textValidation(id)" value="<%=e[1].getRemarks()%>">  </td>            
         </tr>
         
         <tr class="tableTxt">
                    <td>  <input type="text" name="s31" size="13" id="pdate" required onchange="textValidation(id)" value="<%=e[2].getDate1()%>">  </td>    
            <td>  <input type="text" name="s32" size="20" id="pCompName" required onchange="textValidation(id)" value="<%=e[2].getCompany_name()%>">  </td>    
            <td> <input type="text" name="s33" size="8" id="pDes" required onchange="textValidation(id)"  value="<%=e[2].getDesignation_or_job_tile()%>">    </td>
            <td> <input type="text" name="s34" size="14" id="pJob" required onchange="textValidation(id)" value="<%=e[2].getJob_type()%>"> </td>
            <td>  <input type="text" name="s35" size="5" id="pAnnual" required onchange="textValidation(id)" value="<%=e[2].getAnnual_package()%>"></td>
            <td>  <input type="text" name="s36" size="5" id="pOffice" required onchange="textValidation(id)" value="<%=e[2].getOffice_letter()%>">  </td>
            <td>  <input type="text" name="s37" size="10" id="pOpen" required onchange="textValidation(id)" value="<%=e[2].getOpen_or_close_campus()%>">  </td>
            <td>  <input type="text" name="s38" size="15" id="pRemarks" required onchange="textValidation(id)" value="<%=e[2].getRemarks()%>">  </td>            
         </tr>
         
         <tr class="tableTxt">
                    <td>  <input type="text" name="s41" size="13" id="pdate" required onchange="textValidation(id)" value="<%=e[3].getDate1()%>">  </td>    
            <td>  <input type="text" name="s42" size="20" id="pCompName" required onchange="textValidation(id)" value="<%=e[3].getCompany_name()%>">  </td>    
            <td> <input type="text" name="s43" size="8" id="pDes" required onchange="textValidation(id)"  value="<%=e[3].getDesignation_or_job_tile()%>">    </td>
            <td> <input type="text" name="s44" size="14" id="pJob" required onchange="textValidation(id)" value="<%=e[3].getJob_type()%>"> </td>
            <td>  <input type="text" name="s45" size="5" id="pAnnual" required onchange="textValidation(id)"  value="<%=e[3].getAnnual_package()%>"></td>
            <td>  <input type="text" name="s46" size="5" id="pOffice" required onchange="textValidation(id)" value="<%=e[3].getOffice_letter()%>">  </td>
            <td>  <input type="text" name="s47" size="10" id="pOpen" required onchange="textValidation(id)"  value="<%=e[3].getOpen_or_close_campus()%>">  </td>
            <td>  <input type="text" name="s48" size="15" id="pRemarks" required onchange="textValidation(id)" value="<%=e[3].getRemarks()%>">  </td>            
         </tr>
         
         <tr class="tableTxt">
                    <td>  <input type="text" name="s51" size="13" id="pdate" required onchange="textValidation(id)" value="<%=e[4].getDate1()%>">  </td>    
            <td>  <input type="text" name="s52" size="20" id="pCompName" required onchange="textValidation(id)" value="<%=e[4].getCompany_name()%>">  </td>    
            <td> <input type="text" name="s53" size="8" id="pDes" required onchange="textValidation(id)" value="<%=e[4].getDesignation_or_job_tile()%>">    </td>
            <td> <input type="text" name="s54" size="14" id="pJob" required onchange="textValidation(id)" value="<%=e[4].getJob_type()%>"> </td>
            <td>  <input type="text" name="s55" size="5" id="pAnnual" required onchange="textValidation(id)"  value="<%=e[4].getAnnual_package()%>"></td>
            <td>  <input type="text" name="s56" size="5" id="pOffice" required onchange="textValidation(id)" value="<%=e[4].getOffice_letter()%>">  </td>
            <td>  <input type="text" name="s57" size="10" id="pOpen" required onchange="textValidation(id)" value="<%=e[4].getOpen_or_close_campus()%>">  </td>
            <td>  <input type="text" name="s58" size="15" id="pRemarks" required onchange="textValidation(id)" value="<%=e[4].getRemarks()%>">  </td>            
         </tr>
         
                
         </table>
          <%! public List<javap.Joining> lt2=new ArrayList<javap.Joining>();%>
     <%! public javap.Joining e2=new javap.Joining();%>
    
  <% try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Joining.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx2=s.beginTransaction();
Query q2=s.createQuery("from javap.Joining where user_name='"+pa+"'");
lt2=q2.list();

if(lt2.isEmpty())
    { 
        e2=new javap.Joining();
      e2.setUser_name(pa);
      s.save(e2);
   f=1;
    }
else{
Iterator t=lt2.iterator();
e2=(Joining)t.next();
}
tx2.commit();
s.close();
   }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
            <table>
                    <tr><td><span>Joint In :</span></td><td><input type="text" name="JoinInDate" value="<%=e2.getJoint_in()%>"></td>
                    <td><span>City :</span></td><td><input type="text" name="JoiningCity" value="<%=e2.getCity()%>"></td></tr>
                    <tr><td><span>Country :</span></td><td><input type="text" name="JoiningCountry" value="<%=e2.getCountry()%>"></td>
                    <td><span>Year :</span></td><td><input type="text" name="JoiningYear" value="<%=e2.getYear()%>"></td></tr>
            </table>
            
        </fieldset>
        
          <%! public List<javap.Training_certificate> lt1=new ArrayList<javap.Training_certificate>() ;%>
     <%! public Training_certificate e1[]=new Training_certificate[5];%>
     
  <% try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Training_certificate.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx1=s.beginTransaction();
Query q1=s.createQuery("from javap.Training_certificate where user_name='"+pa+"'");
lt1=q1.list();

if(lt1.isEmpty())
    { for(int j=0;j<5;j++)
                   {
        e1[j]=new Training_certificate();
        e1[j].setUser_name(pa);
        e1[j].setS_no(j+1);
        s.save(e1[j]);
             }
       f=1;
    }
else{%> <%! int i1=0; %>
<%for(Iterator t=lt1.iterator();t.hasNext();)
{
e1[i1]=(Training_certificate)t.next();
i1++;
} 
 i1=0;
 }
tx1.commit();
 s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
         <fieldset>
            <legend>TRAINING & CERTIFICATION DETAILS</legend>
            <table>
                <tr>
                    <th>Date</th>
                    <th>Course & Certification Name</th>
                    <th>Company</th>
                    <th>Marks Obtained</th>
                    <th>Max. Marks</th>
                    <th>Marks Percentage</th>
                    <th>Grade</th>
                    <th>Total Attendance</th>
                    <th>Attendance</th>
                    <th>Pass</th>
                    <th>Remarks</th>
                    
                </tr>
                
                <tr class="tableTxt">
                    <td> <input type="text" name="p11" size="9" id="TrainingDate" required onchange="textValidation(id)" value="<%= e1[0].getDate()%>"></td>    
                     <td>  <input type="text" name="p12" size="20" id="TrainingCourseName" required onchange="textValidation(id)" value="<%=e1[0].getCourse_and_certification_name()%>"></td>    
                        <td> <input type="text" name="p13" size="10" id="TrainingCompany" required onchange="textValidation(id)" value="<%=e1[0].getCompany()%>"> </td>
                        <td> <input type="text" name="p14" size="3" id="TrainingMarksObt" required onchange="textValidation(id)" value="<%=e1[0].getMarks_obtained()%>"></td>
                        <td>  <input type="text" name="p15" size="3" id="TrainingMaxMarks" required onchange="textValidation(id)" value="<%=e1[0].getMax_marks()%>"></td>
                        <td>  <input type="text" name="p16" size="3" id="TrainingMarksPercentage" required onchange="textValidation(id)" value="<%=e1[0].getMarks_percentage()%>"></td>
                        <td>  <input type="text" name="p17" size="2" id="TrainingGrade" required onchange="textValidation(id)" value="<%=e1[0].getGrade()%>"></td>
                        <td>  <input type="text" name="p18" size="3" id="TrainingTotAttendance" required onchange="textValidation(id)" value="<%=e1[0].getTotal_attendance() %>"></td>            
                        <td>  <input type="text" name="p19" size="3" id="TrainingAttend" required onchange="textValidation(id)" value="<%=e1[0].getAttendance()%>"></td>
                      <td>  <input type="text" name="p110" size="3" id="TrainingPass" required onchange="textValidation(id)" value="<%=e1[0].getPass()%>"></td>
                      <td>  <input type="text" name="p111" size="15" id="TrainingRemark" required onchange="textValidation(id)" value="<%=e1[0].getRemark()%>"></td>
                </tr>
                <tr class="tableTxt">
                    <td>  <input type="text" name="p21" size="9" id="TrainingDate" required onchange="textValidation(id)"  value="<%= e1[1].getDate()%>"></td>    
                     <td>  <input type="text" name="p22" size="20" id="TrainingCourseName" required onchange="textValidation(id)" value="<%=e1[1].getCourse_and_certification_name()%>"></td>    
                        <td> <input type="text" name="p23" size="10" id="TrainingCompany" required onchange="textValidation(id)"  value="<%=e1[1].getCompany()%>"></td>
                        <td> <input type="text" name="p24" size="3" id="TrainingMarksObt" required onchange="textValidation(id)" value="<%=e1[1].getMarks_obtained()%>"></td>
                        <td>  <input type="text" name="p25" size="3" id="TrainingMaxMarks" required onchange="textValidation(id)" value="<%=e1[1].getMax_marks()%>"></td>
                        <td>  <input type="text" name="p26" size="3" id="TrainingMarksPercentage" required onchange="textValidation(id)"  value="<%=e1[1].getMarks_percentage()%>"></td>
                        <td>  <input type="text" name="p27" size="2" id="TrainingGrade" required onchange="textValidation(id)" value="<%=e1[1].getGrade()%>"></td>
                        <td>  <input type="text" name="p28" size="3" id="TrainingTotAttendance" required onchange="textValidation(id)" value="<%=e1[1].getTotal_attendance() %>"></td>            
                        <td>  <input type="text" name="p29" size="3" id="TrainingAttend" required onchange="textValidation(id)" value="<%=e1[1].getAttendance()%>"></td>
                      <td>  <input type="text" name="p210" size="3" id="TrainingPass" required onchange="textValidation(id)" value="<%=e1[1].getPass()%>"></td>
                      <td>  <input type="text" name="p211" size="15" id="TrainingRemark" required onchange="textValidation(id)" value="<%=e1[1].getRemark()%>"></td>
                </tr>
                <tr class="tableTxt">
                     <td>  <input type="text" name="p31" size="9" id="TrainingDate" required onchange="textValidation(id)" value="<%= e1[2].getDate()%>"></td>    
                     <td>  <input type="text" name="p32" size="20" id="TrainingCourseName" required onchange="textValidation(id)" value="<%=e1[2].getCourse_and_certification_name()%>"></td>    
                        <td> <input type="text" name="p33" size="10" id="TrainingCompany" required onchange="textValidation(id)"  value="<%=e1[2].getCompany()%>"></td>
                        <td> <input type="text" name="p34" size="3" id="TrainingMarksObt" required onchange="textValidation(id)" value="<%=e1[2].getMarks_obtained()%>"></td>
                        <td>  <input type="text" name="p35" size="3" id="TrainingMaxMarks" required onchange="textValidation(id)" value="<%=e1[2].getMax_marks()%>"></td>
                        <td>  <input type="text" name="p36" size="3" id="TrainingMarksPercentage" required onchange="textValidation(id)" value="<%=e1[2].getMarks_percentage()%>"></td>
                        <td>  <input type="text" name="p37" size="2" id="TrainingGrade" required onchange="textValidation(id)" value="<%=e1[2].getGrade()%>"></td>
                        <td>  <input type="text" name="p38" size="3" id="TrainingTotAttendance" required onchange="textValidation(id)" value="<%=e1[2].getTotal_attendance() %>"></td>            
                        <td>  <input type="text" name="p39" size="3" id="TrainingAttend" required onchange="textValidation(id)" value="<%=e1[2].getAttendance()%>"></td>
                      <td>  <input type="text" name="p310" size="3" id="TrainingPass" required onchange="textValidation(id)" value="<%=e1[2].getPass()%>"></td>
                      <td>  <input type="text" name="p311" size="15" id="TrainingRemark" required onchange="textValidation(id)"  value="<%=e1[2].getRemark()%>"></td>
                </tr>
                <tr class="tableTxt">
                     <td>  <input type="text" name="p41" size="9" id="TrainingDate" required onchange="textValidation(id)" value="<%= e1[3].getDate()%>"></td>    
                     <td>  <input type="text" name="p42" size="20" id="TrainingCourseName" required onchange="textValidation(id)" value="<%=e1[3].getCourse_and_certification_name()%>"></td>    
                        <td> <input type="text" name="p43" size="10" id="TrainingCompany" required onchange="textValidation(id)" value="<%=e1[3].getCompany()%>"></td>
                        <td> <input type="text" name="p44" size="3" id="TrainingMarksObt" required onchange="textValidation(id)" value="<%=e1[3].getMarks_obtained()%>"></td>
                        <td>  <input type="text" name="p45" size="3" id="TrainingMaxMarks" required onchange="textValidation(id)" value="<%=e1[3].getMax_marks()%>"></td>
                        <td>  <input type="text" name="p46" size="3" id="TrainingMarksPercentage" required onchange="textValidation(id)" value="<%=e1[3].getMarks_percentage()%>"></td>
                        <td>  <input type="text" name="p47" size="2" id="TrainingGrade" required onchange="textValidation(id)" value="<%=e1[3].getGrade()%>"></td>
                        <td>  <input type="text" name="p48" size="3" id="TrainingTotAttendance" required onchange="textValidation(id)" value="<%=e1[3].getTotal_attendance() %>"></td>            
                        <td>  <input type="text" name="p49" size="3" id="TrainingAttend" required onchange="textValidation(id)" value="<%=e1[3].getAttendance()%>"></td>
                      <td>  <input type="text" name="p410" size="3" id="TrainingPass" required onchange="textValidation(id)" value="<%=e1[3].getPass()%>"></td>
                      <td>  <input type="text" name="p411" size="15" id="TrainingRemark" required onchange="textValidation(id)" value="<%=e1[3].getRemark()%>"></td>
                </tr>
                <tr class="tableTxt">
                     <td>  <input type="text" name="p51" size="9" id="TrainingDate" required onchange="textValidation(id)" value="<%= e1[4].getDate()%>"></td>    
                     <td>  <input type="text" name="p52" size="20" id="TrainingCourseName" required onchange="textValidation(id)" value="<%=e1[4].getCourse_and_certification_name()%>"></td>    
                        <td> <input type="text" name="p53" size="10" id="TrainingCompany" required onchange="textValidation(id)" value="<%=e1[4].getCompany()%>"></td>
                        <td> <input type="text" name="p54" size="3" id="TrainingMarksObt" required onchange="textValidation(id)" value="<%=e1[4].getMarks_obtained()%>"></td>
                        <td>  <input type="text" name="p55" size="3" id="TrainingMaxMarks" required onchange="textValidation(id)" value="<%=e1[4].getMax_marks()%>"></td>
                        <td>  <input type="text" name="p56" size="3" id="TrainingMarksPercentage" required onchange="textValidation(id)" value="<%=e1[4].getMarks_percentage()%>"></td>
                        <td>  <input type="text" name="p57" size="2" id="TrainingGrade" required onchange="textValidation(id)" value="<%=e1[4].getGrade()%>"></td>
                        <td>  <input type="text" name="p58" size="3" id="TrainingTotAttendance" required onchange="textValidation(id)" value="<%=e1[4].getTotal_attendance() %>"></td>            
                        <td>  <input type="text" name="p59" size="3" id="TrainingAttend" required onchange="textValidation(id)" value="<%=e1[4].getAttendance()%>"></td>
                      <td>  <input type="text" name="p510" size="3" id="TrainingPass" required onchange="textValidation(id)" value="<%=e1[4].getPass()%>"></td>
                      <td>  <input type="text" name="p511" size="15" id="TrainingRemark" required onchange="textValidation(id)" value="<%=e1[4].getRemark()%>"></td>
                </tr>
            </table>
            
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
            <input type="button" value="Next" class="reset_btn" onclick="document.location='Deciplinery.jsp'">
            <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
                </div>
        
 </form> 
    </body>
</html>