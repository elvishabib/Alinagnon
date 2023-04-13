<%-- 
    Document   : modifierProfil
    Created on : 4 août 2016, 02:11:40
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.CompagnieModel"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.UserModel"%>

<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<jsp:include page="layout/header.jsp" />
<%
    if (session.getAttribute("type").equals("User")) {
%>
<jsp:include page="layout/userMenu.jsp" />
<%
} else {
%>
<div class="left-column col-lg-3 col-md-3 col-sm-3 col-xs-3">
    <ul>
        <li><a href="ajouterBus.jsp">Ajouter un bus</a>
        </li>
        <li><a href="getBus.jsp">Voir les bus</a>
        </li>
        <li><a href="modifierProfil.jsp">Modifier profil</a>
        </li>
        <li><a href="changerMDP.jsp">Changer mot de passe</a>
        </li>
        <li><a href="supprimerCompagnie.jsp">Supprimer compte</a>
        </li>
        <li><a href="logout.jsp">Déconnexion</a>
        </li>
    </ul>
</div>
<%
    }
%>
<script type="text/javascript" src="assets/js/validation.js"></script>
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-6 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Modifier profil</div>
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%
                try {
                    if (request.getParameter("msg") != null) {
                        out.print("<div>" + request.getParameter("msg") + "</div>");
                    }
                } catch (Exception e) {
                    out.print("Une erreur est parvenue...");
                }
            %>
        </div>
        <%
            if (session.getAttribute("type").equals("User")) {
                UserModel um = new UserModel();
                um.setId_user(String.valueOf(session.getAttribute("id_user")));
                ResultSet rs = um.getUser();
                while (rs.next()) {
        %>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="modifierprofil"
                  action="ModifierProfil"
                  onsubmit="return validation9();" method="post">
                <div class="form-group">
                    <label for="nom">Nom</label> <input type="text"
                                                        name="nom" class="form-control" value="<%=rs.getString(2)%>" />
                </div>
                <div class="form-group">
                    <label for="prenom">Prénom</label> <input type="text"
                                                              name="prenom" class="form-control" value="<%=rs.getString(3)%>" />
                </div>
                <div class="form-group">
                    <label for="adresse">Adresse</label> <input type="text"
                                                                name="adresse" class="form-control" value="<%=rs.getString(4)%>" />
                </div>
                <div class="form-group">
                    <label for="ville">Ville</label> <input type="text" name="ville"
                                                            class="form-control" value="<%=rs.getString(5)%>" />
                </div>
                <div class="form-group">
                    <label for="email">E-mail</label> <input type="text" name="email"
                                                             class="form-control" value="<%=rs.getString(6)%>" />
                </div>
                <div class="form-group">
                    <label for="telephone">Téléphone</label> <input type="text"
                                                                    name="telephone" class="form-control"
                                                                    value="<%=rs.getString(7)%>" />
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-danger">Modifier</button>
                </div>
            </form>
            <%
                }
                rs.close();
            } else {
                CompagnieModel bom = new CompagnieModel();
                bom.setId_compagnie(String.valueOf(session.getAttribute("id_user")));
                ResultSet rs = null;
                rs = bom.getCompagnie();
                while (rs.next()) {
            %>
            <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
                <form name="form" action="ModifierProfil" onsubmit="return validation9();" method="post">
                    <div class="form-group">
                        <label for="email">E-mail</label> <input type="text" name="email"
                                                                 class="form-control" value="<%=rs.getString(4)%>" />
                    </div>
                    <div class="form-group">
                        <label for="nom">Nom</label> <input type="text"
                                                            name="nom" class="form-control" value="<%=rs.getString(2)%>" />
                    </div>
                    <div class="form-group">
                        <label for="adresse">Adresse</label> <input type="text"
                                                                    name="adresse" class="form-control" value="<%=rs.getString(3)%>" />
                    </div>
                    <div class="form-group">
                        <label for="ville">Ville</label> <input type="text" name="ville"
                                                                class="form-control" value="<%=rs.getString(5)%>" />
                    </div>

                    <div class="form-group">
                        <label for="telephone">Téléphone</label> <input type="text"
                                                                        name="telephone" class="form-control"
                                                                        value="<%=rs.getString(6)%>" />
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-danger">Modifier</button>
                    </div>
                    <%
                            }
                        }
                    %>
                </form>				
            </div>
        </div>
    </div>
</div>

<jsp:include page="layout/footer.jsp" />