package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*;
import java.sql.ResultSet;

public final class getReservationInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/userMenu.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");
      out.write("\n");

    try {
        String bookingID = "";
        if (request.getParameter("Reservation") != null) {
            out.print("<div class=''>" + bookingID + "</div>");
            ResultSet rs = null;
            ReservationModel bm = new ReservationModel();
            bm.setId_user(String.valueOf(session.getAttribute("id_user")));
            bm.setId_reservation(request.getParameter("Reservation"));
            rs = bm.getInfoReservation("User", "rien");
            rs.last();
            int numRows = rs.getRow();
            if (numRows <= 0) {
                String msg = "Auncune information sur cette réservation!";
                response.sendRedirect("getReservationInfo.jsp?msg="
                        + msg);
            } else {
                rs.beforeFirst();
                while (rs.next()) {

      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Informations sur les réservations\n");
      out.write("        </div>\n");
      out.write("        <div class=\"errordiv col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            ");

                try {
                    String msg = "";
                    if (request.getParameter("msg") != null) {
                        msg = request.getParameter("msg");
                        out.print("<div><p>" + msg + "</p></div>");
                        System.out.print("");
                    }
                } catch (Exception e) {
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tableContent col-lg-9 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>No Réservation</td>\n");
      out.write("                    <td>No Bus</td>\n");
      out.write("                    <td>No User</td>\n");
      out.write("                    <td>Date Départ</td>\n");
      out.write("                    <td>Heure</td>\n");
      out.write("                    <td>Sieges</td>\n");
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
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

                rs.close();
            }
        }
    } else {
    
      out.write("\n");
      out.write("    ");

        ResultSet rs = null;
        UserModel um = new UserModel();
        um.setEmail(String.valueOf(session.getAttribute("id_user")));
        rs = um.VoirReservationsUser();
    
      out.write("\n");
      out.write("    <div class=\"mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                Informations sur les réservations\n");
      out.write("            </div>\n");
      out.write("            <div class=\"errordiv col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                ");

                    try {
                        String msg = "";
                        if (request.getParameter("msg") != null) {
                            msg = request.getParameter("msg");
                            out.print("<div><p>" + msg + "</p></div>");
                            System.out.print("");
                        }
                    } catch (Exception e) {
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tableContent col-lg-9 col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("                <table class =\"table table-bordered\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>No Réservation</td>\n");
      out.write("                        <td>No Bus</td>\n");
      out.write("                        <td>Date</td>\n");
      out.write("                        <td>Heure</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        while (rs.next()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                        rs.close();
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("                <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    Informations sur les réservations\n");
      out.write("                </div>\n");
      out.write("                <div class=\"centerform col-lg-9 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("                    <form name=\"form\" action=\"GetReservationInfo\"\n");
      out.write("                          onsubmit=\"return validateLogin11();\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>No Réservation</label> \n");
      out.write("                            <input type=\"text\" name=\"reservation\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" name=\"submit\" class=\"btn btn-danger\">Voir</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

            }
        } catch (Exception e) {
            System.out.print(e);
        }
    
      out.write("\n");
      out.write("\n");
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
