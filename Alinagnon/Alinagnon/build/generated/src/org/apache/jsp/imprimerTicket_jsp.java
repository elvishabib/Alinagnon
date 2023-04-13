package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*;
import java.sql.ResultSet;

public final class imprimerTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.css\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/alinagnonStyle.css\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/menuStyle.css\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap-theme.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/calendar/tcal.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/flexselect.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/jqueryCalendar.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/calendar/tcal.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"assets/calendar/tcal.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/bootstrap/js/bootstrap.js\"></script>\n");
      out.write("<script src=\"assets/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"assets/js/liquidmetal.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"assets/js/query.flexselect.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/calendar/tcal.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function openPage(pageURL)\n");
      out.write("{\n");
      out.write("window.location.href = pageURL;\n");
      out.write("}\n");
      out.write("</script>\n");


    ResultSet rs = (ResultSet) request.getAttribute("ticket");
    if (rs != null) {
        while (rs.next()) {
      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Information sur la réservation\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tableContent col-lg-9 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("            <table class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12  table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>No Réservation</td>\n");
      out.write("                    <td>No Bus</td>\n");
      out.write("                    <td>No Bus</td>\n");
      out.write("                    <td>Date Départ</td>\n");
      out.write("                    <td>Heure Départ</td>\n");
      out.write("                    <td>Sièges</td>\n");
      out.write("                </tr>\n");
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
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <button class=\"btn btn-success\" onclick=\"javascript:window.print()\"><span class=\"glyphicon glyphicon-print\">&nbsp;&nbsp;</span>Imprimer</button>\n");
      out.write("            <button class=\"btn btn-success\" onclick=\"openPage('indexUser.jsp')\"><span class=\"glyphicon glyphicon-home\">&nbsp;&nbsp;</span>Accueil</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
	}
    }
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
