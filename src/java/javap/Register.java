
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


public class Register extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
           if((request.getParameter("upassword")).equals(request.getParameter("ucpassword")))
           {  
               SessionFactory sf1=new AnnotationConfiguration().configure().addAnnotatedClass(javap.UserName.class).buildSessionFactory();
               Session s1=sf1.openSession(); 
               Transaction tx1=s1.beginTransaction();
               UserName un=new UserName();
               un.setEmail(request.getParameter("uemail"));
               un.setName(request.getParameter("name"));
               un.setUsername(request.getParameter("user_name"));
               un.setPassword(request.getParameter("upassword"));
               un.setType(request.getParameter("AccountType"));
               un.setVerified("-");
               s1.save(un);
              tx1.commit();
              s1.close(); 
             response.sendRedirect("index.jsp");
           }
           else{
               response.sendRedirect("index.jsp");
           }
        } 
        catch(Exception ex) {
        System.out.println(ex.getMessage());
        response.sendRedirect("index.jsp");
         }finally {            
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
