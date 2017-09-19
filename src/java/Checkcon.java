import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

public class Checkcon {
    public static void main(String str[])
    {
        List<Check> lt=new ArrayList<Check>();
       Check e=new Check();
       int f=0;
   try {
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(Check.class).buildSessionFactory();
Session s=sf.openSession(); 
Transaction tx=s.beginTransaction();
       System.out.println("hello");
Criteria c1 = s.createCriteria(Check.class);
c1.add(Restrictions.eq("s_no",1));
lt=c1.list();
if(lt.isEmpty())
    
           System.out.println("kello"); 
Iterator t=lt.iterator();
       System.out.println("fello");
e=(Check)t.next();
    System.out.println(e.getName());
   // System.out.println(e.getDate_of_birth());
    System.out.println(e.getS_no());
    System.out.println(e.getMobile());
    
 
tx.commit();
s.close();
}
catch(Exception ex) {
        System.out.println(ex.getMessage());
         }

    }
}
