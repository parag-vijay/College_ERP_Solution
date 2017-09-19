package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
import javap.TimeTable;
import java.util.ArrayList;

public final class CreateTimeTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.TimeTable> lt=new ArrayList<TimeTable>();
 public  TimeTable e=new TimeTable();
 public int f=0;
 public SessionFactory sf;
 public Session s;
 int inc=1; 
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"naviTable.css\"> \n");
      out.write("\t        \n");
      out.write("<script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"city_state.js\"></script>\n");
      out.write("        <title> Create TimeTable</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
  
      out.write("\n");
      out.write("        <form class=\"student-form\" onsubmit=\"return checkReq()\" action=\"TimeTable11\" method=\"post\">  \n");
      out.write("         <fieldset>\n");
      out.write("\t\n");
      out.write("             <table class=\"onlyTable\">\n");
      out.write("                 <caption>Create Timetable</caption>   \n");
      out.write("            <tr>\n");
      out.write("                <th>S.no</th>\n");
      out.write("                <th>Time</th>\n");
      out.write("                <th>Day</th>\n");
      out.write("                <th>Semester</th>\n");
      out.write("                <th>Subject code</th>\n");
      out.write("                <th>Faculty name</th>\n");
      out.write("                <th>Room no.</th>\n");
      out.write("            </tr>\n");
      out.write("         ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("  ");
 try {
       
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.TimeTable.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.TimeTable where user_name='"+pa+"'");
lt=q.list();
System.out.println(pa);
      out.write('\n');
      out.write('\n');
      out.write('\n');
 if(lt.isEmpty())
    {   System.out.println("Hi");
         e=new TimeTable();
         e.setUser_name("Admin");
         s.save(e);
      out.write("\n");
      out.write("        <tr class=\"tableTxt\">\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t1"+inc);
      out.write("\" value=\"\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t2"+inc);
      out.write("\" value=\"\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t3"+inc);
      out.write("\" value=\"\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t4"+inc);
      out.write("\" value=\"\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t5"+inc);
      out.write("\" value=\"\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t6"+inc);
      out.write("\" value=\"\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t7"+inc);
      out.write("\" value=\"\" ></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
 f=1;
   System.out.println("hello"); }
else{System.out.println("time");
for(Iterator t=lt.iterator();t.hasNext();)
{ inc++;
  System.out.println(inc);
e=(TimeTable)t.next();
      out.write("\n");
      out.write("<tr class=\"tableTxt\">\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t1"+(inc-1));
      out.write("\" value=\"");
      out.print(e.getS_no());
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t2"+(inc-1));
      out.write("\" value=\"");
      out.print(e.getTime());
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t3"+(inc-1));
      out.write("\" value=\"");
      out.print(e.getDay());
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t4"+(inc-1));
      out.write("\" value=\"");
      out.print(e.getSem());
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t5"+(inc-1));
      out.write("\" value=\"");
      out.print(e.getSubcode());
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t6"+(inc-1));
      out.write("\" value=\"");
      out.print(e.getFaculty_name());
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" name =\"");
      out.print("t7"+(inc-1));
      out.write("\" value=\"");
      out.print(e.getRoom_no());
      out.write("\" ></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
} System.out.println(inc);
      out.write("\n");
      out.write(" <tr class=\"tableTxt\">\n");
      out.write("                <td><input type=\"text\" value=\"\" name=\"");
      out.print("t1"+inc);
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" value =\"\" name=\"");
      out.print("t2"+inc);
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" value =\"\" name=\"");
      out.print("t3"+inc);
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" value =\"\" name=\"");
      out.print("t4"+inc);
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" value =\"\" name=\"");
      out.print("t5"+inc);
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" value =\"\" name=\"");
      out.print("t6"+inc);
      out.write("\" ></td>\n");
      out.write("                <td><input type=\"text\" value =\"\" name=\"");
      out.print("t7"+inc);
      out.write("\" ></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
 System.out.println("table"); } 
  tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 
      out.write("\n");
      out.write("        \n");
      out.write("            </table>\n");
      out.write("\t\t\t\n");
      out.write("        </fieldset>\n");
      out.write(" <div>\n");
      out.write("                <input type=\"text\" hidden=\"hidden\" value=\"");
      out.print(inc);
      out.write("\" name=\"count\" size=\"1\">\n");
      out.write("             ");
 if(f==1)
                             {
      out.write("   \n");
      out.write("             <input type=\"submit\" value=\"Insert\" class=\"submit_btn\">\n");
      out.write("             ");
} 
               else
                 {
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Update\" class=\"submit_btn\">\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <input type=\"button\" value=\"Next\" class=\"reset_btn\" onclick=\"document.location='Exception.jsp'\">\n");
      out.write("            </div>\n");
      out.write(" </form>\n");
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
