package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import alaa.test;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>BOX</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylenew.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.6.min.js\"></script>\n");
      out.write("        <script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/Open_Sans_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/Open_Sans_Light_300.font.js\" type=\"text/javascript\"></script> \n");
      out.write("        <script src=\"js/Open_Sans_Semibold_600.font.js\" type=\"text/javascript\"></script> \n");
      out.write("        <script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page5\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"bg\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"row-1\">\n");
      out.write("                        <h1>\n");
      out.write("                            <a class=\"logo\" href=\"index.html\">REMAA.<span>co</span></a>\n");
      out.write("                            <strong class=\"slog\">Welcome Our Web Site</strong>\n");
      out.write("                        </h1>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </header>\n");
      out.write("                <!-- content --><div class=\"ic\">More Website Templates  at TemplateMonster.com!</div>\n");
      out.write("                <section id=\"content\">\n");
      out.write("                    <div class=\"padding\">\n");
      out.write("                        <div class=\"wrapper margin-bot\">\n");
      out.write("                            <div class=\"col-3\">\n");
      out.write("                                <div class=\"indent\">\n");
      out.write("                                    <h2 class=\"p0\">Contact Form</h2>\n");
      out.write("                                    <form id=\"contact-form\" action=\"Main_servlet\" method=\"post\">\t\t\t\t\t\n");
      out.write("                                        <fieldset>\n");
      out.write("\n");
      out.write("                                            <div class=\"wrapper\"><div class=\"text-form\">Message:</div><textarea name=\"t\">     \n");
      out.write("                                                                                    \n");
      out.write("                                                    ");
      out.print(session.getAttribute("t"));
      out.write("\n");
      out.write("                                                                                    \n");
      out.write("                                                </textarea></div>\n");
      out.write("                                            <input type=\"text\" name=\"sys_date\" class=\"username\" placeholder=\"Next message_id \" style=\"margin-bottom: 20px;margin-left:  75px;margin-top: 10px\" >\n");
      out.write("                                            <div class=\"buttons\">\n");
      out.write("                                                <button type=\"submit\"  class=\"button-2 btn btn-primary \"name=\"send\">show</button>\n");
      out.write("                                                <button type=\"reset\"  class=\"button-2 btn btn-primary \"name=\"send\"> clear</button>\n");
      out.write("\n");
      out.write("                                            </div>\t\t\t\t\t\t\t\t\t\t \n");
      out.write("                                        </fieldset>\t\t\t\t\t\t\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <div class=\"block-news\">\n");
      out.write("                                    <h3 class=\"color-4 indent-bot2\">Contacts</h3>\n");
      out.write("                                    <dl class=\"contact p3\">\n");
      out.write("                                        <dt><span>Our Address:</span>Egypt</dt>\n");
      out.write("                                        <dd><span>Telephone:</span>010-19309352</dd>\n");
      out.write("                                        <dd><span>E-mail:</span><a href=\"#\">mohd@yahoo.com</a></dd>\n");
      out.write("                                    </dl>\n");
      out.write("                                    <h3 class=\"color-4 indent-bot2\">Welcome</h3>\n");
      out.write("                                    <p class=\"text-1\">We Are Ready To Solve Any Problem Faced you and You are Welcom In Our Web Site<br>Contact Us.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"box-bg\">\n");
      out.write("                            <div class=\"wrapper\">\n");
      out.write("                                <div class=\"col-1\">\n");
      out.write("                                    <div class=\"box first\">\n");
      out.write("                                        <div class=\"pad\">\n");
      out.write("                                            <div class=\"wrapper indent-bot\">\n");
      out.write("                                                <strong class=\"numb img-indent2\">01</strong>\n");
      out.write("                                                <div class=\"extra-wrap\">\n");
      out.write("                                                    <h3 class=\"color-1\"><strong>cancel</strong>trip</h3>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("                                                <form action=\"Main_servlet\" method=\"get\">\n");
      out.write("                                                    <input type=\"hidden\" id=\"bb\" name=\"hh\" >\n");
      out.write("                                                    <button  onclick=\"cv()\" class=\"button img-indent-r\" type=\"submit\"></button>\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <!-- footer -->\n");
      out.write("                <script>\n");
      out.write("                    function cv() {\n");
      out.write("                        var x = window.prompt('Enter the message Id ');\n");
      out.write("                        document.getElementById('bb').value = x;\n");
      out.write("\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("                <footer>\n");
      out.write("                    <div class=\"row-top\">\n");
      out.write("                        <div class=\"row-padding\">\n");
      out.write("                            <div class=\"wrapper\">\n");
      out.write("                                <div class=\"col-1\">\n");
      out.write("                                    <h4>Address:</h4>\n");
      out.write("                                    <dl class=\"address\">\n");
      out.write("                                        <dt><span>Country:</span>Egypt</dt>\n");
      out.write("                                        <dd><span>City:</span>shebin Elkom</dd>\n");
      out.write("                                        <dd><span>Address:</span>fci</dd>\n");
      out.write("                                        <dd><span>Email:</span><a href=\"#\">lcenter@mail.com</a></dd>\n");
      out.write("                                    </dl>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-2\">\n");
      out.write("                                    <h4>Follow Us:</h4>\n");
      out.write("                                    <ul class=\"list-services\">\n");
      out.write("                                        <li class=\"item-1\"><a href=\"#\">Facebook</a></li>\n");
      out.write("                                        <li class=\"item-2\"><a href=\"#\">Twitter</a></li>\n");
      out.write("                                        <li class=\"item-3\"><a href=\"#\">LinkedIn</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-3\">\n");
      out.write("                                    <h4>Our Group:</h4>\n");
      out.write("                                    <ul class=\"list-1\">\n");
      out.write("                                        <li><a href=\"#\">mohamed Alalkamy </a></li>\n");
      out.write("                                        <li><a href=\"#\">Alaa Mahmoud</a></li>\n");
      out.write("                                        <li><a href=\"#\">essam Gorab</a></li> \n");
      out.write("                                        <li><a href=\"#\">Reda Meky</a></li>\n");
      out.write("                                        <li><a href=\"#\">Abdelrahman Mosa</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <div class=\"indent3\">\n");
      out.write("                                        <strong class=\"footer-logo\">REMA.<strong>co</strong></strong>\n");
      out.write("                                        <strong class=\"phone\"><strong>Tell Free:</strong> 01019309352</strong>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\"> Cufon.now();</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
