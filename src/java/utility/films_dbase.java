 

package utility;

import Entity.films;
import alaa.message;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static utility.trip_dbase.state;

 
public class films_dbase {
    
    public static void main(String[] args) {

    }
      //  film_name, view_date, path, price
     public ArrayList<films>select_films() throws SQLException {
           ArrayList<films> li = new ArrayList<>() ;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

            state = connect.prepareStatement(" SELECT film_name,view_date,price FROM cinema ;");
            ResultSet result = state.executeQuery();
       
            try {
                  
                while (result.next()){
                  films re = new films();
                   re.setFilm_name(result.getString("film_name"));
                   re.setView_date(result.getString("view_date"));
                   re.setPrice(result.getString("price"));
                   
                   li.add(re);
                }
                
                
            } catch (RuntimeException e) {
                System.out.println("error describtion>>>" + e.getMessage());
            } finally {
                connect.close();
            }
          
 
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
         
return li;
    }
               ///////////////////////////////// delete trip //////////////////////////
                   public void delete(String name){
                  
                  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");
            
            state = connect.prepareStatement("DELETE FROM test.trip_tourism WHERE trip_name='"+name+"';");
            state.executeUpdate();
            connect.close();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();        
        }
                  
              
              }           ////////////////tourist  reserve film //////////////////////////////
                   
                           public void insert_film (String email, String film ) throws ClassNotFoundException, SQLException{
    
         
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

    state = connect.prepareStatement("insert into test.film_tourism (tourism_email,film_name) values (?,?);");
    state.setString(1,email);
    state.setString(2,film);
    
    state.executeUpdate();
          
      connect.close();
                
     
          
 
          
    }  //////////////////////////   add new film ////////////////////////////
                           //film_name, view_date, path, price
                           
            public void add_film (String film_name, String view_date ,String path,String price) throws ClassNotFoundException, SQLException{
    
         
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

    state = connect.prepareStatement("insert into test.cinema (film_name,view_date,path,price) values (?,?,?,?);");
    state.setString(1,film_name);
    state.setString(2,view_date);
    state.setString(3,path);
    state.setString(4,price);
    
    state.executeUpdate();
          
      connect.close();
                
     
          
 
          
    } ////////////////////////////   update films ////////////////////////////////
            
                public void update_film (String film_name,String  view_date ,String film_path,String price) throws ClassNotFoundException, SQLException{
    
         
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

    state = connect.prepareStatement("UPDATE test.cinema SET film_name='"+film_name+"',view_date='"+view_date+"',path='"+film_path+"',price='"+price+"' WHERE film_name='"+film_name+"';");
             
    state.executeUpdate();
          
      connect.close();
                
     
          

          
    }
                           ///////////////////////////////// delete film //////////////////////////
                   public void delete_film(String name){
                  
                  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");
            
            state = connect.prepareStatement("DELETE FROM test.cinema WHERE film_name='"+name+"';");
            state.executeUpdate();
            connect.close();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();        
        }
                  
              
              }        
                   
          //////////////////////////// cancel film regist //////////////////////////
                                       public void cancel_film(String name,String email){
                  
                  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");
            
            state = connect.prepareStatement("DELETE FROM film_tourism WHERE tourism_email='"+email+"' and film_name='"+name+"';");
            state.executeUpdate();
            connect.close();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();        
        }
                  
              
              }
                   
                   
                   
    
}
