package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changerMDP_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write('\n');

    if (session.getAttribute("type").equals("User")) {

      out.write('	');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/userMenu.jsp", out, false);
      out.write('\n');
 } else {

      out.write("\n");
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
 } 
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"centerformWrapper col-lg-6 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Changer mot de passe</div>\n");
      out.write("        <div class=\"errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10\">\n");
      out.write("            ");

                if (request.getParameter("msg") != null) {
            
      out.write("\n");
      out.write("            <p>");
      out.print(String.valueOf(request.getParameter("msg")));
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("            <form name=\"form\" action=\"ChangerMDP\" onsubmit=\"return validateLogin5();\" method=\"post\">\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ancienmdp\">Mot de passe</label> <input\n");
      out.write("                        type=\"password\" name=\"ancienmdp\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nouveaumdp\">Nouveau mot de passe</label> <input\n");
      out.write("                        type=\"password\" name=\"nouveaumdp\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"confirmermdp\">Confirmer mot de passe</label> <input\n");
      out.write("                        type=\"password\" name=\"confirmermdp\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                ");

                    if (String.valueOf(session.getAttribute("type")).equalsIgnoreCase(
                            "Admin")) {
                
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"hidden\" name=\"uname\"\n");
      out.write("                           value=\"");
      out.print(String.valueOf(session.getAttribute("email")));
      out.write("\" />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-danger\" value=\"Changer\" /> <input\n");
      out.write("                        type=\"reset\" class=\"btn btn-danger\" value=\"Annuler\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Footer.jsp", out, false);
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
