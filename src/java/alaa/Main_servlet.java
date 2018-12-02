/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alaa;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;

 
public class Main_servlet extends HttpServlet {

 
 

  
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {// TODO Auto-generated method stub

    int value = Integer.parseInt(request.getParameter("hh"));
    
    test tes = new test();
    regist r=tes.select_regist(value);
  tes.delete_trip(r);
   response.sendRedirect("newjsp.jsp");

}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        test te = new test();
    int value =Integer.parseInt( request.getParameter("sys_date"));
     PrintWriter out = response.getWriter();
    String x =  te.select_mess(value);
        HttpSession s = request.getSession();
        s.setAttribute("t", x);
        response.sendRedirect("newjsp.jsp");
        
   out.print(x);
    }

 

}
