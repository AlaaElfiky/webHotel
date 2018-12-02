/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaa;

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
import utility.trip_dbase;

/**
 *
 * @author snow
 */
public class Add_trip extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        try {
            HttpSession session = request.getSession(true);
            //, trip_date, trip_path, limit_num, finish_date, about
            String trip_name = request.getParameter("trip_name");
            String trip_date = request.getParameter("trip_date");
            String trip_path = request.getParameter("trip_path");
            int limit_num = Integer.parseInt(request.getParameter("limit_num"));
            String finish_date = request.getParameter("finish_date");
            String about = request.getParameter("about");
            trip_dbase d = new trip_dbase();
            session.setAttribute("Message", d.insert_trip(trip_name, trip_date, trip_path, limit_num, finish_date, about));
            response.sendRedirect("Message_admin.jsp");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession(true);

            String trip_name = request.getParameter("trip_name");
            String trip_date = request.getParameter("trip_date");
            String trip_path = request.getParameter("trip_path");
            int limit_num = Integer.parseInt(request.getParameter("limit_num"));
            String finish_date = request.getParameter("finish_date");
            String about = request.getParameter("about");
            trip_dbase da = new trip_dbase();
           session.setAttribute("Message",da.update(trip_name, trip_date, trip_path, limit_num, finish_date, about));
           response.sendRedirect("Message_admin.jsp");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
