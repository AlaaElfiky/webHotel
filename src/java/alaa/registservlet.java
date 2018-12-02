 

package alaa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.test2;
 
public class registservlet extends HttpServlet {
    
  

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
       test t2=new test();
       int id=Integer.parseInt(request.getParameter("t0"));
        System.out.println(t2.select_id(id)+"******"); 
       if(t2.select_id(id)<1){
            regist re=new regist();
       
       re.setId(Integer.parseInt(request.getParameter("t0")) );
       re.setName(request.getParameter("t1"));
       re.setMail(request.getParameter("t2"));
       re.setAddress(request.getParameter("t3"));
       re.setPhone(request.getParameter("t4"));
       re.setCinema(request.getParameter("cinema"));
       re.setTrip(request.getParameter("trips"));
       
 
      test2 t = new test2();
      t.addd(re);
 
       response.sendRedirect("services.html");
       }else{
       response.sendRedirect("valid_register.jsp");
           
       }
       
       
       
       
      
        
    }
 
}
