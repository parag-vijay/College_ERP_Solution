


import java.text.SimpleDateFormat;
import javap.Acedemic_record;
import javap.Compitive_exam;
import javap.Higher_study;
import javap.Placement1;
import javap.Student_record;
import javap.Training_certificate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Debugg {
    public static void main(String[] args) {
        try {
           
            String pa="0827IT111058";
                  float f=0.0f;
                  double d=0;
                  int i=0;
                  
                  SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    System.out.println("hello");
                                    Transaction tx=s.beginTransaction();
                                    System.out.println("1");
                                   
                                    Student_record sr= (Student_record) s.get(Student_record.class, pa);
                                       sr.setEx_anchoring("anchoring");  
                                       sr.setEx_dancing("dancing");
                                       sr.setEx_debate("debate");
                                       sr.setEx_instrument("instrument");
                                       sr.setEx_name_of_instrument("ins_name");
                                       sr.setEx_painting("painting");
                                       sr.setEx_remark("ex_remark");
                                       sr.setEx_singing("singing");
                                       sr.setSpo_Basketball("Basketball");
                                       sr.setSpo_Carom("Carom");
                                       sr.setSpo_Cricket("Cricket");
                                       sr.setSpo_Football("Football");
                                       sr.setSpo_Kho_Kho("Kho-Kho");
                                       sr.setSpo_Softball("Softball");
                                       sr.setSpo_TT("TT");
                                       sr.setSpo_other("sp_other");
                                       sr.setSpo_remark("sp_remark");
                                       sr.setAfter_graduation("graduation");
                                       sr.setE_read("read");
                                       sr.setE_speak("speak");
                                       sr.setE_understand("understand");
                                       sr.setE_write("write");
                                       sr.setL_goal("lgoal");
                                       sr.setS_goal("sgoal");
                                       s.saveOrUpdate(sr);
                                    System.out.println("4");
                                       tx.commit();
                                        s.close();
                  
                                           
                  
                                     
        }
        catch(Exception e){
                                            System.out.println(e.getMessage());
                                        }   
    }
}
