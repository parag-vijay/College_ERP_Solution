/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author lenovo
 */
public class Family extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;session=false");
        PrintWriter out = response.getWriter();
        try {
           out.write("hello");
                 HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
                   
                  float f=0.0f;
                                           
                                           
                                   SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    out.write("hello");
                                    Transaction tx=s.beginTransaction();
                                    out.write("hello");
                                   
                                    Student_record sr= (Student_record) s.get(Student_record.class, pa);
                                           sr.setAnniversary(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("anniversary")));
                                     sr.setF_dob(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("father_dob")));
                                           sr.setF_email(request.getParameter("father_email"));
                                           sr.setF_mobile(request.getParameter("father_mobile"));
                                           sr.setF_occupation(request.getParameter("father_occuption"));
                                           sr.setFather_name(request.getParameter("father_name"));
                                           sr.setM_dob(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("mother_dob")));
                                           sr.setM_email(request.getParameter("mother_email"));
                                           sr.setM_mobile(request.getParameter("mother_mobile"));
                                            sr.setM_occupaion(request.getParameter("mother_occupation")); 
                                            sr.setMother_name(request.getParameter("mother_name"));
                                             sr.setSibling1(request.getParameter("sibling_name_1"));
                                            sr.setSibling2(request.getParameter("sibling_name_2"));
                                            sr.setSibling3(request.getParameter("sibling_name_3"));
                                            sr.setVehicle(request.getParameter("vehicle"));
                                             sr.setIncome(Convert.toFloat(request.getParameter("income"),f));
                                             sr.setLg_address(request.getParameter("guardian_address"));
                                           sr.setLg_mobile(request.getParameter("guardian_mobile"));
                                           sr.setLg_telephone(request.getParameter("guardian_landline"));
                                           sr.setL_guardian(request.getParameter("guardian_name"));
                                           
                                    s.update(sr);
                                    out.write("hello");
                                       tx.commit();
                                       
                                        s.close();
                                        response.sendRedirect("FamilyDetail.jsp");
                                        out.write(pa);
                                         }                                       
                                        catch(Exception e){
                                            System.out.println(e);
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
