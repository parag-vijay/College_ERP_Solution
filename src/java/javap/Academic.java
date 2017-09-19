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
import org.hibernate.tool.hbm2x.StringUtils;


public class Academic extends HttpServlet {

   
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
                                           
                  
                                           
                  SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Acedemic_record.class).buildSessionFactory();
                                    
                  Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    
                                    for(int ti=1;ti<9;ti++)
                                           {
                                              Acedemic_record pq=new Acedemic_record();  
                                               pq.setSem((request.getParameter("t"+ti+"1")));
                                               pq.setSession(request.getParameter("t"+ti+"2"));
                                               pq.setMarks_obtnd(Convert.toFloat(request.getParameter("t"+ti+"3"),f));
                                               pq.setMax_mrks(Convert.toInt(request.getParameter("t"+ti+"4"),i));
                                               pq.setResul(request.getParameter("t"+ti+"5"));
                                                pq.setDivision(Convert.toInt(request.getParameter("t"+ti+"6"),i)); 
                                                pq.setGrade(request.getParameter("t"+ti+"7"));
                                                  pq.setDue_paper(request.getParameter("t"+ti+"8"));
                                                  pq.setRemarks(request.getParameter("t"+ti+"9"));
                                                pq.setS_no(ti);
                                                pq.setUser_name(pa);
                                                  s.saveOrUpdate(pq);
                                           }
                                     s.flush();
                                    tx.commit();
                                    s.close();
                                    out.println("1");
                                     sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Compitive_exam.class).buildSessionFactory();
                                     s=sf.openSession();
                                      Transaction tx1=s.beginTransaction();
                                    
                                    for(int ti=1;ti<5;ti++)
                                           {
                                              Compitive_exam pq1=new Compitive_exam();  
                                                  out.print("33");
                                                  pq1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("p"+ti+"1")));
                                                 out.print("33");
                                               pq1.setExam_name(request.getParameter("p"+ti+"2"));
                                               pq1.setType(request.getParameter("p"+ti+"3"));
                                               pq1.setMarks_obtnd(Convert.toFloat(request.getParameter("p"+ti+"4"),f));
                                               pq1.setMax_marks(Convert.toInt(request.getParameter("p"+ti+"5"),i));
                                                pq1.setPercentage(Convert.toFloat(request.getParameter("p"+ti+"6"),f)); 
                                                pq1.setRank(Convert.toInt(request.getParameter("p"+ti+"7"),i));
                                                  pq1.setQuota_name(request.getParameter("p"+ti+"8"));
                                                  pq1.setQuota_rank(Convert.toInt(request.getParameter("p"+ti+"9"),i));
                                                     pq1.setRemark(request.getParameter("p"+ti+"10"));
                                                  pq1.setS_no(ti);
                                               pq1.setUser_name(pa);
                                               s.saveOrUpdate(pq1);
                                           }
                                     s.flush();
                                    tx1.commit();
                                    s.close();
                                    out.println("1");
                                     sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Higher_study.class).buildSessionFactory();
                                    
                   s=sf.openSession();
                                    Transaction tx2=s.beginTransaction();
                                    Higher_study hs=new Higher_study();
                                    hs.setCourse_name(request.getParameter("H_course_name"));
                                    hs.setSpecialisation(request.getParameter("H_specialization"));
                                    hs.setUniversity_name(request.getParameter("H_university_name"));
                                    hs.setCity(request.getParameter("H_city"));
                                    hs.setCountry(request.getParameter("H_country"));
                                    hs.setYear(Convert.toInt(request.getParameter("H_year"), i));
                                    hs.setUser_name(pa);
                                    hs.setInstitute_name(request.getParameter("H_name"));
                                    s.saveOrUpdate(hs);
                                    s.flush();
                                    tx2.commit();
                                    s.close();
                                    out.println("1");
                                     response.sendRedirect("Academic_detail.jsp");
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
