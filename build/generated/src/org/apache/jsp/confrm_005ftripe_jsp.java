package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utility.trip_dbase;

public final class confrm_005ftripe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("    <title>Conf </title>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Fullscreen Login</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/home.css\">\n");
      out.write("        <script src=\"html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"respond.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/supersized.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background:url(assets/img/p.jpg) fixed center center ;background-repeat:no-repeat;background-size: cover\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"page-container1\" style=\"height: 100%; width: 60%;margin: auto ;background:rgba(0,0,0,.6) ;border: none\">\n");
      out.write("            <h1 style=\"font-style: italic ;font-size: 50px ; margin: auto;margin-top: 100px;\">welcome to Remaa</h1>\n");
      out.write("             <form action=\"conf_regist\" method=\"post\" >\n");
      out.write("                 <input placeholder=\"E-mail\" name=\"email\" type=\"text\" value=\"");
      out.print(session.getAttribute("email"));
      out.write("\"style=\"border-radius: 2px;border: 2px solid #fcffc1;padding-right:45px\"><br>\n");
      out.write("                 <input placeholder=\"Trip name\" name=\"name\" type=\"text\" style=\"border-radius: 2px;border: 2px solid #fcffc1;padding-right:45px\"><br>\n");
      out.write("                 <input placeholder=\"Bander\" type=\"text\" name=\"num\" style=\"border-radius: 2px;border: 2px solid #fcffc1;padding-right:45px\"><br> \n");
      out.write("                 <input placeholder=\"price\" type=\"text\" name=\"money\" style=\"border-radius: 2px;border: 2px solid #fcffc1;padding-right:45px\"><br> \n");
      out.write("\n");
      out.write("           \n");
      out.write("                <button type=\"submit\" class=\"reg\" >Reserve</button>\n");
      out.write("\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <div class=\"error\"><span>+</span></div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Javascript -->\n");
      out.write("        <script src=\"assets/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/supersized.3.2.7.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/supersized-init.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("                function valid() {\n");
      out.write("                    if (document.fo.user.value.length < 1) {\n");
      out.write("                        alert(\"Please Enter user name\");\n");
      out.write("\n");
      out.write("                        return  false;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                    if (document.fo.pass.value.length < 1) {\n");
      out.write("                        alert(\" Please Enter password\");\n");
      out.write("\n");
      out.write("                        return  false;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("    </script>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
