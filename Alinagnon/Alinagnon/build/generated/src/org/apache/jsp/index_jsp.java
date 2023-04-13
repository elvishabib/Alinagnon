package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import javax.servlet.http.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/flexselect.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      out.write("<script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"></script> \n");
      out.write("<script src=\"assets/js/liquidmetal.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"assets/js/jquery.flexselect.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\"select.flexselect\").flexselect();\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    jQuery(function () {\n");
      out.write("        jQuery(\"#inf_custom_someDateField\").datepicker();\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    document.onkeydown = function (event) {\n");
      out.write("\n");
      out.write("        if (!event) {\n");
      out.write("            event = window.event;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var keyCode = event.keyCode;\n");
      out.write("\n");
      out.write("        if (keyCode == 8 &&\n");
      out.write("                ((event.target || event.srcElement).tagName != \"TEXTAREA\") &&\n");
      out.write("                ((event.target || event.srcElement).tagName != \"INPUT\")) {\n");
      out.write("\n");
      out.write("            if (navigator.userAgent.toLowerCase().indexOf(\"msie\") == -1) {\n");
      out.write("                event.stopPropagation();\n");
      out.write("            } else {\n");
      out.write("                alert(\"prevented\");\n");
      out.write("                event.returnValue = false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("</script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div  class=\"errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10\">\n");
      out.write("        ");

            if (request.getParameter("msg") != null) {
        
      out.write("\n");
      out.write("        <h4 style=\"color:#ffff22;\">");
      out.print(request.getParameter("msg"));
      out.write("</h4>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"leftWrapper col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            RESERVATION EN LIGNE DE TICKET BUS</div>\n");
      out.write("        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <form name=\"form\" action=\"RechercherBus\"\n");
      out.write("                  onsubmit=\"return validateLogin12();\" method=\"post\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group col-lg-8 col-md-7 col-sm-10 col-xs-10\">\n");
      out.write("                    <label for=\"depart\">De</label>\n");
      out.write("                    <select name=\"depart\" id=\"depart\" class=\"form-control\">\t\t\t\t\t\t\n");
      out.write("                        <option value=\"\"></option>\n");
      out.write("                        ");

                            BusModel model = new BusModel();
                            ResultSet rs = model.getBusInfo1(1);

                            while (rs.next()) {
      out.write("\n");
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(1).toUpperCase());
      out.write("</option>\n");
      out.write("                        ");
} 
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-lg-8 col-md-7 col-sm-10 col-xs-10\">\n");
      out.write("                    <label for=\"arrivee\">A</label>\n");
      out.write("                    <select name=\"arrivee\" id=\"arrivee\" class=\"form-control\">\n");
      out.write("                        <option value=\"\"></option>\n");
      out.write("                        ");

                            ResultSet rs1 = model.getBusInfo1(2);

                            while (rs1.next()) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs1.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(1).toUpperCase());
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-lg-8 col-md-7 col-sm-10 col-xs-10\">\n");
      out.write("                    <label for=\"date_depart\">Date</label>\n");
      out.write("                        <input class=\"tcal\" type=\"text\" name=\"date_depart\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-lg-8 col-md-7 col-sm-10 col-xs-10\">\n");
      out.write("                    <button type=\"submit\"\n");
      out.write("                            class=\"btn btn-warning col-lg-5 col-md-5 col-sm-5 col-xs-5\"\n");
      out.write("                            style=\"float: left\">Rechercher</button>\n");
      out.write("                    <button type=\"reset\"\n");
      out.write("                            class=\"btn btn-warning col-lg-5 col-md-5 col-sm-5 col-xs-5\"\n");
      out.write("                            style=\"float: right\">Annuler</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"rightWrapper col-lg-5 col-md-5 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            CONNEXION</div>\n");
      out.write("        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <form name=\"form\" action=\"Login\"\n");
      out.write("                  onsubmit=\"return validateLogin13();\" method=\"post\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group col-lg-8 col-md-7 col-sm-10 col-xs-10\">\n");
      out.write("                    <label for=\"email\">E-mail</label> <input type=\"text\" id=\"email\"\n");
      out.write("                                                             class=\"form-control text required email\" id=\"email\"\n");
      out.write("                                                             name=\"email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-lg-8 col-md-7 col-sm-10 col-xs-10\">\n");
      out.write("                    <label for=\"mdp\">Mot de passe</label> <input type=\"password\"\n");
      out.write("                                                                 class=\"form-control\" id=\"mdp\" name=\"mdp\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"hidden\" name=\"type\" value=\"user\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-lg-8 col-md-7 col-sm-10 col-xs-10\">\n");
      out.write("                    <button type=\"submit\"\n");
      out.write("                            class=\"btn btn-danger col-lg-5 col-md-5 col-sm-5 col-xs-5\"\n");
      out.write("                            style=\"float: left\">Connexion</button>\n");
      out.write("                    <button type=\"reset\"\n");
      out.write("                            class=\"btn btn-danger col-lg-5 col-md-5 col-sm-5 col-xs-5\"\n");
      out.write("                            style=\"float: right\">Annuler</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div\n");
      out.write("                class=\"centertitle forgotpwd col-lg-8 col-md-7 col-sm-10 col-xs-10\">\n");
      out.write("                <a href=\"oublieMDP1.jsp\">Mot de passe oublié? Cliquez ici!</a>\n");
      out.write("            </div>\n");
      out.write("            <div\n");
      out.write("                class=\"centertitle logOptions col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <a href=\"compagnieLogin.jsp\">Compagnie? Se connecter!</a> | <a href=\"ajouterUser.jsp\"> S'inscrire!</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/footer.jsp", out, false);
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
