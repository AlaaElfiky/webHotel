 

package alaa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class empServlet extends HttpServlet {

  
 

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
   if(request.getParameter("search").equals("hotels")){
     response.sendRedirect("news.html");
      if(request.getParameter("search").equals("places")){
     response.sendRedirect("products.html");
     } if (request.getParameter("search").equals("trip")){ response.sendRedirect("services.html"); }}
     else{ response.sendRedirect("index.html"); }
  }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    } 

}
