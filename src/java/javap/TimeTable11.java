
package javap;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class TimeTable11 extends HttpServlet {

   
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
            out.write("hello");
                  float f=0.0f;
                  double d=0;
                  int i=0;
            int count=Convert.toInt(request.getParameter("count"),i);
            SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.TimeTable.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                     for(int si=1;si<=count;si++)
                                        {    
                                    TimeTable tt=new TimeTable();
            tt.setS_no(Convert.toInt(request.getParameter("t1"+si), i));
            tt.setFaculty_name(request.getParameter("t6"+si));
            tt.setRoom_no(request.getParameter("t7"+si));
            tt.setDay(request.getParameter("t3"+si));
            tt.setSem(request.getParameter("t4"+si));
            tt.setSubcode(request.getParameter("t5"+si));
            tt.setTime(request.getParameter("t2"+si));
            tt.setUser_name(pa);
                                    s.save(tt);
                                        }
                                      out.write("hello");
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    out.write("11");
                                        response.sendRedirect("CreateTimeTable.jsp");
                                        out.write(pa);
                                         }                                       
                                        catch(Exception e){
                                            System.out.println("helloe1");
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
