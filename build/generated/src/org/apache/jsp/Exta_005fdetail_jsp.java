package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import javap.Strength;
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

public final class Exta_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.Student_record> lt=new ArrayList<Student_record>();
 public Student_record e=new Student_record();
 public int f=0;
 public List<javap.Strength> lt1=new ArrayList<Strength>();
public Strength e1=new Strength();
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"newcss.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("        \n");
      out.write("        <title></title>\n");
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
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
Session s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Student_record where username='0827IT111058'");
lt=q.list();

if(lt.isEmpty())
    {
    e=new Student_record();
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
        System.out.println(ex.getMessage());
         }
 
      out.write("\n");
      out.write(" <form class=\"extra-details\" onsubmit=\"return checkReq()\" action=\"Extra_detail1\" method=\"post\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Extra-Curricular</legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"txt\"><span>Proficiency in English:</span></td>\n");
      out.write("                        <td>\n");
      out.write("                            <ul>\n");
      out.write("                                 ");

                                    if("Write".equals(e.getE_write()))
                                                           {
      out.write("\n");
      out.write("                                <li><label>Write</label><input type=\"checkbox\" name=\"write\" value=\"Write\" checked></li>\n");
      out.write("                               \n");
      out.write("                          ");
}else 
                                                           {
      out.write("\n");
      out.write("                                  <li><label>Write</label><input type=\"checkbox\" name=\"write\" value=\"Write\"></li>\n");
      out.write("                          ");
}
                                  if("Speak".equals(e.getE_speak()))
                                                           {
      out.write("\n");
      out.write("                               \n");
      out.write("                                <li><label>Speak</label><input type=\"checkbox\" name=\"speak\" value=\"Speak\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else 
                                                           {
      out.write("\n");
      out.write("                                  <li><label>Speak</label><input type=\"checkbox\" name=\"speak\" value=\"Speak\"></li>\n");
      out.write("                          ");
} if("Understand".equals(e.getE_understand()))
                                                           {
      out.write("\n");
      out.write("                               \n");
      out.write("                                <li><label>Understand</label><input type=\"checkbox\" name=\"understand\" value=\"Understand\" checked></li>\n");
      out.write("                          ");
} else 
                                                           {
      out.write("\n");
      out.write("                                  <li><label>Understand</label><input type=\"checkbox\" name=\"understand\" value=\"Understand\"></li>\n");
      out.write("                          ");
} if("Read".equals(e.getE_read()))
                                                           {
      out.write("\n");
      out.write("                               <li><label>Read</label><input type=\"checkbox\" name= \"read\" value=\"Read\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
}else
                                {
      out.write("\n");
      out.write("                                <li><label>Read</label><input type=\"checkbox\" name= \"read\" value=\"Read\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}
      out.write("   \n");
      out.write("                           </ul>\n");
      out.write("                        </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"txt\"><span>Extra-Curricular Skills:</span></td>\n");
      out.write("                    <td>\n");
      out.write("                            <ul id=\"ex-skill-list\">\n");
      out.write("                               ");
 if("Anchoring".equals(e.getEx_anchoring()))
                                                           {
      out.write("\n");
      out.write("                               <li><label>Anchoring</label><input type=\"checkbox\" name=\"anchoring\" value=\"Anchoring\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Anchoring</label><input type=\"checkbox\" name=\"anchoring\" value=\"Anchoring\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
} if("Debate".equals(e.getEx_debate()))
                                                           {
      out.write("\n");
      out.write("                               <li><label>Debate</label><input type=\"checkbox\" name=\"debate\" value=\"Debate\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Debate</label><input type=\"checkbox\" name=\"debate\" value=\"Debate\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if("Painting".equals(e.getEx_painting()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Painting</label><input type=\"checkbox\" name=\"painting\" value=\"Painting\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Painting</label><input type=\"checkbox\" name=\"painting\" value=\"Painting\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if( "Dancing".equals(e.getEx_dancing()))
                                                           {
      out.write("\n");
      out.write("                             <li><label>Dancing</label><input type=\"checkbox\" name=\"dancing\" value=\"Dancing\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Dancing</label><input type=\"checkbox\" name=\"dancing\" value=\"Dancing\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if( "Singing".equals(e.getEx_singing()))
                                                           {
      out.write("\n");
      out.write("                             <li><label>Singing</label><input type=\"checkbox\" name=\"singing\" value=\"Singing\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Singing</label><input type=\"checkbox\" name=\"singing\" value=\"Singing\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if( "instrument".equals(e.getEx_instrument()))
                                                           {
      out.write("\n");
      out.write("                             <li><label>Instrument</label><input type=\"checkbox\" name=\"instrument\" value=\"Instrument\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Instrument</label><input type=\"checkbox\" name=\"instrument\" value=\"Instrument\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}
      out.write(" \n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"txt\"><span>Sports:</span></td>\n");
      out.write("                    <td>\n");
      out.write("                        <ul>\n");
      out.write("                            ");
if("Football".equals(e.getSpo_Football()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Football</label><input type=\"checkbox\"  name=\"football\" value=\"Football\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                 <li><label>Football</label><input type=\"checkbox\"  name=\"football\" value=\"Football\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if("Carom".equals(e.getSpo_Carom()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Carom</label><input type=\"checkbox\"  name=\"carom\" value=\"Carom\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Carom</label><input type=\"checkbox\"  name=\"carom\" value=\"Carom\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if("TT".equals(e.getSpo_TT()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>TT</label><input type=\"checkbox\"  name=\"tt\" value=\"TT\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>TT</label><input type=\"checkbox\"  name=\"tt\" value=\"TT\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if("Cricket".equals(e.getSpo_Cricket()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Cricket</label><input type=\"checkbox\"  name=\"Cricket\" value=\"Cricket\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Cricket</label><input type=\"checkbox\"  name=\"Cricket\" value=\"Cricket\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if("Chess".equals(e.getCheese()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Chess</label><input type=\"checkbox\"  name=\"Chess\" value=\"Chess\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Chess</label><input type=\"checkbox\"  name=\"Chess\" value=\"Chess\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if("Basketball".equals(e.getSpo_Basketball()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Basketball</label><input type=\"checkbox\"  name=\"Basketball\" value=\"Basketball\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Basketball</label><input type=\"checkbox\"  name=\"Basketball\" value=\"Basketball\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if("Softball".equals(e.getSpo_Softball()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Softball</label><input type=\"checkbox\"  name=\"Softball\" value=\"Softball\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Softball</label><input type=\"checkbox\"  name=\"Softball\" value=\"Softball\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}if("Kho-Kho".equals(e.getSpo_Kho_Kho()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Kho-Kho</label><input type=\"checkbox\"  name=\"Kho-Kho\" value=\"Kho-Kho\" checked></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else
                                {
      out.write("\n");
      out.write("                                <li><label>Kho-Kho</label><input type=\"checkbox\"  name=\"Kho-Kho\" value=\"Kho-Kho\"></li>\n");
      out.write("                               \n");
      out.write("                               ");
}
      out.write(" \n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </table>    \n");
      out.write("            </fieldset>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Career Plan</legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                <td class=\"txt\"><span>After Graduation :</span></td>\n");
      out.write("                <td>\n");
      out.write("                    <ul id=\"radio-list\">\n");
      out.write("                        ");
if("Entrepreneurship".equals(e.getAfter_graduation()))
                                                           {
      out.write("\n");
      out.write("                              <li><label>Entrepreneurship</label><input type=\"radio\" name=\"graduation\" value=\"Entrepreneurship\" checked></li>\n");
      out.write("                        <li><label>Private Job</label><input type=\"radio\" name=\"graduation\"  value=\"Private Job\"></li>\n");
      out.write("                        <li><label>Public Sector</label><input type=\"radio\" name=\"graduation\"  value=\"Public Sector\"></li>\n");
      out.write("                        <li><label>Higher Studies</label><input type=\"radio\" name=\"graduation\" value=\"Higher Studies\"></li>\n");
      out.write("                        <li><label>Other</label><input type=\"radio\" name=\"graduation\" value=\"Other\" ></li>\n");
      out.write("                                \n");
      out.write("                          ");
} else if("Private Job".equals(e.getAfter_graduation()))
                                {
      out.write("\n");
      out.write("                                 <li><label>Entrepreneurship</label><input type=\"radio\" name=\"graduation\" value=\"Entrepreneurship\"></li>\n");
      out.write("                        <li><label>Private Job</label><input type=\"radio\" name=\"graduation\"  value=\"Private Job\" checked></li>\n");
      out.write("                        <li><label>Public Sector</label><input type=\"radio\" name=\"graduation\"  value=\"Public Sector\"></li>\n");
      out.write("                        <li><label>Higher Studies</label><input type=\"radio\" name=\"graduation\" value=\"Higher Studies\"></li>\n");
      out.write("                        <li><label>Other</label><input type=\"radio\" name=\"graduation\" value=\"Other\" ></li>\n");
      out.write("                               \n");
      out.write("                               ");
}else if("Public Sector".equals(e.getAfter_graduation()))
                                {
      out.write("\n");
      out.write("                                 <li><label>Entrepreneurship</label><input type=\"radio\" name=\"graduation\" value=\"Entrepreneurship\"></li>\n");
      out.write("                        <li><label>Private Job</label><input type=\"radio\" name=\"graduation\"  value=\"Private Job\"></li>\n");
      out.write("                        <li><label>Public Sector</label><input type=\"radio\" name=\"graduation\"  value=\"Public Sector\" checked></li>\n");
      out.write("                        <li><label>Higher Studies</label><input type=\"radio\" name=\"graduation\" value=\"Higher Studies\"></li>\n");
      out.write("                        <li><label>Other</label><input type=\"radio\" name=\"graduation\" value=\"Other\" ></li>\n");
      out.write("                               \n");
      out.write("                               ");
}else if("Higher Studies".equals(e.getAfter_graduation()))
                                {
      out.write("\n");
      out.write("                                 <li><label>Entrepreneurship</label><input type=\"radio\" name=\"graduation\" value=\"Entrepreneurship\"></li>\n");
      out.write("                        <li><label>Private Job</label><input type=\"radio\" name=\"graduation\"  value=\"Private Job\"></li>\n");
      out.write("                        <li><label>Public Sector</label><input type=\"radio\" name=\"graduation\"  value=\"Public Sector\"></li>\n");
      out.write("                        <li><label>Higher Studies</label><input type=\"radio\" name=\"graduation\" value=\"Higher Studies\" checked></li>\n");
      out.write("                        <li><label>Other</label><input type=\"radio\" name=\"graduation\" value=\"Other\" ></li>\n");
      out.write("                               \n");
      out.write("                               ");
}else if("Other".equals(e.getAfter_graduation()))
                                {
      out.write("\n");
      out.write("                                 <li><label>Entrepreneurship</label><input type=\"radio\" name=\"graduation\" value=\"Entrepreneurship\"></li>\n");
      out.write("                        <li><label>Private Job</label><input type=\"radio\" name=\"graduation\"  value=\"Private Job\"></li>\n");
      out.write("                        <li><label>Public Sector</label><input type=\"radio\" name=\"graduation\"  value=\"Public Sector\"></li>\n");
      out.write("                        <li><label>Higher Studies</label><input type=\"radio\" name=\"graduation\" value=\"Higher Studies\"></li>\n");
      out.write("                        <li><label>Other</label><input type=\"radio\" name=\"graduation\" value=\"Other\" checked ></li>\n");
      out.write("                               \n");
      out.write("                               ");
}else
                                {
      out.write("\n");
      out.write("                                 <li><label>Entrepreneurship</label><input type=\"radio\" name=\"graduation\" value=\"Entrepreneurship\"></li>\n");
      out.write("                        <li><label>Private Job</label><input type=\"radio\" name=\"graduation\"  value=\"Private Job\" ></li>\n");
      out.write("                        <li><label>Public Sector</label><input type=\"radio\" name=\"graduation\"  value=\"Public Sector\"></li>\n");
      out.write("                        <li><label>Higher Studies</label><input type=\"radio\" name=\"graduation\" value=\"Higher Studies\"></li>\n");
      out.write("                        <li><label>Other</label><input type=\"radio\" name=\"graduation\" value=\"Other\" ></li>\n");
      out.write("                               \n");
      out.write("                               ");
}
      out.write(" \n");
      out.write("                      \n");
      out.write("                    </ul>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"text\"><span>Short Term Goal<span class=\"small_font\">(next 5 years)</span>:</span><td><textarea maxlength=\"300\" size=\"100\" name=\"sgoal\" id=\"sgoal\">");
      out.print(e.getS_goal());
      out.write("</textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"text\"><span>Long Term Goals:</span><td><textarea maxlength=\"300\" size=\"115\" name=\"lgoal\" id=\"lgoal\">");
      out.print( e.getL_goal());
      out.write("</textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("                    ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("    \n");
      out.write("  ");
 try {
SessionFactory sf1=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Strength.class).buildSessionFactory();
Session s1=sf1.openSession(); 
Transaction tx1=s1.beginTransaction();
Query q1=s1.createQuery("from javap.Strength where user_name='0827IT111058'");
lt1=q1.list();

if(lt1.isEmpty())
    { System.out.println("Hello");
  e1=new Strength();
e1.setUser_name("0827IT111058");
e1.setS_no(1);
s1.save(e1);
      
      out.write("\n");
      out.write("     <div id=\"str-weak\">\n");
      out.write("                    <h1><u>Strengths and Weaknesses</u></h1>\n");
      out.write("                    <span class=\"ul_container\">\n");
      out.write("                    <ul id=\"str_list\">\n");
      out.write("                        <li><label>Strength:</label><input type=\"text\" maxlength=\"20\" name=\"strength1\" id=\"strength\"></li>   \n");
      out.write("                    </ul>\n");
      out.write("                    <span onclick=\"addStrength()\" class=\"addButton\" id=\"Str_addButton\">S<sup>+</sup></span>\n");
      out.write("                    </span>\n");
      out.write("                    \n");
      out.write("                    <span class=\"ul_container\">\n");
      out.write("                    <ul id=\"weak_list\">\n");
      out.write("                        <li><label>Weakness:</label><input type=\"text\" maxlength=\"20\" name=\"weakness1\" id=\"weakness\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                        <span class=\"addButton\" onclick=\"addWeakness()\" id=\"Weak_addButton\">W<sup>+</sup></span>\n");
      out.write("                    </span>\n");
      out.write("                    </div>\n");
      out.write("     ");
f=1;
     System.out.println("H1");
    }
else{ System.out.println("H2");
      out.write("\n");
      out.write("    <div id=\"str-weak\">\n");
      out.write("                    <h1><u>Strengths and Weaknesses</u></h1>\n");
      out.write("                    <span class=\"ul_container\">\n");
for(Iterator it=lt1.iterator();it.hasNext();)
{
 e1=(Strength)it.next(); 
      out.write(" \n");
      out.write("<ul id=\"str_list\">\n");
      out.write("                        <li><label>Strength:</label><input type=\"text\" maxlength=\"20\" name=\"strength1\" id=\"strength\" value=\"");
      out.print(e1.getStrength());
      out.write("\"></li>   \n");
      out.write("                    </ul> \n");
      out.write("<ul id=\"weak_list\">\n");
      out.write("                        <li><label>Weakness:</label><input type=\"text\" maxlength=\"20\" name=\"weakness1\" id=\"weakness\" value=\"");
      out.print(e1.getWeakness());
      out.write("\"></li>\n");
      out.write("                    </ul>                                \n");
}
      out.write("   \n");
      out.write("\n");
      out.write("                    <ul id=\"str_list\">\n");
      out.write("                        <li><label>Strength:</label><input type=\"text\" maxlength=\"20\" name=\"strength1\" id=\"strength\"></li>   \n");
      out.write("                    </ul>\n");
      out.write("                    <span onclick=\"addStrength()\" class=\"addButton\" id=\"Str_addButton\">S<sup>+</sup></span>\n");
      out.write("                    </span>\n");
      out.write("                    \n");
      out.write("                    <span class=\"ul_container\">\n");
      out.write("                    <ul id=\"weak_list\">\n");
      out.write("                        <li><label>Weakness:</label><input type=\"text\" maxlength=\"20\" name=\"weakness1\" id=\"weakness\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                        <span class=\"addButton\" onclick=\"addWeakness()\" id=\"Weak_addButton\">W<sup>+</sup></span>\n");
      out.write("                    </span>\n");
      out.write("\n");
} 
tx1.commit();
s1.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 
      out.write("\n");
      out.write("               \n");
      out.write("             </fieldset>\n");
      out.write("            <div>\n");
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
      out.write("</form>\n");
      out.write("        \n");
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
