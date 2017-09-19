
package javap;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    public class Expectation1 extends HttpServlet {

   
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
                                          
                                    
                                    out.write("hello");
                                   SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Expectations.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    out.write("hello");
                                    Transaction tx=s.beginTransaction();
                                    out.write("hello");
                                     Expectations e=(Expectations) s.get(Expectations.class,pa);
                                    e.setActn_planed(request.getParameter("act"));
                                    e.setExp_frm_colg(request.getParameter("clg"));
                                    e.setExp_frm_dept(request.getParameter("dpt"));
                                    e.setExp_frm_mentr(request.getParameter("mnt"));
                                    s.saveOrUpdate(e);
                                    out.write("hello");
                                       tx.commit();
                                        s.close();
                                        response.sendRedirect("Exception.jsp");
                                        out.write("0827");
                                         }                                       
                                        catch(Exception e){
                                            System.out.println(e);
                                        }   
        
         finally {            
            out.close();
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
