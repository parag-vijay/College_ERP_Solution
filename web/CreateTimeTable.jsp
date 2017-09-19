<%-- 
    Document   : CreateTimeTable
    Created on : Dec 5, 2014, 10:32:57 AM
    Author     : lenovo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.List"%>
<%@page import="javap.TimeTable"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <link rel="stylesheet" type="text/css" href="naviTable.css"> 
	        
<script type="text/javascript" src="validate.js"></script>
        <script type="text/javascript" src="city_state.js"></script>
        <script type="text/javascript" src="TimeTableValidate.js"></script>
        <title> Create TimeTable</title>
    </head>
    <body>
        <%
        HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
  %>
        <form class="student-form" onsubmit="return checkReq()" action="TimeTable11" method="post">  
         <fieldset>
	
             <table class="onlyTable">
                 <caption>Create Timetable</caption>   
            <tr>
                <th>S.no</th>
                <th>Time</th>
                <th>Day</th>
                <th>Semester</th>
                <th>Subject code</th>
                <th>Faculty name</th>
                <th>Room no.</th>
                <th>Class</th>
            </tr>
         <%! public List<javap.TimeTable> lt=new ArrayList<TimeTable>();%>
        <%! public  TimeTable e=new TimeTable();%>
     <%! public int f=0;%>
     <%! public SessionFactory sf;%>
     <%! public Session s;%>
  <% try {
       
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.TimeTable.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.TimeTable where user_name='"+pa+"'");
lt=q.list();
System.out.println(pa);%>

<%! int inc=1; %>
<% if(lt.isEmpty())
    {   System.out.println("Hi");
         e=new TimeTable();
         e.setUser_name("Admin");
         s.save(e);%>
        <tr class="tableTxt">
                <td><input type="text" name ="<%="t1"+inc%>" value="" ></td>
                <td><input type="text" name ="<%="t2"+inc%>" value="" ></td>
                <td><input type="text" name ="<%="t3"+inc%>" value="" ></td>
                <td><input type="text" name ="<%="t4"+inc%>" value="" ></td>
                <td><input type="text" name ="<%="t5"+inc%>" value="" ></td>
                <td><input type="text" name ="<%="t6"+inc%>" value="" ></td>
                <td><input type="text" name ="<%="t7"+inc%>" value="" ></td>
                <td><input type="text" name ="<%="t8"+inc%>" value="" ></td>
            </tr>
            
<% f=1;
   System.out.println("hello"); }
else{System.out.println("time");
for(Iterator t=lt.iterator();t.hasNext();)
{ inc++;
  System.out.println(inc);
e=(TimeTable)t.next();%>
<tr class="tableTxt">
    <td><input type="text" name ="<%="t1"+(inc-1)%>"  value="<%=e.getS_no()%>" ></td>
                <td><input type="text" name ="<%="t2"+(inc-1)%>" onchange="TimeTable(inc)" value="<%=e.getTime()%>" ></td>
                <td><input type="text" name ="<%="t3"+(inc-1)%>"  value="<%=e.getDay()%>" ></td>
                <td><input type="text" name ="<%="t4"+(inc-1)%>" onchange="TimeTable(inc)" value="<%=e.getSem()%>" ></td>
                <td><input type="text" name ="<%="t5"+(inc-1)%>" value="<%=e.getSubcode()%>" ></td>
                <td><input type="text" name ="<%="t6"+(inc-1)%>" onchange="TimeTable(inc)" value="<%=e.getFaculty_name()%>" ></td>
                <td><input type="text" name ="<%="t7"+(inc-1)%>" onchange="TimeTable(inc)" value="<%=e.getRoom_no()%>" ></td>
                <td><input type="text" name ="<%="t8"+(inc-1)%>" onchange="TimeTable(inc)" value="<%=e.getClass1()%>" ></td>
            </tr>
            <%} System.out.println(inc);%>
 <tr class="tableTxt">
                <td><input type="text" value="" name="<%="t1"+inc%>" ></td>
                <td><input type="text" value ="" onchange="TimeTable(inc)" name="<%="t2"+inc%>" ></td>
                <td><input type="text" value ="" name="<%="t3"+inc%>" ></td>
                <td><input type="text" value ="" onchange="TimeTable(inc)" name="<%="t4"+inc%>" ></td>
                <td><input type="text" value ="" name="<%="t5"+inc%>" ></td>
                <td><input type="text" value ="" onchange="TimeTable(inc)" name="<%="t6"+inc%>" ></td>
                <td><input type="text" value ="" onchange="TimeTable(inc)" name="<%="t7"+inc%>" ></td>
                <td><input type="text" value ="" onchange="TimeTable(inc)" name="<%="t8"+inc%>" ></td>
            </tr>

            <% System.out.println("table"); } 
  tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
        
            </table>
			
        </fieldset>
 <div>
                <input type="text" hidden="hidden" value="<%=inc%>" name="count" size="1">
             <% if(f==1)
                             {%>   
             <input type="submit" value="Insert" class="submit_btn">
             <%} 
               else
                 {%>
            <input type="submit" value="Update" class="submit_btn">
            <%}%>
            <input type="button" value="ViewTimeTable" class="reset_btn" onclick="document.location='ViewTimeTable.jsp'">
            <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
            </div>
 </form>
    </body>
</html>