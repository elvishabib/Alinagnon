package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel;
import java.sql.ResultSet;

public final class reserverTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');

    HttpSession session1 = request.getSession();
    if (session1.getAttribute("id_user") != null) {

      out.write('	');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/userMenu.jsp", out, false);
      out.write('\n');
 } 
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      out.write("\n");

    String id_bus = request.getParameter("id_bus");

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"errordiv col-lg-9 col-md-9 col-sm-10 col-xs-10\">\n");
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
      out.write("<div class=\"mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Réserver un ticket\n");
      out.write("        </div>\n");
      out.write("        ");

            BusModel bm = new BusModel();
            ResultSet rs = bm.getBusInfo(request.getParameter("id_bus"));
            String date_depart = "";
            String heure_depart = "";
        
      out.write("\n");
      out.write("        <div class=\"tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <table class =\"col-lg-6 col-md-6 col-sm-12 col-xs-12 table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>No Bus</th>\n");
      out.write("                    <th>Nom</th>\n");
      out.write("                    <th>Type</th>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Heure</th>\n");
      out.write("                    <th>De</th>\n");
      out.write("                    <th>A</th>\n");
      out.write("                    <th>Prix</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    while (rs.next()) {
                
      out.write("\t\t\t\t\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString(1));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(3));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(4));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(5));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(6));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(7));
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString(8));
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

                        date_depart = request.getParameter("date_depart");
                        heure_depart = rs.getString(5);
                    }
                    rs.close();
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-2 col-xs-2\">\n");
      out.write("            <div class=\"centerform col-lg-12 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                <form name=\"form\" action=\"ReserverTicket\" onsubmit=\"return validateLogin3();\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"sieges\">Nombre de sièges</label>\n");
      out.write("                        <input type=\"text\" name=\"sieges\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        if (session1.getAttribute("id_user") == null) {
                    
      out.write("\t\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\">E-mail</label>\n");
      out.write("                        <input type=\"text\" name=\"email\" class=\"form-control\">\n");
      out.write("                    </div>\t\t\t\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"id_bus\">No Bus</label>\n");
      out.write("                        <input type=\"text\" name=\"id_bus\"  class=\"form-control\" value=\"");
      out.print(id_bus);
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"date_depart\">Date</label>\n");
      out.write("                        <input type=\"text\" name=\"date_depart\"  class=\"form-control\" value=\"");
      out.print(date_depart);
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"heure_depart\">Heure Départ</label>\n");
      out.write("                        <input type=\"text\" name=\"heure_depart\"  class=\"form-control\" value=\"");
      out.print(heure_depart);
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" name=\"submit\" class=\"btn btn-danger\">Réserver</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
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
