<%-- 
    Document   : supprimerCompagnie
    Created on : 4 août 2016, 02:10:39
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<%
    if (session.getAttribute("type") == null || (!session.getAttribute("type").equals("Compagnie"))) {
        response.sendRedirect("compagnieLogin.jsp");
    }
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
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Supprimer une compagnie</div>


        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%
                if (request.getParameter("msg") != null) {
            %>
            <h4><%=request.getParameter("msg")%></h4>
            <%
                }
            %>
        </div>

        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="supprcompagnie"
                  action="SupprimerCompagnie"
                  onsubmit="return validation6();" method="post">

                <div class="form-group">
                    <label for="telephone">Téléphone</label> <input type="text"
                                                                    id="telephone" class="form-control" name="telephone">
                </div>
                <div class="form-group">
                    <label for="mdp">Mot de passe</label> <input
                        type="password" id="password" class="form-control" name="mdp">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-danger" value="Supprimer">
                    <input type="reset" class="btn btn-danger" value="Annuler">
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />








