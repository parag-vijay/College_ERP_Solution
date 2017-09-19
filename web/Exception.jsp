<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="java.awt.geom.QuadCurve2D"%>
<%@page import="javap.Expectations"%>
<%@page import="javap.Convert"%>
<%@page import="java.io.IOException" %>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%> 
 <!DOCTYPE html>
 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Expectation </title>
        <link type="text/css" rel="stylesheet" href="newcss.css">
        <script type="text/javascript" src="validate.js"></script>
    </head>
    <body>
       <%! public List<javap.Expectations> lt;%>
     <%! public Expectations e; int f=0; %>
   
  <% try {
       HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Expectations.class).buildSessionFactory();
Session s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Expectations where username='"+pa+"'");
lt=q.list();

if(lt.isEmpty())
    { e=new Expectations();
    e.setUsername(pa);
     s.save(e);
    }
else{
Iterator t=lt.iterator();   
e=(Expectations)t.next();
} 
tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex);
         }
 %>
<form action="Expectation1" method="post" >
  <div id="expct-container">  
<table>
<tr>
<td><div align="left"><b>Expectation from College:</b></div></td>
<td><div class="expect-inner"><textarea rows="5" cols="100"  maxlength="300" name="clg" id="clg1"><%=e.getExp_frm_colg()%></textarea></td></d
</tr>
<tr>
<td><div align="left"><b> Expectation from Department:</b></div></td>
<td><div class="expect-inner"><textarea rows="5" cols="100" maxlength="300" name="dpt" id="dpt1"><%=e.getExp_frm_dept()%></textarea></td></d
</tr>
<tr>
<td><div align="left"><b>Expectation from Mentor:</b></div></td>
<td><div class="expect-inner"><textarea rows="5" cols="100" maxlength="300" name="mnt" id="mnt1"><%=e.getExp_frm_mentr()%></textarea></td></d
</tr>
<tr>
<td><div align="left"><b>Action Planed:</b></div></td>
<td><div class="expect-inner"><textarea rows="5" cols="100" maxlength='300' name="act" id="act1"><%=e.getActn_planed()%></textarea></td></d
</tr>
 <% if(f==1)
                             {%>   
                             <tr><td> <input type="submit" value="Insert" class="submit_btn"></td>
             <%} 
               else
                 {%>
                             <tr><td> <input type="submit" value="Update" class="submit_btn"></td>
            <%}%>
                                 <td><div><input type="button" value="Next" class="reset_btn" onclick="document.location='Previous_Qualification.jsp'">
                              <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'"></td></div></tr>
</table>
</div>
</form>

</body>
</html> 

