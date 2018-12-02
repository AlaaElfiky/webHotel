package alaa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NewServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   HttpSession session=request.getSession(true);
        String s1 = request.getParameter("email");
        String s2 = request.getParameter("password");
        String s3 = request.getParameter("cinema");

        test b = new test();
        String s = b.select(s1);
        employee e = new employee();
         
        if (s3.equals("Tourist")) {
            if (s2.equals(s)) {
                session.setAttribute("email",s1);
              
                response.sendRedirect("about_trip.jsp");
                
            } else {
                response.sendRedirect("log_in.jsp");
            }
        } else if (s3.equals("Employee")) {
           
                
            
            for (int i = 0; i < e.select().size(); i++) {
                if (s2.equals(e.select().get(i))) {
                 session.setAttribute("email",s1);
                    response.sendRedirect("Admin.jsp");
                }  
            }
        
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
