 

package alaa;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class employee {
    
       static PreparedStatement state ;
          ArrayList<String> l ;
 public ArrayList<String> select(){
 
  
      
           try {
               Class.forName("com.mysql.jdbc.Driver");
               System.out.println("driver loaded");
               
               Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123" );
               System.out.println("database conected");
               
//               state = connect.prepareStatement("insert into account (username,password,balance)values ('salem','elfiky',5000)");
//               state.executeUpdate();
    state = connect.prepareStatement(" SELECT * FROM test.emp ");
        ResultSet result = state.executeQuery();
          l = new ArrayList<>();

    
        while (result.next()){
   
      l.add(result.getString(1));
    
        }
             
  
   connect.close();
               
 
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
           }
    
    
 return l ;
 } 
 
 
 
 
}
