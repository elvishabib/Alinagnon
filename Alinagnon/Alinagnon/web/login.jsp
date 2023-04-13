<%-- 
    Document   : login
    Created on : 4 août 2016, 02:14:38
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel"%>
<%@page import="java.sql.ResultSet"%>

<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>

<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Connexion
        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="login" action="Login"
                  onsubmit="return validation14();" method="post">

                <div class="form-group">
                    <label for="email">E-mail</label> 
                    <input type="text" name="email" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="mdp">Mot de passe</label> 
                    <input type="password" name="mdp" class="form-control"/>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-danger">Connexion</button>
                    <button type="reset" class="btn btn-danger">Annuler</button>
                </div>
            </form>	
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />





