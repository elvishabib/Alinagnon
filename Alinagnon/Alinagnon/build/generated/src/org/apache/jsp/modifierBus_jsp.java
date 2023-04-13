package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modifierBus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      out.write("\n");

    if (session.getAttribute("type") == null || (!session.getAttribute("type").equals("Compagnie"))) {
        response.sendRedirect("compagnieLogin.jsp");
    }

      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Modifier les informations du bus\n");
      out.write("        </div>\n");
      out.write("        <div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("\n");
      out.write("            <form name=\"form\" action=\"ModifierBus\"\n");
      out.write("                  onsubmit=\"return validateLogin8();\" method=\"post\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nom_bus\">Nom</label>\n");
      out.write("                    <input type=\"text\" name=\"nom_bus\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"type_bus\">Type</label>\n");
      out.write("                    <select class=\"form-control\" name=\"type_bus\">\n");
      out.write("                        <option value=\"Climatisé\">Climatisé</option>\n");
      out.write("                        <option value=\"Non-Climatisé\">Non-Climatisé</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ville_depart\">Départ</label>\n");
      out.write("                    <input type=\"text\" name=\"ville_depart\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ville_arrivee\">Arrivée</label>\n");
      out.write("                    <input type=\"text\" name=\"ville_arrivee\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"heure_depart\">Heure Départ(HH:MM)</label>\n");
      out.write("                    <input type=\"text\" name=\"heure_depart\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"duree_voyage\">Durée (HH:MM)</label>\n");
      out.write("                    <input type=\"text\" name=\"duree_voyage\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"jours_voyage\">Jours de voyages</label><br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyage\" value=\"Sunday\">Dimanche<br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyage\" value=\"Monday\">Lundi<br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyage\" value=\"Tuesday\">Mardi<br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyage\" value=\"Wednesday\">Mercredi<br>\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyage\" value=\"Thursday\">Jeudi<br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyage\" value=\"Friday\">Vendredi<br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyage\" value=\"Saturday\">Samedi<br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"prix_voyage\">Prix</label>\n");
      out.write("                    <input type=\"text\" name=\"prix_voyage\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"sieges\">Sièges</label>\n");
      out.write("                    <input type=\"text\" name=\"prix_voyage\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-danger\" value=\"Modifier\">\n");
      out.write("                    <input type=\"reset\"  class=\"btn btn-danger\" value=\"Annuler\">\n");
      out.write("                </div>\t\n");
      out.write("            </form>\t\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/footer.jsp", out, false);
      out.write('\n');
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
