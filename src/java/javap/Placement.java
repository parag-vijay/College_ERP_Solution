
package javap;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Placement extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             HttpSession session=request.getSession();
                 // String pa = (String) session.getAttribute("user_name");
                  String pa="0827IT111058";
                  float f=0.0f;
                  double d=0;
                  int i=0;
                  
                  out.print("1");
                                           session.setAttribute("user_name","0827IT111058");
                                           for(int ti=0;ti<5;ti++)
                                           {
                                              Placement1 p=new Placement1();
                                           p.setAnnual_package(request.getParameter("t"+i+"5"));
                                           p.setCompany_name(request.getParameter("t"+i+"2"));
                                           p.setDate1(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("t"+i+"1")));
                                           p.setDesignation_or_job_tile(request.getParameter("t"+i+"3"));
                                           p.setJob_type(request.getParameter("t"+i+"4"));
                                           p.setOffice_letter(request.getParameter("t"+i+"6"));
                                           p.setOpen_or_close_campus(request.getParameter("t"+i+"7"));
                                           p.setRemarks(request.getParameter("t"+i+"8"));
                                           p.setUser_name(request.getParameter("pa")); 
                                           Convert.insertRow(p);
                                           }
                                          /* Placement1 p=new Placement1();
                                           p.setAnnual_package(request.getParameter("t15"));
                                           p.setCompany_name(request.getParameter("t12"));
                                           p.setDate1(request.getParameter("t11"));
                                           p.setDesignation_or_job_tile(request.getParameter("t13"));
                                           p.setJob_type(request.getParameter("t14"));
                                           p.setOffice_letter(request.getParameter("t16"));
                                           p.setOpen_or_close_campus(request.getParameter("t17"));
                                           p.setRemarks(request.getParameter("t18"));
                                           p.setUser_name(request.getParameter("pa"));
                                           
                                           Placement1 p1=new Placement1();
                                          out.write("2"); 
                                           p1.setAnnual_package(request.getParameter("t25"));
                                           p1.setCompany_name(request.getParameter("t22"));
                                           p1.setDate1(request.getParameter("t21"));
                                           p1.setDesignation_or_job_tile(request.getParameter("t23"));
                                           p1.setJob_type(request.getParameter("t24"));
                                           p1.setOffice_letter(request.getParameter("t26"));
                                           p1.setOpen_or_close_campus(request.getParameter("t27"));
                                           p1.setRemarks(request.getParameter("t28"));
                                           p1.setUser_name(request.getParameter("pa"));
                                           Placement1 p2=new Placement1();
                                           out.write("3");
                                           p2.setAnnual_package(request.getParameter("t35"));
                                           p2.setCompany_name(request.getParameter("t32"));
                                           p2.setDate1(request.getParameter("t31"));
                                           p2.setDesignation_or_job_tile(request.getParameter("t33"));
                                           p2.setJob_type(request.getParameter("t34"));
                                           p2.setOffice_letter(request.getParameter("t36"));
                                           p2.setOpen_or_close_campus(request.getParameter("t37"));
                                           p2.setRemarks(request.getParameter("t38"));
                                           p2.setUser_name(request.getParameter("pa"));
                                           Placement1 p3=new Placement1();
                                           
                                           p3.setAnnual_package(request.getParameter("t45"));
                                           p3.setCompany_name(request.getParameter("t42"));
                                           p3.setDate1(request.getParameter("t41"));
                                           p3.setDesignation_or_job_tile(request.getParameter("t43"));
                                           p3.setJob_type(request.getParameter("t44"));
                                           p3.setOffice_letter(request.getParameter("t46"));
                                           p3.setOpen_or_close_campus(request.getParameter("t47"));
                                           p3.setRemarks(request.getParameter("t48"));
                                           p3.setUser_name(request.getParameter("pa"));
                                           Placement1 p4=new Placement1();
                                           
                                           p4.setAnnual_package(request.getParameter("t55"));
                                           p4.setCompany_name(request.getParameter("t52"));
                                           p4.setDate1(request.getParameter("t51"));
                                           p4.setDesignation_or_job_tile(request.getParameter("t53"));
                                           p4.setJob_type(request.getParameter("t54"));
                                           p4.setOffice_letter(request.getParameter("t56"));
                                           p4.setOpen_or_close_campus(request.getParameter("t57"));
                                           p4.setRemarks(request.getParameter("t58"));
                                           p4.setUser_name(request.getParameter("pa"));
                                           Placement1 p5=new Placement1();
                                           
                                           p5.setAnnual_package(request.getParameter("t65"));
                                           p5.setCompany_name(request.getParameter("t62"));
                                           p5.setDate1(request.getParameter("t61"));
                                           p5.setDesignation_or_job_tile(request.getParameter("t63"));
                                           p5.setJob_type(request.getParameter("t64"));
                                           p5.setOffice_letter(request.getParameter("t66"));
                                           p5.setOpen_or_close_campus(request.getParameter("t67"));
                                           p5.setRemarks(request.getParameter("t68"));
                                           p5.setUser_name(request.getParameter("pa"));*/
                                           out.write("4");
                                  Joining j=new Joining();
                                  out.write(pa);
                                  j.setCity(request.getParameter("city"));
                                  j.setCountry(request.getParameter("Country"));
                                  out.write(pa);
                                  j.setJoint_in(request.getParameter("joint"));
                                  out.write("5");
                                  
                                 j.setYear(Integer.getInteger(request.getParameter("year"),i).intValue());
                                  j.setUser_name(pa);
                                  out.write("6");
                                  List<Training_certificate> t01 = new ArrayList<Training_certificate>();
                                  Training_certificate tc=new Training_certificate();
                                  out.write("7");
                                  
                                  
         
  
                                 tc.setAttendance(Integer.getInteger(request.getParameter("c19"),i).intValue());
                                 out.write("7");
                                 tc.setCompany(request.getParameter("c13"));
                                 tc.setCourse_and_certification_name(request.getParameter("c12"));
                                 tc.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c11")));
                                 out.write("7");
                                 tc.setGrade(request.getParameter("c17"));
                                 tc.setMarks_obtained(Integer.getInteger(request.getParameter("c14"),i).intValue());
                                 out.print("8");
                                 tc.setMarks_percentage(Convert.toFloat(request.getParameter("c16"),f));
                                 out.write("9");
                                 tc.setMax_marks(Convert.toFloat(request.getParameter("c16"),f));
                                 tc.setPass(request.getParameter("c110"));
                                 tc.setRemark(request.getParameter("c111"));
                                 tc.setTotal_attendance(Integer.getInteger(request.getParameter("c18"),i).intValue());
                                 tc.setUser_name(pa);
                                 out.write("02");
                                   Training_certificate tc1=new Training_certificate();
                                 tc1.setAttendance(Integer.getInteger(request.getParameter("c29"),i).intValue());
                                 tc1.setCompany(request.getParameter("c23"));
                                 tc1.setCourse_and_certification_name(request.getParameter("c22"));
                                 tc1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c21")));
                                 tc1.setGrade(request.getParameter("c27"));
                                 tc1.setMarks_obtained(Integer.getInteger(request.getParameter("c24"),i).intValue());
                                 tc1.setMarks_percentage(Convert.toFloat(request.getParameter("c16"),f));
                                 tc1.setMax_marks(Convert.toFloat(request.getParameter("c16"),f));
                                 tc1.setPass(request.getParameter("c210"));
                                 tc1.setRemark(request.getParameter("c211"));
                                 tc1.setTotal_attendance(Integer.getInteger(request.getParameter("c28"),i).intValue());
                                 tc1.setUser_name(pa);
                                 out.write("13");
                                   Training_certificate tc3=new Training_certificate();
                                 tc3.setAttendance(Integer.getInteger(request.getParameter("c39"),i).intValue());
                                 tc3.setCompany(request.getParameter("c33"));
                                 tc3.setCourse_and_certification_name(request.getParameter("c32"));
                                 tc3.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c31")));
                                 tc3.setGrade(request.getParameter("c37"));
                                 tc3.setMarks_obtained(Integer.getInteger(request.getParameter("c34"),i).intValue());
                                 tc3.setMarks_percentage(Convert.toFloat(request.getParameter("c36"),f));
                                 tc3.setMax_marks(Convert.toFloat(request.getParameter("c35"),f));
                                 tc3.setPass(request.getParameter("c310"));
                                 tc3.setRemark(request.getParameter("c311"));
                                 tc3.setTotal_attendance(Integer.getInteger(request.getParameter("c38"),i).intValue());
                                 tc3.setUser_name(pa);
                                 out.write("14");
                                   Training_certificate tc4=new Training_certificate();
                                 tc4.setAttendance(Integer.getInteger(request.getParameter("c49"),i).intValue());
                                 out.write("14");
                                 tc4.setCompany(request.getParameter("c43"));
                                 tc4.setCourse_and_certification_name(request.getParameter("c42"));
                                 tc4.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c41")));
                                 tc4.setGrade(request.getParameter("c47"));
                                 out.write("14");
                                 tc4.setMarks_obtained(Integer.getInteger(request.getParameter("c44"),i).intValue());
                                 out.write("14");
                                 tc4.setMarks_percentage(Convert.toFloat(request.getParameter("c46"),f));
                                 out.write("14");
                                 tc4.setMax_marks(Convert.toFloat(request.getParameter("c45"),f));
                                 out.write("14");
                                 tc4.setPass(request.getParameter("c410"));
                                 tc4.setRemark(request.getParameter("c411"));
                                 tc4.setTotal_attendance(Integer.getInteger(request.getParameter("c48"),i).intValue());
                                 tc4.setUser_name(pa);
                                 out.write("15");
                                   Training_certificate tc5=new Training_certificate();
                                 tc5.setAttendance(Integer.getInteger(request.getParameter("c59"),i).intValue());
                                 tc5.setCompany(request.getParameter("c53"));
                                 tc5.setCourse_and_certification_name(request.getParameter("c52"));
                                 tc5.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c51")));
                                 tc5.setGrade(request.getParameter("c57"));
                                 tc5.setMarks_obtained(Integer.getInteger(request.getParameter("c54"),i).intValue());
                                 tc5.setMarks_percentage(Convert.toFloat(request.getParameter("c56"),f));
                                 tc5.setMax_marks(Convert.toFloat(request.getParameter("c55"),f));
                                 tc5.setPass(request.getParameter("c510"));
                                 tc5.setRemark(request.getParameter("c511"));
                                 tc5.setTotal_attendance(Integer.getInteger(request.getParameter("c58"),i).intValue());
                                 tc5.setUser_name(pa);
                                 out.write("16");
                                   Training_certificate tc6=new Training_certificate();
                                 tc6.setAttendance(Integer.getInteger(request.getParameter("c69"),i).intValue());
                                 out.write("14");
                                 tc6.setCompany(request.getParameter("c63"));
                                 tc6.setCourse_and_certification_name(request.getParameter("c62"));
                                 tc6.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c61")));
                                 tc6.setGrade(request.getParameter("c67"));
                                 out.write("14");
                                 tc6.setMarks_obtained(Integer.getInteger(request.getParameter("c64"),i).intValue());
                                 out.write("14");
                                 tc6.setMarks_percentage(Convert.toFloat(request.getParameter("c66"),f));
                                 out.write("14");
                                 tc6.setMax_marks(Convert.toFloat(request.getParameter("c65"),f));
                                 out.write("14");
                                 tc6.setPass(request.getParameter("c610"));
                                 tc6.setRemark(request.getParameter("c611"));
                                 tc6.setTotal_attendance(Convert.toInt(request.getParameter("c68"),i));
                                 tc6.setUser_name(pa);
                                 out.write("17");
                                   Training_certificate tc7=new Training_certificate();
                                 tc7.setAttendance(Integer.getInteger(request.getParameter("c79"),i).intValue());
                                 tc7.setCompany(request.getParameter("c73"));
                                 tc7.setCourse_and_certification_name(request.getParameter("c72"));
                                 tc7.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c71")));
                                 tc7.setGrade(request.getParameter("c77"));
                                 tc7.setMarks_obtained(Integer.getInteger(request.getParameter("c74"),i).intValue());
                                 tc7.setMarks_percentage(Convert.toFloat(request.getParameter("c76"),f));
                                 tc7.setMax_marks(Convert.toFloat(request.getParameter("c75"),f));
                                 tc7.setPass(request.getParameter("c710"));
                                 tc7.setRemark(request.getParameter("c711"));
                                 tc7.setTotal_attendance(Integer.getInteger(request.getParameter("c78"),i).intValue());
                                 tc7.setUser_name(pa);
                                 out.write("11");
                                   Training_certificate tc8=new Training_certificate();
                                 tc8.setAttendance(Integer.getInteger(request.getParameter("c89"),i).intValue());
                                 tc8.setCompany(request.getParameter("c83"));
                                 tc8.setCourse_and_certification_name(request.getParameter("c82"));
                                 tc8.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c81")));
                                 tc8.setGrade(request.getParameter("c87"));
                                 tc8.setMarks_obtained(Integer.getInteger(request.getParameter("c84"),i).intValue());
                                 tc8.setMarks_percentage(Convert.toFloat(request.getParameter("c86"),f));
                                 tc8.setMax_marks(Convert.toFloat(request.getParameter("c85"),f));
                                 tc8.setPass(request.getParameter("c810"));
                                 tc8.setRemark(request.getParameter("c811"));
                                 tc8.setTotal_attendance(Integer.getInteger(request.getParameter("c88"),i).intValue());
                                 tc8.setUser_name(pa);
                                   Training_certificate tc9=new Training_certificate();
                                 tc9.setAttendance(Integer.getInteger(request.getParameter("c99"),i).intValue());
                                 tc9.setCompany(request.getParameter("c93"));
                                 tc9.setCourse_and_certification_name(request.getParameter("c92"));
                                 tc9.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c91")));
                                 tc9.setGrade(request.getParameter("c97"));
                                 tc9.setMarks_obtained(Integer.getInteger(request.getParameter("c94"),i).intValue());
                                 tc9.setMarks_percentage(Convert.toFloat(request.getParameter("c96"),f));
                                 tc9.setMax_marks(Convert.toFloat(request.getParameter("c95"),f));
                                 tc9.setPass(request.getParameter("c910"));
                                 tc9.setRemark(request.getParameter("c911"));
                                 tc9.setTotal_attendance(Integer.getInteger(request.getParameter("c98"),i).intValue());
                                 tc9.setUser_name(pa);
                                 out.write("10");
                                   Training_certificate tc2=new Training_certificate();
                                 tc2.setAttendance(Integer.getInteger(request.getParameter("c109"),i).intValue());
                                 tc2.setCompany(request.getParameter("c103"));
                                 tc2.setCourse_and_certification_name(request.getParameter("c102"));
                                 tc2.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("c101")));
                                 tc2.setGrade(request.getParameter("c107"));
                                 tc2.setMarks_obtained(Integer.getInteger(request.getParameter("c104"),i).intValue());
                                 tc2.setMarks_percentage(Convert.toFloat(request.getParameter("c106"),f));
                                 tc2.setMax_marks(Convert.toFloat(request.getParameter("c105"),f));
                                 tc2.setPass(request.getParameter("c1010"));
                                 tc2.setRemark(request.getParameter("c1011"));
                                 tc2.setTotal_attendance(Integer.getInteger(request.getParameter("c108"),i).intValue());
                                 tc2.setUser_name(pa);
                                 out.write(pa);
                                
                                   
                                   out.write("11");
                                   t01.add(tc);
                                   t01.add(tc1);
                                   t01.add(tc3);
                                  t01.add(tc4);
                                   t01.add(tc5);
                                   t01.add(tc6);
                                   t01.add(tc7);
                                   t01.add(tc8);
                                   t01.add(tc9);
                                   t01.add(tc2);
                                   Convert.insertRows(t01);
                                    out.write("11");
                                   SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Joining.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(j);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    out.write("11");
                                        response.sendRedirect("Placement.jsp");
                                        out.write(pa);
                                         }                                       
                                        catch(Exception e){
                                            System.out.println("helloe1");
                                            e.printStackTrace();
                                        }   
         finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
