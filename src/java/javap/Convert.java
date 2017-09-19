
package javap;

import java.sql.*;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author lenovo
 */
public class Convert {
    public static int toInt(String s,int f)
    {
        if(s==null)
        {
            return f;
        }
        try{
            return Integer.valueOf(s).intValue();
        }
        catch(NumberFormatException n)
        {
            return f;
        }
    }
    
    public static float toFloat(String s,float f)
    {
        if(s==null)
        {
            return f;
        }
        try{
            return Float.valueOf(s).floatValue();
        }
        catch(NumberFormatException n)
        {
            return f;
        }
    }
     public static double toDouble(String s,double  f)
    {
        if(s==null)
        {
            return f;
        }
        try{
            return Double.valueOf(s).doubleValue();
        }
        catch(NumberFormatException n)
        {
            return f;
        }
    }
     public static Connection getCon()
     { Connection con = null;
         try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdata","root","root");
        
         }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          return con;
     }
     public static Connection getCon1()
     { Connection con = null;
         try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3307/timetable","root","root");
        
         }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          return con;
     }
     public static void insertRow(Placement1 p1)
     { 
         try{
         SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Placement1.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(p1);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          
     }
     public static void insertRows(List<Training_certificate> t)
     { 
         try{
         SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Training_certificate.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(t);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          
     }
      public static void insertRow(Cocurricular_activity c)
     { 
         try{
         SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Cocurricular_activity.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(c);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          
     }
       public static void insertRow(Acedemic_record a)
     { 
         try{
         SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Acedemic_record.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(a);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          
     }
        public static void insertRow(Compitive_exam c)
     { 
         try{
         SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Compitive_exam.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(c);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          
     }
         public static void insertRow(Disciplinary_Action d)
     { 
         try{
         SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Disciplinary_Action.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(d);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          
     }
          public static void insertRow(Previous_qualification p)
     { 
         try{
         SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Previous_qualification.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(p);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          
     }
          public static void insertRow(Strength st)
     { 
         try{
         SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Strength.class).buildSessionFactory();
                                    Session s=sf.openSession();
                                    Transaction tx=s.beginTransaction();
                                    s.save(st);
                                    s.flush();
                                    tx.commit();
                                    s.close();
                                    }
         catch(Exception e)
         {
             e.getMessage();
             
         }
          
     }
        
}
