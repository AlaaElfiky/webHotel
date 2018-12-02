package alaa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utility.films_dbase;
import utility.trip_dbase;

/**
 *
 * @author snow
 */
public class update_film extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String s = request.getParameter("film_name");
        films_dbase fil = new films_dbase();
        fil.delete_film(s);
        session.setAttribute("Message", "film is deleted");
        response.sendRedirect("Message_admin.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession(true);

            String film_name = request.getParameter("film_name");
            String view_date = request.getParameter("view_date");
            String film_path = request.getParameter("film_path");
            String price = request.getParameter("price");
            films_dbase f = new films_dbase();
            f.update_film(film_name, view_date, film_path, price);

            session.setAttribute("Message", "rows are updated");
            response.sendRedirect("Message_admin.jsp");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
