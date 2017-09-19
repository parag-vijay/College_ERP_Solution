<%-- 
    Document   : FamilyDetail
    Created on : Sep 18, 2014, 12:51:05 PM
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
       <html><head>
                <title></title>
    <link rel="stylesheet" type="text/css" href="newcss.css">
    <script type="text/javascript" src="validate.js"></script>
        
    </head>
    <body>
        
        <%! public List<javap.Student_record> lt=new ArrayList<Student_record>();%>
     <%! public Student_record e;%>
     <%! public int f=0;%>
  <% try {
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
    { e=new Student_record();
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
        System.out.println(ex);
         }
 %>
 <form class="Family-details" onsubmit="return checkReq()" action="Family" method="post">
<fieldset id="_father">
<legend>Father Information</legend>
<br>
<table>
<tr>
	<td class="txt"><span>	Father's Name*: </span></td><td class="in"><input name="father_name" id="Father_name" required onchange="textValidation(id)" value="<%=e.getFather_name() %>" ></td>
	<td class="txt"><span>	Father's DOB*: </span></td><td class="in"><input name="father_dob" id="Father_dob" required onchange="textValidation(id)" value="<%=e.getF_dob() %>"></td>
</tr>
<tr>
        <td class="txt"><span>	Occupation*: </span></td><td class="in"><input name="father_occuption" id="Father_occupation" required onchange="textValidation(id)" value="<%=e.getF_occupation()%>"></td>
        <td class="txt"><span>	Mobile*: </span></td><td class="in"><input name="father_mobile" id="Father_mobile" required onchange="textValidation(id)" value="<%=e.getF_mobile() %>"></td>
</tr>	
<tr>
        <td class="txt"><span>	E-Mail: </span></td><td class="in"><input name="father_email" id="Father_email"  onchange="textValidation(id)" value="<%=e.getF_email() %>"></td><td></td><td></td>
</tr>

</table>
</fieldset>
<br><br>





<fieldset id="_mother">
<legend>Mother information</legend>
<br>
<table>
<tr>
	<td class="txt"><span>	Mother's Name*: </span></td><td class="in"><input name="mother_name" id="Mother_name" required onchange="textValidation(id)" value="<%=e.getMother_name() %>"></td>
	<td class="txt"><span>	Mother's DOB*: </span></td><td class="in"><input name="mother_dob" id="Mother_dob" required onchange="textValidation(id)" value="<%=e.getM_dob() %>"></td>
</tr>
<tr>
        <td class="txt"><span>	Occupation*: </span></td><td class="in"><input name="mother_occupation" id="Mother_occupation" required onchange="textValidation(id)" value="<%=e.getM_occupaion() %>"></td>
	<td class="txt"><span>	Mobile*: </span></td><td class="in"><input name="mother_mobile" id="Mother_mobile" required onchange="textValidation(id)" value="<%=e.getM_mobile() %>"></td>
</tr>
<tr>
        <td class="txt"><span>	E-Mail: </span></td><td class="in"><input name="mother_email" id="Mother_email" onchange="textValidation(id)" value="<%=e.getM_email() %>"></td><td></td><td></td>
</tr>
</table>
</fieldset>
<br><br>






<fieldset id="_family">
<legend>Family Details</legend>
<br>
<table>
<tr>
	<td class="txt"><span>Anniversary: </span></td><td class="in"><input name="anniversary" id="Anniversary"  onchange="textValidation(id)" value="<%=e.getAnniversary() %>"></td>
	<td class="txt"><span>Income: </span></td><td class="in"><input name="income" id="Income" required onchange="textValidation(id)" value="<%=e.getIncome() %>" ></td>
	<td class="txt"><span>Vehicle: </span></td><td class="in"><input name="vehicle" id="Vehicle"  onchange="textValidation(id)" value="<%=e.getVehicle() %>"></td>
</tr>
<tr>
	<td class="txt"><span>Sibling 1: </span></td><td class="in"><input name="sibling_name_1" id="Sibling_name_1"  onchange="textValidation(id)" value="<%=e.getSibling1() %>" ></td>
	<td class="txt"><span>Sibling 2: </span></td><td class="in"><input name="sibling_name_2" id="Sibling_name_2"  onchange="textValidation(id)" value="<%=e.getSibling2() %>" ></td>
	<td class="txt"><span>Sibling 3: </span></td><td class="in"><input name="sibling_name_3" id="Sibling_name_3"  onchange="textValidation(id)" value="<%=e.getSibling3() %>"></td>

</tr>
<tr>
	<td class="txt"><span>	Guardian Name*: </span></td><td class="in"><input name="guardian_name" id="Guardian_name" required onchange="textValidation(id)" value="<%=e.getL_guardian() %>"></td>
	<td class="txt"><span>	Mobile No.*: </span></td><td class="in"><input name="guardian_mobile" id="Guardian_mobile" required onchange="textValidation(id)" value="<%=e.getLg_mobile() %>"></td>
        <td></td><td></td>
</tr>
<tr>
        <td class="txt"><span>	Land Line No.: </span></td><td class="in"><input name="guardian_landline" id="Guardian_landline" value="<%=e.getLg_telephone() %>"></td>
	<td class="txt"><span>	Address*: </span></td><td class="in"><input name="guardian_address" id="Guardian_address" required value="<%=e.getLg_address() %>"></td>
        <td></td><td></td>
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
            <input type="button" value="Next" class="reset_btn" onclick="document.location='Exta_detail.jsp'">
           <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
</div>
</form>

</body></html>



