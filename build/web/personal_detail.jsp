<%-- 
    Document   : personal_detail
    Created on : Nov 21, 2014, 3:18:17 PM
    Author     : lenovo
--%>

<%@page import="java.util.ArrayList"%>
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
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <script type="text/javascript" src="validate.js"></script>
        <script type="text/javascript" src="city_state.js"></script>
        
    </head>
    <body>
      <em> ( fields marked with * are mandatory)</em>
       
  
      <%! public List<javap.Student_record> lt=new ArrayList<javap.Student_record>();%>
     <%! public Student_record e=new Student_record();%>
     <%! public int f=0;%>
   <%  try {
      HttpSession sess=request.getSession(false);
       if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
Session s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Student_record where username='"+pa+"'");
lt=q.list();

if(lt.isEmpty())
     { 
    e=new Student_record();
    e.setUsername(pa);
    s.save(e);
     f=1;
    }
else{
Iterator t=lt.iterator();   
e=(Student_record)t.next();
} 
tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
        System.out.println("hello");
         }
 %>

        
      
            
     <form class="student-form" onsubmit="return checkReq()" action="Personal" method="post">      
            <fieldset>
                <legend>Personal Detail</legend>
                
                <table>
                    <tr><td class="txt"><span>Name* :</span></td><td class="in"><input type="text" name ="Student_Name" id="Student_Name"  placeholder="ENTER STUDENT'S NAME"  required onchange="textValidation(id)" value="<%=e.getName() %>"></td>
                    <td class="txt"><span>Enrollment No* :</span></td><td class="in"><input type="text" name ="Student_Enroll_No" id="Student_Enroll_No" placeholder="ENTER STUDENT ENROLLMENT NO" maxlength="12" required onchange="textValidation(id)" value="<%=e.getEnrollment_no() %>"></td></tr>
                    <tr><td class="txt"><span>Scholar No :</span></td><td class="in"><input type="text" name ="Student_Scholar_No" id="Student_Scholar_No" placeholder="ENTER STUDENT'S SCHOLAR NO" maxlength="15" value="<%=e.getScholar_no() %>"  ></td>
                    <td class="txt"> <span>Gender* : </span></td>
                        <%if(e.getGender().equals("male")){%>
                      <td class="radio"> MALE<input type =radio name="gender" value="male" checked="checked">FEMALE<input type =radio name="gender" value="female" required></td></tr>
                        <% } else{%>
                      <td class="radio">MALE<input type =radio name="gender" value="male">FEMALE<input type =radio name="gender" value="female" required checked="checked"></td></tr><%}%>
                    <tr><td class="txt"><span> Date of Birth*:</span></td><td class="in"> <input type="text" name="Student_dob" id="Student_dob" placeholder="dd-mm-yyyy" maxlength="10" required onchange="textValidation(id)" value="<%=e.getDate_of_birth() %>"></td>
                        <%if(!(" ".equals(e.getBlood_group())))
                                                       {
                         if(e.getBlood_group().equals("A+"))
                                                        {%>
                           <td class="txt"><span>Blood Group :</span></td><td class="in"><select name="blood_group" id="blood_group"><option value="O+">O+</option><option value="O-">O-</option><option selected="selected" value="A+">A+</option><option value="A-">A-</option><option value="B+">B+</option><option value="B-">B-</option><option value="AB+">AB+</option><option value="AB-">AB-</option></select></td></tr> 
                        <%}
                           else if(e.getBlood_group().equals("B+"))
                                                            {%>
                              <td class="txt"><span>Blood Group :</span></td><td class="in"><select name="blood_group" id="blood_group"><option>O</option><option value="A+">A+</option><option value="A-">A-</option><option selected="selected" value="B+">B+</option><option value="B-">B-</option><option value="AB+">AB+</option><option value="AB-">AB-</option></select></td></tr>
                          <%}
                             else if(e.getBlood_group().equals("B-"))
                                                            {%>
                              <td class="txt"><span>Blood Group :</span></td><td class="in"><select name="blood_group" id="blood_group"><option value="O+">O+</option><option value="O-">O-</option><option value="A+">A+</option><option value="A-">A-</option><option selected="selected" value="B-">B-</option><option value="B+">B+</option><option value="AB-">AB-</option><option value="AB+">AB+</option></select></td></tr>
                           <%}else if(e.getBlood_group().equals("O+"))
                                                            {%>
                              <td class="txt"><span>Blood Group :</span></td><td class="in"><select name="blood_group" id="blood_group"><option selected="selected">O+</option><option value="O-">O-</option><option value="A+">A+</option><option value="A-">A-</option><option value="B+">B+</option><option value="B-">B-</option><option value="AB-">AB-</option><option value="AB+">AB+</option></select></td></tr>
                           <%}else if(e.getBlood_group().equals("O-"))
                                                            {%>
                              <td class="txt"><span>Blood Group :</span></td><td class="in"><select name="blood_group" id="blood_group"><option selected="selected" value="O-">O-</option><option value="O+">O+</option><option value="A-">A-</option><option value="A+">A+</option><option value="B-">B-</option><option value="B+">B+</option><option value="AB-">AB-</option><option value="AB+">AB+</option></select></td></tr>
                           <%}else if(e.getBlood_group().equals("A-"))
                                                            {%>
                              <td class="txt"><span>Blood Group :</span></td><td class="in"><select name="blood_group" id="blood_group"><option value="O-">O-</option><option value="O+">O+</option><option value="A-" selected="selected">A-</option><option value="A+">A+</option><option value="B-">B-</option><option value="B+">B+</option><option value="AB-">AB-</option><option value="AB+">AB+</option></select></td></tr>
                           <%}}else {%>
                                               
                              <td class="txt"><span>Blood Group :</span></td><td class="in"><select name="blood_group" id="blood_group"><option value="O-">O-</option><option value="O+">O+</option><option value="A-">A-</option><option value="A+">A+</option><option value="B-">B-</option><option value="B+">B+</option><option value="AB-">AB-</option><option value="AB+">AB+</option></select></td></tr>
                          <%}%>
                        
                    </table>
                    </fieldset>  
            
            <fieldset>
                <legend>Contact Detail</legend><table>
                
                
            <tr><td class="txt"><span> College Email ID *:</span></td><td class="in"><input type="email" name="College_email_id" id="College_Email_id" placeholder="ENTER A VALID EMAIL ID" required onchange="textValidation(id)" value="<%=e.getC_email() %>"></td>
            <td class="txt"><span>Personal Email ID :</span></td><td class="in"><input type="email" name="Personal_email_id" id="Personal_email_id" placeholder="ENTER A VALID EMAIL ID" onchange="textValidation(id)" value="<%=e.getP_email() %>"></td></tr>
            <tr><td class="txt"><span> Mobile 1* :</span></td><td class="in"><input type="text" name ="Student_mobile_no_1" id="Student_mobile_no_1" placeholder="ENTER STUDENT'S MOBILE NO" maxlength="13" required onchange="textValidation(id)" value="<%=e.getMobile1() %>"></td>
            <td class="txt"><span>Mobile 2  :</span></td><td class="in"><input type="text" name ="Student_mobile_no_2" id="Student_mobile_no_2" placeholder="ENTER SECOND MOBILE NO" maxlength="13" onchange="textValidation(id)" value="<%=e.getMobile2() %>"></td></tr>
            </table>
            </fieldset>
            
            
            <fieldset>
                <legend>Stop Detail</legend><table>
                    <tr><td class="txt"><span> Bus No :</span></td><td class="in"><input type="text" name ="Bus_no" id="Bus_no" placeholder="ENTER BUS NO e.g. G05" maxlength="3" onchange="textValidation(id)" value="<%= e.getBus_no() %>"></td></tr>
            <tr><td class="txt"><span> Stop No/Name :</span></td><td class="in"><input type="text" name ="Bus_Stop" id="Bus_Stop" placeholder="ENTER STOP NAME OR NUMBER" maxlength="30" value="<%= e.getStop_name() %>"></td></tr>
            </table></fieldset>
            
             
            <fieldset>
                <legend>Local Address Detail</legend><table>
            <tr><td class="txt"><span> Local Address* :</span></td><td class="in" colspan="3"><input type="text" name="Local_address" id="Local_address" placeholder="ENTER THE LOCAL ADDRESS" required maxlength="50" value="<%= e.getL_address()%>"></td></tr>
            <tr><td class="txt"><span> City* :</span></td><td class="in"><input type="text" name="La_city" id="La_city" maxlength="10" required onchange="textValidation(id)" value="<%=e.getL_city()%>"></td>
            <td class="txt"><span> State* :</span></td><td class="in"><input type="text" name="La_state" id="La_state" maxlength="20" required onchange="textValidation(id)" value="<%= e.getL_state()%>"></td></tr>
            <tr><td class="txt"><span> Pin Code* :</span></td><td class="in"><input type="text" name="La_pin_code" id="La_pin_code" maxlength="6" required onchange="textValidation(id)" value="<%=e.getL_pincode()%>"></td>
            <td class="txt"><span> Telephone No. :</span></td><td class="in"><input type="text" name="La_telephone" id="La_telephone" maxlength="10" value="<%=e.getL_telephone_no() %>" ></td></tr>
            </table></fieldset>
             
             
            <fieldset>  
                <legend>Permanent Address Detail</legend><table>
                    <tr><td class="txt"><span> Permanent Address* :</span></td><td class="in" colspan="3"><input type="text" name="Perma_address" id="Perma_address" placeholder="ENTER THE PERMANENT ADDRESS" maxlength="50" required value="<%=e.getP_address() %>"></td></tr>
                    <tr><td class="txt"><span> City* :</span></td><td class="in"><input type="text" name="Pa_city" id="Pa_city" maxlength="10" required onchange="textValidation(id)" value="<%=e.getP_city() %>"></td>
                        <td class="txt"><span> State*:</span></td><td class="in"><input type="text" name="Pa_state" id="Pa_state" maxlength="20" required onchange="textValidation(id)" value="<%=e.getP_state() %>"></td></tr>
                    <tr><td class="txt"><span> Pin Code* :</span></td><td class="in"><input type="text" name="Pa_pin_code" id="Pa_pin_code" maxlength="6" required onchange="textValidation(id)" value="<%=e.getP_pincode() %>"></td>
                        <td class="txt"><span> Telephone No. :</span></td><td class="in"><input type="text" name="Pa_telephone" id="Pa_telephone" maxlength="10" value="<%=e.getP_telephone_no() %>"></td></tr>
            </table></fieldset>
            
             
            <fieldset>
                <legend>Other Information</legend><table>
                     <%if(e.getCategory().equals("General"))
                                                       {%>
                          <tr><td class="txt"><span> Category* :</span></td><td class="in"><select name="Category" id="Category"><option id="general" value="General" selected="selected">GEN</option><option id="obc" value="OBC">OBC</option><option id="sc" value="SC">SC</option><option id="st">ST</option></select></td>  
                        <%}
                           else if(e.getCategory().equals("OBC"))
                                                           {%>
                               <tr><td class="txt"><span> Category* :</span></td><td class="in"><select name="Category" id="Category"><option id="general" value="General">GEN</option><option id="obc" value="OBC" selected="selected">OBC</option><option id="sc" value="SC">SC</option><option id="st" value="ST">ST</option></select></td>
                          <%}
                             else if(e.getCategory().equals("SC"))
                                                           {%>
                               <tr><td class="txt"><span> Category* :</span></td><td class="in"><select name="Category" id="Category"><option id="general" value="General">GEN</option><option id="obc" value="OBC">OBC</option><option id="sc" value="SC" selected="selected">SC</option><option id="st" value="ST">ST</option></select></td>
                          <%}else if(e.getCategory().equals("ST"))
                                                           {%>
                               <tr><td class="txt"><span> Category* :</span></td><td class="in"><select name="Category" id="Category"><option id="general" value="General">GEN</option><option id="obc" value="OBC">OBC</option><option id="sc" value="SC">SC</option><option id="st" value="ST" selected="selected">ST</option></select></td>
                          <%}else
                                {%>
                                <tr><td class="txt"><span> Category* :</span></td><td class="in"><select name="Category" id="Category"><option id="general" value="General">GEN</option><option id="obc" value="OBC">OBC</option><option id="sc" value="SC">SC</option><option id="st" value="ST">ST</option></select></td>
                               <%}%>     
               <td class="txt"><span> Cast*:</span></td><td class="in"><input type="text" name="Cast" id="Cast" maxlength="8" required onchange="textValidation(id)" value="<%=e.getCast() %>"></td></tr>
           <tr><td class="txt"><span> Religion* :</span></td><td class="in"><input type="text" name="Religion" id="Religion" maxlength="10" required onchange="textValidation(id)" value="<%=e.getReligion() %>"></td>
               <td class="txt"><span> Mother Tongue* :</span></td><td class="in"><input type="text" name="Mother_tongue" id="Mother_tongue" maxlength="10" required value="<%=e.getM_tongue() %>"></td></tr>
           <tr><td class="txt"><span> Nationality* :</span></td><td class="in"><input type="text" name="Nationality" id="Nationality" maxlength="10" required value="<%=e.getNationality() %>"></td><td></td><td></td></tr>
            </table></fieldset>
         
            
            <fieldset>
            <span> Medical Detail :</span><textarea name="Medical_detail" id="Medical_detail" maxlength="100" ><%=e.getMedical_detail()%></textarea>
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
            <input type="button" value="Next" class="reset_btn" onclick="document.location='FamilyDetail.jsp'">
             <input type="button" value="ViewTimeTable" class="reset_btn" onclick="document.location='ViewTimeTable.jsp'">
            <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
           </div>
           
        </form>
    </body>
</html>

