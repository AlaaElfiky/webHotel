 

package alaa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author snow
 */
public class insert_servelet extends HttpServlet {
 
   
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           
                 String s1 = request.getParameter("username");
                 String s2 = request.getParameter("password");
                 String s3 = request.getParameter("email");
                 String s4 = request.getParameter("phone");
                 String s5 = request.getParameter("nationality");
                 String s6 = request.getParameter("address");
       
        
        
        
        
        
             tourist obg = new tourist(s1, s2, s3, s4, s5, s6);
             test obj = new test();
             obj.add(obg);
             HttpSession session = request.getSession(true);
     request.setAttribute("Message", "Registed successfuly");
     response.sendRedirect("about_trip.jsp");   
     
     
   
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
