<%-- 
    Document   : ajouterBus
    Created on : 4 août 2016, 02:08:38
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel"%>
<%@page import="java.sql.ResultSet"%>
<%
    if (session.getAttribute("type") == null || (!session.getAttribute("type").equals("Compagnie"))) {
        response.sendRedirect("compagnieLogin.jsp");
    }
%>
<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
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
            Ajouter un bus</div>


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
            <form name="ajouterbus" action="AjouterBus"
                  onsubmit="return validation();" method="post">
                <div class="form-group">
                    <label for="nom_bus">Nom du bus</label> 
                    <input type="text" name="nom_bus" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="type_bus">Type de bus</label> 
                    <select name="type_bus"
                            class="form-control">
                        <option Value="Climatise">Climatise</option>
                        <option Value="Non-Climatise">Non-Climatise</option>
                    </select> 
                </div>
                <div class="form-group">
                    <label for="ville_depart">Ville départ</label> 
                    <input type="text" name="ville_depart" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="ville_arrivee">Ville d'arrivée</label> 
                    <input type="text" name="ville_arrivee" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="heure_depart">Heure départ</label> 
                    <input type="text" name="heure_depart" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="duree_voyage">Heure d'arrivée</label> 
                    <input type="text" name="duree_voyage" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="jours_voyages">Jours de voyage</label><br /> 
                    <input type="checkbox" name="jours_voyages1" value="S" checked>Dimanche<br />
                    <input type="checkbox" name="jours_voyages2" value="M">Lundi<br />
                    <input type="checkbox" name="jours_voyages3" value="T">Mardi<br />
                    <input type="checkbox" name="jours_voyages4" value="W">Mercredi<br />
                    <input type="checkbox" name="jours_voyages5" value="H">Jeudi<br />
                    <input type="checkbox" name="jours_voyages6" value="F">Vendredi<br />
                    <input type="checkbox" name="jours_voyages7" value="A">Samedi<br />
                </div>
                <div class="form-group">
                    <label for="prix_voyage">Tarifs</label> 
                    <input type="text" name="prix_voyage" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="sieges">Nombre de places disponible</label> 
                    <input type="text" name="sieges" class="form-control" />
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

