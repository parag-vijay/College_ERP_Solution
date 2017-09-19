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


public class Displinary extends HttpServlet {

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
                                    
                                    for(int ti=1;ti<6;ti++)
                                           {
                                               Disciplinary_Action pq=new Disciplinary_Action();  
                                               pq.setDis_date(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("r"+ti+"1")));
                                              
                                               pq.setTypes((request.getParameter("r"+ti+"2")));
                                              
                                               pq.setTime_spend(Convert.toInt(request.getParameter("r"+ti+"4"),i));
                                              
                                               pq.setParticular(request.getParameter("r"+ti+"3"));
                                               pq.setS_no(ti);
                                              pq.setUser_name(pa);
                                            
                                              s.saveOrUpdate(pq);
                                           }
                                    out.println("1");
                                     s.flush();
                                    tx.commit();
                                    s.close();
            
       sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Cocurricular_activity.class).buildSessionFactory();
                                    
                  s=sf.openSession();
                                    Transaction tx1=s.beginTransaction();
                                    out.println("1");
                                    for(int ti=1;ti<6;ti++)
                                           {
                                               Cocurricular_activity pq1=new Cocurricular_activity();  
                                           
                                               pq1.setActivity_name((request.getParameter("q"+ti+"1")));
                                               pq1.setCategory((request.getParameter("q"+ti+"2")));
                                                pq1.setLevel(request.getParameter("q"+ti+"3"));
                                                 pq1.setName_of_event(request.getParameter("q"+ti+"4"));
                                                  pq1.setDate_or_year(request.getParameter("q"+ti+"5"));
                                                pq1.setOrganised_by_or_place(request.getParameter("q"+ti+"6"));
                                                pq1.setPosition_secured(Convert.toInt(request.getParameter("q"+ti+"7"),i));
                                                  pq1.setAchievement_remark(request.getParameter("q"+ti+"8"));
   
                                                  pq1.setS_no(ti);                                 
                                               pq1.setUser_name(pa);
                                              
                                               s.saveOrUpdate(pq1);
                                           }
                                    out.println("1");
                                    s.flush();
                                    tx1.commit();
                                    s.close();
                                    response.sendRedirect("Deciplinery.jsp");
            
        } 
        catch(Exception ex) {
        System.out.println(ex);
         }
        finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

