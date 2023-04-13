package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel;
import java.sql.ResultSet;

public final class ajouterBus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (session.getAttribute("type") == null || (!session.getAttribute("type").equals("Compagnie"))) {
        response.sendRedirect("compagnieLogin.jsp");
    }

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      out.write("<div class=\"left-column col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"ajouterBus.jsp\">Ajouter un bus</a>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"getBus.jsp\">Voir les bus</a>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"modifierProfil.jsp\">Modifier profil</a>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"changerMDP.jsp\">Changer mot de passe</a>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"supprimerCompagnie.jsp\">Supprimer compte</a>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"logout.jsp\">Déconnexion</a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Ajouter un bus</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10\">\n");
      out.write("            ");

                if (request.getParameter("msg") != null) {
            
      out.write("\n");
      out.write("            <h4>");
      out.print(request.getParameter("msg"));
      out.write("</h4>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("            <form name=\"form\" action=\"AjouterBus\"\n");
      out.write("                  onsubmit=\"return validation();\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nom_bus\">Nom du bus</label> \n");
      out.write("                    <input type=\"text\" name=\"nom_bus\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"type_bus\">Type de bus</label> \n");
      out.write("                    <select name=\"type_bus\"\n");
      out.write("                            class=\"form-control\">\n");
      out.write("                        <option Value=\"Climatisé\">Climatisé</option>\n");
      out.write("                        <option Value=\"Non-Climatisé\">Non-Climatisé</option>\n");
      out.write("                    </select> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ville_depart\">Ville départ</label> \n");
      out.write("                    <input type=\"text\" name=\"ville_depart\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ville_arrivee\">Ville d'arrivée</label> \n");
      out.write("                    <input type=\"text\" name=\"ville_arrivee\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"heure_depart\">Heure départ</label> \n");
      out.write("                    <input type=\"text\" name=\"heure_depart\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"duree_voyage\">Durée du voyage</label> \n");
      out.write("                    <input type=\"text\" name=\"duree_voyage\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"jours_voyages\">Jours de voyage</label><br /> \n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyages1\" value=\"S\" checked>Dimanche<br />\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyages2\" value=\"M\">Lundi<br />\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyages3\" value=\"T\">Mardi<br />\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyages4\" value=\"W\">Mercredi<br />\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyages5\" value=\"T\">Jeudi<br />\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyages6\" value=\"F\">Vendredi<br />\n");
      out.write("                    <input type=\"checkbox\" name=\"jours_voyages7\" value=\"S\">Samedi<br />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"prix_voyage\">Prix du voyage</label> \n");
      out.write("                    <input type=\"text\" name=\"prix_voyage\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"sieges\">Nombre de sièges disponible</label> \n");
      out.write("                    <input type=\"text\" name=\"sieges\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-danger\" value=\"Ajouter\" /> \n");
      out.write("                    <input type=\"reset\" class=\"btn btn-danger\" value=\"Annuler\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/footer.jsp", out, false);
      out.write('\n');
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
