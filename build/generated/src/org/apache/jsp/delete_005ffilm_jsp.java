package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delete_005ffilm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title></title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\t <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/stylenew.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("\t\t\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.6.min.js\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Open_Sans_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Open_Sans_Light_300.font.js\" type=\"text/javascript\"></script> \n");
      out.write("<script src=\"js/Open_Sans_Semibold_600.font.js\" type=\"text/javascript\"></script> \n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>  \n");
      out.write("<!--[if lt IE 7]>\n");
      out.write("\t<div style=' clear: both; text-align:center; position: relative;'>\n");
      out.write("\t\t<a href=\"http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode\"><img src=\"http://www.theie6countdown.com/images/upgrade.jpg\" border=\"0\"  alt=\"\" /></a>\n");
      out.write("\t</div>\n");
      out.write("<![endif]-->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/html5.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/ie.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page5\">\n");
      out.write("<!-- header -->\n");
      out.write("\t<div class=\"bg\">\n");
      out.write("\t\t<div class=\"main\">\n");
      out.write("\t\t\t<header>\n");
      out.write("\t\t\t\t<div class=\"row-1\">\n");
      out.write("\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\t<a class=\"logo\" href=\"index.html\">REMAA.<span>co</span></a>\n");
      out.write("\t\t\t\t\t\t<strong class=\"slog\">Welcome Our Web Site</strong>\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t           <FORM NAME=\"database\">\n");
      out.write("<INPUT TYPE=\"hidden\" NAME=\"list\" VALUE='index.html~REMAA.CO|pyramid tourism Egypt ^welcome to egypt*news.html~Hottels|Hotel Hotels rest stay room building ^ this is hotel *log_in.html~Log IN|service services trip trips ticket cinema film films move movies^Some Services!*products.html~Places|place places cairo tour Meusum Sharm Elshik Marsa Matrooh^Some Places*'>\n");
      out.write("</FORM>\n");
      out.write("\t\t\t\t\t          <form   action=\"#\" name=\"entryform\" onSubmit=\"return entry()\" >\n");
      out.write("\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"frm\">\t\t\t\t\t\n");
      out.write("                                                    <input id=\"txt\" type=\"text\" size=20 \n");
      out.write("name=\"keyword\"> \n");
      out.write("                                                    <input id=\"but\" type=\"button\" value=\"Go\" onClick=\"entry()\"><select type=\"hidden\" id=\"bnb\"  name=\"and_or\" \n");
      out.write("size=1><option type=\"hidden\"  selected\":\"\")>\n");
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
      out.write("\t\t\t\t</div>\n");
      out.write("                  \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"row-2\">\n");
      out.write("\t\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t\t<ul class=\"menu\">\n");
      out.write("                                                    <li><a  href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"news.html\">Hotels</a></li>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"log_in.html\">Services</a></li>\n");
      out.write("\t\t\t\t\t\t  <li><a href=\"products.html\">Places</a></li>\n");
      out.write("\t\t\t\t\t\t  <li class=\"last-item\"><a class=\"active\" href=\"contacts.html\">ADMIN</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</header>\n");
      out.write("<!-- content -->\n");
      out.write("\t\t\t<section id=\"content\">\n");
      out.write("\t\t\t\t<div class=\"padding\">\n");
      out.write("\t\t\t\t\t<div class=\"wrapper margin-bot\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"col-4\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"block-news\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"color-4 indent-bot2\">Contacts</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                                                  <li >\n");
      out.write("                                                                 \n");
      out.write("                   \n");
      out.write("                     <ul >\n");
      out.write("                        <li><a href=\"register_trip.jsp\">&nbsp;Add Trip  </a></li>\n");
      out.write("                        <li><a href=\"select_trip.jsp\">&nbsp;&nbsp;&nbsp;&nbsp;SELECT Trips</a></li>                       \n");
      out.write("                        <li><a href=\"update_trip.jsp\">&nbsp;&nbsp;&nbsp;&nbsp;UPDATE on Trips</a></li>                       \n");
      out.write("                        <li><a href=\"delete_trip.jsp\">&nbsp;&nbsp;&nbsp;&nbsp;Delete Trip</a></li>                       \n");
      out.write("                        <li><a href=\"cancel_trip.jsp\">&nbsp;&nbsp;&nbsp;&nbsp;Cancel Trip</a></li>                       \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <hr>\n");
      out.write("                <li >\n");
      out.write("                     \n");
      out.write("                    <ul >\n");
      out.write("                          <li><a href=\"Add_film.jsp\">&nbsp;ADD Film </a></li>\n");
      out.write("                        <li><a href=\"select_film.jsp\">&nbsp;&nbsp;&nbsp;&nbsp;SELECT Films</a></li>                      \n");
      out.write("                        <li><a href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;UPDATE ON Films</a></li>                       \n");
      out.write("                        <li><a href=\"#\">&nbsp;&nbsp;&nbsp;&nbsp;Delete Films</a></li>                       \n");
      out.write("                    </ul>\n");
      out.write("                <hr>\n");
      out.write("                <li ><a  href=\"#\">InBox <span></span></a></li>                                                \n");
      out.write("\t\t<hr>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("                                                   \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                            <div class=\"badge\"  style=\"color: #000;padding: 25px;margin-left: 150px;padding-right: 10px;margin-top: 30px;\">\n");
      out.write("                                                <form action=\"delete_trip\" method=\"post\">\n");
      out.write("                                                    enter name of trip <input type=\"text\" name=\"trip_name\"><hr>  <br>    \n");
      out.write("                                                     <input type=\"submit\" value=\"Delete\"> <br>    \n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                </form>\n");
      out.write("                </div>\n");
      out.write("                                    \n");
      out.write("                                            <div class=\"box-bg\" style=\"margin-top: 50px;\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"box first\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pad\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrapper indent-bot\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<strong class=\"numb img-indent2\">01</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"extra-wrap\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"color-1\"><strong>The</strong>Pyramids</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"button img-indent-r\" href=\"#\">>></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"box second\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pad\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrapper indent-bot\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<strong class=\"numb img-indent2\">02</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"extra-wrap\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"color-2\"><strong>Our</strong>CountryS</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"button img-indent-r\" href=\"#\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"box third\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pad\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrapper indent-bot\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<strong class=\"numb img-indent2\">03</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"extra-wrap\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"color-3\"><strong>New</strong>Hergada</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"button img-indent-r\" href=\"#\">>></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
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
      out.write("\t<script type=\"text/javascript\"> Cufon.now(); </script>\n");
      out.write("        <script language=\"JavaScript\">\n");
      out.write("<!--\n");
      out.write("function Page(url,title,keywords,description) {\n");
      out.write("while ((url.length > 0) && (url.charAt(0) == \" \")) {\n");
      out.write("url = url.substring(1,url.length);\n");
      out.write("}\n");
      out.write("this.url = url;\n");
      out.write("while ((title.length > 0) && (title.charAt(0) == \" \")) {\n");
      out.write("title = title.substring(1,title.length);\n");
      out.write("}\n");
      out.write("this.title = title;\n");
      out.write("this.keywords = keywords;\n");
      out.write("this.description = description;\n");
      out.write("return this;\n");
      out.write("}\n");
      out.write("function Database() {\n");
      out.write("var pos = 0;\n");
      out.write("while ((pos1 = amorphous.indexOf(\"~\",pos)) != -1) {\n");
      out.write("pos2 = amorphous.indexOf(\"|\",pos1+1);\n");
      out.write("pos3 = amorphous.indexOf(\"^\",pos2+1);\n");
      out.write("pos4 = amorphous.indexOf(\"*\",pos3+1);\n");
      out.write("if ((pos2 != -1)\n");
      out.write("&& (pos2 < pos3) && (pos3 < pos4)\n");
      out.write("&& (pos4 <= amorphous.indexOf(\"*\",pos))) {\n");
      out.write("this[database_length++] = new Page(amorphous.substring(pos,pos1),\n");
      out.write("amorphous.substring(pos1+1,pos2),\n");
      out.write("amorphous.substring(pos2+1,pos3),\n");
      out.write("amorphous.substring(pos3+1,pos4));\n");
      out.write("pos = pos4+1;\n");
      out.write("} else { // error reading amorphous database\n");
      out.write("if (pos+30 <= amorphous.length)\n");
      out.write("alert('Error reading in amorphous database around \"'\n");
      out.write("+ amorphous.substring(pos,pos+30) + '\"');\n");
      out.write("pos = amorphous.indexOf(\"*\",pos) + 1;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("return this;\n");
      out.write("}\n");
      out.write("function search(str) {\n");
      out.write("menu_length = 0;\n");
      out.write("temp = new Object();\n");
      out.write("temp_length = 0;\n");
      out.write("words_length = 0;\n");
      out.write("words = new Object();\n");
      out.write("pos = 0;\n");
      out.write("while ((pos = str.indexOf(\" \")) != -1\n");
      out.write("&& and_search != \"exact\") {\n");
      out.write("words[words_length] = str.substring(0,pos);\n");
      out.write("if (words[words_length].length > 0)\n");
      out.write("words_length++;\n");
      out.write("if (str.length == 1)\n");
      out.write("str=\"\";\n");
      out.write("else\n");
      out.write("str = str.substring(pos+1,str.length);\n");
      out.write("}\n");
      out.write("if (str.length > 0)\n");
      out.write("words[words_length++] = str;\n");
      out.write("for (q=0;q<words_length;q++) {\n");
      out.write("temp_length = 0;\n");
      out.write("str = words[q].toLowerCase();\n");
      out.write("len = (and_search==\"and\"&&q>0?menu_length:database_length);\n");
      out.write("for (n=0; n<len; n++) {\n");
      out.write("if (and_search==\"and\"&&q>0) {\n");
      out.write("combo = (menu[n].title + \" \" + menu[n].description\n");
      out.write("+ \" \" + menu[n].keywords).toLowerCase();\n");
      out.write("} else {\n");
      out.write("combo = (database[n].title + \" \" + database[n].description\n");
      out.write("+ \" \" + database[n].keywords).toLowerCase();\n");
      out.write("}\n");
      out.write("if (combo.indexOf(str) != -1) // found\n");
      out.write("temp[temp_length++] = (and_search==\"and\"&&q>0?menu[n]:database[n]);\n");
      out.write("}\n");
      out.write("if (and_search!=\"and\" && q>0) {\n");
      out.write("added = 0;\n");
      out.write("for (i=0;i<temp_length;i++) {\n");
      out.write("duplicate = false;\n");
      out.write("for (j=0;j<menu_length&&!duplicate;j++) {\n");
      out.write("if (menu[j] == temp[i]) {\n");
      out.write("duplicate = true;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("if (!duplicate)\n");
      out.write("menu[menu_length+(added++)] = temp[i];\n");
      out.write("}\n");
      out.write("menu_length += added;\n");
      out.write("} else {\n");
      out.write("for(h=0;h<temp_length;h++)\n");
      out.write("menu[h] = temp[h];\n");
      out.write("menu_length = temp_length;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function entry() {\n");
      out.write("if ((document.entryform.keyword.value.length == 0)\n");
      out.write("|| (document.entryform.keyword.value == \" \")) {\n");
      out.write("alert(\"First you must enter a keyword to search for.\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("and_search = (document.entryform.and_or.selectedIndex == 0?\"and\":\"or\");\n");
      out.write("if (document.entryform.and_or.selectedIndex == 2)\n");
      out.write("and_search = \"exact\";\n");
      out.write("location.href = location.pathname + \"?\"\n");
      out.write("+ escape(document.entryform.keyword.value)\n");
      out.write("+ (and_search != \"or\"?\"&\"+and_search:\"\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("function redWord(str) {\n");
      out.write("for(r=0; r<words_length; r++) {\n");
      out.write("pos = -3;\n");
      out.write("word = words[r].toLowerCase();\n");
      out.write("while ((pos = str.toLowerCase().indexOf(word,pos+3)) != -1) {\n");
      out.write("val = pos+word.length;\n");
      out.write("str = str.substring(0,pos) + \"*\"\n");
      out.write("+ str.substring(pos,val) + \"|\"\n");
      out.write("+ str.substring(val,str.length);\n");
      out.write("}\n");
      out.write("}\n");
      out.write("pos = -16;\n");
      out.write("while ((pos = str.toLowerCase().indexOf(\"*\",pos+16)) != -1)\n");
      out.write("str = str.substring(0,pos) + \"<font color=red>\"\n");
      out.write("+ str.substring(pos+1,str.length);\n");
      out.write("pos = -7;\n");
      out.write("while ((pos = str.toLowerCase().indexOf(\"|\",pos+7)) != -1)\n");
      out.write("str = str.substring(0,pos) + \"</font>\"\n");
      out.write("+ str.substring(pos+1,str.length);\n");
      out.write("return str;\n");
      out.write("}\n");
      out.write("var amorphous = document.database.list.value;\n");
      out.write("temp_str = amorphous.substring(amorphous.length-2,amorphous.length);\n");
      out.write("if (temp_str.indexOf(\"*\") == -1)\n");
      out.write("amorphous += \"* \";\n");
      out.write("else\n");
      out.write("amorphous += \" \"; // amorphous database must have characters after last asterisk\n");
      out.write("database_length = 0; // Netscape 2 fix\n");
      out.write("var database = new Database(); // read in from amorphous database\n");
      out.write("menu_length = 0; // Netscape 2 fix\n");
      out.write("var menu = new Object();\n");
      out.write("string = \"\";\n");
      out.write("and_search = \"or\";\n");
      out.write("if (location.search.length > 1) {\n");
      out.write("string = unescape(location.search.substring(1,location.search.length));\n");
      out.write("pos = 0;\n");
      out.write("while ((pos = string.indexOf('\"',pos)) != -1) {\n");
      out.write("string = string.substring(0,pos) + '\\\\\"' + string.substring(pos+1,string.length);\n");
      out.write("pos += 2;\n");
      out.write("}\n");
      out.write("if (string.substring(string.length-4,string.length) == \"&and\") {\n");
      out.write("string = string.substring(0,string.length-4);\n");
      out.write("and_search = \"and\";\n");
      out.write("} else if (string.substring(string.length-6,string.length) == \"&exact\") {\n");
      out.write("string = string.substring(0,string.length-6);\n");
      out.write("and_search = \"exact\";\n");
      out.write("} else if (string.substring(string.length-3,string.length) == \"&or\") {\n");
      out.write("string = string.substring(0,string.length-3);\n");
      out.write("and_search = \"or\";\n");
      out.write("}\n");
      out.write("search(string);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("if (location.search.length > 1){\n");
      out.write("\t\n");
      out.write("var ur=\"\";\n");
      out.write("if (window.confirm('If you click \"ok\" you would be redirected or cancel ')) {\n");
      out.write("\n");
      out.write("window.location.href= menu[0].url;\n");
      out.write("}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("var search_htm_url = \"your_search_page_name.htm\";\n");
      out.write("function searchPage() {\n");
      out.write("if ((document.searchpage.keyword.value.length == 0)\n");
      out.write("|| (document.searchpage.keyword.value == \" \")) {\n");
      out.write("alert(\"First you must enter a keyword to search for.\");\n");
      out.write("} else {\n");
      out.write("sel = document.searchpage.and_or.selectedIndex;\n");
      out.write("location.href = search_htm_url + \"?\"\n");
      out.write("+ escape(document.searchpage.keyword.value)\n");
      out.write("+ (sel==0?\"&and\":(sel==2?\"&exact\":\"&or\"));\n");
      out.write("}\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
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