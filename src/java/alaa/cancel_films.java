

package alaa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utility.films_dbase;

/**
 *
 * @author snow
 */
public class cancel_films extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        
        String s1 = request.getParameter("film_name");
        String s2 = request.getParameter("email");
        films_dbase f = new films_dbase();
        f.cancel_film(s1, s2);
        session.setAttribute("Message", "Your request is done");
        response.sendRedirect("Message_admin.jsp");
        
  
    }

}
