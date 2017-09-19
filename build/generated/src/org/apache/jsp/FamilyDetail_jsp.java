package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import javap.Student_record;
import java.util.Iterator;
import org.hibernate.Query;
import java.awt.geom.QuadCurve2D;
import javap.Convert;
import java.io.IOException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.Session;

public final class FamilyDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.Student_record> lt=new ArrayList<Student_record>();
 public Student_record e;
 public int f=0;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("       <html><head>\n");
      out.write("                <title></title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
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
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
Session s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Student_record where username='0827IT111058'");
lt=q.list();

if(lt.isEmpty())
    { e=new Student_record();
    e.setUsername("0827IT111058");
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
 
      out.write("\n");
      out.write(" <form class=\"Family-details\" onsubmit=\"return checkReq()\" action=\"Family\" method=\"post\">\n");
      out.write("<fieldset id=\"_father\">\n");
      out.write("<legend>Father Information</legend>\n");
      out.write("<br>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("\t<td class=\"txt\"><span>\tFather's Name*: </span></td><td class=\"in\"><input name=\"father_name\" id=\"Father_name\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getFather_name() );
      out.write("\" ></td>\n");
      out.write("\t<td class=\"txt\"><span>\tFather's DOB*: </span></td><td class=\"in\"><input name=\"father_dob\" id=\"Father_dob\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getF_dob() );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("        <td class=\"txt\"><span>\tOccupation*: </span></td><td class=\"in\"><input name=\"father_occuption\" id=\"Father_occupation\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getF_occupation());
      out.write("\"></td>\n");
      out.write("        <td class=\"txt\"><span>\tMobile*: </span></td><td class=\"in\"><input name=\"father_mobile\" id=\"Father_mobile\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getF_mobile() );
      out.write("\"></td>\n");
      out.write("</tr>\t\n");
      out.write("<tr>\n");
      out.write("        <td class=\"txt\"><span>\tE-Mail: </span></td><td class=\"in\"><input name=\"father_email\" id=\"Father_email\"  onchange=\"textValidation(id)\" value=\"");
      out.print(e.getF_email() );
      out.write("\"></td><td></td><td></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</fieldset>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<fieldset id=\"_mother\">\n");
      out.write("<legend>Mother information</legend>\n");
      out.write("<br>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("\t<td class=\"txt\"><span>\tMother's Name*: </span></td><td class=\"in\"><input name=\"mother_name\" id=\"Mother_name\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getMother_name() );
      out.write("\"></td>\n");
      out.write("\t<td class=\"txt\"><span>\tMother's DOB*: </span></td><td class=\"in\"><input name=\"mother_dob\" id=\"Mother_dob\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getM_dob() );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("        <td class=\"txt\"><span>\tOccupation*: </span></td><td class=\"in\"><input name=\"mother_occupation\" id=\"Mother_occupation\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getM_occupaion() );
      out.write("\"></td>\n");
      out.write("\t<td class=\"txt\"><span>\tMobile*: </span></td><td class=\"in\"><input name=\"mother_mobile\" id=\"Mother_mobile\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getM_mobile() );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("        <td class=\"txt\"><span>\tE-Mail: </span></td><td class=\"in\"><input name=\"mother_email\" id=\"Mother_email\" onchange=\"textValidation(id)\" value=\"");
      out.print(e.getM_email() );
      out.write("\"></td><td></td><td></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</fieldset>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<fieldset id=\"_family\">\n");
      out.write("<legend>Family Details</legend>\n");
      out.write("<br>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("\t<td class=\"txt\"><span>Anniversary: </span></td><td class=\"in\"><input name=\"anniversary\" id=\"Anniversary\"  onchange=\"textValidation(id)\" value=\"");
      out.print(e.getAnniversary() );
      out.write("\"></td>\n");
      out.write("\t<td class=\"txt\"><span>Income: </span></td><td class=\"in\"><input name=\"income\" id=\"Income\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getIncome() );
      out.write("\" ></td>\n");
      out.write("\t<td class=\"txt\"><span>Vehicle: </span></td><td class=\"in\"><input name=\"vehicle\" id=\"Vehicle\"  onchange=\"textValidation(id)\" value=\"");
      out.print(e.getVehicle() );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td class=\"txt\"><span>Sibling 1: </span></td><td class=\"in\"><input name=\"sibling_name_1\" id=\"Sibling_name_1\"  onchange=\"textValidation(id)\" value=\"");
      out.print(e.getSibling1() );
      out.write("\" ></td>\n");
      out.write("\t<td class=\"txt\"><span>Sibling 2: </span></td><td class=\"in\"><input name=\"sibling_name_2\" id=\"Sibling_name_2\"  onchange=\"textValidation(id)\" value=\"");
      out.print(e.getSibling2() );
      out.write("\" ></td>\n");
      out.write("\t<td class=\"txt\"><span>Sibling 3: </span></td><td class=\"in\"><input name=\"sibling_name_3\" id=\"Sibling_name_3\"  onchange=\"textValidation(id)\" value=\"");
      out.print(e.getSibling3() );
      out.write("\"></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td class=\"txt\"><span>\tGuardian Name*: </span></td><td class=\"in\"><input name=\"guardian_name\" id=\"Guardian_name\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getL_guardian() );
      out.write("\"></td>\n");
      out.write("\t<td class=\"txt\"><span>\tMobile No.*: </span></td><td class=\"in\"><input name=\"guardian_mobile\" id=\"Guardian_mobile\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getLg_mobile() );
      out.write("\"></td>\n");
      out.write("        <td></td><td></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("        <td class=\"txt\"><span>\tLand Line No.: </span></td><td class=\"in\"><input name=\"guardian_landline\" id=\"Guardian_landline\" value=\"");
      out.print(e.getLg_telephone() );
      out.write("\"></td>\n");
      out.write("\t<td class=\"txt\"><span>\tAddress*: </span></td><td class=\"in\"><input name=\"guardian_address\" id=\"Guardian_address\" required value=\"");
      out.print(e.getLg_address() );
      out.write("\"></td>\n");
      out.write("        <td></td><td></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</fieldset>\n");
      out.write("<div>\n");
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
      out.write("            <input type=\"button\" value=\"Next\" class=\"reset_btn\" onclick=\"document.location='Exta_detail.jsp'\">\n");
      out.write("            </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body></html>\n");
      out.write("\n");
      out.write("\n");
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
