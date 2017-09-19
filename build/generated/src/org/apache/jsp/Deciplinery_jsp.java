package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import javap.Cocurricular_activity;
import javap.Disciplinary_Action;
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

public final class Deciplinery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.Cocurricular_activity> lt=new ArrayList<Cocurricular_activity>();
 public Cocurricular_activity e[]=new Cocurricular_activity[5];
 public int f=0;
 public SessionFactory sf;
 public Session s;
 int i=0; 
 public List<javap.Disciplinary_Action> lt1=new ArrayList<Disciplinary_Action>();
 public Disciplinary_Action e1[]=new Disciplinary_Action[5];
 int i1=0; 
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
      out.write("<!DOCTYPE html>\n");
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
      out.write("        ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("  ");
 
  HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
  try {
       
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Cocurricular_activity.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Cocurricular_activity where user_name='"+pa+"'");
lt=q.list();

if(lt.isEmpty())
    { for(int j=0;j<5;j++)
                   {
         e[j]=new Cocurricular_activity();
        e[j].setUser_name(pa);
         e[j].setS_no(j+1);
         s.save(e[j]);
               }
   f=1;
    }
else{
      out.write(' ');
      out.write('\n');
for(Iterator t=lt.iterator();t.hasNext();)
{
e[i]=(Cocurricular_activity)t.next();
i++;
} 
i=0;
   } 
  tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 
      out.write("\n");
      out.write("        <form class=\"student-form\" onsubmit=\"return checkReq()\" action=\"Displinary\">\n");
      out.write("         <fieldset>\n");
      out.write("            <legend>CO-CURRICULAR ACTIVITY</legend>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Activity Name</th>\n");
      out.write("                    <th>Category</th>\n");
      out.write("                    <th>Level</th>\n");
      out.write("                    <th>Name of Event</th>\n");
      out.write("                    <th>Date/Year</th>\n");
      out.write("                    <th>Organized By & Place</th>\n");
      out.write("                    <th>Position Secured</th>\n");
      out.write("                    <th>Achievement</th>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"q11\" size=\"10\" id=\"CoActivityName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getActivity_name());
      out.write("\">  </td>    \n");
      out.write("                    <td>  <input type=\"text\" name=\"q12\" size=\"20\" id=\"CoCate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getCategory());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"q13\" size=\"8\" id=\"CoLevel\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getLevel());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"q14\" size=\"14\" id=\"CoName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getName_of_event());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q15\" size=\"5\" id=\"CoDate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getDate_or_year());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q16\" size=\"5\" id=\"CoOrganized\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getOrganised_by_or_place());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q17\" size=\"10\" id=\"CoPosition\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getPosition_secured());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q18\" size=\"15\" id=\"CoAchievement\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getAchievement_remark());
      out.write("\">  </td>            \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"q21\" size=\"10\" id=\"CoActivityName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getActivity_name());
      out.write("\">  </td>    \n");
      out.write("                    <td>  <input type=\"text\" name=\"q22\" size=\"20\" id=\"CoCate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getCategory());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"q23\" size=\"8\" id=\"CoLevel\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getLevel());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"q24\" size=\"14\" id=\"CoName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getName_of_event());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q25\" size=\"5\" id=\"CoDate\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[1].getDate_or_year());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q26\" size=\"5\" id=\"CoOrganized\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getOrganised_by_or_place());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q27\" size=\"10\" id=\"CoPosition\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getPosition_secured());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q28\" size=\"15\" id=\"CoAchievement\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getAchievement_remark());
      out.write("\">  </td>            \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"q31\" size=\"10\" id=\"CoActivityName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getActivity_name());
      out.write("\">  </td>    \n");
      out.write("                    <td>  <input type=\"text\" name=\"q32\" size=\"20\" id=\"CoCate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getCategory());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"q33\" size=\"8\" id=\"CoLevel\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getLevel());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"q34\" size=\"14\" id=\"CoName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getName_of_event());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q35\" size=\"5\" id=\"CoDate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getDate_or_year());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q36\" size=\"5\" id=\"CoOrganized\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getOrganised_by_or_place());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q37\" size=\"10\" id=\"CoPosition\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getPosition_secured());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q38\" size=\"15\" id=\"CoAchievement\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getAchievement_remark());
      out.write("\">  </td>            \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"q41\" size=\"10\" id=\"CoActivityName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getActivity_name());
      out.write("\">  </td>    \n");
      out.write("                    <td>  <input type=\"text\" name=\"q42\" size=\"20\" id=\"CoCate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getCategory());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"q43\" size=\"8\" id=\"CoLevel\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getLevel());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"q44\" size=\"14\" id=\"CoName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getName_of_event());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q45\" size=\"5\" id=\"CoDate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getDate_or_year());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q46\" size=\"5\" id=\"CoOrganized\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[3].getOrganised_by_or_place());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q47\" size=\"10\" id=\"CoPosition\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getPosition_secured());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q48\" size=\"15\" id=\"CoAchievement\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getAchievement_remark());
      out.write("\">  </td>            \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"q51\" size=\"10\" id=\"CoActivityName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getActivity_name());
      out.write("\">  </td>    \n");
      out.write("                    <td>  <input type=\"text\" name=\"q52\" size=\"20\" id=\"CoCate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getCategory());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"q53\" size=\"8\" id=\"CoLevel\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getLevel());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"q54\" size=\"14\" id=\"CoName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getName_of_event());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q55\" size=\"5\" id=\"CoDate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getDate_or_year());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q56\" size=\"5\" id=\"CoOrganized\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getOrganised_by_or_place());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q57\" size=\"10\" id=\"CoPosition\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getPosition_secured());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"q58\" size=\"15\" id=\"CoAchievement\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getAchievement_remark());
      out.write("\">  </td>            \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </fieldset>\n");
      out.write("                        ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("    \n");
      out.write("  ");
 try {
 sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Disciplinary_Action.class).buildSessionFactory();
s= sf.openSession(); 
Transaction tx1=s.beginTransaction();
Query q1=s.createQuery("from javap.Disciplinary_Action where user_name='"+pa+"'");
lt1=q1.list();

if(lt1.isEmpty())
    { for(int j=0;j<5;j++)
                   {
         e1[j]=new Disciplinary_Action();
         e1[j].setUser_name(pa);
         e1[j].setS_no(j+1);
         s.save(e1[j]);
                }
   f=1;
    }
else{
      out.write(' ');
      out.write('\n');
for(Iterator t1=lt1.iterator();t1.hasNext();)
{
e1[i1]=(Disciplinary_Action)t1.next();
i1++;
} 
 i1=0;
  }
tx1.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex);
         }
 
      out.write("\n");
      out.write("                <fieldset>\n");
      out.write("            <legend>DISCIPLINARY </legend>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Types</th>\n");
      out.write("                    <th>Particular</th>\n");
      out.write("                    <th>Time Spend</th>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"r11\" size=\"5\" id=\"DiDate\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[0].getDis_date());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"r12\" size=\"20\" id=\"DiTypes\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getTypes());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"r13\" size=\"8\" id=\"DiParticular\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getParticular());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"r14\" size=\"14\" id=\"DiTime\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getTime_spend() );
      out.write("\">   </td>\n");
      out.write("                                             \n");
      out.write("                </tr>\n");
      out.write("                 <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"r21\" size=\"5\" id=\"DiDate\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[1].getDis_date());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"r22\" size=\"20\" id=\"DiTypes\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[1].getTypes());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"r23\" size=\"8\" id=\"DiParticular\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[1].getParticular());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"r24\" size=\"14\" id=\"DiTime\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[1].getTime_spend());
      out.write("\">   </td>\n");
      out.write("                                             \n");
      out.write("                </tr>\n");
      out.write("                 <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"r31\" size=\"5\" id=\"DiDate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getDis_date());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"r32\" size=\"20\" id=\"DiTypes\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[2].getTypes());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"r33\" size=\"8\" id=\"DiParticular\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[2].getParticular());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"r34\" size=\"14\" id=\"DiTime\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getTime_spend());
      out.write("\">   </td>\n");
      out.write("                                             \n");
      out.write("                </tr>\n");
      out.write("                 <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"r41\" size=\"5\" id=\"DiDate\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[3].getDis_date());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"r42\" size=\"20\" id=\"DiTypes\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[3].getTypes());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"r43\" size=\"8\" id=\"DiParticular\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[3].getParticular());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"r44\" size=\"14\" id=\"DiTime\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[3].getTime_spend());
      out.write("\">   </td>\n");
      out.write("                                             \n");
      out.write("                </tr>\n");
      out.write("                 <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"r51\" size=\"5\" id=\"DiDate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[4].getDis_date());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"r52\" size=\"20\" id=\"DiTypes\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[4].getTypes());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"r53\" size=\"8\" id=\"DiParticular\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[4].getParticular());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"r54\" size=\"14\" id=\"DiTime\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[4].getTime_spend());
      out.write("\">   </td>\n");
      out.write("                                             \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </fieldset>\n");
      out.write("        <div>\n");
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
      out.write("            <input type=\"button\" value=\"Logout\" class=\"reset_btn\" onclick=\"document.location='index.jsp'\">\n");
      out.write("            </div>\n");
      out.write("       \n");
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
