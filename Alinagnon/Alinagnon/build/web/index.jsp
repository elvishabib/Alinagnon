<%-- 
    Document   : index
    Created on : 4 août 2016, 01:41:16
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel" %>
<link rel="stylesheet" href="assets/css/flexselect.css" type="text/css" media="screen" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<script src="assets/js/jquery.min.js" type="text/javascript"></script> 
<script src="assets/js/liquidmetal.js" type="text/javascript"></script>
<script src="assets/js/jquery.flexselect.js" type="text/javascript"></script>

<script>
    $(document).ready(function () {
        $("select.flexselect").flexselect();
    });
</script>
<script>
    jQuery(function () {
        jQuery("#inf_custom_someDateField").datepicker();
    });
</script>

<script type="text/javascript">
    document.onkeydown = function (event) {

        if (!event) {
            event = window.event;
        }

        var keyCode = event.keyCode;

        if (keyCode == 8 &&
                ((event.target || event.srcElement).tagName != "TEXTAREA") &&
                ((event.target || event.srcElement).tagName != "INPUT")) {

            if (navigator.userAgent.toLowerCase().indexOf("msie") == -1) {
                event.stopPropagation();
            } else {
                alert("prevented");
                event.returnValue = false;
            }

            return false;
        }
    };
</script>
<jsp:include page="layout/header.jsp" />

<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div  class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
        <%
            if (request.getParameter("msg") != null) {
        %>
        <h4 style="color:#ffff22;"><%=request.getParameter("msg")%></h4>
        <%
            }
        %>
    </div>
    <div class="leftWrapper col-lg-6 col-md-6 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            RESERVATION EN LIGNE DE BILLETS BUS</div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <form name="rechercherbus" action="RechercherBus"
                  onsubmit="return validation12();" method="post">

                <div class="form-group col-lg-8 col-md-7 col-sm-10 col-xs-10">
                    <label for="depart">De</label>
                    <select name="depart" id="depart" class="form-control">						
                        <option value=""></option>
                        <%
                            BusModel model = new BusModel();
                            ResultSet rs = model.getBusInfo1(1);

                            while (rs.next()) {%>

                        <option value="<%=rs.getString(1)%>"><%=rs.getString(1).toUpperCase()%></option>
                        <%} %>
                    </select>

                </div>
                <div class="form-group col-lg-8 col-md-7 col-sm-10 col-xs-10">
                    <label for="arrivee">A</label>
                    <select name="arrivee" id="arrivee" class="form-control">
                        <option value=""></option>
                        <%
                            ResultSet rs1 = model.getBusInfo1(2);

                            while (rs1.next()) {%>
                        <option value="<%=rs1.getString(1)%>"><%=rs1.getString(1).toUpperCase()%></option>
                        <%}%>
                    </select>
                </div>
                <div class="form-group col-lg-8 col-md-7 col-sm-10 col-xs-10">
                    <label for="date_depart">Date</label>
                        <input class="tcal" type="text" name="date_depart" />
                </div>
                <div class="form-group col-lg-8 col-md-7 col-sm-10 col-xs-10">
                    <button type="submit"
                            class="btn btn-warning col-lg-5 col-md-5 col-sm-5 col-xs-5"
                            style="float: left">Rechercher</button>
                    <button type="reset"
                            class="btn btn-warning col-lg-5 col-md-5 col-sm-5 col-xs-5"
                            style="float: right">Annuler</button>
                </div>
            </form>
        </div>
    </div>
    <div class="rightWrapper col-lg-5 col-md-5 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            CONNEXION</div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <form name="loginuser" action="Login"
                  onsubmit="return validation13();" method="post">

                <div class="form-group col-lg-8 col-md-7 col-sm-10 col-xs-10">
                    <label for="email">E-mail</label> <input type="text" id="email"
                                                             class="form-control text required email" id="email"
                                                             name="email">
                </div>
                <div class="form-group col-lg-8 col-md-7 col-sm-10 col-xs-10">
                    <label for="mdp">Mot de passe</label> <input type="password"
                                                                 class="form-control" id="mdp" name="mdp">
                </div>
                <div class="form-group">
                    <input type="hidden" name="type" value="User" />
                </div>
                <div class="form-group col-lg-8 col-md-7 col-sm-10 col-xs-10">
                    <button type="submit"
                            class="btn btn-danger col-lg-5 col-md-5 col-sm-5 col-xs-5"
                            style="float: left">Connexion</button>
                    <button type="reset"
                            class="btn btn-danger col-lg-5 col-md-5 col-sm-5 col-xs-5"
                            style="float: right">Annuler</button>
                </div>
            </form>
            <div
                class="centertitle forgotpwd col-lg-8 col-md-7 col-sm-10 col-xs-10">
                <a href="oublieMDP1.jsp">Mot de passe oublié? Cliquez ici!</a>
            </div>
            <div
                class="centertitle logOptions col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <a href="compagnieLogin.jsp">Compagnie? Se connecter!</a> | <a href="ajouterUser.jsp"> S'inscrire!</a>
            </div>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />