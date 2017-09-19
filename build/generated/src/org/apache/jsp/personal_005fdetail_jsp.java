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

public final class personal_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.Student_record> lt=new ArrayList<javap.Student_record>();
 public Student_record e=new Student_record();
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
      out.write("\n");
      out.write(" \n");
      out.write(" <!DOCTYPE html>\n");
      out.write(" <html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"city_state.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <em> ( fields marked with * are mandatory)</em>\n");
      out.write("       \n");
      out.write("  \n");
      out.write("      ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("   ");
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
 
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("            \n");
      out.write("     <form class=\"student-form\" onsubmit=\"return checkReq()\" action=\"Personal\" method=\"post\">      \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Personal Detail</legend>\n");
      out.write("                \n");
      out.write("                <table>\n");
      out.write("                    <tr><td class=\"txt\"><span>Name* :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_Name\" id=\"Student_Name\"  placeholder=\"ENTER STUDENT'S NAME\"  required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getName() );
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Enrollment No* :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_Enroll_No\" id=\"Student_Enroll_No\" placeholder=\"ENTER STUDENT ENROLLMENT NO\" maxlength=\"12\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getEnrollment_no() );
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>Scholar No :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_Scholar_No\" id=\"Student_Scholar_No\" placeholder=\"ENTER STUDENT'S SCHOLAR NO\" maxlength=\"15\" value=\"");
      out.print(e.getScholar_no() );
      out.write("\"  ></td>\n");
      out.write("                    <td class=\"txt\"> <span>Gender* : </span></td>\n");
      out.write("                        ");
if(e.getGender().equals("male")){
      out.write("\n");
      out.write("                      <td class=\"radio\"> MALE<input type =radio name=\"gender\" value=\"male\" checked=\"checked\">FEMALE<input type =radio name=\"gender\" value=\"female\" required></td></tr>\n");
      out.write("                        ");
 } else{
      out.write("\n");
      out.write("                      <td class=\"radio\">MALE<input type =radio name=\"gender\" value=\"male\">FEMALE<input type =radio name=\"gender\" value=\"female\" required checked=\"checked\"></td></tr>");
}
      out.write("\n");
      out.write("                    <tr><td class=\"txt\"><span> Date of Birth*:</span></td><td class=\"in\"> <input type=\"text\" name=\"Student_dob\" id=\"Student_dob\" placeholder=\"dd-mm-yyyy\" maxlength=\"10\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getDate_of_birth() );
      out.write("\"></td>\n");
      out.write("                        ");
if(!(" ".equals(e.getBlood_group())))
                                                       {
                         if(e.getBlood_group().equals("A+"))
                                                        {
      out.write("\n");
      out.write("                           <td class=\"txt\"><span>Blood Group :</span></td><td class=\"in\"><select name=\"blood_group\" id=\"blood_group\"><option value=\"O+\">O+</option><option value=\"O-\">O-</option><option selected=\"selected\" value=\"A+\">A+</option><option value=\"A-\">A-</option><option value=\"B+\">B+</option><option value=\"B-\">B-</option><option value=\"AB+\">AB+</option><option value=\"AB-\">AB-</option></select></td></tr> \n");
      out.write("                        ");
}
                           else if(e.getBlood_group().equals("B+"))
                                                            {
      out.write("\n");
      out.write("                              <td class=\"txt\"><span>Blood Group :</span></td><td class=\"in\"><select name=\"blood_group\" id=\"blood_group\"><option>O</option><option value=\"A+\">A+</option><option value=\"A-\">A-</option><option selected=\"selected\" value=\"B+\">B+</option><option value=\"B-\">B-</option><option value=\"AB+\">AB+</option><option value=\"AB-\">AB-</option></select></td></tr>\n");
      out.write("                          ");
}
                             else if(e.getBlood_group().equals("B-"))
                                                            {
      out.write("\n");
      out.write("                              <td class=\"txt\"><span>Blood Group :</span></td><td class=\"in\"><select name=\"blood_group\" id=\"blood_group\"><option value=\"O+\">O+</option><option value=\"O-\">O-</option><option value=\"A+\">A+</option><option value=\"A-\">A-</option><option selected=\"selected\" value=\"B-\">B-</option><option value=\"B+\">B+</option><option value=\"AB-\">AB-</option><option value=\"AB+\">AB+</option></select></td></tr>\n");
      out.write("                           ");
}else if(e.getBlood_group().equals("O+"))
                                                            {
      out.write("\n");
      out.write("                              <td class=\"txt\"><span>Blood Group :</span></td><td class=\"in\"><select name=\"blood_group\" id=\"blood_group\"><option selected=\"selected\">O+</option><option value=\"O-\">O-</option><option value=\"A+\">A+</option><option value=\"A-\">A-</option><option value=\"B+\">B+</option><option value=\"B-\">B-</option><option value=\"AB-\">AB-</option><option value=\"AB+\">AB+</option></select></td></tr>\n");
      out.write("                           ");
}else if(e.getBlood_group().equals("O-"))
                                                            {
      out.write("\n");
      out.write("                              <td class=\"txt\"><span>Blood Group :</span></td><td class=\"in\"><select name=\"blood_group\" id=\"blood_group\"><option selected=\"selected\" value=\"O-\">O-</option><option value=\"O+\">O+</option><option value=\"A-\">A-</option><option value=\"A+\">A+</option><option value=\"B-\">B-</option><option value=\"B+\">B+</option><option value=\"AB-\">AB-</option><option value=\"AB+\">AB+</option></select></td></tr>\n");
      out.write("                           ");
}else if(e.getBlood_group().equals("A-"))
                                                            {
      out.write("\n");
      out.write("                              <td class=\"txt\"><span>Blood Group :</span></td><td class=\"in\"><select name=\"blood_group\" id=\"blood_group\"><option value=\"O-\">O-</option><option value=\"O+\">O+</option><option value=\"A-\" selected=\"selected\">A-</option><option value=\"A+\">A+</option><option value=\"B-\">B-</option><option value=\"B+\">B+</option><option value=\"AB-\">AB-</option><option value=\"AB+\">AB+</option></select></td></tr>\n");
      out.write("                           ");
}}else {
      out.write("\n");
      out.write("                                               \n");
      out.write("                              <td class=\"txt\"><span>Blood Group :</span></td><td class=\"in\"><select name=\"blood_group\" id=\"blood_group\"><option value=\"O-\">O-</option><option value=\"O+\">O+</option><option value=\"A-\">A-</option><option value=\"A+\">A+</option><option value=\"B-\">B-</option><option value=\"B+\">B+</option><option value=\"AB-\">AB-</option><option value=\"AB+\">AB+</option></select></td></tr>\n");
      out.write("                          ");
}
      out.write("\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                    </fieldset>  \n");
      out.write("            \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Contact Detail</legend><table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            <tr><td class=\"txt\"><span> College Email ID *:</span></td><td class=\"in\"><input type=\"email\" name=\"College_email_id\" id=\"College_Email_id\" placeholder=\"ENTER A VALID EMAIL ID\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getC_email() );
      out.write("\"></td>\n");
      out.write("            <td class=\"txt\"><span>Personal Email ID :</span></td><td class=\"in\"><input type=\"email\" name=\"Personal_email_id\" id=\"Personal_email_id\" placeholder=\"ENTER A VALID EMAIL ID\" onchange=\"textValidation(id)\" value=\"");
      out.print(e.getP_email() );
      out.write("\"></td></tr>\n");
      out.write("            <tr><td class=\"txt\"><span> Mobile 1* :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_mobile_no_1\" id=\"Student_mobile_no_1\" placeholder=\"ENTER STUDENT'S MOBILE NO\" maxlength=\"13\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getMobile1() );
      out.write("\"></td>\n");
      out.write("            <td class=\"txt\"><span>Mobile 2  :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_mobile_no_2\" id=\"Student_mobile_no_2\" placeholder=\"ENTER SECOND MOBILE NO\" maxlength=\"13\" onchange=\"textValidation(id)\" value=\"");
      out.print(e.getMobile2() );
      out.write("\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Stop Detail</legend><table>\n");
      out.write("                    <tr><td class=\"txt\"><span> Bus No :</span></td><td class=\"in\"><input type=\"text\" name =\"Bus_no\" id=\"Bus_no\" placeholder=\"ENTER BUS NO e.g. G05\" maxlength=\"3\" onchange=\"textValidation(id)\" value=\"");
      out.print( e.getBus_no() );
      out.write("\"></td></tr>\n");
      out.write("            <tr><td class=\"txt\"><span> Stop No/Name :</span></td><td class=\"in\"><input type=\"text\" name =\"Bus_Stop\" id=\"Bus_Stop\" placeholder=\"ENTER STOP NAME OR NUMBER\" maxlength=\"30\" value=\"");
      out.print( e.getStop_name() );
      out.write("\"></td></tr>\n");
      out.write("            </table></fieldset>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Local Address Detail</legend><table>\n");
      out.write("            <tr><td class=\"txt\"><span> Local Address* :</span></td><td class=\"in\" colspan=\"3\"><input type=\"text\" name=\"Local_address\" id=\"Local_address\" placeholder=\"ENTER THE LOCAL ADDRESS\" required maxlength=\"50\" value=\"");
      out.print( e.getL_address());
      out.write("\"></td></tr>\n");
      out.write("            <tr><td class=\"txt\"><span> City* :</span></td><td class=\"in\"><input type=\"text\" name=\"La_city\" id=\"La_city\" maxlength=\"10\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getL_city());
      out.write("\"></td>\n");
      out.write("            <td class=\"txt\"><span> State* :</span></td><td class=\"in\"><input type=\"text\" name=\"La_state\" id=\"La_state\" maxlength=\"20\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e.getL_state());
      out.write("\"></td></tr>\n");
      out.write("            <tr><td class=\"txt\"><span> Pin Code* :</span></td><td class=\"in\"><input type=\"text\" name=\"La_pin_code\" id=\"La_pin_code\" maxlength=\"6\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getL_pincode());
      out.write("\"></td>\n");
      out.write("            <td class=\"txt\"><span> Telephone No. :</span></td><td class=\"in\"><input type=\"text\" name=\"La_telephone\" id=\"La_telephone\" maxlength=\"10\" value=\"");
      out.print(e.getL_telephone_no() );
      out.write("\" ></td></tr>\n");
      out.write("            </table></fieldset>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("            <fieldset>  \n");
      out.write("                <legend>Permanent Address Detail</legend><table>\n");
      out.write("                    <tr><td class=\"txt\"><span> Permanent Address* :</span></td><td class=\"in\" colspan=\"3\"><input type=\"text\" name=\"Perma_address\" id=\"Perma_address\" placeholder=\"ENTER THE PERMANENT ADDRESS\" maxlength=\"50\" required value=\"");
      out.print(e.getP_address() );
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span> City* :</span></td><td class=\"in\"><input type=\"text\" name=\"Pa_city\" id=\"Pa_city\" maxlength=\"10\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getP_city() );
      out.write("\"></td>\n");
      out.write("                        <td class=\"txt\"><span> State*:</span></td><td class=\"in\"><input type=\"text\" name=\"Pa_state\" id=\"Pa_state\" maxlength=\"20\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getP_state() );
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span> Pin Code* :</span></td><td class=\"in\"><input type=\"text\" name=\"Pa_pin_code\" id=\"Pa_pin_code\" maxlength=\"6\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getP_pincode() );
      out.write("\"></td>\n");
      out.write("                        <td class=\"txt\"><span> Telephone No. :</span></td><td class=\"in\"><input type=\"text\" name=\"Pa_telephone\" id=\"Pa_telephone\" maxlength=\"10\" value=\"");
      out.print(e.getP_telephone_no() );
      out.write("\"></td></tr>\n");
      out.write("            </table></fieldset>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Other Information</legend><table>\n");
      out.write("                     ");
if(e.getCategory().equals("General"))
                                                       {
      out.write("\n");
      out.write("                          <tr><td class=\"txt\"><span> Category* :</span></td><td class=\"in\"><select name=\"Category\" id=\"Category\"><option id=\"general\" value=\"General\" selected=\"selected\">GEN</option><option id=\"obc\" value=\"OBC\">OBC</option><option id=\"sc\" value=\"SC\">SC</option><option id=\"st\">ST</option></select></td>  \n");
      out.write("                        ");
}
                           else if(e.getCategory().equals("OBC"))
                                                           {
      out.write("\n");
      out.write("                               <tr><td class=\"txt\"><span> Category* :</span></td><td class=\"in\"><select name=\"Category\" id=\"Category\"><option id=\"general\" value=\"General\">GEN</option><option id=\"obc\" value=\"OBC\" selected=\"selected\">OBC</option><option id=\"sc\" value=\"SC\">SC</option><option id=\"st\" value=\"ST\">ST</option></select></td>\n");
      out.write("                          ");
}
                             else if(e.getCategory().equals("SC"))
                                                           {
      out.write("\n");
      out.write("                               <tr><td class=\"txt\"><span> Category* :</span></td><td class=\"in\"><select name=\"Category\" id=\"Category\"><option id=\"general\" value=\"General\">GEN</option><option id=\"obc\" value=\"OBC\">OBC</option><option id=\"sc\" value=\"SC\" selected=\"selected\">SC</option><option id=\"st\" value=\"ST\">ST</option></select></td>\n");
      out.write("                          ");
}else if(e.getCategory().equals("ST"))
                                                           {
      out.write("\n");
      out.write("                               <tr><td class=\"txt\"><span> Category* :</span></td><td class=\"in\"><select name=\"Category\" id=\"Category\"><option id=\"general\" value=\"General\">GEN</option><option id=\"obc\" value=\"OBC\">OBC</option><option id=\"sc\" value=\"SC\">SC</option><option id=\"st\" value=\"ST\" selected=\"selected\">ST</option></select></td>\n");
      out.write("                          ");
}else
                                {
      out.write("\n");
      out.write("                                <tr><td class=\"txt\"><span> Category* :</span></td><td class=\"in\"><select name=\"Category\" id=\"Category\"><option id=\"general\" value=\"General\">GEN</option><option id=\"obc\" value=\"OBC\">OBC</option><option id=\"sc\" value=\"SC\">SC</option><option id=\"st\" value=\"ST\">ST</option></select></td>\n");
      out.write("                               ");
}
      out.write("     \n");
      out.write("               <td class=\"txt\"><span> Cast*:</span></td><td class=\"in\"><input type=\"text\" name=\"Cast\" id=\"Cast\" maxlength=\"8\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getCast() );
      out.write("\"></td></tr>\n");
      out.write("           <tr><td class=\"txt\"><span> Religion* :</span></td><td class=\"in\"><input type=\"text\" name=\"Religion\" id=\"Religion\" maxlength=\"10\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e.getReligion() );
      out.write("\"></td>\n");
      out.write("               <td class=\"txt\"><span> Mother Tongue* :</span></td><td class=\"in\"><input type=\"text\" name=\"Mother_tongue\" id=\"Mother_tongue\" maxlength=\"10\" required value=\"");
      out.print(e.getM_tongue() );
      out.write("\"></td></tr>\n");
      out.write("           <tr><td class=\"txt\"><span> Nationality* :</span></td><td class=\"in\"><input type=\"text\" name=\"Nationality\" id=\"Nationality\" maxlength=\"10\" required value=\"");
      out.print(e.getNationality() );
      out.write("\"></td><td></td><td></td></tr>\n");
      out.write("            </table></fieldset>\n");
      out.write("         \n");
      out.write("            \n");
      out.write("            <fieldset>\n");
      out.write("            <span> Medical Detail :</span><textarea name=\"Medical_detail\" id=\"Medical_detail\" maxlength=\"100\" >");
      out.print(e.getMedical_detail());
      out.write("</textarea>\n");
      out.write("           </fieldset>\n");
      out.write("            \n");
      out.write("           <div>\n");
      out.write("            ");
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
      out.write("            <input type=\"button\" value=\"Next\" class=\"reset_btn\" onclick=\"document.location='FamilyDetail.jsp'\">\n");
      out.write("             <input type=\"button\" value=\"ViewTimeTable\" class=\"reset_btn\" onclick=\"document.location='ViewTimeTable.jsp'\">\n");
      out.write("            <input type=\"button\" value=\"Logout\" class=\"reset_btn\" onclick=\"document.location='index.jsp'\">\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
