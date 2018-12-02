package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class valid_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">  \n");
      out.write("    <head>\n");
      out.write("        <!--fixed-->\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register1.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main\">\n");
      out.write("            <section class=\"user center-block\">\n");
      out.write("                <div class=\"fields\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h1 >Register Now</h1>\n");
      out.write("                        <p > You Are Welcome In <span>REMAA.<span>co</span></span></p>\n");
      out.write("\n");
      out.write("                        <form action=\"registservlet\" method=\"post\" name=\"form1\" onsubmit=\"return valid()\">\n");
      out.write("                            <div class=\"col-md-6 \">\n");
      out.write("                                \n");
      out.write("                                 <div class=\"form-group \">\n");
      out.write("                                     <input type=\"text\"  id=\"id\" class=\"form-control input-lg\" name=\"t0\" placeholder=\" this id is al_ready exist enter another\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group \">\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"t1\" placeholder=\" Enter Your Name\">\n");
      out.write("                                 </div>\n");
      out.write("                                <div class=\"form-group \">\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"t2\" placeholder=\" Enter Your E-mail\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"t3\" placeholder=\" Enter Your Address\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"t4\" placeholder=\" Enter Your Phone\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div  style=\"margin-top: 100px \">\n");
      out.write("                                <style> \n");
      out.write("                                    select.ss{\n");
      out.write("                                        width:48%;\n");
      out.write("                                    }\n");
      out.write("                                </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <select   name=\"trips\" class=\"ss\" style=\"margin-top: 300px\" > \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <option>Sharm Elshik</option>\n");
      out.write("                                    <option>Alexandria</option>\n");
      out.write("                                    <option>Matrooh</option>\n");
      out.write("                                    <option>Elgouna</option>\n");
      out.write("                                    <option>Balteem</option>\n");
      out.write("                                    <option>aswan</option>\n");
      out.write("                                    <option>luexor</option>\n");
      out.write("                                    <option>huergada</option>\n");
      out.write("                                    <option>marina</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"bb\" style=\"margin-top: 40px\">\n");
      out.write("                                <button type=\"submit\" class= \"btn btn-primary btn-lg btn-block \" style=\"font-weight: bold\">Register Now</button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>       \n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("            function  valid(){\n");
      out.write("            if(document.form1.id.value.length<1){\n");
      out.write("                alert(\"Enter you id\");\n");
      out.write("                return false;services\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("    }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
