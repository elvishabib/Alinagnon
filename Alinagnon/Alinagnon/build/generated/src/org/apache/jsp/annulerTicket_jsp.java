package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*;
import java.sql.ResultSet;

public final class annulerTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/userMenu.jsp", out, false);
      out.write('\n');

    ResultSet rs = null;
    UserModel um = new UserModel();
    um.setEmail(String.valueOf(session.getAttribute("id_user")));
    rs = um.VoirReservationsUser();

      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("    <div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Historique des réservations\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <table class =\"table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>No Réservation</td>\n");
      out.write("                    <td>No Bus</td>\n");
      out.write("                    <td>Date</td>\n");
      out.write("                    <td>Heure</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
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
      out.write("                </tr>\n");
      out.write("                ");
}
                    rs.close();
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"centerformWrapper col-lg-5 col-md-5 col-sm-2 col-xs-2\">\n");
      out.write("    <div class=\"formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12\">Annuler un ticket</div>\n");
      out.write("    <div class=\"errordiv col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        ");

            if (request.getParameter("msg") != null) {
        
      out.write("\n");
      out.write("        <h4>");
      out.print(request.getParameter("msg"));
      out.write(" for id_reservation ");
      out.print(request.getParameter("id_bus"));
      out.write("</h4>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"centerform col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <form name=\"form\" action=\"AnnulerTicket\" method=\"post\">\n");
      out.write("            ");

                HttpSession session1 = request.getSession();
                if (session1.getAttribute("id_user") != null) {
            
      out.write("\t\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"id_reservation\">No de la réservation</label>\n");
      out.write("                <input type=\"text\" name=\"id_reservation\" class=\"form-control\">\n");
      out.write("            </div>\t\t\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"id_reservation\">No de la réservation</label>\n");
      out.write("                <input type=\"text\" name=\"id_reservation\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"email\">E-mail</label>\n");
      out.write("                <input type=\"text\" name=\"email\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <button type=\"submit\" name=\"submit\" class=\"btn btn-danger\">Annuler le ticket</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
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
