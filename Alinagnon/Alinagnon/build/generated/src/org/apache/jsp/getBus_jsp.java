package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller.SupprimerBus;
import java.sql.ResultSet;
import javax.servlet.http.*;

public final class getBus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write('\n');

    if (session.getAttribute("type") == null || (!session.getAttribute("type").equals("Compagnie"))) {
        response.sendRedirect("compagnieLogin.jsp");
    }

      out.write('\n');

    String id_compagnie = String.valueOf(session.getAttribute("id_user"));
    System.out.print(id_compagnie);
    ResultSet rs = null;
    BusModel model = new BusModel();
    model.setId_compagnie(id_compagnie);
    rs = model.VoirBus();

      out.write("\n");
      out.write("<div class=\"errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10\">\n");
      out.write("    ");

        if (request.getParameter("msg") != null) {
    
      out.write("\n");
      out.write("    <h4>");
      out.print(request.getParameter("msg"));
      out.write("</h4>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"left-column col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"ajouterBus.jsp\">Ajouter un bus</a></li>\n");
      out.write("        <li><a href=\"getBus.jsp\">Voir les bus</a></li>\n");
      out.write("        <li><a href=\"modifierProfil.jsp\">Modifier profil</a></li>\n");
      out.write("        <li><a href=\"changerMDP.jsp\">Changer mot de passe</a></li>\n");
      out.write("        <li><a href=\"supprimerCompagnie.jsp\">Supprimer compte</a></li>\n");
      out.write("        <li><a href=\"logout.jsp\">Déconnexion</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<br/><br/>\n");
      out.write("<div class=\"mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Bus de la compagnie\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <table class =\"table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>No Bus</td>\n");
      out.write("                    <td>Nom</td>\n");
      out.write("                    <td>Type</td>\n");
      out.write("                    <td>Départ</td>\n");
      out.write("                    <td>Arrivée</td>\n");
      out.write("                    <td>Heure</td>\n");
      out.write("                    <td>Durée</td>\n");
      out.write("                    <td>Prix</td>\n");
      out.write("                    <td>Jours de voyages</td>\n");
      out.write("                    <td>Sièges</td>\n");
      out.write("                    <td>  </td>\n");
      out.write("                    <td>  </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    String id_bus = "";
                    String nom_bus = "";
                    String type_bus = "";
                    String heure_depart = "";
                    String duree_voyage = "";
                    String ville_depart = "";
                    String ville_arrivee = "";
                    float prix_voyage = 0;
                    int sieges = 0;
                    String jours = "";

                    while (rs.next()) {
                        if (id_bus.equals("")) {
                            id_bus = rs.getString(1);
                            nom_bus = rs.getString(2);
                            type_bus = rs.getString(3);
                            ville_depart = rs.getString(4);
                            ville_arrivee = rs.getString(5);
                            heure_depart = rs.getString(6);
                            duree_voyage = rs.getString(7);
                            prix_voyage = rs.getFloat(8);
                            jours = jours + rs.getString(9);
                            sieges = rs.getInt(10);
                        } else if (id_bus.equals(rs.getString(1))) {
                            jours = jours + " - ";
                            jours = jours + rs.getString(9);
                        } else {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(id_bus);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(nom_bus);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(type_bus);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ville_depart);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ville_arrivee);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(heure_depart);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(duree_voyage);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(prix_voyage);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(jours);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(sieges);
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"modifierBus.jsp?id_bus=");
      out.print(id_bus);
      out.write("\"><span class=\"glyphicon glyphicon-edit\"></span></a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"SupprimerBus?id_bus=");
      out.print(id_bus);
      out.write("\"><span class=\"glyphicon glyphicon-trash\"></span></a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                            id_bus = rs.getString(1);
                            nom_bus = rs.getString(2);
                            type_bus = rs.getString(3);
                            ville_depart = rs.getString(4);
                            ville_arrivee = rs.getString(5);
                            heure_depart = rs.getString(6);
                            duree_voyage = rs.getString(7);
                            prix_voyage = rs.getFloat(8);
                            jours = rs.getString(9);
                            sieges = rs.getInt(10);
                        }
                    }
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(id_bus);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(nom_bus);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(type_bus);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ville_depart);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ville_arrivee);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(heure_depart);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(duree_voyage);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(prix_voyage);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(jours);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(sieges);
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"modifierBus.jsp?id_bus=");
      out.print(id_bus);
      out.write("\"><span class=\"glyphicon glyphicon-edit\"></span></a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"SupprimerBus?id_bus=");
      out.print(id_bus);
      out.write("\"><span class=\"glyphicon glyphicon-trash\"></span></a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
