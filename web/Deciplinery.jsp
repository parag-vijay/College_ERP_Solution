<%@page import="java.util.ArrayList"%>
<%@page import="javap.Cocurricular_activity"%>
<%@page import="javap.Disciplinary_Action"%>
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
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <script type="text/javascript" src="validate.js"></script>
        <script type="text/javascript" src="city_state.js"></script>
        <title></title>
    </head>
    <body>
        <%! public List<javap.Cocurricular_activity> lt=new ArrayList<Cocurricular_activity>();%>
        <%! public Cocurricular_activity e[]=new Cocurricular_activity[5];%>
     <%! public int f=0;%>
     <%! public SessionFactory sf;%>
     <%! public Session s;%>
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
       
sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Cocurricular_activity.class).buildSessionFactory();
s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Cocurricular_activity where user_name='"+pa+"'");
lt=q.list();

if(lt.isEmpty())
    { for(int j=0;j<5;j++)
                   {
         e[j]=new Cocurricular_activity();
        e[j].setUser_name(pa);
         e[j].setS_no(j+1);
         s.save(e[j]);
               }
   f=1;
    }
else{%> <%! int i=0; %>
<%for(Iterator t=lt.iterator();t.hasNext();)
{
e[i]=(Cocurricular_activity)t.next();
i++;
} 
i=0;
   } 
  tx.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }
 %>
        <form class="student-form" onsubmit="return checkReq()" action="Displinary">
         <fieldset>
            <legend>CO-CURRICULAR ACTIVITY</legend>
            <table>
                <tr>
                    <th>Activity Name</th>
                    <th>Category</th>
                    <th>Level</th>
                    <th>Name of Event</th>
                    <th>Date/Year</th>
                    <th>Organized By & Place</th>
                    <th>Position Secured</th>
                    <th>Achievement</th>
                    
                    
                </tr>
                
                <tr class="tableTxt">
                    <td>  <input type="text" name="q11" size="10" id="CoActivityName" required onchange="textValidation(id)" value="<%=e[0].getActivity_name()%>">  </td>    
                    <td>  <input type="text" name="q12" size="20" id="CoCate" required onchange="textValidation(id)" value="<%=e[0].getCategory()%>">  </td>    
                        <td> <input type="text" name="q13" size="8" id="CoLevel" required onchange="textValidation(id)" value="<%=e[0].getLevel()%>">    </td>
                        <td> <input type="text" name="q14" size="14" id="CoName" required onchange="textValidation(id)" value="<%=e[0].getName_of_event()%>">   </td>
                        <td>  <input type="text" name="q15" size="5" id="CoDate" required onchange="textValidation(id)" value="<%=e[0].getDate_or_year()%>">  </td>
                        <td>  <input type="text" name="q16" size="5" id="CoOrganized" required onchange="textValidation(id)" value="<%=e[0].getOrganised_by_or_place()%>">  </td>
                        <td>  <input type="text" name="q17" size="10" id="CoPosition" required onchange="textValidation(id)" value="<%=e[0].getPosition_secured()%>">  </td>
                        <td>  <input type="text" name="q18" size="15" id="CoAchievement" required onchange="textValidation(id)" value="<%=e[0].getAchievement_remark()%>">  </td>            
                </tr>
                
                <tr class="tableTxt">
                    <td>  <input type="text" name="q21" size="10" id="CoActivityName" required onchange="textValidation(id)" value="<%=e[1].getActivity_name()%>">  </td>    
                    <td>  <input type="text" name="q22" size="20" id="CoCate" required onchange="textValidation(id)" value="<%=e[1].getCategory()%>">  </td>    
                        <td> <input type="text" name="q23" size="8" id="CoLevel" required onchange="textValidation(id)" value="<%=e[1].getLevel()%>">    </td>
                        <td> <input type="text" name="q24" size="14" id="CoName" required onchange="textValidation(id)" value="<%=e[1].getName_of_event()%>">   </td>
                        <td>  <input type="text" name="q25" size="5" id="CoDate" required onchange="textValidation(id)"  value="<%=e[1].getDate_or_year()%>">  </td>
                        <td>  <input type="text" name="q26" size="5" id="CoOrganized" required onchange="textValidation(id)" value="<%=e[1].getOrganised_by_or_place()%>">  </td>
                        <td>  <input type="text" name="q27" size="10" id="CoPosition" required onchange="textValidation(id)" value="<%=e[1].getPosition_secured()%>">  </td>
                        <td>  <input type="text" name="q28" size="15" id="CoAchievement" required onchange="textValidation(id)" value="<%=e[1].getAchievement_remark()%>">  </td>            
                </tr>
                <tr class="tableTxt">
                    <td>  <input type="text" name="q31" size="10" id="CoActivityName" required onchange="textValidation(id)" value="<%=e[2].getActivity_name()%>">  </td>    
                    <td>  <input type="text" name="q32" size="20" id="CoCate" required onchange="textValidation(id)" value="<%=e[2].getCategory()%>">  </td>    
                        <td> <input type="text" name="q33" size="8" id="CoLevel" required onchange="textValidation(id)" value="<%=e[2].getLevel()%>">    </td>
                        <td> <input type="text" name="q34" size="14" id="CoName" required onchange="textValidation(id)" value="<%=e[2].getName_of_event()%>">   </td>
                        <td>  <input type="text" name="q35" size="5" id="CoDate" required onchange="textValidation(id)" value="<%=e[2].getDate_or_year()%>">  </td>
                        <td>  <input type="text" name="q36" size="5" id="CoOrganized" required onchange="textValidation(id)" value="<%=e[2].getOrganised_by_or_place()%>">  </td>
                        <td>  <input type="text" name="q37" size="10" id="CoPosition" required onchange="textValidation(id)" value="<%=e[2].getPosition_secured()%>">  </td>
                        <td>  <input type="text" name="q38" size="15" id="CoAchievement" required onchange="textValidation(id)" value="<%=e[2].getAchievement_remark()%>">  </td>            
                </tr>
                <tr class="tableTxt">
                    <td>  <input type="text" name="q41" size="10" id="CoActivityName" required onchange="textValidation(id)" value="<%=e[3].getActivity_name()%>">  </td>    
                    <td>  <input type="text" name="q42" size="20" id="CoCate" required onchange="textValidation(id)" value="<%=e[3].getCategory()%>">  </td>    
                        <td> <input type="text" name="q43" size="8" id="CoLevel" required onchange="textValidation(id)" value="<%=e[3].getLevel()%>">    </td>
                        <td> <input type="text" name="q44" size="14" id="CoName" required onchange="textValidation(id)" value="<%=e[3].getName_of_event()%>">   </td>
                        <td>  <input type="text" name="q45" size="5" id="CoDate" required onchange="textValidation(id)" value="<%=e[3].getDate_or_year()%>">  </td>
                        <td>  <input type="text" name="q46" size="5" id="CoOrganized" required onchange="textValidation(id)"  value="<%=e[3].getOrganised_by_or_place()%>">  </td>
                        <td>  <input type="text" name="q47" size="10" id="CoPosition" required onchange="textValidation(id)" value="<%=e[3].getPosition_secured()%>">  </td>
                        <td>  <input type="text" name="q48" size="15" id="CoAchievement" required onchange="textValidation(id)" value="<%=e[3].getAchievement_remark()%>">  </td>            
                </tr>
                <tr class="tableTxt">
                    <td>  <input type="text" name="q51" size="10" id="CoActivityName" required onchange="textValidation(id)" value="<%=e[4].getActivity_name()%>">  </td>    
                    <td>  <input type="text" name="q52" size="20" id="CoCate" required onchange="textValidation(id)" value="<%=e[4].getCategory()%>">  </td>    
                        <td> <input type="text" name="q53" size="8" id="CoLevel" required onchange="textValidation(id)" value="<%=e[4].getLevel()%>">    </td>
                        <td> <input type="text" name="q54" size="14" id="CoName" required onchange="textValidation(id)" value="<%=e[4].getName_of_event()%>">   </td>
                        <td>  <input type="text" name="q55" size="5" id="CoDate" required onchange="textValidation(id)" value="<%=e[4].getDate_or_year()%>">  </td>
                        <td>  <input type="text" name="q56" size="5" id="CoOrganized" required onchange="textValidation(id)" value="<%=e[4].getOrganised_by_or_place()%>">  </td>
                        <td>  <input type="text" name="q57" size="10" id="CoPosition" required onchange="textValidation(id)" value="<%=e[4].getPosition_secured()%>">  </td>
                        <td>  <input type="text" name="q58" size="15" id="CoAchievement" required onchange="textValidation(id)" value="<%=e[4].getAchievement_remark()%>">  </td>            
                </tr>
            </table>
            
        </fieldset>
                        <%! public List<javap.Disciplinary_Action> lt1=new ArrayList<Disciplinary_Action>();%>
     <%! public Disciplinary_Action e1[]=new Disciplinary_Action[5];%>
    
  <% try {
 sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Disciplinary_Action.class).buildSessionFactory();
s= sf.openSession(); 
Transaction tx1=s.beginTransaction();
Query q1=s.createQuery("from javap.Disciplinary_Action where user_name='"+pa+"'");
lt1=q1.list();

if(lt1.isEmpty())
    { for(int j=0;j<5;j++)
                   {
         e1[j]=new Disciplinary_Action();
         e1[j].setUser_name(pa);
         e1[j].setS_no(j+1);
         s.save(e1[j]);
                }
   f=1;
    }
else{%> <%! int i1=0; %>
<%for(Iterator t1=lt1.iterator();t1.hasNext();)
{
e1[i1]=(Disciplinary_Action)t1.next();
i1++;
} 
 i1=0;
  }
tx1.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex);
         }
 %>
                <fieldset>
            <legend>DISCIPLINARY </legend>
            <table>
                <tr>
                    <th>Date</th>
                    <th>Types</th>
                    <th>Particular</th>
                    <th>Time Spend</th>
                    
                    
                </tr>
                
                <tr class="tableTxt">
                    <td>  <input type="text" name="r11" size="5" id="DiDate" required onchange="textValidation(id)"  value="<%=e1[0].getDis_date()%>">  </td>    
                     <td>  <input type="text" name="r12" size="20" id="DiTypes" required onchange="textValidation(id)" value="<%=e1[0].getTypes()%>">  </td>    
                        <td> <input type="text" name="r13" size="8" id="DiParticular" required onchange="textValidation(id)" value="<%=e1[0].getParticular()%>">    </td>
                        <td> <input type="text" name="r14" size="14" id="DiTime" required onchange="textValidation(id)" value="<%=e1[0].getTime_spend() %>">   </td>
                                             
                </tr>
                 <tr class="tableTxt">
                    <td>  <input type="text" name="r21" size="5" id="DiDate" required onchange="textValidation(id)"  value="<%=e1[1].getDis_date()%>">  </td>    
                     <td>  <input type="text" name="r22" size="20" id="DiTypes" required onchange="textValidation(id)"  value="<%=e1[1].getTypes()%>">  </td>    
                        <td> <input type="text" name="r23" size="8" id="DiParticular" required onchange="textValidation(id)"  value="<%=e1[1].getParticular()%>">    </td>
                        <td> <input type="text" name="r24" size="14" id="DiTime" required onchange="textValidation(id)"  value="<%=e1[1].getTime_spend()%>">   </td>
                                             
                </tr>
                 <tr class="tableTxt">
                    <td>  <input type="text" name="r31" size="5" id="DiDate" required onchange="textValidation(id)" value="<%=e1[2].getDis_date()%>">  </td>    
                     <td>  <input type="text" name="r32" size="20" id="DiTypes" required onchange="textValidation(id)"  value="<%=e1[2].getTypes()%>">  </td>    
                        <td> <input type="text" name="r33" size="8" id="DiParticular" required onchange="textValidation(id)"  value="<%=e1[2].getParticular()%>">    </td>
                        <td> <input type="text" name="r34" size="14" id="DiTime" required onchange="textValidation(id)" value="<%=e1[2].getTime_spend()%>">   </td>
                                             
                </tr>
                 <tr class="tableTxt">
                    <td>  <input type="text" name="r41" size="5" id="DiDate" required onchange="textValidation(id)"  value="<%=e1[3].getDis_date()%>">  </td>    
                     <td>  <input type="text" name="r42" size="20" id="DiTypes" required onchange="textValidation(id)" value="<%=e1[3].getTypes()%>">  </td>    
                        <td> <input type="text" name="r43" size="8" id="DiParticular" required onchange="textValidation(id)" value="<%=e1[3].getParticular()%>">    </td>
                        <td> <input type="text" name="r44" size="14" id="DiTime" required onchange="textValidation(id)" value="<%=e1[3].getTime_spend()%>">   </td>
                                             
                </tr>
                 <tr class="tableTxt">
                    <td>  <input type="text" name="r51" size="5" id="DiDate" required onchange="textValidation(id)" value="<%=e1[4].getDis_date()%>">  </td>    
                     <td>  <input type="text" name="r52" size="20" id="DiTypes" required onchange="textValidation(id)"  value="<%=e1[4].getTypes()%>">  </td>    
                        <td> <input type="text" name="r53" size="8" id="DiParticular" required onchange="textValidation(id)" value="<%=e1[4].getParticular()%>">    </td>
                        <td> <input type="text" name="r54" size="14" id="DiTime" required onchange="textValidation(id)" value="<%=e1[4].getTime_spend()%>">   </td>
                                             
                </tr>
            </table>
        </fieldset>
        <div>
            <% if(f==1)
                             {%>   
             <input type="submit" value="Insert" class="submit_btn">
             <%} 
               else
                 {%>
            <input type="submit" value="Update" class="submit_btn">
            <%}%>
            <input type="button" value="Logout" class="reset_btn" onclick="document.location='index.jsp'">
            <input type="button" value="ViewTimeTable" class="reset_btn" onclick="document.location='ViewTimeTable.jsp'">
            
        </div>
       
        </form>
    </body>
</html>
