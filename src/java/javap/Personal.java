
package javap;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Personal extends HttpServlet {

   
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
                   
                                           
                                           SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    out.write("hello");
                                  Transaction tx=s.beginTransaction();
                                    out.write("hello");
                                          Student_record sr=(Student_record) s.get(Student_record.class,pa);
                                          sr.setL_address(request.getParameter("Local_address"));
                                           sr.setL_city(request.getParameter("La_city"));
                                           sr.setL_pincode(Integer.parseInt(request.getParameter("La_pin_code")));
                                           sr.setL_state(request.getParameter("La_state"));
                                           sr.setL_telephone_no(request.getParameter("La_telephone"));
                                            sr.setP_address(request.getParameter("Perma_address"));
                                            sr.setP_city(request.getParameter("Pa_city"));
                                            sr.setP_email(request.getParameter("Personal_email_id"));
                                            sr.setP_pincode(Integer.parseInt(request.getParameter("Pa_pin_code")));
                                            sr.setP_state(request.getParameter("Pa_state"));
                                            sr.setP_telephone_no(request.getParameter("Pa_telephone"));
                                             sr.setM_tongue(request.getParameter("Mother_tongue"));
                                             sr.setMobile1(request.getParameter("Student_mobile_no_1"));
                                            sr.setMobile2(request.getParameter("Student_mobile_no_2"));
                                             sr.setReligion(request.getParameter("Religion"));
                                             sr.setScholar_no(request.getParameter("Student_Scholar_No"));
                                             sr.setStop_name(request.getParameter("Bus_Stop"));
                                             
                                             sr.setMedical_detail(request.getParameter("Medical_detail"));
                                             sr.setGender(request.getParameter("gender"));
                                             sr.setDate_of_birth(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("Student_dob")));
                                           sr.setEnrollment_no(request.getParameter("Student_Enroll_No"));
                                            sr.setCast(request.getParameter("Cast"));
                                           sr.setCategory(request.getParameter("Category"));
                                           sr.setBus_no(request.getParameter("Bus_no"));
                                           sr.setC_email(request.getParameter("College_email_id"));
                                           sr.setBlood_group(request.getParameter("blood_group"));
                                           sr.setName(request.getParameter("Student_Name"));
                                          sr.setNationality(request.getParameter("Nationality"));
                                    out.write("hello");
                                    
                                   s.saveOrUpdate(sr);
                                    out.write("hello");
                                       tx.commit(); 
                                        s.close();
                                        out.write(pa);
                                        response.sendRedirect("personal_detail.jsp");
                                        
                                         }                                       
                                        catch(Exception e){
                                            System.out.println(e.getMessage());
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
