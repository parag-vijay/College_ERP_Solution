<%-- 
    Document   : Exta_detail
    Created on : Sep 19, 2014, 2:15:09 PM
    Author     : lenovo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="javap.Strength"%>
<%@page import="javap.Student_record"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="java.awt.geom.QuadCurve2D"%>

<%@page import="javap.Convert"%>
<%@page import="java.io.IOException" %>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="newcss.css">
        <script type="text/javascript" src="validate.js"></script>
        
        <title></title>
    </head>
    <body>
        
        <%! public List<javap.Student_record> lt=new ArrayList<Student_record>();%>
     <%! public Student_record e=new Student_record();%>
     <%! public int f=0;%>
  <% 
  HttpSession sess=request.getSession(false);
      if(sess==null)
                   {
          response.sendRedirect("index.jsp");
          return;
      }
      String pa=sess.getAttribute("user_name").toString();
          sess.setAttribute("user_name",pa);
  try {
       
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
Session s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Student_record where username='"+pa+"'");
lt=q.list();

if(lt.isEmpty())
    {
    e=new Student_record();
    e.setUsername(pa);
     s.save(e);
     f=1;
    }
else{
Iterator t=lt.iterator();   
e=(Student_record)t.next();
} 
tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
 <form class="extra-details" onsubmit="return checkReq()" action="Extra_detail1" method="post">
            <fieldset>
                <legend>Extra-Curricular</legend>
                <table>
                    <tr>
                        <td class="txt"><span>Proficiency in English:</span></td>
                        <td>
                            <ul>
                                 <%
                                    if("Write".equals(e.getE_write()))
                                                           {%>
                                <li><label>Write</label><input type="checkbox" name="write" value="Write" checked></li>
                               
                          <%}else 
                                                           {%>
                                  <li><label>Write</label><input type="checkbox" name="write" value="Write"></li>
                          <%}
                                  if("Speak".equals(e.getE_speak()))
                                                           {%>
                               
                                <li><label>Speak</label><input type="checkbox" name="speak" value="Speak" checked></li>
                                
                          <%} else 
                                                           {%>
                                  <li><label>Speak</label><input type="checkbox" name="speak" value="Speak"></li>
                          <%} if("Understand".equals(e.getE_understand()))
                                                           {%>
                               
                                <li><label>Understand</label><input type="checkbox" name="understand" value="Understand" checked></li>
                          <%} else 
                                                           {%>
                                  <li><label>Understand</label><input type="checkbox" name="understand" value="Understand"></li>
                          <%} if("Read".equals(e.getE_read()))
                                                           {%>
                               <li><label>Read</label><input type="checkbox" name= "read" value="Read" checked></li>
                                
                          <%}else
                                {%>
                                <li><label>Read</label><input type="checkbox" name= "read" value="Read"></li>
                               
                               <%}%>   
                           </ul>
                        </td>
                </tr>
                <tr>
                    <td class="txt"><span>Extra-Curricular Skills:</span></td>
                    <td>
                            <ul id="ex-skill-list">
                               <% if("Anchoring".equals(e.getEx_anchoring()))
                                                           {%>
                               <li><label>Anchoring</label><input type="checkbox" name="anchoring" value="Anchoring" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Anchoring</label><input type="checkbox" name="anchoring" value="Anchoring"></li>
                               
                               <%} if("Debate".equals(e.getEx_debate()))
                                                           {%>
                               <li><label>Debate</label><input type="checkbox" name="debate" value="Debate" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Debate</label><input type="checkbox" name="debate" value="Debate"></li>
                               
                               <%}if("Painting".equals(e.getEx_painting()))
                                                           {%>
                              <li><label>Painting</label><input type="checkbox" name="painting" value="Painting" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Painting</label><input type="checkbox" name="painting" value="Painting"></li>
                               
                               <%}if( "Dancing".equals(e.getEx_dancing()))
                                                           {%>
                             <li><label>Dancing</label><input type="checkbox" name="dancing" value="Dancing" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Dancing</label><input type="checkbox" name="dancing" value="Dancing"></li>
                               
                               <%}if( "Singing".equals(e.getEx_singing()))
                                                           {%>
                             <li><label>Singing</label><input type="checkbox" name="singing" value="Singing" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Singing</label><input type="checkbox" name="singing" value="Singing"></li>
                               
                               <%}if( "instrument".equals(e.getEx_instrument()))
                                                           {%>
                             <li><label>Instrument</label><input type="checkbox" name="instrument" value="Instrument" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Instrument</label><input type="checkbox" name="instrument" value="Instrument"></li>
                               
                               <%}%> 
                                
                            </ul>
                        </td>
                </tr>
                <tr>
                    <td class="txt"><span>Sports:</span></td>
                    <td>
                        <ul>
                            <%if("Football".equals(e.getSpo_Football()))
                                                           {%>
                              <li><label>Football</label><input type="checkbox"  name="Football" value="Football" checked></li>
                                
                          <%} else
                                {%>
                                 <li><label>Football</label><input type="checkbox"  name="Football" value="Football"></li>
                               
                               <%}if("Carom".equals(e.getSpo_Carom()))
                                                           {%>
                              <li><label>Carom</label><input type="checkbox"  name="Carom" value="Carom" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Carom</label><input type="checkbox"  name="Carom" value="Carom"></li>
                               
                               <%}if("TT".equals(e.getSpo_TT()))
                                                           {%>
                              <li><label>TT</label><input type="checkbox"  name="TT" value="TT" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>TT</label><input type="checkbox"  name="TT" value="TT"></li>
                               
                               <%}if("Cricket".equals(e.getSpo_Cricket()))
                                                           {%>
                              <li><label>Cricket</label><input type="checkbox"  name="Cricket" value="Cricket" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Cricket</label><input type="checkbox"  name="Cricket" value="Cricket"></li>
                               
                               <%}if("Chess".equals(e.getCheese()))
                                                           {%>
                              <li><label>Chess</label><input type="checkbox"  name="Chess" value="Chess" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Chess</label><input type="checkbox"  name="Chess" value="Chess"></li>
                               
                               <%}if("Basketball".equals(e.getSpo_Basketball()))
                                                           {%>
                              <li><label>Basketball</label><input type="checkbox"  name="Basketball" value="Basketball" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Basketball</label><input type="checkbox"  name="Basketball" value="Basketball"></li>
                               
                               <%}if("Softball".equals(e.getSpo_Softball()))
                                                           {%>
                              <li><label>Softball</label><input type="checkbox"  name="Softball" value="Softball" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Softball</label><input type="checkbox"  name="Softball" value="Softball"></li>
                               
                               <%}if("Kho-Kho".equals(e.getSpo_Kho_Kho()))
                                                           {%>
                              <li><label>Kho-Kho</label><input type="checkbox"  name="Kho-Kho" value="Kho-Kho" checked></li>
                                
                          <%} else
                                {%>
                                <li><label>Kho-Kho</label><input type="checkbox"  name="Kho-Kho" value="Kho-Kho"></li>
                               
                               <%}%> 
                            
                        </ul>
                    </td>
                </tr>
                </table>    
            </fieldset>
            <fieldset>
                <legend>Career Plan</legend>
                <table>
                    <tr>
                <td class="txt"><span>After Graduation :</span></td>
                <td>
                    <ul id="radio-list">
                        <%if("Entrepreneurship".equals(e.getAfter_graduation()))
                                                           {%>
                              <li><label>Entrepreneurship</label><input type="radio" name="graduation" value="Entrepreneurship" checked></li>
                        <li><label>Private Job</label><input type="radio" name="graduation"  value="Private Job"></li>
                        <li><label>Public Sector</label><input type="radio" name="graduation"  value="Public Sector"></li>
                        <li><label>Higher Studies</label><input type="radio" name="graduation" value="Higher Studies"></li>
                        <li><label>Other</label><input type="radio" name="graduation" value="Other" ></li>
                                
                          <%} else if("Private Job".equals(e.getAfter_graduation()))
                                {%>
                                 <li><label>Entrepreneurship</label><input type="radio" name="graduation" value="Entrepreneurship"></li>
                        <li><label>Private Job</label><input type="radio" name="graduation"  value="Private Job" checked></li>
                        <li><label>Public Sector</label><input type="radio" name="graduation"  value="Public Sector"></li>
                        <li><label>Higher Studies</label><input type="radio" name="graduation" value="Higher Studies"></li>
                        <li><label>Other</label><input type="radio" name="graduation" value="Other" ></li>
                               
                               <%}else if("Public Sector".equals(e.getAfter_graduation()))
                                {%>
                                 <li><label>Entrepreneurship</label><input type="radio" name="graduation" value="Entrepreneurship"></li>
                        <li><label>Private Job</label><input type="radio" name="graduation"  value="Private Job"></li>
                        <li><label>Public Sector</label><input type="radio" name="graduation"  value="Public Sector" checked></li>
                        <li><label>Higher Studies</label><input type="radio" name="graduation" value="Higher Studies"></li>
                        <li><label>Other</label><input type="radio" name="graduation" value="Other" ></li>
                               
                               <%}else if("Higher Studies".equals(e.getAfter_graduation()))
                                {%>
                                 <li><label>Entrepreneurship</label><input type="radio" name="graduation" value="Entrepreneurship"></li>
                        <li><label>Private Job</label><input type="radio" name="graduation"  value="Private Job"></li>
                        <li><label>Public Sector</label><input type="radio" name="graduation"  value="Public Sector"></li>
                        <li><label>Higher Studies</label><input type="radio" name="graduation" value="Higher Studies" checked></li>
                        <li><label>Other</label><input type="radio" name="graduation" value="Other" ></li>
                               
                               <%}else if("Other".equals(e.getAfter_graduation()))
                                {%>
                                 <li><label>Entrepreneurship</label><input type="radio" name="graduation" value="Entrepreneurship"></li>
                        <li><label>Private Job</label><input type="radio" name="graduation"  value="Private Job"></li>
                        <li><label>Public Sector</label><input type="radio" name="graduation"  value="Public Sector"></li>
                        <li><label>Higher Studies</label><input type="radio" name="graduation" value="Higher Studies"></li>
                        <li><label>Other</label><input type="radio" name="graduation" value="Other" checked ></li>
                               
                               <%}else
                                {%>
                                 <li><label>Entrepreneurship</label><input type="radio" name="graduation" value="Entrepreneurship"></li>
                        <li><label>Private Job</label><input type="radio" name="graduation"  value="Private Job" ></li>
                        <li><label>Public Sector</label><input type="radio" name="graduation"  value="Public Sector"></li>
                        <li><label>Higher Studies</label><input type="radio" name="graduation" value="Higher Studies"></li>
                        <li><label>Other</label><input type="radio" name="graduation" value="Other" ></li>
                               
                               <%}%> 
                      
                    </ul>
                </td>
                </tr>
                <tr>
                    <td class="text"><span>Short Term Goal<span class="small_font">(next 5 years)</span>:</span><td><textarea maxlength="300" size="100" name="sgoal" id="sgoal"><%=e.getS_goal()%></textarea></td>
                </tr>
                <tr>
                    <td class="text"><span>Long Term Goals:</span><td><textarea maxlength="300" size="115" name="lgoal" id="lgoal"><%= e.getL_goal()%></textarea></td>
                </tr>
                </table>
                    <%! public List<javap.Strength> lt1=new ArrayList<Strength>();%>
     <%!public Strength e1=new Strength();%>
    
  <% try {
SessionFactory sf1=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Strength.class).buildSessionFactory();
Session s1=sf1.openSession(); 
Transaction tx1=s1.beginTransaction();
Query q1=s1.createQuery("from javap.Strength where user_name='"+pa+"'");
lt1=q1.list();%>
<%!int inc=1;%>
<% if(lt1.isEmpty())
    { System.out.println("Hello");
  e1=new Strength();
e1.setUser_name(pa);
e1.setS_no(1);
s1.save(e1);
      %>
     <div id="str-weak">
                    <h1><u>Strengths and Weaknesses</u></h1>
                    <span class="ul_container">
                    <ul id="str_list">
                        <li><label>Strength:</label><input type="text" maxlength="20" name="<%="s"+inc%>" id="strength"></li>   
                    </ul>
                    <span onclick="addStrength()" class="addButton" id="Str_addButton">S<sup>+</sup></span>
                    </span>
                    
                    <span class="ul_container">
                    <ul id="weak_list">
                        <li><label>Weakness:</label><input type="text" maxlength="20" name="<%="w"+inc%>" id="weakness"></li>
                    </ul>
                        <span class="addButton" onclick="addWeakness()" id="Weak_addButton">W<sup>+</sup></span>
                    </span>
                    </div>
     <%f=1;
     System.out.println("H1");
    }
else{ System.out.println("H2");%>
    <div id="str-weak">
                    <h1><u>Strengths and Weaknesses</u></h1>
                    <span class="ul_container">
<%for(Iterator it=lt1.iterator();it.hasNext();)
{  inc++;
 e1=(Strength)it.next(); %> 
<ul id="str_list">
    <li><label>Strength:</label><input type="text" maxlength="20" name="<%="s"+(inc-1)%>" id="strength" value="<%=e1.getStrength()%>"></li>   
                    </ul> 
<ul id="weak_list">
                        <li><label>Weakness:</label><input type="text" maxlength="20" name="<%="w"+(inc-1)%>" id="weakness" value="<%=e1.getWeakness()%>"></li>
                    </ul>                                
<%}%>   

                    <ul id="str_list">
                        <li><label>Strength:</label><input type="text" maxlength="20" name="<%="s"+inc%>" id="strength"></li>   
                    </ul>
                    <span onclick="addStrength()" class="addButton" id="Str_addButton">S<sup>+</sup></span>
                    </span>
                    
                    <span class="ul_container">
                    <ul id="weak_list">
                        <li><label>Weakness:</label><input type="text" maxlength="20" name="<%="w"+inc%>" id="weakness"></li>
                    </ul>
                        <span class="addButton" onclick="addWeakness()" id="Weak_addButton">W<sup>+</sup></span>
                    </span>

<%} 
tx1.commit();
s1.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
               
             </fieldset>
            <div>
                <input type="text" hidden="hidden" value="<%=inc%>" name="count" size="1">
             <% if(f==1)
                             {%>   
             <input type="submit" value="Insert" class="submit_btn">
             <%} 
               else
                 {%>
            <input type="submit" value="Update" class="submit_btn">
            <%}%>
            <input type="button" value="Next" class="reset_btn" onclick="document.location='Exception.jsp'">
            <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
            </div>
</form>
        
    </body>
</html>

