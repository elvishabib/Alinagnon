<%-- 
    Document   : changerMDP
    Created on : 4 août 2016, 02:10:19
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<% } else {
%>
<div class="left-column col-lg-3 col-md-3 col-sm-3 col-xs-3">
    <ul>
        <li><a href="ajouterBus.jsp">Ajouter un bus</a></li>
        <li><a href="getBus.jsp">Voir les bus</a></li>
        <li><a href="modifierProfil.jsp">Modifier profil</a></li>
        <li><a href="changerMDP.jsp">Changer mot de passe</a></li>
        <li><a href="supprimerCompagnie.jsp">Supprimer compte</a></li>
        <li><a href="logout.jsp">Déconnexion</a></li>
    </ul>
</div>
<% } %>
<script type="text/javascript" src="assets/js/validation.js"></script>
<div class="mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-6 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Changer mot de passe</div>
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%
                if (request.getParameter("msg") != null) {
            %>
            <p><%=String.valueOf(request.getParameter("msg"))%>
                <%
                    }
                %>

        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="changermdp" action="ChangerMDP" onsubmit="return validation5();" method="post">

                <div class="form-group">
                    <label for="ancienmdp">Mot de passe</label> <input
                        type="password" name="ancienmdp" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="nouveaumdp">Nouveau mot de passe</label> <input
                        type="password" name="nouveaumdp" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="confirmermdp">Confirmer mot de passe</label> <input
                        type="password" name="confirmermdp" class="form-control" />
                </div>
                <%
                    if (String.valueOf(session.getAttribute("type")).equalsIgnoreCase(
                            "Admin")) {
                %>
                <div class="form-group">
                    <input type="hidden" name="uname"
                           value="<%=String.valueOf(session.getAttribute("email"))%>" />
                </div>

                <%
                    }
                %>
                <div class="form-group">
                    <input type="submit" class="btn btn-danger" value="Changer" /> <input
                        type="reset" class="btn btn-danger" value="Annuler" />
                </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="layout/footer.jsp" />
