package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel;

public final class ajouterUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<div class=\"mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("    <div class=\"centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("        <div class=\"centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("            Formulaire d'inscription\n");
      out.write("        </div>\n");
      out.write("        <div class=\"errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10\">\n");
      out.write("            ");

                String msg = request.getParameter("msg");
                if (msg != null) {
                    out.print(msg);
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"centerform col-lg-12 col-md-12 col-sm-12c col-xs-12\">\n");
      out.write("            <form name=\"ajouteruser\" action=\"AjouterUser\" onsubmit=\"return validateLogin15();\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\">E-mail</label> \n");
      out.write("                    <input type=\"text\" name=\"email\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"mdp\">Mot de passe</label> \n");
      out.write("                    <input type=\"password\" name=\"mdp\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"confirmermdp\">Confirmer mot de passe</label> \n");
      out.write("                    <input type=\"password\" name=\"confirmermdp\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nom\">Nom</label> \n");
      out.write("                    <input type=\"text\" name=\"nom\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"prenom\">Prénom</label> \n");
      out.write("                    <input type=\"text\" name=\"prenom\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"ville\">Ville</label> \n");
      out.write("                    <input type=\"text\" name=\"ville\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"adresse\">Adresse</label> \n");
      out.write("                    <textarea name=\"adresse\" class=\"form-control\" rows=\"3\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"telephone\">Téléphone</label> \n");
      out.write("                    <input type=\"text\" name=\"telephone\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"sq\">Question de sécurité</label>\n");
      out.write("                    <select name=\"sq\" id=\"sq\" class=\"form-control\">\n");
      out.write("                        <option value=\"Quel est votre livre d'enfant prefere?\">Quel est votre livre d'enfant prefere?</option>\n");
      out.write("                        <option value=\"Quel est selon vous le metier ideal?\">Quel est selon vous le metier ideal?</option>\n");
      out.write("                        <option value=\"Quel etait votre surnom quand vous etiez enfant?\">Quel etait votre surnom quand vous etiez enfant?</option>\n");
      out.write("                        <option value=\"Quel etait le modele de votre premier vehicule?\">Quel etait le modele de votre premier vehicule?</option>\n");
      out.write("                        <option value=\"A l'ecole, qui etait votre vedette ou personnage de cinema prefere?\">A l'ecole, qui etait votre vedette ou personnage de cinema prefere?</option>\n");
      out.write("                        <option value=\"Quel etait le nom de votre premier patron?\">Quel etait le nom de votre premier patron?</option>\n");
      out.write("                        <option value=\"Dans quel ville vos parents se sont ils rencontres?\">Dans quel ville vos parents se sont ils rencontres?</option>\n");
      out.write("                        <option value=\"Quel etait le nom de votre premier animal de compagnie?\">Quel etait le nom de votre premier animal de compagnie?</option>\n");
      out.write("                        <option value=\"Quel etait le nom de votre meilleur ami quand vous etiez adolescent?\">Quel etait le nom de votre meilleur ami quand vous etiez adolescent?</option>\n");
      out.write("                        <option value=\"Quel etait le premier film que vous avez vu au cinema?\">Quel etait le premier film que vous avez vu au cinema?</option>\n");
      out.write("                        <option value=\"Quel est le premier plat que vous avez appris a preparer?\">Quel est le premier plat que vous avez appris a preparer?</option>\n");
      out.write("                        <option value=\"Quel etait le nom de votre enseignant prefere au primaire?\">Quel etait le nom de votre enseignant prefere au primaire?</option>\n");
      out.write("                        <option value=\"Quel etait votre destination la premiere fois que vous avez pris l'avion?\">Quel etait votre destination la premiere fois que vous avez pris l'avion?</option>\n");
      out.write("                        <option value=\"Quel est le nom de la rue ou vous avez grandi?\">Quel est le nom de la rue ou vous avez grandi?</option>\n");
      out.write("                        <option value=\"Quel est le nom de la premiere plage que vous avez visitee?\">Quel est le nom de la premiere plage que vous avez visitee?</option>\n");
      out.write("                        <option value=\"Quel est le premier album que vous avez achete?\">Quel est le premier album que vous avez achete?</option>\n");
      out.write("                        <option value=\"Quel est le nom de votre equipe de sport preferee?\">Quel est le nom de votre equipe de sport preferee?</option>\n");
      out.write("                        <option value=\"Comment s'appelait l'enseignant que vous aimiez le moins?\"></option>Comment s'appelait l'enseignant que vous aimiez le moins?</select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"sa\">Réponse</label> \n");
      out.write("                    <input type=\"text\" name=\"sa\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-danger\">S'inscrire</button>\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-danger\">Annuler</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/footer.jsp", out, false);
      out.write("\n");
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
