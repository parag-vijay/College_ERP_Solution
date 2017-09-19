

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javap.Student_record;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;


public class Connection1 {

    
    public static void main(String[] args) {
       List<javap.Student_record> lt=new ArrayList<javap.Student_record>();
       Student_record e=new Student_record();
       int f=0;
   try {
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Student_record.class).buildSessionFactory();
Session s=sf.openSession(); 
Transaction tx=s.beginTransaction();
       System.out.println("hello");
Criteria c1 = s.createCriteria(javap.Student_record.class);
c1.add(Restrictions.eq("username", "0827IT111058"));
lt=c1.list();
if(lt.isEmpty())
    
           System.out.println("kello");

//if(lt.isEmpty())
//     { 
//    e=new Student_record();
//    e.setUsername("0827IT111058");
//    s.save(e);
//     f=1;
//    }

Iterator t=lt.iterator();
       System.out.println("fello");
e=(Student_record)t.next();
    System.out.println(e.getName());
   // System.out.println(e.getDate_of_birth());
    System.out.println(e.getEnrollment_no());
    System.out.println(e.getUsername());
    System.out.println(e.getC_email());
    System.out.println(e.getP_email());
       System.out.println("ssssss"+e.getSibling3());
 
tx.commit();
s.close();
}
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }

    }
}
