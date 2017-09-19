package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.hibernate.Query;
import java.awt.geom.QuadCurve2D;
import javap.Expectations;
import javap.Convert;
import java.io.IOException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.Session;

public final class Exception_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.Expectations> lt;
 public Expectations e; int f=0; 
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
      out.write("\n");
      out.write(" \n");
      out.write(" <!DOCTYPE html>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Expectation </title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"newcss.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("   \n");
      out.write("  ");
 try {
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
 
      out.write("\n");
      out.write("<form action=\"Expectation1\" method=\"post\" >\n");
      out.write("  <div id=\"expct-container\">  \n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td><div align=\"left\"><b>Expectation from College:</b></div></td>\n");
      out.write("<td><div class=\"expect-inner\"><textarea rows=\"5\" cols=\"100\"  maxlength=\"300\" name=\"clg\" id=\"clg1\">");
      out.print(e.getExp_frm_colg());
      out.write("</textarea></td></d\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><div align=\"left\"><b> Expectation from Department:</b></div></td>\n");
      out.write("<td><div class=\"expect-inner\"><textarea rows=\"5\" cols=\"100\" maxlength=\"300\" name=\"dpt\" id=\"dpt1\">");
      out.print(e.getExp_frm_dept());
      out.write("</textarea></td></d\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><div align=\"left\"><b>Expectation from Mentor:</b></div></td>\n");
      out.write("<td><div class=\"expect-inner\"><textarea rows=\"5\" cols=\"100\" maxlength=\"300\" name=\"mnt\" id=\"mnt1\">");
      out.print(e.getExp_frm_mentr());
      out.write("</textarea></td></d\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><div align=\"left\"><b>Action Planed:</b></div></td>\n");
      out.write("<td><div class=\"expect-inner\"><textarea rows=\"5\" cols=\"100\" maxlength='300' name=\"act\" id=\"act1\">");
      out.print(e.getActn_planed());
      out.write("</textarea></td></d\n");
      out.write("</tr>\n");
      out.write(" ");
 if(f==1)
                             {
      out.write("   \n");
      out.write("                             <tr><td> <input type=\"submit\" value=\"Insert\" class=\"submit_btn\"></td>\n");
      out.write("             ");
} 
               else
                 {
      out.write("\n");
      out.write("                             <tr><td> <input type=\"submit\" value=\"Update\" class=\"submit_btn\"></td>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("                                 <td><div><input type=\"button\" value=\"Next\" class=\"reset_btn\" onclick=\"document.location='Previous_Qualification.jsp'\">\n");
      out.write("                              <input type=\"button\" value=\"Logout\" class=\"reset_btn\" onclick=\"document.location='index.jsp'\"></td></div></tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html> \n");
      out.write("\n");
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
