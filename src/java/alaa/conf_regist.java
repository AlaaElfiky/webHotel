 

package alaa;

import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import utility.films_dbase;
import utility.trip_dbase;

/**
 *
 * @author snow
 */
public class conf_regist extends HttpServlet {

   

    

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session=request.getSession(true);
            String c1 = request.getParameter("email");
            String c2 = request.getParameter("film");
           
            
            
            films_dbase ob = new films_dbase();
            ob.insert_film(c1, c2);
             session.setAttribute("Message","Your request is done ");
                  response.sendRedirect("user_response.jsp");
        } catch (ClassNotFoundException ex) {
          ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession(true);
        try {
            String x1 = request.getParameter("email");
            String x2 = request.getParameter("name");
            
            
            trip_dbase obj = new trip_dbase();
            obj.insert(x1, x2);
            session.setAttribute("Message","Your request is done ");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
              ex.printStackTrace();
        }
     response.sendRedirect("user_response.jsp");
 
    }

   
 

}
