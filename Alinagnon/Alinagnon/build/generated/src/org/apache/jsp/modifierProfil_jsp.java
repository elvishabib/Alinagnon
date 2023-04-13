package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.CompagnieModel;
import java.sql.ResultSet;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.UserModel;

public final class modifierProfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write('\n');

    if (session.getAttribute("type").equals("User")) {

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/userMenu.jsp", out, false);
      out.write('\n');

} else {

      out.write("\n");
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

    }

      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"centerformWrapper col-lg-6 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Modifier profil</div>\n");
      out.write("        <div class=\"errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10\">\n");
      out.write("            ");

                try {
                    if (request.getParameter("msg") != null) {
                        out.print("<div>" + request.getParameter("msg") + "</div>");
                    }
                } catch (Exception e) {
                    out.print("Une erreur est parvenue...");
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");

            if (session.getAttribute("type").equals("User")) {
                UserModel um = new UserModel();
                um.setId_user(String.valueOf(session.getAttribute("id_user")));
                ResultSet rs = um.getUser();
                while (rs.next()) {
        
      out.write("\n");
      out.write("        <div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("            <form name=\"form\"\n");
      out.write("                  action=\"ModifierProfil\"\n");
      out.write("                  onsubmit=\"return validateLogin9();\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nom\">Nom</label> <input type=\"text\"\n");
      out.write("                                                        name=\"nom\" class=\"form-control\" value=\"");
      out.print(rs.getString(2));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"prenom\">Prénom</label> <input type=\"text\"\n");
      out.write("                                                              name=\"prenom\" class=\"form-control\" value=\"");
      out.print(rs.getString(3));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"adresse\">Adresse</label> <input type=\"text\"\n");
      out.write("                                                                name=\"adresse\" class=\"form-control\" value=\"");
      out.print(rs.getString(4));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ville\">Ville</label> <input type=\"text\" name=\"ville\"\n");
      out.write("                                                            class=\"form-control\" value=\"");
      out.print(rs.getString(5));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\">E-mail</label> <input type=\"text\" name=\"email\"\n");
      out.write("                                                             class=\"form-control\" value=\"");
      out.print(rs.getString(6));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"telephone\">Téléphone</label> <input type=\"text\"\n");
      out.write("                                                                    name=\"telephone\" class=\"form-control\"\n");
      out.write("                                                                    value=\"");
      out.print(rs.getString(7));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-danger\">Modifier</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            ");

                }
                rs.close();
            } else {
                CompagnieModel bom = new CompagnieModel();
                bom.setId_compagnie(String.valueOf(session.getAttribute("userid")));
                ResultSet rs = null;
                rs = bom.getCompagnie();
                while (rs.next()) {
            
      out.write("\n");
      out.write("            <div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("                <form name=\"form\" action=\"ModifierProfil\" onsubmit=\"return validateLogin9();\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\">E-mail</label> <input type=\"text\" name=\"email\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" value=\"");
      out.print(rs.getString(4));
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t <input type=\"hidden\" name=\"nom\"  value=\"");
      out.print(rs.getString(4));
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t <input type=\"hidden\" name=\"type\"  value=\"Compagnie\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"nom\">Nom</label> <input type=\"text\"\n");
      out.write("                                                            name=\"nom\" class=\"form-control\" value=\"");
      out.print(rs.getString(2));
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"adresse\">Adresse</label> <input type=\"text\"\n");
      out.write("                                                                    name=\"adresse\" class=\"form-control\" value=\"");
      out.print(rs.getString(3));
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"ville\">Ville</label> <input type=\"text\" name=\"ville\"\n");
      out.write("                                                                class=\"form-control\" value=\"");
      out.print(rs.getString(5));
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"telephone\">Téléphone</label> <input type=\"text\"\n");
      out.write("                                                                        name=\"telephone\" class=\"form-control\"\n");
      out.write("                                                                        value=\"");
      out.print(rs.getString(6));
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger\">Modifier</button>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                            }
                        }
                    
      out.write("\n");
      out.write("                </form>\t\t\t\t\n");
      out.write("            </div>\n");
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
