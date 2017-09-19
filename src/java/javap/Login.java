/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javap.UserName;
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
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;



public class Login extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;session=false");
        PrintWriter out = response.getWriter();
        try {
           
                                    String id = request.getParameter("lusername");
                                    String pa = request.getParameter("lpassword");
                                    SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.UserName.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    Criteria c=s.createCriteria(javap.UserName.class);
                                    Criterion user=Restrictions.eq("username",id);
                                    Criterion pass=Restrictions.eq("password",pa);
                                    LogicalExpression chk=Restrictions.and(user, pass);
                                    c.add(chk);
                                    List l=c.list();
                                    out.println(id);
                                    if(!(l.isEmpty()))
                                        {
                                           Iterator t=l.iterator();   
                                           UserName e=(UserName)t.next(); 
                                            if(e.getType().equals("Student"))
                                            {    
                                            HttpSession session=request.getSession();
                                           session.setAttribute("user_name",id);
                                          response.sendRedirect("personal_detail.jsp");
                                            }
                                            else if(e.getType().equals("Faculty"))
                                            {
                                                
                                                if(e.getVerified().equalsIgnoreCase("Yes"))
                                                {
                                                    HttpSession session=request.getSession();
                                           session.setAttribute("user_name",id);
                                              response.sendRedirect("ViewTimeTable.jsp");
                                                }
                                                else
                                                {
                                                    out.print("user is not verified");
                                                    response.sendRedirect("index.jsp");
                                            }
                                              }
                                            else if(e.getType().equalsIgnoreCase("Admin"))
                                            {
                                                System.out.println("TimeTable Page");
                                                HttpSession session=request.getSession();
                                           session.setAttribute("user_name",id);
                                                response.sendRedirect("CreateTimeTable.jsp");
                                            }
                                        }
                                    else {
                                           System.out.println("Roopal");
                                          
                                          response.sendRedirect("index.jsp");
                                           
                                            }
                                    out.println(id);
                                        tx.commit();
                                        s.close();
                                         }                                       
                                        catch(Exception e){
                                            System.out.print(e);
                                        }   
            
         finally {     
            
            out.close();
        }
    }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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

