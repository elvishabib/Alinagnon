<%-- 
    Document   : ajouterCompagnie
    Created on : 4 août 2016, 02:08:09
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<jsp:include page="layout/adminMenu.jsp" />
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <%if (request.getParameter("msg") != null) {%>
            <h4><%=request.getParameter("msg")%></h4>	
            <%}%>
            Ajouter une compagnie
        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <form name="ajoutercompagnie" action="AjouterCompagnie" onsubmit="return validation1();" method="post">
                <div class="form-group">
                    <label for="nom_compagnie">Nom</label>
                    <input type="text" name="nom_compagnie" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="email">E-mail</label>
                    <input type="text" name="email" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="adresse">Adresse</label> 
                    <input type="text" name="adresse" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="ville">Ville</label> 
                    <input type="text" name="ville" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="telephone">Telephone</label>
                    <input type="text" name="telephone" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="newmdp">Mot de passe</label>
                    <input type="text" name="mdp" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="mdp">Confirmer mot de passe</label>
                    <input type="text" name="newmdp" class="form-control" />
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-danger" value="Ajouter" />
                    <input type="reset" class="btn btn-danger" value="Annuler" />
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />