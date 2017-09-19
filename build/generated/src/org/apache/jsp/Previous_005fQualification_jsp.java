package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import javap.Admision_detail;
import javap.Previous_qualification;
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

public final class Previous_005fQualification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.Previous_qualification> lt=new ArrayList<Previous_qualification>();
 public Previous_qualification e[]=new Previous_qualification[3];
 public int f=0;
 public SessionFactory sf ;
 public Session s;
 int ii=0;
 public List<javap.Admision_detail> lt1=new ArrayList<Admision_detail>();
 public Admision_detail e1=new Admision_detail();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"city_state.js\"></script>\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("                 ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("  ");
 try {
 sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Previous_qualification.class).buildSessionFactory();
 s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Previous_qualification where user_name='0827IT111058'");
lt=q.list();

if(lt.isEmpty())
    { 
        for(int i=0;i<3;i++)
        {
        e[i]=new Previous_qualification();
        e[i].setUser_name("0827IT111058");
        e[i].setS_no(i+1);
        if(i==0)
        e[i].setExam_name("10th");
               else if(i==1)
                   e[i].setExam_name("12th");
                   else
                       e[i].setExam_name("Deploma");
        s.save(e[i]);
        }
   f=1;
    }
else{
      out.write(' ');
      out.write('\n');
for(Iterator t=lt.iterator();t.hasNext();)
{  
  System.out.println(ii);
 e[ii]=(Previous_qualification)t.next();
ii++;
}
 ii=0;
} 
s.flush();
tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex);
         }
 
      out.write("\n");
      out.write("        <form class=\"student-form\" onsubmit=\"return checkReq()\" action=\"Pervious_Q\">\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Previous Qualification</legend>         \n");
      out.write("            <table>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <th>Exam Name </th>\n");
      out.write("                    <th>Roll No. </th>\n");
      out.write("                    <th>University/Board </th>\n");
      out.write("                    <th>School Name & City </th>\n");
      out.write("                    <th>Medium</th>\n");
      out.write("                    <th>Year of Passing</th>\n");
      out.write("                    <th>Marks Obtained</th>\n");
      out.write("                    <th>Max Marks</th>\n");
      out.write("                    <th>Div</th>\n");
      out.write("                    <th>Grade</th>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                 <tr class=\"tableTxt\">\n");
      out.write("                     <td>  <input type=\"text\" name=\"t11\" size=\"15\" id=\"PQExamName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getExam_name());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"t12\" size=\"12\" id=\"PQRollNo\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getRoll_no());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t13\" size=\"20\" id=\"PQUniversity\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getUniversity_board());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t14\" size=\"25\" id=\"PQSchool\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getSchool_name_city());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t15\" size=\"15\" id=\"PQMedium\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getMedium());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t16\" size=\"5\" id=\"PQYearOfPassing\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getYear_of_passing());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t17\" size=\"8\" id=\"PQMarksObtained\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getMarks_obtained());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t18\" size=\"3\" id=\"PQMaxMarks\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getMax_marks());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t19\" size=\"3\" id=\"PQDiv\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getDivision());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t110\" size=\"3\" id=\"PQGrade\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[0].getGrade_percent());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr class=\"tableTxt\">\n");
      out.write("                     <td>  <input type=\"text\" name=\"t21\" size=\"15\" id=\"PQExamName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getExam_name());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"t22\" size=\"12\" id=\"PQRollNo\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getRoll_no());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t23\" size=\"20\" id=\"PQUniversity\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getUniversity_board());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t24\" size=\"25\" id=\"PQSchool\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getSchool_name_city());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t25\" size=\"15\" id=\"PQMedium\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getMedium());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t26\" size=\"5\" id=\"PQYearOfPassing\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getYear_of_passing());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t27\" size=\"8\" id=\"PQMarksObtained\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getMarks_obtained());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t28\" size=\"3\" id=\"PQMaxMarks\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getMax_marks());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t29\" size=\"3\" id=\"PQDiv\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getDivision());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t210\" size=\"3\" id=\"PQGrade\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[1].getGrade_percent());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                     <td>  <input type=\"text\" name=\"t31\" size=\"15\" id=\"PQExamName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getExam_name());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"t32\" size=\"12\" id=\"PQRollNo\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getRoll_no());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t33\" size=\"20\" id=\"PQUniversity\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getUniversity_board());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t34\" size=\"25\" id=\"PQSchool\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getSchool_name_city());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t35\" size=\"15\" id=\"PQMedium\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getMedium());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t36\" size=\"5\" id=\"PQYearOfPassing\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getYear_of_passing());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t37\" size=\"8\" id=\"PQMarksObtained\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getMarks_obtained());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t38\" size=\"3\" id=\"PQMaxMarks\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getMax_marks());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t39\" size=\"3\" id=\"PQDiv\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getDivision());
      out.write("\">   </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t310\" size=\"3\" id=\"PQGrade\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e[2].getGrade_percent());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 </table>\n");
      out.write("        </fieldset>\n");
      out.write("                        ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     \n");
      out.write("  ");
 try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Admision_detail.class).buildSessionFactory();
 s=sf.openSession(); 
Transaction tx1=s.beginTransaction();
Query q1=s.createQuery("from javap.Admision_detail where user_name='0827IT111058'");
lt1=q1.list();

if(lt1.isEmpty())
     { 
    e1=new Admision_detail();
     e1.setUser_name("0827IT111058");
     s.save(e1);
     f=1;
    }
else{
Iterator t1=lt1.iterator();   
e1=(Admision_detail)t1.next();
} 
tx1.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex);
         }
 
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Admission Detail</legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr><td class=\"txt\"><span>Course* :</span></td><td class=\"in\"><input type=\"text\" name =\"Course\" id=\"Course1\"  required onchange=\"textValidation(id)\" value=\"");
      out.print( e1.getCourse());
      out.write("\"></td>\n");
      out.write("                     <td class=\"txt\"><span>Admitted Branch* :</span></td><td class=\"in\"><input type=\"text\" name =\"Admitted_Branch\" id=\"Admitted_Branch\"  required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getAdmitted_branch());
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>Admitted Sem * :</span></td><td class=\"in\"><input type=\"text\" name =\"Admitted_Sem\" id=\"Admitted_Sem\"    required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getAdmitted_sem());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Admitted Session * :</span></td><td class=\"in\"><input type=\"text\" name =\"Admitted_Session\" id=\"Admitted_Session\"    required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getAdmitted_session());
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>Admitted Date* :</span></td><td class=\"in\"><input type=\"text\" name =\"Admitted_Date\" id=\"Admitted_Date\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getAdmission_date());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Entrance Exam Name* :</span></td><td class=\"in\"><input type=\"text\" name =\"Entrance_Exam_Name\" id=\"Entrance_Exam_Name\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getEntrance_exam_name());
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>Marks Obtained* :</span></td><td class=\"in\"><input type=\"text\" name =\"Marks_Obtained\" id=\"Marks_Obtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getMarks_obtained());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Max Marks* :</span></td><td class=\"in\"><input type=\"text\" name =\"Max_Marks\" id=\"Max_Marks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getMax_marks());
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>Percentage* :</span></td><td class=\"in\"><input type=\"text\" name =\"Percentage\" id=\"Percentage\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getPercentage());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Percentile* :</span></td><td class=\"in\"><input type=\"text\" name =\"Percentile\" id=\"Percentile\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getPercentile());
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>All India Rank* :</span></td><td class=\"in\"><input type=\"text\" name =\"All_India_Rank\" id=\"All_India_Rank\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getAll_india_rank());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Admission Quota* :</span></td><td class=\"in\"><input type=\"text\" name =\"Admission_Quota\" id=\"Admission_Quota\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getAdmission_quota());
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>Quota Rank* :</span></td><td class=\"in\"><input type=\"text\" name =\"Quota_Rank\" id=\"Quota_Rank\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getQuota_rank());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Type of Admission* :</span></td><td class=\"in\"><input type=\"text\" name =\"Type_of_Admission\" id=\"Type_of_Admission\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getType_of_admission());
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td class=\"txt\"><span>Year* :</span></td><td class=\"in\"><input type=\"text\" name =\"Year\" id=\"Year\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1.getYear());
      out.write("\"></td></tr>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            </fieldset>\n");
      out.write("                    <div>\n");
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
      out.write("            <input type=\"submit\" value=\"Next\" class=\"reset_btn\" onclick=\"\">\n");
      out.write("            </div>\n");
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
