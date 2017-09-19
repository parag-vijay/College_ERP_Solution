package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javap.Convert;

public final class ViewTimeTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
 /*
        HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);*/
  
      out.write("\n");
      out.write("    <form method=\"post\" action=\"ViewTimeTable.jsp\">\n");
      out.write("        <fieldset>\n");
      out.write("  <select name=\"Procedure\" id=\"Procedure\">\n");
      out.write("      <option value=\"faculty\">Faculty Wise</option>\n");
      out.write("      <option value=\"room\">Room wise</option>\n");
      out.write("      <option value=\"sem\">Sem Wise</option>\n");
      out.write("  </select>\n");
      out.write("  <input type=\"text\" name=\"Argument\">\n");
      out.write("  <input type=\"submit\" value=\"View Time Table\" name=\"View Time Table\">\n");
      out.write("  ");
 try {
      String pro=request.getParameter("Procedure"); 
      String argu=request.getParameter("Argument");
Connection c= Convert.getCon1();
PreparedStatement ps=c.prepareStatement("call timetable."+pro+"(?)");
ps.setString(1,argu);
ResultSet rs=ps.executeQuery();
 if(!rs.wasNull())
    {
     
      out.write("\n");
      out.write("        <table class=\"onlyTable\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Day/Time</th>\n");
      out.write("                <th>8:20-9:05</th>\n");
      out.write("                <th>9:05-09:50</th>\n");
      out.write("                <th>09:50-10:30</th>\n");
      out.write("                <th>10:30-11:20</th>\n");
      out.write("                <th>11:20-12:10</th>\n");
      out.write("                <th>12:10-1:00</th>\n");
      out.write("                <th>1:00-1:50</th>\n");
      out.write("                <th>1:50-2:40</th>\n");
      out.write("                <th>2:40-3:30</th>\n");
      out.write("                <th>3:30-4:15</th>\n");
      out.write("                <th>4:15-5:00</th>\n");
      out.write("            </tr>\n");
      out.write("     ");
 while( rs.next())
                 {
           System.out.println("rs.getString(1)"); 
     
     
      out.write("       \n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"text\" name =\"r1c1\" value=\"");
      out.print(rs.getString(1));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c1\" value=\"");
      out.print(rs.getString(2));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c2\" value=\"");
      out.print(rs.getString(3));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c3\" value=\"");
      out.print(rs.getString(4));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c4\" value=\"");
      out.print(rs.getString(5));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c5\" value=\"");
      out.print(rs.getString(6));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c6\" value=\"");
      out.print(rs.getString(7));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c7\" value=\"");
      out.print(rs.getString(8));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c8\" value=\"");
      out.print(rs.getString(9));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c9\" value=\"");
      out.print(rs.getString(10));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c9\" value=\"");
      out.print(rs.getString(11));
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"r1c9\" value=\"");
      out.print(rs.getString(12));
      out.write("\" ></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
     System.out.println("table"); } 
 rs.close();
ps.close();
 c.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
     
      out.write("\n");
      out.write("           \n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("        </fieldset>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
