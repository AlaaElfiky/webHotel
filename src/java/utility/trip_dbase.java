package utility;

import Entity.films;
import Entity.registed_trip;
import Entity.trip;
import Entity.message;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
 

public class trip_dbase {

    static PreparedStatement state;
     ArrayList<String> list ;
   
    /**
     *
     * @param args
     */
    public static void main(String[] args)  {

    }
    // id, date, mail, message, name
            public ArrayList<message>select_inbox() throws SQLException {
           ArrayList<message> li = new ArrayList<>() ;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

            state = connect.prepareStatement(" SELECT name,mail,message FROM contact ");
            ResultSet result = state.executeQuery();
       
            try {
                  
                while (result.next()){
                  message re = new message();
                   re.setName(result.getString("name"));
                   re.setE_mail(result.getString("mail"));
                   re.setMessage_to(result.getString("message"));
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
    
    // id, tourism_email, trip_name, num
        public ArrayList<registed_trip>select_regigt() throws SQLException {
           ArrayList<registed_trip> l = new ArrayList<>() ;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

            state = connect.prepareStatement(" SELECT tourism_email, trip_name FROM trip_tourism ");
            ResultSet result = state.executeQuery();
       
            try {
                  
                while (result.next()){
                  registed_trip re = new registed_trip();
                   re.setTourism_email(result.getString("tourism_email"));
                   re.setTrip_name(result.getString("trip_name"));
                  
                   l.add(re);
                }
                
                
            } catch (RuntimeException e) {
                System.out.println("error describtion>>>" + e.getMessage());
            } finally {
                connect.close();
            }
          
 
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
         
return l;
    }

    public ArrayList<trip> select() throws SQLException {
           ArrayList<trip> listt = new ArrayList<>() ;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

            state = connect.prepareStatement(" SELECT trip_name, trip_date, trip_path, limit_num, finish_date, about  FROM trips ");
            ResultSet result = state.executeQuery();
         //trip_name, trip_date, trip_path, limit_num, finish_date, about
            try {
                  
                while (result.next()){
                    trip t=new trip();
                   t.setTrip_name(result.getString("trip_name"));
                   t.setTrip_date(result.getString("trip_date"));
                   t.setTrip_path(result.getString("trip_path"));
                   t.setLimit_num(result.getInt("limit_num"));
                   t.setFinish_date(result.getString("finish_date"));
                   t.setAbout(result.getString("about"));
                  
                   listt.add(t);
                   
        
                }
                
                
            } catch (RuntimeException e) {
                System.out.println("error describtion>>>" + e.getMessage());
            } finally {
                connect.close();
            }
          
 
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
         
return listt;
    }
//    film_name, view_date, path, price
     public ArrayList<films> select_flim() throws SQLException {
           ArrayList<films> listtt = new ArrayList<>() ;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

            state = connect.prepareStatement(" SELECT film_name, view_date, path, price  FROM cinema ");
            ResultSet result = state.executeQuery();
         //trip_name, trip_date, trip_path, limit_num, finish_date, about
            try {
                  
                while (result.next()){
                    films t=new films();
                   t.setFilm_name(result.getString("film_name"));
                   t.setView_date(result.getString("view_date"));
                   t.setPath(result.getString("path"));
                   t.setPrice(result.getString("price"));
                   listtt.add(t);   
        
                }
                
                
            } catch (RuntimeException e) {
                System.out.println("error describtion>>>" + e.getMessage());
            } finally {
                connect.close();
            }
          
 
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
         
return listtt;
    }
    
    public String update (String trip_name,String  trip_date ,String trip_path  ,int limit_num,String finish_date,String about) throws ClassNotFoundException, SQLException{
    
         
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

    state = connect.prepareStatement("UPDATE test.trips SET trip_name='"+trip_name+"',trip_date='"+trip_date+"',trip_path='"+trip_path+"',limit_num="+limit_num+","
            + "finish_date='"+finish_date+"',about='"+about+"' WHERE trip_name='"+trip_name+"';");
   int x =   state.executeUpdate();
          
      connect.close();
                
     
          
 return "Rows Updated";
          
    }
    //id, tourism_email, trip_name
        public void insert (String tourism_email, String trip_name  ) throws ClassNotFoundException, SQLException{
    
         
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

    state = connect.prepareStatement("insert into trip_tourism (tourism_email,trip_name) values (?,?)");
    state.setString(1,tourism_email);
    state.setString(2,trip_name);
  
    state.executeUpdate();
          
      connect.close();
                
     
          
 
          
    }
        ////, trip_date, trip_path, limit_num, finish_date, about
                public String insert_trip (String trip_name,String  trip_date ,String trip_path  ,int limit_num,String finish_date,String about) throws ClassNotFoundException, SQLException{
    
         
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");

    state = connect.prepareStatement("insert into trips (trip_name, trip_date, trip_path, limit_num, finish_date, about) values (?,?,?,?,?,?)");
    state.setString(1,trip_name);
    state.setString(2,trip_date);
    state.setString(3,trip_path);
    state.setInt(4,limit_num);
    state.setString(5,finish_date);
    state.setString(6,about);
    state.executeUpdate();
          
      connect.close();

          return "Successfuly Added";
    }
              public void delete(String name){
                  
                  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");
            
            state = connect.prepareStatement("DELETE FROM test.trips WHERE trip_name='"+name+"';");
            state.executeUpdate();
            connect.close();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();        
        }
                  
              
              }
                    public void cancel(String name,String email){
                  
                  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
            System.out.println("database conected");
            
            state = connect.prepareStatement("DELETE FROM trip_tourism WHERE tourism_email='"+email+"' and trip_name='"+name+"';");
            state.executeUpdate();
            connect.close();
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();        
        }
                  
              
              }
        
        
    
    }
    


