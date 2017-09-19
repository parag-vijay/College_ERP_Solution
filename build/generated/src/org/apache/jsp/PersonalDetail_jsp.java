package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PersonalDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
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
      out.write("        \n");
      out.write("       <em> ( fields marked with * are mandatory)</em>\n");
      out.write("       <form class=\"student-form\" onsubmit=\"return checkReq()\" action=\"Personal\" method=\"post\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Personal Detail</legend>\n");
      out.write("                \n");
      out.write("                <table>\n");
      out.write("                    <tr><td class=\"txt\"><span>Name* :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_Name\" id=\"Student_Name\"  placeholder=\"ENTER STUDENT'S NAME\"  required onchange=\"textValidation(id)\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Enrollment No* :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_Enroll_No\" id=\"Student_Enroll_No\" placeholder=\"ENTER STUDENT ENROLLMENT NO\" maxlength=\"12\" required onchange=\"textValidation(id)\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>Scholar No :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_Scholar_No\" id=\"Student_Scholar_No\" placeholder=\"ENTER STUDENT'S SCHOLAR NO\" maxlength=\"15\" ></td>\n");
      out.write("                    <td class=\"txt\"> <span>Gender* :</span></td><td>MALE<input type =radio name=\"gender\" value=\"male\" checked=\"checked\">FEMALE<input type =radio name=\"gender\" value=\"female\" required>FEMALE</td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span> Date of Birth*:</span></td><td class=\"in\"> <input type=\"text\" name=\"Student_dob\" id=\"Student_dob\" placeholder=\"dd-mm-yyyy\" maxlength=\"10\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Blood Group :</span></td><td class=\"in\"><select name=\"blood_group\" id=\"blood_group\"><option>O</option><option>A</option><option>B</option><option>AB</option></select></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                    </fieldset>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Contact Detail</legend><table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            <tr><td class=\"txt\"><span> College Email ID *:</span></td><td class=\"in\"><input type=\"email\" name=\"College_email_id\" id=\"College_Email_id\" placeholder=\"ENTER A VALID EMAIL ID\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("            <td class=\"txt\"><span>Personal Email ID :</span></td><td class=\"in\"><input type=\"email\" name=\"Personal_email_id\" id=\"Personal_email_id\" placeholder=\"ENTER A VALID EMAIL ID\" onchange=\"textValidation(id)\"></td></tr>\n");
      out.write("            <tr><td class=\"txt\"><span> Mobile 1* :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_mobile_no_1\" id=\"Student_mobile_no_1\" placeholder=\"ENTER STUDENT'S MOBILE NO\" maxlength=\"10\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("            <td class=\"txt\"><span>Mobile 2  :</span></td><td class=\"in\"><input type=\"text\" name =\"Student_mobile_no_2\" id=\"Student_mobile_no_2\" placeholder=\"ENTER SECOND MOBILE NO\" maxlength=\"10\" onchange=\"textValidation(id)\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("            </fieldset>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Stop Detail</legend><table>\n");
      out.write("                    <tr><td class=\"txt\"><span> Bus No :</span></td><td class=\"in\"><input type=\"text\" name =\"Bus_no\" id=\"Bus_no\" placeholder=\"ENTER BUS NO e.g. G05\" maxlength=\"3\" onchange=\"textValidation(id)\"></td></tr>\n");
      out.write("            <tr><td class=\"txt\"><span> Stop No/Name :</span></td><td class=\"in\"><input type=\"text\" name =\"Bus_Stop\" id=\"Bus_Stop\" placeholder=\"ENTER STOP NAME OR NUMBER\" maxlength=\"30\"></td></tr>\n");
      out.write("            </table></fieldset>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Local Address Detail</legend><table>\n");
      out.write("            <tr><td class=\"txt\"><span> Local Address* :</span></td><td class=\"in\" colspan=\"3\"><input type=\"text\" name=\"Local_address\" id=\"Local_address\" placeholder=\"ENTER THE LOCAL ADDRESS\" required maxlength=\"50\"></td></tr>\n");
      out.write("            <tr><td class=\"txt\"><span> City* :</span></td><td class=\"in\"><input type=\"text\" name=\"La_city\" id=\"La_city\" maxlength=\"10\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("            <td class=\"txt\"><span> State* :</span></td><td class=\"in\"><input type=\"text\" name=\"La_state\" id=\"La_state\" maxlength=\"20\" required onchange=\"textValidation(id)\"></td></tr>\n");
      out.write("            <tr><td class=\"txt\"><span> Pin Code* :</span></td><td class=\"in\"><input type=\"text\" name=\"La_pin_code\" id=\"La_pin_code\" maxlength=\"6\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("            <td class=\"txt\"><span> Telephone No. :</span></td><td class=\"in\"><input type=\"text\" name=\"La_telephone\" id=\"La_telephone\" maxlength=\"10\" ></td></tr>\n");
      out.write("            </table></fieldset>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("            <fieldset>  \n");
      out.write("                <legend>Permanent Address Detail</legend><table>\n");
      out.write("                    <tr><td class=\"txt\"><span> Permanent Address* :</span></td><td class=\"in\" colspan=\"3\"><input type=\"text\" name=\"Perma_address\" id=\"Perma_address\" placeholder=\"ENTER THE PERMANENT ADDRESS\" maxlength=\"50\" required></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span> City* :</span></td><td class=\"in\"><input type=\"text\" name=\"Pa_city\" id=\"Pa_city\" maxlength=\"10\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td class=\"txt\"><span> State*:</span></td><td class=\"in\"><input type=\"text\" name=\"Pa_state\" id=\"Pa_state\" maxlength=\"20\" required onchange=\"textValidation(id)\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span> Pin Code* :</span></td><td class=\"in\"><input type=\"text\" name=\"Pa_pin_code\" id=\"Pa_pin_code\" maxlength=\"6\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td class=\"txt\"><span> Telephone No. :</span></td><td class=\"in\"><input type=\"text\" name=\"Pa_telephone\" id=\"Pa_telephone\" maxlength=\"10\"></td></tr>\n");
      out.write("            </table></fieldset>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Other Information</legend><table>\n");
      out.write("           <tr><td class=\"txt\"><span> Category* :</span></td><td class=\"in\"><select name=\"Category\" id=\"Category\"><option id=\"general\">GEN</option><option id=\"obc\">OBC</option><option id=\"sc\">SC</option><option id=\"st\">ST</option></select></td>\n");
      out.write("               <td class=\"txt\"><span> Cast*:</span></td><td class=\"in\"><input type=\"text\" name=\"Cast\" id=\"Cast\" maxlength=\"8\" required onchange=\"textValidation(id)\"></td></tr>\n");
      out.write("           <tr><td class=\"txt\"><span> Religion* :</span></td><td class=\"in\"><input type=\"text\" name=\"Religion\" id=\"Religion\" maxlength=\"10\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("               <td class=\"txt\"><span> Mother Tongue* :</span></td><td class=\"in\"><input type=\"text\" name=\"Mother_tongue\" id=\"Mother_tongue\" maxlength=\"10\" required></td></tr>\n");
      out.write("           <tr><td class=\"txt\"><span> Nationality* :</span></td><td class=\"in\"><input type=\"text\" name=\"Nationality\" id=\"Nationality\" maxlength=\"10\" required></td><td></td><td></td></tr>\n");
      out.write("            </table></fieldset>\n");
      out.write("         \n");
      out.write("          \n");
      out.write("            <fieldset>\n");
      out.write("            <span> Medical Detail :</span><textarea name=\"Medical_detail\" id=\"Medical_detail\" maxlength=\"100\"></textarea>\n");
      out.write("           </fieldset>\n");
      out.write("            \n");
      out.write("           <div>\n");
      out.write("            <input type=\"submit\" value=\"submit\" class=\"submit_btn\">\n");
      out.write("            <input type=\"reset\" value=\"reset\" class=\"reset_btn\">\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
