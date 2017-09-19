<%-- 
    Document   : ViewTimeTable
    Created on : Dec 7, 2014, 3:40:51 PM
    Author     : lenovo
--%>

<%@page import="java.sql.*"%> 
<%@page import="javap.Convert"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <title></title>
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
    <form method="post" action="ViewTimeTable.jsp">
        <fieldset>
  <select name="Procedure" id="Procedure">
      <option value="faculty">Faculty Wise</option>
      <option value="room">Room wise</option>
      <option value="sem">Sem Wise</option>
  </select>
  <input type="text" name="Argument">
  <input type="submit" value="View Time Table" name="View Time Table">
  <% try {
      String pro=request.getParameter("Procedure"); 
      String argu=request.getParameter("Argument");
Connection c= Convert.getCon1();
PreparedStatement ps=c.prepareStatement("call timetable."+pro+"(?)");
ps.setString(1,argu);
ResultSet rs=ps.executeQuery();
 if(!rs.wasNull())
    {
     %>
        <table class="onlyTable">
            <tr>
                <th>Day/Time</th>
                <th>8:20-9:05</th>
                <th>9:05-09:50</th>
                <th>09:50-10:30</th>
                <th>10:30-11:20</th>
                <th>11:20-12:10</th>
                <th>12:10-1:00</th>
                <th>1:00-1:50</th>
                <th>1:50-2:40</th>
                <th>2:40-3:30</th>
                <th>3:30-4:15</th>
                <th>4:15-5:00</th>
            </tr>
     <% while( rs.next())
                 {
           System.out.println("rs.getString(1)"); 
     
     %>       
            <tr>
                <td><input type="text" name ="r1c1" value="<%=rs.getString(1)%>" ></td>
                <td><input type="text" name ="r1c1" value="<%=rs.getString(2)%>" ></td>
                <td><input type="text" name ="r1c2" value="<%=rs.getString(3)%>" ></td>
                <td><input type="text" name ="r1c3" value="<%=rs.getString(4)%>" ></td>
                <td><input type="text" name ="r1c4" value="<%=rs.getString(5)%>" ></td>
                <td><input type="text" name ="r1c5" value="<%=rs.getString(6)%>" ></td>
                <td><input type="text" name ="r1c6" value="<%=rs.getString(7)%>" ></td>
                <td><input type="text" name ="r1c7" value="<%=rs.getString(8)%>" ></td>
                <td><input type="text" name ="r1c8" value="<%=rs.getString(9)%>" ></td>
                <td><input type="text" name ="r1c9" value="<%=rs.getString(10)%>" ></td>
                <td><input type="text" name ="r1c9" value="<%=rs.getString(11)%>" ></td>
                <td><input type="text" name ="r1c9" value="<%=rs.getString(12)%>" ></td>
            </tr>
            <% }
     System.out.println("table"); } 
 rs.close();
ps.close();
 c.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
     %>
           
            </table>
                
        </fieldset>
     <div> 
         <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
     </div>
</form>
    </body>
</html>