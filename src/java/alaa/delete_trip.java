/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alaa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utility.trip_dbase;

/**
 *
 * @author snow
 */
public class delete_trip extends HttpServlet {
 
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               HttpSession session = request.getSession(true);
        String name = request.getParameter("trip_name");
        String email = request.getParameter("email");
        trip_dbase dd = new trip_dbase();
        dd.cancel(name,email);
        session.setAttribute("Message", "Your request is done");
        response.sendRedirect("Message_admin.jsp");
      
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String name = request.getParameter("trip_name");
        trip_dbase d = new trip_dbase();
        d.delete(name);
        session.setAttribute("Message", "Trip is deleted ");
        response.sendRedirect("Message_admin.jsp");
  
    }
 
}
