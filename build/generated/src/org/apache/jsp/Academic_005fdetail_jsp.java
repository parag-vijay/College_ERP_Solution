package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import javap.Compitive_exam;
import javap.Higher_study;
import javap.Acedemic_record;
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

public final class Academic_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.Acedemic_record> lt=new ArrayList<Acedemic_record>();
 public Acedemic_record e[]=new Acedemic_record[8]; 
 public int f=0;
 public SessionFactory sf;
 public Session s ;
int i=0;
 public List<javap.Compitive_exam> lt1=new ArrayList<Compitive_exam>();
 public Compitive_exam e1[]=new Compitive_exam[4]; 
int count=0;
 public List<javap.Higher_study> lt2=new ArrayList<Higher_study>();
public Higher_study e2=new Higher_study(); 
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
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("             ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("  ");
 try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Acedemic_record.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Acedemic_record where user_name='0827IT111058'");
lt=q.list();

if(lt.isEmpty())
    { 
    for(int j=0;j<8;j++)
    {
    e[j]=new Acedemic_record();
    e[j].setS_no(j+1);
    e[j].setUser_name("0827IT111058");
    s.save(e[j]);
       }
   f=1;
    }
else{
      out.write(' ');
      out.write('\n');
for(Iterator t=lt.iterator();t.hasNext();)  
{
   e[i]=( Acedemic_record)t.next();  
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
      out.write("  <form class=\"student-form\" onsubmit=\"return checkReq()\" action=\"Academic\" method=\"post\">\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Academic Performance Detail</legend>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Semester</th>\n");
      out.write("                    <th>Session</th>\n");
      out.write("                    <th>Marks Obtained</th>\n");
      out.write("                    <th>Max Mark</th>\n");
      out.write("                    <th>Result</th>\n");
      out.write("                    <th>Division</th>\n");
      out.write("                    <th>Grade</th>\n");
      out.write("                    <th>Due Paper(if any)</th>\n");
      out.write("                    <th>Remarks</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td><input type=\"text\" name=\"t11\" size=\"1\" id=\"tableSem\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[0].getSem());
      out.write("\"></td>    \n");
      out.write("                     <td><input type=\"text\" name=\"t12\" size=\"9\" id=\"tableSession\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[0].getSession());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t13\" size=\"3\" id=\"tableMarksObtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[0].getMarks_obtnd());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t14\" size=\"3\" required id=\"tableMaxMarks\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[0].getMax_mrks());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t15\" size=\"4\" required id=\"tableResult\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[0].getResul());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t16\" size=\"1\" required id=\"tableDivision\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[0].getDivision());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t17\" size=\"1\" required id=\"tableGrade\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[0].getGrade());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t18\" size=\"20\" required id=\"tableDuePaper\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getDue_paper());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"t19\" size=\"20\" required id=\"tableRemarks\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getRemarks());
      out.write("\">  </td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td><input type=\"text\" name=\"t21\" size=\"1\" id=\"tableSem\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getSem());
      out.write("\"></td>    \n");
      out.write("                     <td><input type=\"text\" name=\"t22\" size=\"9\" id=\"tableSession\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[1].getSession());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t23\" size=\"3\" id=\"tableMarksObtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[1].getMarks_obtnd());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t24\" size=\"3\" required id=\"tableMaxMarks\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[1].getMax_mrks());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t25\" size=\"4\" required id=\"tableResult\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[1].getResul());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t26\" size=\"1\" required id=\"tableDivision\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[1].getDivision());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t27\" size=\"1\" required id=\"tableGrade\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[1].getGrade());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t28\" size=\"20\" required id=\"tableDuePaper\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getDue_paper());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"t29\" size=\"20\" required id=\"tableRemarks\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getRemarks());
      out.write("\">  </td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td><input type=\"text\" name=\"t31\" size=\"1\" id=\"tableSem\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getSem());
      out.write("\"></td>    \n");
      out.write("                     <td><input type=\"text\" name=\"t32\" size=\"9\" id=\"tableSession\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[2].getSession());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t33\" size=\"3\" id=\"tableMarksObtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getMarks_obtnd());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t34\" size=\"3\" required id=\"tableMaxMarks\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getMax_mrks());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t35\" size=\"4\" required id=\"tableResult\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getResul());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t36\" size=\"1\" required id=\"tableDivision\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[2].getDivision());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t37\" size=\"1\" required id=\"tableGrade\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[2].getGrade());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t38\" size=\"20\" required id=\"tableDuePaper\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getDue_paper());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"t39\" size=\"20\" required id=\"tableRemarks\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[2].getRemarks());
      out.write("\">  </td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td><input type=\"text\" name=\"t41\" size=\"1\" id=\"tableSem\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getSem());
      out.write("\"></td>    \n");
      out.write("                     <td><input type=\"text\" name=\"t42\" size=\"9\" id=\"tableSession\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[3].getSession());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t43\" size=\"3\" id=\"tableMarksObtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[3].getMarks_obtnd());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t44\" size=\"3\" required id=\"tableMaxMarks\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[3].getMax_mrks());
      out.write("\" >   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t45\" size=\"4\" required id=\"tableResult\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getResul());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t46\" size=\"1\" required id=\"tableDivision\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[3].getDivision());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t47\" size=\"1\" required id=\"tableGrade\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getGrade());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t48\" size=\"20\" required id=\"tableDuePaper\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getDue_paper());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"t49\" size=\"20\" required id=\"tableRemarks\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getRemarks());
      out.write("\">  </td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td><input type=\"text\" name=\"t51\" size=\"1\" id=\"tableSem\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getSem());
      out.write("\"></td>    \n");
      out.write("                     <td><input type=\"text\" name=\"t52\" size=\"9\" id=\"tableSession\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[4].getSession());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t53\" size=\"3\" id=\"tableMarksObtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[4].getMarks_obtnd());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t54\" size=\"3\" required id=\"tableMaxMarks\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[4].getMax_mrks());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t55\" size=\"4\" required id=\"tableResult\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getResul());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t56\" size=\"1\" required id=\"tableDivision\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[4].getDivision());
      out.write("\" >  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t57\" size=\"1\" required id=\"tableGrade\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getGrade());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t58\" size=\"20\" required id=\"tableDuePaper\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getDue_paper());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"t59\" size=\"20\" required id=\"tableRemarks\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getRemarks());
      out.write("\">  </td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td><input type=\"text\" name=\"t61\" size=\"1\" id=\"tableSem\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[5].getSem());
      out.write("\"></td>    \n");
      out.write("                     <td><input type=\"text\" name=\"t62\" size=\"9\" id=\"tableSession\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[5].getSession());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t63\" size=\"3\" id=\"tableMarksObtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[5].getMarks_obtnd());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t64\" size=\"3\" required id=\"tableMaxMarks\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[5].getMax_mrks());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t65\" size=\"4\" required id=\"tableResult\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[5].getResul());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t66\" size=\"1\" required id=\"tableDivision\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[5].getDivision());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t67\" size=\"1\" required id=\"tableGrade\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[5].getGrade());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t68\" size=\"20\" required id=\"tableDuePaper\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[5].getDue_paper());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"t69\" size=\"20\" required id=\"tableRemarks\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[5].getRemarks());
      out.write("\">  </td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td><input type=\"text\" name=\"t71\" size=\"1\" id=\"tableSem\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[6].getSem());
      out.write("\"></td>    \n");
      out.write("                     <td><input type=\"text\" name=\"t72\" size=\"9\" id=\"tableSession\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[6].getSession());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t73\" size=\"3\" id=\"tableMarksObtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[6].getMarks_obtnd());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t74\" size=\"3\" required id=\"tableMaxMarks\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[6].getMax_mrks());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t75\" size=\"4\" required id=\"tableResult\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[6].getResul());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t76\" size=\"1\" required id=\"tableDivision\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[6].getDivision());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t77\" size=\"1\" required id=\"tableGrade\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[6].getGrade());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t78\" size=\"20\" required id=\"tableDuePaper\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[6].getDue_paper());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"t79\" size=\"20\" required id=\"tableRemarks\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[6].getRemarks());
      out.write("\">  </td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td><input type=\"text\" name=\"t81\" size=\"1\" id=\"tableSem\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[7].getSem());
      out.write("\"></td>    \n");
      out.write("                     <td><input type=\"text\" name=\"t82\" size=\"9\" id=\"tableSession\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[7].getSession());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"t83\" size=\"3\" id=\"tableMarksObtained\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e[7].getMarks_obtnd());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"t84\" size=\"3\" required id=\"tableMaxMarks\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[7].getMax_mrks());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t85\" size=\"4\" required id=\"tableResult\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[7].getResul());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t86\" size=\"1\" required id=\"tableDivision\" onchange=\"textValidation(id)\" value=\"");
      out.print( e[7].getDivision());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t87\" size=\"1\" required id=\"tableGrade\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[7].getGrade());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"t88\" size=\"20\" required id=\"tableDuePaper\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[7].getDue_paper());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"t89\" size=\"20\" required id=\"tableRemarks\" onchange=\"textValidation(id)\" value=\"");
      out.print(e[7].getRemarks());
      out.write("\">  </td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </fieldset>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                          ");
      out.write("\n");
      out.write("     \n");
      out.write("  ");
 try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Compitive_exam.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx1=s.beginTransaction();
Query q1=s.createQuery("from javap.Compitive_exam where user_name='0827IT111058'");
lt1=q1.list();
      out.write('\n');
      out.write('\n');
if(lt1.isEmpty())
    { 
    for( int j=0;j<4;j++)
    {
    e1[j]=new Compitive_exam();
    e1[j].setUser_name("0827IT111058");
    e1[j].setS_no(j+1);
    s.save(e1[j]);
     count++;
       }
   f=1;
    }
else{
      out.write(' ');
      out.write('\n');
for(Iterator t=lt1.iterator();t.hasNext();)  
{
   e1[count]=(Compitive_exam)t.next();  
    count++;    
}    
 count=0;
} 
tx1.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 
      out.write("\n");
      out.write("            \n");
      out.write("            <fieldset>\n");
      out.write("            <legend>Competitive Exam Performance</legend>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Exam Name</th>\n");
      out.write("                    <th>Type</th>\n");
      out.write("                    <th>Marks Obtained</th>\n");
      out.write("                    <th>max Marks</th>\n");
      out.write("                    <th>%</th>\n");
      out.write("                    <th>Rank</th>\n");
      out.write("                    <th>Quota Name</th>\n");
      out.write("                    <th>Quota Rank</th>\n");
      out.write("                    <th>Remark</th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"p11\" size=\"6\" id=\"ComDate\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getDate());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p12\" size=\"20\" id=\"ComExName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getExam_name());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p13\" size=\"8\" id=\"ComType\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getType());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p14\" size=\"14\" id=\"ComMarksObt\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getMarks_obtnd());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p15\" size=\"5\" id=\"ComMaxMarks\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getMax_marks());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p16\" size=\"5\" id=\"ComPercantage\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getPercentage());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p17\" size=\"10\" id=\"ComRank\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getRank());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p18\" size=\"15\" id=\"ComQuotaName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getQuota_name());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p19\" size=\"10\" id=\"ComQuotaRank\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getQuota_rank());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p110\" size=\"10\" id=\"ComRemark\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[0].getRemark());
      out.write("\">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"p21\" size=\"6\" id=\"ComDate\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getDate());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p22\" size=\"20\" id=\"ComExName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getExam_name());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p23\" size=\"8\" id=\"ComType\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getType());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p24\" size=\"14\" id=\"ComMarksObt\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getMarks_obtnd());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p25\" size=\"5\" id=\"ComMaxMarks\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getMax_marks());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p26\" size=\"5\" id=\"ComPercantage\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getPercentage());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p27\" size=\"10\" id=\"ComRank\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getRank());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p28\" size=\"15\" id=\"ComQuotaName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getQuota_name());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p29\" size=\"10\" id=\"ComQuotaRank\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getQuota_rank());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p210\" size=\"10\" id=\"ComRemark\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[1].getRemark());
      out.write("\">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"p31\" size=\"6\" id=\"ComDate\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getDate());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p32\" size=\"20\" id=\"ComExName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getExam_name());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p33\" size=\"8\" id=\"ComType\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getType());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p34\" size=\"14\" id=\"ComMarksObt\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getMarks_obtnd());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p35\" size=\"5\" id=\"ComMaxMarks\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getMax_marks());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p36\" size=\"5\" id=\"ComPercantage\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getPercentage());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p37\" size=\"10\" id=\"ComRank\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getRank());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p38\" size=\"15\" id=\"ComQuotaName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getQuota_name());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p39\" size=\"10\" id=\"ComQuotaRank\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getQuota_rank());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p310\" size=\"10\" id=\"ComRemark\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[2].getRemark());
      out.write("\">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"p41\" size=\"6\" id=\"ComDate\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getDate());
      out.write("\">  </td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p42\" size=\"20\" id=\"ComExName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getExam_name());
      out.write("\">  </td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p43\" size=\"8\" id=\"ComType\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getType());
      out.write("\">    </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p44\" size=\"14\" id=\"ComMarksObt\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getMarks_obtnd());
      out.write("\">   </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p45\" size=\"5\" id=\"ComMaxMarks\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getMax_marks());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p46\" size=\"5\" id=\"ComPercantage\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getPercentage());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p47\" size=\"10\" id=\"ComRank\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getRank());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p48\" size=\"15\" id=\"ComQuotaName\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getQuota_name());
      out.write("\">  </td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p49\" size=\"10\" id=\"ComQuotaRank\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getQuota_rank());
      out.write("\">  </td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p410\" size=\"10\" id=\"ComRemark\" onchange=\"textValidation(id)\" required value=\"");
      out.print(e1[3].getRemark());
      out.write("\">  </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </fieldset>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                          ");
      out.write("\n");
      out.write("     \n");
      out.write("  ");
 try {
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Higher_study.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx2=s.beginTransaction();
Query q2=s.createQuery("from javap.Higher_study where user_name='0827IT111058'");
lt2=q2.list();

if(lt2.isEmpty())
    { 
   e2=new Higher_study();
   e2.setUser_name("0827IT111058");
   s.save(e2);
   f=1;
    }
else{
Iterator t=lt2.iterator(); 
e2=(Higher_study)t.next();  
} 
tx2.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 
      out.write("\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Higher Studies</legend>\n");
      out.write("            <table>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td class=\"txt\"><span>Course Name</span></td><td class=\"in\"><input type=\"text\" name=\"H_course_name\" value=\"");
      out.print(e2.getCourse_name());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Specialization</span></td><td class=\"in\"><input type=\"text\" name=\"H_specialization\" value=\"");
      out.print(e2.getSpecialisation());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Year</span></td><td class=\"in\"><input type=\"text\" name=\"H_year\" value=\"");
      out.print(e2.getYear());
      out.write("\"></td>   \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"txt\"><span>Institute Name:</span></td><td class=\"in\"><input type=\"text\" name=\"H_name\" value=\"");
      out.print(e2.getInstitute_name());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>University Name:</span></td><td class=\"in\"><input type=\"text\" name=\"H_university_name\" value=\"");
      out.print(e2.getUniversity_name());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"txt\"><span>City</span></td><td class=\"in\"><input type=\"text\" name=\"H_city\" value=\"");
      out.print(e2.getCity());
      out.write("\"></td>\n");
      out.write("                    <td class=\"txt\"><span>Country</span></td><td class=\"in\"><input type=\"text\" name=\"H_country\" value=\"");
      out.print(e2.getCountry());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <span></span>\n");
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
      out.write("            <input type=\"button\" value=\"Next\" class=\"reset_btn\" onclick=\"document.location='Placement1.jsp'\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
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
