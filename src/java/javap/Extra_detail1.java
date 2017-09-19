/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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


public class Extra_detail1 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;session=false;");
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
                  
                   
                  
                                           
                                           
                                   SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    out.write("hello");
                                    Transaction tx=s.beginTransaction();
                                    out.write("hello");
                                   
                                    Student_record sr= (Student_record) s.get(Student_record.class, pa);
                                       sr.setEx_anchoring(request.getParameter("anchoring"));  
                                       sr.setEx_dancing(request.getParameter("dancing"));
                                       sr.setEx_debate(request.getParameter("debate"));
                                       sr.setEx_instrument(request.getParameter("instrument"));
                                       sr.setEx_name_of_instrument(request.getParameter("ins_name"));
                                       sr.setEx_painting(request.getParameter("painting"));
                                       sr.setEx_remark(request.getParameter("ex_remark"));
                                       sr.setEx_singing(request.getParameter("singing"));
                                       sr.setSpo_Basketball(request.getParameter("Basketball"));
                                       sr.setSpo_Carom(request.getParameter("Carom"));
                                       sr.setSpo_Cricket(request.getParameter("Cricket"));
                                       sr.setSpo_Football(request.getParameter("Football"));
                                       sr.setSpo_Kho_Kho(request.getParameter("Kho-Kho"));
                                       sr.setSpo_Softball(request.getParameter("Softball"));
                                       sr.setCheese(request.getParameter("Chess"));
                                       sr.setSpo_TT(request.getParameter("TT"));
                                       sr.setSpo_other(request.getParameter("sp_other"));
                                       sr.setSpo_remark(request.getParameter("sp_remark"));
                                       sr.setAfter_graduation(request.getParameter("graduation"));
                                       sr.setE_read(request.getParameter("read"));
                                       sr.setE_speak(request.getParameter("speak"));
                                       sr.setE_understand(request.getParameter("understand"));
                                       sr.setE_write(request.getParameter("write"));
                                       sr.setL_goal(request.getParameter("lgoal"));
                                       sr.setS_goal(request.getParameter("sgoal"));
                                       s.saveOrUpdate(sr);
                                    out.write("hello");
                                       tx.commit();
                                        s.close();
                                        int count=Convert.toInt(request.getParameter("count"),0);
                                        SessionFactory sf1=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Strength.class).buildSessionFactory();
                                        Session s1=sf1.openSession();
                                    out.write("hello");
                                    Transaction tx1=s1.beginTransaction();
                                    out.write("hello");
                                    
                                       for(int si=1;si<=count;si++)
                                        {    
                                        Strength st=new Strength();
                                            System.out.println(request.getParameter(""+si));
                                            System.out.println(request.getParameter(""+si));
                                        st.setUser_name(pa);
                                        st.setStrength(request.getParameter("s"+si));
                                        st.setWeakness(request.getParameter("w"+si));
                                        st.setS_no(si);
                                        s1.saveOrUpdate(st);
                                        }
                                        
                                    out.write("hello");
                                       tx1.commit();
                                        s1.close();
                                        response.sendRedirect("Exta_detail.jsp");
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
