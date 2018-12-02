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
import utility.films_dbase;

/**
 *
 * @author snow
 */
public class add_films extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession(true);

            String film_name = request.getParameter("film_name");
            String view_date = request.getParameter("view_date");
            String film_path = request.getParameter("film_path");
            String  price    = request.getParameter("price");

            films_dbase film = new films_dbase();
            film.add_film(film_name, view_date,film_path , price);

            session.setAttribute("Message", "A new film is added");
            response.sendRedirect("Message_admin.jsp");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
