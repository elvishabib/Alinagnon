package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class supprimerUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/validation.js\"></script>\n");

    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }

      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10\">\n");
      out.write("        ");

            if (request.getParameter("msg") != null) {
        
      out.write("\n");
      out.write("        <h4>");
      out.print(request.getParameter("msg"));
      out.write("</h4>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"centerformWrapper col-lg-6 col-md-6 col-sm-12 col-xs-4\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Supprimer user\n");
      out.write("        </div>\n");
      out.write("        <div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("            <form name=\"form\" action=\"SupprimerUser\"\n");
      out.write("                  onsubmit=\"return validateLogin7();\" method=\"post\">\n");
      out.write("                <form name=\"form\" method=\"get\" action=\"SupprimerUser\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"telephone\">Téléphone</label>\n");
      out.write("                        <input type=\"text\" id=\"phonenumber\" name=\"telephone\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"mdp\">Mot de passe</label>\n");
      out.write("                        <input type=\"password\" id=\"password\" class=\"form-control\" name=\"mdp\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-danger\" value=\"Supprimer\">\n");
      out.write("                        <input type=\"reset\"  class=\"btn btn-danger\" value=\"Annuler\">\n");
      out.write("                    </div>\t\n");
      out.write("                </form>\t\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\t\n");
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
