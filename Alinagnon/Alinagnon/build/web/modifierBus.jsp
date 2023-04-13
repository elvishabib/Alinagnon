<%-- 
    Document   : modifierBus
    Created on : 4 août 2016, 02:11:29
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
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Modifier les informations du bus
        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">

            <form name="modifierbus" action="ModifierBus"
                  onsubmit="return validation8();" method="post">

                <div class="form-group">
                    <label for="nom_bus">Nom</label>
                    <input type="text" name="nom_bus" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="type_bus">Type</label>
                    <select class="form-control" name="type_bus">
                        <option value="Climatisé">Climatisé</option>
                        <option value="Non-Climatisé">Non-Climatisé</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="ville_depart">Départ</label>
                    <input type="text" name="ville_depart" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="ville_arrivee">Arrivée</label>
                    <input type="text" name="ville_arrivee" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="heure_depart">Heure Départ(HH:MM)</label>
                    <input type="text" name="heure_depart" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="duree_voyage">Durée (HH:MM)</label>
                    <input type="text" name="duree_voyage" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="jours_voyage">Jours de voyages</label><br/>
                    <input type="checkbox" name="jours_voyage" value="Sunday">Dimanche<br/>
                    <input type="checkbox" name="jours_voyage" value="Monday">Lundi<br/>
                    <input type="checkbox" name="jours_voyage" value="Tuesday">Mardi<br/>
                    <input type="checkbox" name="jours_voyage" value="Wednesday">Mercredi<br>
                    <input type="checkbox" name="jours_voyage" value="Thursday">Jeudi<br/>
                    <input type="checkbox" name="jours_voyage" value="Friday">Vendredi<br/>
                    <input type="checkbox" name="jours_voyage" value="Saturday">Samedi<br>
                </div>
                <div class="form-group">
                    <label for="prix_voyage">Prix</label>
                    <input type="text" name="prix_voyage" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="sieges">Sièges</label>
                    <input type="text" name="prix_voyage" class="form-control" />
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-danger" value="Modifier">
                    <input type="reset"  class="btn btn-danger" value="Annuler">
                </div>	
            </form>	
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />
