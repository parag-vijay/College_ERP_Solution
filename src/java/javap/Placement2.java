
package javap;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Placement2 extends HttpServlet {

   
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
                                           
                                           SessionFactory sf1;
                                           Session s1;
                                          SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Placement1.class).buildSessionFactory();
                                           Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    out.write("2");
                                           for(int ti=1;ti<6;ti++)
                                           {
                                              Placement1 p=new Placement1();
                                              
                                           p.setAnnual_package(request.getParameter("s"+ti+"5"));
                                           
                                           p.setCompany_name(request.getParameter("s"+ti+"2"));
                                           
                                           if("".equals(request.getParameter("s"+ti+"1")))
                                           {
                                               out.print("null1");
                                           }
                                           else
                                           {
                                               out.print(request.getParameter("s"+ti+"1"));
                                           p.setDate1(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("s"+ti+"1")));
                                           }
                                           
                                           p.setDesignation_or_job_tile(request.getParameter("s"+ti+"3"));
                                           
                                           p.setJob_type(request.getParameter("s"+ti+"4"));
                                           p.setOffice_letter(request.getParameter("s"+ti+"6"));
                                           p.setOpen_or_close_campus(request.getParameter("s"+ti+"7"));
                                           p.setRemarks(request.getParameter("s"+ti+"8"));
                                           p.setUser_name(pa); 
                                           
                                           p.setS_no(ti);
                                           
                                           s.saveOrUpdate(p);
                                           }
                                           
                                           s.flush();
                                           
                                    tx.commit();
                                    
                                    s.close();
                                    out.write("3");
                                            sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Training_certificate.class).buildSessionFactory();
                                    s=sf.openSession();
                                    Transaction tx1=s.beginTransaction();
                                    for(int ti=1;ti<6;ti++)
                                           {
                                               Training_certificate tc=new Training_certificate();
                                  
                                  tc.setAttendance(Convert.toInt(request.getParameter("p"+ti+"9"), i));
                                 
                                 tc.setCompany(request.getParameter("p"+ti+"3"));
                                 tc.setCourse_and_certification_name(request.getParameter("p"+ti+"2"));
                                 if("".equals(request.getParameter("p"+ti+"1")))
                                 {
                                     
                                 }
                                 else
                                 {
                                 tc.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("p"+ti+"1")));
                                 }
                                 tc.setGrade(request.getParameter("p"+ti+"7"));
                                 tc.setMarks_obtained(Convert.toFloat(request.getParameter("p"+ti+"4"), i));
                                 
                                 tc.setMarks_percentage(Convert.toFloat(request.getParameter("p"+ti+"6"),f));
                                 
                                 tc.setMax_marks(Convert.toInt(request.getParameter("p"+ti+"5"),i));
                                 tc.setPass(request.getParameter("p"+ti+"10"));
                                 tc.setRemark(request.getParameter("p"+ti+"11"));
                                 tc.setTotal_attendance(Convert.toInt(request.getParameter("p"+ti+"8"), i));
                                 tc.setUser_name(pa);
                                 tc.setS_no(ti);
                                 s.saveOrUpdate(tc);
                                           }
                                     s.flush();
                                    tx1.commit();
                                    s.close();
                                    out.write("4");
                                  Joining j=new Joining();
                                  
                                  j.setCity(request.getParameter("JoiningCity"));
                                  j.setCountry(request.getParameter("JoiningCountry"));
                                  
                                  j.setJoint_in(request.getParameter("JoinInDate"));
                                 
                                  
                                 j.setYear(Convert.toInt(request.getParameter("JoiningYear"),i));
                                  j.setUser_name(pa);
                                 
                                  
                                   sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Joining.class).buildSessionFactory();
                                    s=sf.openSession();
                                    Transaction tx2=s.beginTransaction();
                                    s.saveOrUpdate(j);
                                    s.flush();
                                    tx2.commit();
                                    s.close();
                                    out.write("11");
                                        response.sendRedirect("Placement1.jsp");
                                        out.write(pa);
        }
       catch(Exception ex) {
        System.out.println(ex.getMessage());
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
