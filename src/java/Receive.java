
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javap.Acedemic_record;
import javap.Admision_detail;
import javap.Compitive_exam;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Receive {
    public static void main(String[] args) {
                             List<javap.Admision_detail> lt1=new ArrayList<Admision_detail>();
     Admision_detail e1=new Admision_detail();
     int f=0;
   try {
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Admision_detail.class).buildSessionFactory();
 Session s=sf.openSession(); 
Transaction tx1=s.beginTransaction();
Query q1=s.createQuery("from javap.Admision_detail where user_name='0827IT111058'");
lt1=q1.list();

if(lt1.isEmpty())
     { 
    e1=new Admision_detail();
     e1.setUser_name("0827IT111058");
     s.save(e1);
     f=1;
    }
else{
Iterator t1=lt1.iterator();   
e1=(Admision_detail)t1.next();
} 
tx1.commit();
s.close();
  }
catch(Exception ex) {
        System.out.println(ex);
         }
    
}
}
