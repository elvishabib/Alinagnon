package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*;
import java.sql.ResultSet;

public final class supprimerCompagnieByAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (session.getAttribute("type") == null) {
        response.sendRedirect("adminLogin.jsp");
    }

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write('\n');

    CompagnieModel model = new CompagnieModel();
    ResultSet rs = model.getAllCompagnies();

      out.write("\n");
      out.write("<div class=\"left-column col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"ajouterCompagnie.jsp\">Ajouter une compagnie</a></li>\n");
      out.write("        <li><a href=\"supprimerCompagnieByAdmin.jsp\">Supprimer une compagnie</a></li>\n");
      out.write("        <li><a href=\"logout.jsp\">Déconnexion</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"errordiv\">\n");
      out.write("    ");

        if (request.getParameter("msg") != null) {
    
      out.write("\n");
      out.write("    <h4 style=\"color:red\">");
      out.print(request.getParameter("msg"));
      out.write("</h4>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Supprimer une compagnie\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <table class =\"table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>No Compagnie</td>\n");
      out.write("                    <td>Nom</td>\n");
      out.write("                    <td>Adresse</td>\n");
      out.write("                    <td>E-mail</td>\n");
      out.write("                    <td>Ville</td>\n");
      out.write("                    <td>Téléphone</td>\n");
      out.write("                    <td>Mot de passe</td>\n");
      out.write("                    <td>  </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                    <td><a href=\"SupprimerCompagnieByAdmin?id_compagnie=");
      out.print(rs.getString(1));
      out.write("\"><span class=\"glyphicon glyphicon-trash\"></span></a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
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
