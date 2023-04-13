package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/userMenu.jsp", out, false);
      out.write('\n');
      out.write('\n');

    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"dashboard container col-lg-9 col-md-9 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"dashboardBody col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12\">Tableau de bord</div>\n");
      out.write("        <div class=\"dashboarddiv col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <div class=\"odd col-lg-3 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"dashimg\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-search\"></span>Rechercher un bus\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dashcontent\">\n");
      out.write("                    <a href=\"rechercheBus.jsp\">Rechercher</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"even col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"dashimg\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-list-alt\"></span>Réserver un ticket\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dashcontent\">\t\t\t\t\t\n");
      out.write("                    <a href=\"reserverTicket.jsp\">Réserver</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"odd  col-lg-3 col-md-3 col-sm-12 col-xs-12\">\t\t\n");
      out.write("                <div class=\"dashimg\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-eye-open\"></span>Voir les réservations\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dashcontent\">\n");
      out.write("                    <a href=\"getReservationHist.jsp\">Voir</a>\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"even  col-lg-3 col-md-3 col-sm-12 col-xs-12\">\t\t\t\t\t\t\n");
      out.write("                <div class=\"dashimg\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-remove\"></span>Annuler un ticket\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dashcontent\">\n");
      out.write("                    <a href=\"getReservationHist.jsp\">Annuler</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"odd  col-lg-3 col-md-3 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"dashimg\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-print\"></span>Imprimer un ticket\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dashcontent\">\n");
      out.write("                    <a href=\"getReservationInfo.jsp\">Imprimer</a>\n");
      out.write("                </div>\t\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
