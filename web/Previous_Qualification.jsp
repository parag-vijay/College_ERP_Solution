<%-- 
    Document   : Previous_Qualification
    Created on : Nov 23, 2014, 7:22:02 PM
    Author     : n()t Me
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="javap.Admision_detail"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<%@page import="javap.Previous_qualification"%>


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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <script type="text/javascript" src="validate.js"></script>
        <script type="text/javascript" src="city_state.js"></script>
        <title></title>
    </head>
    <body>
        <%! public List<javap.Previous_qualification> lt=new ArrayList<Previous_qualification>();%>
                 <%! public Previous_qualification e[]=new Previous_qualification[3];%>
     <%! public int f=0;%>
     <%! public SessionFactory sf ;%>
     <%! public Session s;%>
  <% HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
  try {
       sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Previous_qualification.class).buildSessionFactory();
 s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Previous_qualification where user_name='"+pa+"'");
lt=q.list();

if(lt.isEmpty())
    { 
        for(int i=0;i<3;i++)
        {
        e[i]=new Previous_qualification();
        e[i].setUser_name(pa);
        e[i].setS_no(i+1);
        if(i==0)
        e[i].setExam_name("10th");
               else if(i==1)
                   e[i].setExam_name("12th");
                   else
                       e[i].setExam_name("Deploma");
        s.save(e[i]);
        }
   f=1;
    }
else{%> <%! int ii=0;%>
<%for(Iterator t=lt.iterator();t.hasNext();)
{  
  System.out.println(ii);
 e[ii]=(Previous_qualification)t.next();
ii++;
}
 ii=0;
} 
s.flush();
tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex);
         }
 %>
        <form class="student-form" onsubmit="return checkReq()" action="Pervious_Q">
        <fieldset>
            <legend>Previous Qualification</legend>         
            <table>
                <tr class="tableTxt">
                    <th>Exam Name </th>
                    <th>Roll No. </th>
                    <th>University/Board </th>
                    <th>School Name & City </th>
                    <th>Medium</th>
                    <th>Year of Passing</th>
                    <th>Marks Obtained</th>
                    <th>Max Marks</th>
                    <th>Div</th>
                    <th>Grade</th>
                    
                    
                </tr>
                 <tr class="tableTxt">
                     <td>  <input type="text" name="t11" size="15" id="PQExamName" onchange="textValidation(id)" required value="<%=e[0].getExam_name()%>">  </td>    
                     <td>  <input type="text" name="t12" size="12" id="PQRollNo" onchange="textValidation(id)" required value="<%=e[0].getRoll_no()%>">  </td>    
                        <td> <input type="text" name="t13" size="20" id="PQUniversity" onchange="textValidation(id)" required value="<%=e[0].getUniversity_board()%>">    </td>
                        <td> <input type="text" name="t14" size="25" id="PQSchool" onchange="textValidation(id)" required value="<%=e[0].getSchool_name_city()%>">   </td>
                        <td> <input type="text" name="t15" size="15" id="PQMedium" onchange="textValidation(id)" required value="<%=e[0].getMedium()%>">   </td>
                        <td> <input type="text" name="t16" size="5" id="PQYearOfPassing" onchange="textValidation(id)" required value="<%=e[0].getYear_of_passing()%>">   </td>
                        <td> <input type="text" name="t17" size="8" id="PQMarksObtained" onchange="textValidation(id)" required value="<%=e[0].getMarks_obtained()%>">   </td>
                        <td> <input type="text" name="t18" size="3" id="PQMaxMarks" onchange="textValidation(id)" required value="<%=e[0].getMax_marks()%>">   </td>
                        <td> <input type="text" name="t19" size="3" id="PQDiv" onchange="textValidation(id)" required value="<%=e[0].getDivision()%>">   </td>
                        <td> <input type="text" name="t110" size="3" id="PQGrade" onchange="textValidation(id)" required value="<%=e[0].getGrade_percent()%>"></td>
                </tr>
                 <tr class="tableTxt">
                     <td>  <input type="text" name="t21" size="15" id="PQExamName" onchange="textValidation(id)" required value="<%=e[1].getExam_name()%>">  </td>    
                     <td>  <input type="text" name="t22" size="12" id="PQRollNo" onchange="textValidation(id)" required value="<%=e[1].getRoll_no()%>">  </td>    
                        <td> <input type="text" name="t23" size="20" id="PQUniversity" onchange="textValidation(id)" required value="<%=e[1].getUniversity_board()%>">    </td>
                        <td> <input type="text" name="t24" size="25" id="PQSchool" onchange="textValidation(id)" required value="<%=e[1].getSchool_name_city()%>">   </td>
                        <td> <input type="text" name="t25" size="15" id="PQMedium" onchange="textValidation(id)" required value="<%=e[1].getMedium()%>">   </td>
                        <td> <input type="text" name="t26" size="5" id="PQYearOfPassing" onchange="textValidation(id)" required value="<%=e[1].getYear_of_passing()%>">   </td>
                        <td> <input type="text" name="t27" size="8" id="PQMarksObtained" onchange="textValidation(id)" required value="<%=e[1].getMarks_obtained()%>">   </td>
                        <td> <input type="text" name="t28" size="3" id="PQMaxMarks" onchange="textValidation(id)" required value="<%=e[1].getMax_marks()%>">   </td>
                        <td> <input type="text" name="t29" size="3" id="PQDiv" onchange="textValidation(id)" required value="<%=e[1].getDivision()%>">   </td>
                        <td> <input type="text" name="t210" size="3" id="PQGrade" onchange="textValidation(id)" required value="<%=e[1].getGrade_percent()%>"></td>
                </tr>
                <tr class="tableTxt">
                     <td>  <input type="text" name="t31" size="15" id="PQExamName" onchange="textValidation(id)" required value="<%=e[2].getExam_name()%>">  </td>    
                     <td>  <input type="text" name="t32" size="12" id="PQRollNo" onchange="textValidation(id)" required value="<%=e[2].getRoll_no()%>">  </td>    
                        <td> <input type="text" name="t33" size="20" id="PQUniversity" onchange="textValidation(id)" required value="<%=e[2].getUniversity_board()%>">    </td>
                        <td> <input type="text" name="t34" size="25" id="PQSchool" onchange="textValidation(id)" required value="<%=e[2].getSchool_name_city()%>">   </td>
                        <td> <input type="text" name="t35" size="15" id="PQMedium" onchange="textValidation(id)" required value="<%=e[2].getMedium()%>">   </td>
                        <td> <input type="text" name="t36" size="5" id="PQYearOfPassing" onchange="textValidation(id)" required value="<%=e[2].getYear_of_passing()%>">   </td>
                        <td> <input type="text" name="t37" size="8" id="PQMarksObtained" onchange="textValidation(id)" required value="<%=e[2].getMarks_obtained()%>">   </td>
                        <td> <input type="text" name="t38" size="3" id="PQMaxMarks" onchange="textValidation(id)" required value="<%=e[2].getMax_marks()%>">   </td>
                        <td> <input type="text" name="t39" size="3" id="PQDiv" onchange="textValidation(id)" required value="<%=e[2].getDivision()%>">   </td>
                        <td> <input type="text" name="t310" size="3" id="PQGrade" onchange="textValidation(id)" required value="<%=e[2].getGrade_percent()%>"></td>
                </tr>
                
                 </table>
        </fieldset>
                        <%! public List<javap.Admision_detail> lt1=new ArrayList<Admision_detail>();%>
     <%! public Admision_detail e1=new Admision_detail();%>
     
  <% try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Admision_detail.class).buildSessionFactory();
 s=sf.openSession(); 
Transaction tx1=s.beginTransaction();
Query q1=s.createQuery("from javap.Admision_detail where user_name='"+pa+"'");
lt1=q1.list();

if(lt1.isEmpty())
     { 
    e1=new Admision_detail();
     e1.setUser_name(pa);
     s.save(e1);
     f=1;
    }
else{
Iterator t1=lt1.iterator();   
e1=(Admision_detail)t1.next();
} 
tx1.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex);
         }
 %>
            <fieldset>
                <legend>Admission Detail</legend>
                <table>
                    <tr><td class="txt"><span>Course* :</span></td><td class="in"><input type="text" name ="Course" id="Course1"  required onchange="textValidation(id)" value="<%= e1.getCourse()%>"></td>
                     <td class="txt"><span>Admitted Branch* :</span></td><td class="in"><input type="text" name ="Admitted_Branch" id="Admitted_Branch"  required onchange="textValidation(id)" value="<%=e1.getAdmitted_branch()%>"></td>
                    </tr>
                    <tr><td class="txt"><span>Admitted Sem * :</span></td><td class="in"><input type="text" name ="Admitted_Sem" id="Admitted_Sem"    required onchange="textValidation(id)" value="<%=e1.getAdmitted_sem()%>"></td>
                    <td class="txt"><span>Admitted Session * :</span></td><td class="in"><input type="text" name ="Admitted_Session" id="Admitted_Session"    required onchange="textValidation(id)" value="<%=e1.getAdmitted_session()%>"></td></tr>
                    <tr><td class="txt"><span>Admitted Date* :</span></td><td class="in"><input type="text" name ="Admitted_Date" id="Admitted_Date" required onchange="textValidation(id)" value="<%=e1.getAdmission_date()%>"></td>
                    <td class="txt"><span>Entrance Exam Name* :</span></td><td class="in"><input type="text" name ="Entrance_Exam_Name" id="Entrance_Exam_Name" required onchange="textValidation(id)" value="<%=e1.getEntrance_exam_name()%>"></td></tr>
                    <tr><td class="txt"><span>Marks Obtained* :</span></td><td class="in"><input type="text" name ="Marks_Obtained" id="Marks_Obtained" required onchange="textValidation(id)" value="<%=e1.getMarks_obtained()%>"></td>
                    <td class="txt"><span>Max Marks* :</span></td><td class="in"><input type="text" name ="Max_Marks" id="Max_Marks" required onchange="textValidation(id)" value="<%=e1.getMax_marks()%>"></td></tr>
                    <tr><td class="txt"><span>Percentage* :</span></td><td class="in"><input type="text" name ="Percentage" id="Percentage" required onchange="textValidation(id)" value="<%=e1.getPercentage()%>"></td>
                    <td class="txt"><span>Percentile* :</span></td><td class="in"><input type="text" name ="Percentile" id="Percentile" required onchange="textValidation(id)" value="<%=e1.getPercentile()%>"></td></tr>
                    <tr><td class="txt"><span>All India Rank* :</span></td><td class="in"><input type="text" name ="All_India_Rank" id="All_India_Rank" required onchange="textValidation(id)" value="<%=e1.getAll_india_rank()%>"></td>
                    <td class="txt"><span>Admission Quota* :</span></td><td class="in"><input type="text" name ="Admission_Quota" id="Admission_Quota" required onchange="textValidation(id)" value="<%=e1.getAdmission_quota()%>"></td></tr>
                    <tr><td class="txt"><span>Quota Rank* :</span></td><td class="in"><input type="text" name ="Quota_Rank" id="Quota_Rank" required onchange="textValidation(id)" value="<%=e1.getQuota_rank()%>"></td>
                    <td class="txt"><span>Type of Admission* :</span></td><td class="in"><input type="text" name ="Type_of_Admission" id="Type_of_Admission" required onchange="textValidation(id)" value="<%=e1.getType_of_admission()%>"></td></tr>
                    <tr><td class="txt"><span>Year* :</span></td><td class="in"><input type="text" name ="Year" id="Year" required onchange="textValidation(id)" value="<%=e1.getYear()%>"></td></tr>
                    

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
            <input type="button" value="Next" class="reset_btn" onclick="document.location='Academic_detail.jsp'">
            <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
                    </div>
        </form>
    </body>
</html>

