
package javap;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Pervious_Q extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;session=false");
        PrintWriter out = response.getWriter();
        try {
            
         HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
            
                  float f=0.0f;
                  double d=0;
                  int i=0;
                  
                  out.print("1");
                                          
                                           SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Previous_qualification.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                           for(int ti=1;ti<4;ti++)
                                           {
                                              Previous_qualification pq=new Previous_qualification();
                                              pq.setDivision(request.getParameter("t"+ti+"9"));
                                              pq.setExam_name(request.getParameter("t"+ti+"1"));
                                              pq.setGrade_percent(request.getParameter("t"+ti+"10"));
                                              pq.setMarks_obtained(Convert.toFloat(request.getParameter("t"+ti+"7"), i));
                                              pq.setMax_marks(Convert.toInt(request.getParameter("t"+ti+"8"), i));
                                              pq.setMedium(request.getParameter("t"+ti+"5"));
                                              pq.setRoll_no(request.getParameter("t"+ti+"2"));
                                              pq.setSchool_name_city(request.getParameter("t"+ti+"4"));
                                              pq.setUniversity_board(request.getParameter("t"+ti+"3"));
                                              pq.setUser_name(pa);
                                              pq.setS_no(ti);
                                              pq.setYear_of_passing(Convert.toInt(request.getParameter("t"+ti+"6"), i));
                                              s.saveOrUpdate(pq);
                                           }
                                           s.flush();
                                    tx.commit();
                                    s.close();
                                             sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Admision_detail.class).buildSessionFactory();
                                     s=sf.openSession();
                                    Transaction tx1=s.beginTransaction();
                                    Admision_detail j=new Admision_detail();
                                    j.setAdmission_date(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("Admitted_Date")));
                                    j.setAdmission_quota(request.getParameter("Admission_Quota"));
                                    j.setAdmitted_branch(request.getParameter("Admitted_Branch"));
                                    j.setAdmitted_sem(Convert.toInt(request.getParameter("Admitted_Sem"), i));
                                    j.setAdmitted_session(Convert.toInt(request.getParameter("Admitted_Session"), i));
                                    j.setAll_india_rank(Convert.toDouble(request.getParameter("All_India_Rank"), d));
                                    j.setCourse(request.getParameter("Course"));
                                    j.setEntrance_exam_name(request.getParameter("Entrance_Exam_Name"));
                                    j.setMarks_obtained(Convert.toFloat(request.getParameter("Marks_Obtained"), i));
                                    j.setMax_marks(Convert.toInt(request.getParameter("Max_Marks"), i));
                                    j.setPercentage(Convert.toFloat(request.getParameter("Percentage"), f));
                                    j.setQuota_rank(Convert.toDouble(request.getParameter("Quota_Rank"), d));
                                    j.setPercentile(Convert.toFloat(request.getParameter("Percentile"), f));
                                    j.setType_of_admission(request.getParameter("Type_of_Admission"));
                                    j.setUser_name(pa);
                                    j.setYear(Convert.toInt(request.getParameter("Year"), i));
                                    s.saveOrUpdate(j);
                                    s.flush();
                                    tx1.commit();
                                    s.close();
                                    out.write("11");
                                        response.sendRedirect("Previous_Qualification.jsp");
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
