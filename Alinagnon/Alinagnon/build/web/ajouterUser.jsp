<%-- 
    Document   : ajouterUser
    Created on : 4 août 2016, 02:16:14
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel"%>
<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>

<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Formulaire d'inscription
        </div>
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%
                String msg = request.getParameter("msg");
                if (msg != null) {
                    out.print(msg);
                }
            %>
        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="ajouteruser" action="AjouterUser" onsubmit="return validation15();" method="post">
                <div class="form-group">
                    <label for="email">E-mail</label> 
                    <input type="text" name="email" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="mdp">Mot de passe</label> 
                    <input type="password" name="mdp" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="confirmermdp">Confirmer mot de passe</label> 
                    <input type="password" name="confirmermdp" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="nom">Nom</label> 
                    <input type="text" name="nom" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="prenom">Prénom</label> 
                    <input type="text" name="prenom" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="ville">Ville</label> 
                    <input type="text" name="ville" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="adresse">Adresse</label> 
                    <textarea name="adresse" class="form-control" rows="3"></textarea>
                </div>
                <div class="form-group">
                    <label for="telephone">Téléphone</label> 
                    <input type="text" name="telephone" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="sq">Question de sécurité</label>
                    <select name="sq" id="sq" class="form-control">
                        <option value="Quel est votre livre d'enfant prefere?">Quel est votre livre d'enfant prefere?</option>
                        <option value="Quel est selon vous le metier ideal?">Quel est selon vous le metier ideal?</option>
                        <option value="Quel etait votre surnom quand vous etiez enfant?">Quel etait votre surnom quand vous etiez enfant?</option>
                        <option value="Quel etait le modele de votre premier vehicule?">Quel etait le modele de votre premier vehicule?</option>
                        <option value="A l'ecole, qui etait votre vedette ou personnage de cinema prefere?">A l'ecole, qui etait votre vedette ou personnage de cinema prefere?</option>
                        <option value="Quel etait le nom de votre premier patron?">Quel etait le nom de votre premier patron?</option>
                        <option value="Dans quel ville vos parents se sont ils rencontres?">Dans quel ville vos parents se sont ils rencontres?</option>
                        <option value="Quel etait le nom de votre premier animal de compagnie?">Quel etait le nom de votre premier animal de compagnie?</option>
                        <option value="Quel etait le nom de votre meilleur ami quand vous etiez adolescent?">Quel etait le nom de votre meilleur ami quand vous etiez adolescent?</option>
                        <option value="Quel etait le premier film que vous avez vu au cinema?">Quel etait le premier film que vous avez vu au cinema?</option>
                        <option value="Quel est le premier plat que vous avez appris a preparer?">Quel est le premier plat que vous avez appris a preparer?</option>
                        <option value="Quel etait le nom de votre enseignant prefere au primaire?">Quel etait le nom de votre enseignant prefere au primaire?</option>
                        <option value="Quel etait votre destination la premiere fois que vous avez pris l'avion?">Quel etait votre destination la premiere fois que vous avez pris l'avion?</option>
                        <option value="Quel est le nom de la rue ou vous avez grandi?">Quel est le nom de la rue ou vous avez grandi?</option>
                        <option value="Quel est le nom de la premiere plage que vous avez visitee?">Quel est le nom de la premiere plage que vous avez visitee?</option>
                        <option value="Quel est le premier album que vous avez achete?">Quel est le premier album que vous avez achete?</option>
                        <option value="Quel est le nom de votre equipe de sport preferee?">Quel est le nom de votre equipe de sport preferee?</option>
                        <option value="Comment s'appelait l'enseignant que vous aimiez le moins?"></option>Comment s'appelait l'enseignant que vous aimiez le moins?</select>
                </div>
                <div class="form-group">
                    <label for="sa">Réponse</label> 
                    <input type="text" name="sa" class="form-control"/>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-danger">S'inscrire</button>
                    <button type="reset" class="btn btn-danger">Annuler</button>
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />



