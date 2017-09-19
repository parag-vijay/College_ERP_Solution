
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


public class StudentInfo extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             out.write("hello");
                  HttpSession session=request.getSession();
                 // String pa = (String) session.getAttribute("user_name");
                  String pa="0827IT111058";
                  
                                           session.setAttribute("user_name","0827IT111058");
                                           Student_record sr=new Student_record();
                                           sr.setAnniversary(request.getParameter(""));
                                           sr.setBlood_group(request.getParameter(""));
                                           sr.setBranchvar(request.getParameter(""));
                                           sr.setBus_no(request.getParameter(""));
                                           sr.setC_email(request.getParameter(""));
                                           sr.setCast(request.getParameter(""));
                                           sr.setCategory(request.getParameter(""));
                                           sr.setCheese(request.getParameter(""));
                                           sr.setDate_of_birth(request.getParameter(""));
                                           sr.setEnrollment_no(request.getParameter(""));
                                           sr.setEx_anchoring(request.getParameter(""));
                                           sr.setEx_dancing(request.getParameter(""));
                                           sr.setEx_debate(request.getParameter(""));
                                           sr.setEx_instrument(request.getParameter(""));
                                           sr.setEx_name_of_instrument(request.getParameter(""));
                                           sr.setEx_painting(request.getParameter(""));
                                           sr.setEx_remark(request.getParameter(""));
                                           sr.setEx_singing(request.getParameter(""));
                                           sr.setF_dob(request.getParameter(""));
                                           sr.setF_email(request.getParameter(""));
                                           sr.setF_mobile(Double.parseDouble(request.getParameter("")));
                                           sr.setF_occupation(request.getParameter(""));
                                           sr.setFather_name(request.getParameter(""));
                                           sr.setGender(request.getParameter(""));
                                         
                                           sr.setImage(request.getParameter(""));
                                           sr.setIncome(Double.parseDouble(request.getParameter("")));
                                           sr.setL_address(request.getParameter(""));
                                           sr.setL_city(request.getParameter(""));
                                           sr.setL_goal(request.getParameter(""));
                                           sr.setL_guardian(request.getParameter(""));
                                           sr.setL_pincode(Integer.parseInt(request.getParameter("")));
                                           sr.setL_state(request.getParameter(""));
                                           sr.setL_telephone_no(Double.parseDouble(request.getParameter("")));
                                           sr.setLg_address(request.getParameter(""));
                                           sr.setLg_mobile(Double.parseDouble(request.getParameter("")));
                                           sr.setLg_telephone(Double.parseDouble(request.getParameter("")));
                                           sr.setM_dob(request.getParameter(""));
                                           sr.setM_email(request.getParameter(""));
                                           sr.setM_mobile(Double.parseDouble(request.getParameter("")));
                                            sr.setM_occupaion(request.getParameter("")); 
                                            sr.setM_tongue(request.getParameter(""));
                                            sr.setMedical_detail(request.getParameter(""));
                                            sr.setMobile1(Double.parseDouble(request.getParameter("")));
                                            sr.setMobile2(Double.parseDouble(request.getParameter("")));
                                            sr.setMother_name(request.getParameter(""));
                                            sr.setName(request.getParameter(""));
                                            sr.setNationality(request.getParameter(""));
                                            sr.setP_address(request.getParameter(""));
                                            sr.setP_city(request.getParameter(""));
                                            sr.setP_email(request.getParameter(""));
                                            sr.setP_pincode(Integer.parseInt(request.getParameter("")));
                                            sr.setP_state(request.getParameter(""));
                                            sr.setP_telephone_no(Double.parseDouble(request.getParameter("")));
                                            sr.setReligion(request.getParameter(""));
                                            sr.setS_goal(request.getParameter(""));
                                            sr.setScholar_no(request.getParameter(""));
                                            sr.setSibling1(request.getParameter(""));
                                            sr.setSibling2(request.getParameter(""));
                                            sr.setSibling3(request.getParameter(""));
                                            sr.setSpo_Basketball(request.getParameter(""));
                                            sr.setSpo_Carom(request.getParameter(""));
                                            sr.setSpo_Cricket(request.getParameter(""));
                                            sr.setSpo_Football(request.getParameter(""));
                                            sr.setSpo_Kho_Kho(request.getParameter(""));
                                            sr.setSpo_Softball(request.getParameter(""));
                                            sr.setSpo_TT(request.getParameter(""));
                                            sr.setSpo_other(request.getParameter(""));
                                            sr.setSpo_remark(request.getParameter(""));
                                            sr.setStop_name(request.getParameter(""));
                                            sr.setUsername(request.getParameter(""));
                                            sr.setVehicle(request.getParameter(""));
                                    SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Expectations.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    out.write("hello");
                                    Transaction tx=s.beginTransaction();
                                    out.write("hello");
                                    s.save(sr);
                                    out.write("hello");
                                       tx.commit();
                                        s.close();
                                        response.sendRedirect("Exception.jsp");
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
