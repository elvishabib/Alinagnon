package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Alinagnon: Système de réservation de ticket bus en ligne au Bénin!</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/alinagnonStyle.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/menuStyle.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap-theme.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/calendar/tcal.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/flexselect.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/jqueryCalendar.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/calendar/tcal.css\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/calendar/tcal.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/bootstrap/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/liquidmetal.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.flexselect.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/calendar/tcal.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                var elements = $(\"input[type!='submit'], textarea, select\");\n");
      out.write("                elements.focus(function () {\n");
      out.write("                    $(this).parents('li').addClass('highlight');\n");
      out.write("                });\n");
      out.write("                elements.blur(function () {\n");
      out.write("                    $(this).parents('li').removeClass('highlight');\n");
      out.write("                });\n");
      out.write("                $(\"#oubliemdp\").click(function () {\n");
      out.write("                    $(\"#mdp\").removeClass(\"required\");\n");
      out.write("                    $(\"#login\").submit();\n");
      out.write("                    $(\"#mdp\").addClass(\"required\");\n");
      out.write("                    return false;\n");
      out.write("                });\n");
      out.write("                $(\"#login\").validate()\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .myheader {\n");
      out.write("                height: 100px;\n");
      out.write("                font-size: 32px;\n");
      out.write("                background-color: rgba(50, 50, 50, 0.5);\n");
      out.write("                height: 100px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                padding-top: 25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media ( min-width :768px) and (max-width:1024px) {\n");
      out.write("                .myheader {\n");
      out.write("                    width: 768px;\n");
      out.write("                    font-size: 28px;\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    border-radius: 0px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media ( min-width :600px) and (max-width:767px) {\n");
      out.write("                .myheader {\n");
      out.write("                    width: 600px;\n");
      out.write("                    font-size: 24px;\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    border-radius: 0px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media ( min-width :480px) and (max-width:599px) {\n");
      out.write("                .myheader {\n");
      out.write("                    width: 480px;\n");
      out.write("                    font-size: 20px;\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    border-radius: 0px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media ( max-width :479px) {\n");
      out.write("                .myheader {\n");
      out.write("                    width: 300px;\n");
      out.write("                    font-size: 16px;\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    border-radius: 0px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"assets/img/bus.jpg\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"myheader col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                ALINAGNON: Système de réservation de ticket bus en ligne!</div>");
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
