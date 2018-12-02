package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class log_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>REMAA.CO</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\t <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/stylenew.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.6.min.js\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Open_Sans_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Open_Sans_Light_300.font.js\" type=\"text/javascript\"></script> \n");
      out.write("<script src=\"js/Open_Sans_Semibold_600.font.js\" type=\"text/javascript\"></script>  \n");
      out.write("<script type=\"text/javascript\" src=\"js/tms-0.3.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/tms_presets.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.easing.1.3.js\"></script> \n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--[if lt IE 7]>\n");
      out.write("\t<div style=' clear: both; text-align:center; position: relative;'>\n");
      out.write("\t\t<a href=\"http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode\"><img src=\"http://www.theie6countdown.com/images/upgrade.jpg\" border=\"0\"  alt=\"\" /></a>\n");
      out.write("\t</div>\n");
      out.write("<![endif]-->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/html5.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/ie.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<![endif]-->\n");
      out.write("<style>\n");
      out.write("    a#l:hover{\n");
      out.write("       color: #eeeeee; \n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write(" <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/supersized.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body id=\"page1\">\n");
      out.write("<!-- header -->\n");
      out.write("\t<div class=\"bg\">\n");
      out.write("\t\t<div class=\"main\">\n");
      out.write("\t\t\t<header>\n");
      out.write("\t\t\t\t<div class=\"row-1\">\n");
      out.write("\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t<a class=\"logo\" href=\"index.html\">REMAA.<span>co</span></a>\n");
      out.write("\t\t\t\t\t\t<strong class=\"slog\">Welcome Our Web Site</strong>\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("                        <FORM NAME=\"database\">\n");
      out.write("<INPUT TYPE=\"hidden\" NAME=\"list\" VALUE='index.html~REMAA.CO|pyramid tourism Egypt ^welcome to egypt*news.html~Hottels|Hotel Hotels rest stay room building ^ this is hotel *log_in.html~Log IN|service services trip trips ticket cinema film films move movies^Some Services!*products.html~Places|place places cairo tour Meusum Sharm Elshik Marsa Matrooh^Some Places*'>\n");
      out.write("</FORM>\n");
      out.write("\t\t\t\t\t          <form   action=\"#\" name=\"entryform\" onSubmit=\"return entry()\" >\n");
      out.write("                                                      <fieldset style=\"margin-top: -40px\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"frm\">\t\t\t\t\t\n");
      out.write("                                                    <input style=\"height: 30px;width:70%;border: none;position: relative;top:-30px;right: 29px ;color: blue\" id=\"txt\" type=\"text\" size=20 \n");
      out.write("name=\"keyword\"> \n");
      out.write("                                                    <input style=\"height: 70% ;position: relative;top:-85px;right: -127px\" id=\"but\" type=\"button\" value=\"Go\" onClick=\"entry()\">\n");
      out.write("           <select type=\"hidden\" id=\"bnb\"  name=\"and_or\" size=1><option type=\"hidden\"   selected\":\"\")>\n");
      out.write("\n");
      out.write("</select>\n");
      out.write("                                               \n");
      out.write("<!--                                                         <a href=\"\" onclick=\"se()\" id=\"go\">Search</a>\t\t\t\t\t\t\t\t\t-->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                        </div>\n");
      out.write("\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("select#bnb{\n");
      out.write("\tvisibility:hidden;\n");
      out.write("}\n");
      out.write("#frm{\n");
      out.write("    margin-left: 300px;\n");
      out.write("    margin-top: 30px;\n");
      out.write("    width: 270px;\n");
      out.write("    height: 50px;\n");
      out.write("    border: 2px outset orange;\n");
      out.write("    padding-top: 20px;\n");
      out.write("    padding-left: 25px;\n");
      out.write("    background-color: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input#but{\n");
      out.write("    \n");
      out.write(" width: 50px;\n");
      out.write(" font-size: 18px;\n");
      out.write(" color: blue;\n");
      out.write(" \n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("\t\t\t\t<div class=\"row-2\">\n");
      out.write("\t\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t\t<ul class=\"menu\">\n");
      out.write("\t\t\t\t\t\t  <li><a  href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"news.html\">Hotels</a></li>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"about_trip.jsp\">Services</a></li>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"products.html\"> places</a></li>\n");
      out.write("\t\t\t\t\t\t  <li class=\"last-item\"><a href=\"contacts.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</header>\n");
      out.write("<!-- content -->\n");
      out.write("            <div class=\"ic\">More Website Templates  at TemplateMonster.com!</div>\n");
      out.write("\t\t\t<section id=\"content\" style=\"background:url(assets/img/p.jpg)  ;background-repeat:no-repeat;background-size: cover\">\n");
      out.write("\t\t\t\t    <div class=\"page-container1\" style=\"height: 100%; width: 60%;margin: auto ;background:rgba(0,0,0,.6) ;border: none\">\n");
      out.write("            <h1 style=\"font-style: italic ;font-size: 50px ; margin: auto;margin-top: 80px;margin-bottom: 40px;margin-left: 90px; color: #2D7D8F\">welcome to Remaa</h1>\n");
      out.write("            <form action=\"ghonem\" method=\"post\" name=\"fo\" onsubmit=\"return valid()\">\n");
      out.write("             <input type=\"text\" name=\"email\" class=\"username\" placeholder=\"E_mail\" id=\"user\">\n");
      out.write("                <input type=\"password\" name=\"password\" class=\"password\" placeholder=\"password\" id=\"pass\" >\n");
      out.write("                <div   >\n");
      out.write("                        \n");
      out.write("                            <select   name=\"cinema\"  class=\"ss\" > \n");
      out.write("                               \n");
      out.write("                               <option>Tourist</option>\n");
      out.write("                                <option>Employee</option>\n");
      out.write("                                \n");
      out.write("                                 </select>\n");
      out.write("                              \n");
      out.write("                        </div>\n");
      out.write("               \n");
      out.write("                <button type=\"submit\" class=\"reg\" >Sign me in</button>\n");
      out.write("                <a href=\"Registration.html\" style=\"margin-top: 20px;\" class=\"btn btn-info btn-block reg\" >Register</a>\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <div class=\"error\"><span>+</span></div>\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("\t\t\t</section>\n");
      out.write("<!-- footer -->\n");
      out.write("\t\t\t<footer>\n");
      out.write("\t\t\t\t<div class=\"row-top\">\n");
      out.write("\t\t\t\t\t<div class=\"row-padding\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Address:</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<dl class=\"address\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<dt><span>Country:</span>Egypt</dt>\n");
      out.write("\t\t\t\t\t\t\t\t\t<dd><span>City:</span>shebin Elkom</dd>\n");
      out.write("\t\t\t\t\t\t\t\t\t<dd><span>Address:</span>fci</dd>\n");
      out.write("\t\t\t\t\t\t\t\t\t<dd><span>Email:</span><a href=\"#\">lcenter@mail.com</a></dd>\n");
      out.write("\t\t\t\t\t\t\t\t</dl>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Follow Us:</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-services\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"item-1\"><a href=\"#\">Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"item-2\"><a href=\"#\">Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"item-3\"><a href=\"#\">LinkedIn</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Our Group:</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">mohamed Alalkamy </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Alaa Mahmoud</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">essam Gorab</a></li> \n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Reda Meky</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Abdelrahman Mosa</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"indent3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"footer-logo\">REMA.<strong>co</strong></strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong class=\"phone\"><strong>Tell Free:</strong> 01019309352</strong>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t <!-- Javascript -->\n");
      out.write("        <script src=\"assets/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/supersized.3.2.7.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/supersized-init.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("       function valid(){\n");
      out.write("           if(document.fo.user.value.length<1) {\n");
      out.write("            alert(\"Please Enter user name\");\n");
      out.write("            \n");
      out.write("            return  false;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("             if(document.fo.pass.value.length<1) {\n");
      out.write("            alert(\" Please Enter password\");\n");
      out.write("            \n");
      out.write("            return  false;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
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
