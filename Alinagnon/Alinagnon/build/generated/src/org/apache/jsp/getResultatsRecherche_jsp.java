package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class getResultatsRecherche_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Résultats de la recherche\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            <table class =\"col-lg-6 col-md-6 col-sm-12 col-xs-12 table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>No Bus</td>\n");
      out.write("                    <td>Nom</td>\n");
      out.write("                    <td>Type</td>\n");
      out.write("                    <td>Date Départ</td>\n");
      out.write("                    <td>Heure Départ</td>\n");
      out.write("                    <td>De</td>\n");
      out.write("                    <td>A</td>\n");
      out.write("                    <td>Prix</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    ResultSet rs = (ResultSet) request.getAttribute("InfoBus");
                    try {
                        while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"reserverTicket.jsp?busid=");
      out.print(rs.getString(1));
      out.write("&date=");
      out.print(String.valueOf(request.getAttribute("Date")));
      out.write('"');
      out.write('>');
      out.print(rs.getString(1));
      out.write("</a>\n");
      out.write("                    <td><a href=\"reserverTicket.jsp?busid=");
      out.print(rs.getString(1));
      out.write("&date=");
      out.print(String.valueOf(request.getAttribute("Date")));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</a>\n");
      out.write("                    <td><a href=\"reserverTicket.jsp?busid=");
      out.print(rs.getString(1));
      out.write("&date=");
      out.print(String.valueOf(request.getAttribute("Date")));
      out.write('"');
      out.write('>');
      out.print(rs.getString(3));
      out.write("</a>\n");
      out.write("                    <td><a href=\"reserverTicket.jsp?busid=");
      out.print(rs.getString(1));
      out.write("&date=");
      out.print(String.valueOf(request.getAttribute("Date")));
      out.write('"');
      out.write('>');
      out.print(rs.getString(4));
      out.write("</a>\n");
      out.write("                    <td><a href=\"reserverTicket.jsp?busid=");
      out.print(rs.getString(1));
      out.write("&date=");
      out.print(String.valueOf(request.getAttribute("Date")));
      out.write('"');
      out.write('>');
      out.print(rs.getString(5));
      out.write("</a>\n");
      out.write("                    <td><a href=\"reserverTicket.jsp?busid=");
      out.print(rs.getString(1));
      out.write("&date=");
      out.print(String.valueOf(request.getAttribute("Date")));
      out.write('"');
      out.write('>');
      out.print(rs.getString(6));
      out.write("</a>\n");
      out.write("                    <td><a href=\"reserverTicket.jsp?busid=");
      out.print(rs.getString(1));
      out.write("&date=");
      out.print(String.valueOf(request.getAttribute("Date")));
      out.write('"');
      out.write('>');
      out.print(rs.getString(7));
      out.write("</a>\n");
      out.write("                    <td><a href=\"reserverTicket.jsp?busid=");
      out.print(rs.getString(1));
      out.write("&date=");
      out.print(String.valueOf(request.getAttribute("Date")));
      out.write('"');
      out.write('>');
      out.print(rs.getString(8));
      out.write("</a>\n");
      out.write("                </tr>\n");
      out.write("                ");

                        }
                        rs.close();

                    } catch (Exception e) {

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
