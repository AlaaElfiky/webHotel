/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alaa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.test2;
/**
 *
 * @author snow
 */
public class mess_serv extends HttpServlet {

    
   

  

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      message me =new message();
      me.setName(request.getParameter("p1"));
      me.setMail(request.getParameter("p2"));
      me.setMessage(request.getParameter("tt"));
      
    
      test2 t2= new test2();
      t2.insert(me);
      response.sendRedirect("contacts.html");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
