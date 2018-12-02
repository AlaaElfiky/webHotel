package alaa;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class test {
              ///////////////////////// insert table_tourist ///////////////////
    
    public  void add(tourist t) {
        Session obg = NewHibernateUtil.getSessionFactory().openSession();
        try {
            obg.beginTransaction();

            obg.save(t);
            obg.getTransaction().commit();

        } catch (HibernateException e) {
           // obg.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            obg.close();
        }
    } 
    
 
    

                     //////////// select for log_in //////////////////////
    String password;
  
        public String select(String email ) {
     
            SessionFactory s =NewHibernateUtil.getSessionFactory();
            Session ss =s.openSession();
            Transaction tx =ss.beginTransaction();
       
            try
            {
                
                tourist o = new tourist();
             
       
               o =  (tourist) ss.get(tourist.class,email );
             
      
                    password= o.getPassword();
      
           
 
           tx.commit();
           
            }catch(Exception x)
                
            {
                
                tx.rollback();
            }
            finally{ss.close();}
           
       return password;
       
    } 
        //////////////////////////////////////
 public int select_id(int pass ) {
     int  id=0;
            SessionFactory s =NewHibernateUtil.getSessionFactory();
            Session ss =s.openSession();
            Transaction tx =ss.beginTransaction();
       
            try
            {
                
               regist o = new regist();
             
       
               o =  (regist) ss.get(regist.class,pass );
             
      
                   id= o.getId();
      
           
 
           tx.commit();
           
            }catch(Exception x)
                
            {
                
                tx.rollback();
            }
            finally{ss.close();}
           
       return id;
       
    } 
 ///////////////////////////////////

 
public regist select_regist(int pass ) {
      regist r=new regist();
            SessionFactory s =NewHibernateUtil.getSessionFactory();
            Session ss =s.openSession();
            Transaction tx =ss.beginTransaction();
       
            try
            {
                
               regist o = new regist();
             
       
               o =  (regist) ss.get(regist.class,pass );
             
      
                   r.setId(o.getId());
                   r.setName(o.getName());
                   r.setAddress(o.getAddress());
                   r.setCinema(o.getCinema());
                   r.setMail(o.getMail());
                   r.setPhone(o.getPhone());
                   r.setTrip(o.getTrip());
                   
      
           
 
           tx.commit();
           
            }catch(Exception x)
                
            {
                
                tx.rollback();
            }
            finally{ss.close();}
           
       return r;
       
    } 
////////////////////////// select for message ////////////////////////
             static String mess;
          public String select_mess(int pass ) {
     
            SessionFactory s =NewHibernateUtil.getSessionFactory();
            Session ss =s.openSession();
            Transaction tx =ss.beginTransaction();
       
            try
            {
                
                message o = new message();
             
       
               o =  (message) ss.get(message.class,pass );
             
      
                    mess= o.getMessage();
      
           
 
           tx.commit();
           
            }catch(Exception x)
                
            {
                
                tx.rollback();
            }
            finally{ss.close();}
           
       return mess;
       
    }   
          ///////////////////////////// delete from trips ////////////////////
          
           
          public void delete_trip(regist pass ) {
     
            SessionFactory s =NewHibernateUtil.getSessionFactory();
            Session ss =s.openSession();
            Transaction tx =ss.beginTransaction();
       
            try
            {
                
              ss.delete(pass);
 
           tx.commit();
           
            }catch(Exception x)
                
            {
                
                tx.rollback();
            }
            finally{ss.close();}
           
     
       
    }

 
    
}
