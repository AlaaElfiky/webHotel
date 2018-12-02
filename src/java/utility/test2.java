 

package utility;

import alaa.NewHibernateUtil;
import alaa.message;
import alaa.regist;
import alaa.tourist;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
public class test2 { 
    
        //////////////////////// insert trips ////////////////
    
            public  void addd(regist re) {
        Session ob = utility.HibernateUtil.getSessionFactory().openSession();
        try {
            ob.beginTransaction();

            ob.save(re);
            ob.getTransaction().commit();

        } catch (HibernateException e) {
         
            e.printStackTrace();
        } finally {
            ob.close();
        }
    }

         ////////////////////////// insert message///////////////////////   
              public  void insert(message re) {
        Session obj = utility.HibernateUtil.getSessionFactory().openSession();
        try {
            obj.beginTransaction();

            obj.save(re);
            obj.getTransaction().commit();

        } catch (HibernateException e) {
          //  obj.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            obj.close();
        }
    }
              
              /////////////////////////// select message //////////////////////
                 String message;
  
        public String select(String me ) {
     
            SessionFactory s =utility.HibernateUtil.getSessionFactory();
            Session ss =s.openSession();
            Transaction tx =ss.beginTransaction();
       
            try
            {
                
             message m = new message();
             
       
               m =  (message) ss.get(message.class,me );
             
      
                    message= m.getMessage();
      
           
 
           tx.commit();
           
            }catch(Exception x)
                
            {
                
                tx.rollback();
            }
            finally{ss.close();}
           
       return message;
       
    }  
            
}
