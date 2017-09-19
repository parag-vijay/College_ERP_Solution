
package javap;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class studentrecord extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String id = request.getParameter("username");
                                    String pa = request.getParameter("password");
                                    SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(Student_record.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    Student_record s1=new Student_record();
                                    s1.setName(request.getParameter(""));
                                    s1.setEnrollment_no(request.getParameter(""));
                                    s1.setScholar_no(request.getParameter(""));
                                    s1.setGender(request.getParameter(""));
                                    s.save(s1);
                                       tx.commit();
                                        s.close();
                                        response.sendRedirect("Exception.jsp");
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
