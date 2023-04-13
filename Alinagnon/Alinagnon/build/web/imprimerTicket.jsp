<%-- 
    Document   : imprimerTicket
    Created on : 4 août 2016, 02:15:44
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*"%>
<%@page import="java.sql.ResultSet"%>

<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.css" type="text/css"/>
<link rel="stylesheet" href="assets/css/alinagnonStyle.css" type="text/css"/>
<link rel="stylesheet" href="assets/css/menuStyle.css" type="text/css"/>
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap-theme.css" />
<link rel="stylesheet" type="text/css" href="assets/calendar/tcal.css" />
<link rel="stylesheet" href="assets/css/flexselect.css" type="text/css" media="screen" />
<link rel="stylesheet" href="assets/css/jqueryCalendar.css">
<link rel="stylesheet" type="text/css" href="assets/calendar/tcal.css" />
<script type="text/javascript" src="assets/calendar/tcal.js"></script>
<script type="text/javascript" src="assets/bootstrap/js/bootstrap.js"></script>
<script src="assets/js/jquery.min.js" type="text/javascript"></script>
<script src="assets/js/liquidmetal.js" type="text/javascript"></script>
<script src="assets/js/query.flexselect.js" type="text/javascript"></script>
<script type="text/javascript" src="assets/calendar/tcal.js"></script>
<script type="text/javascript" src="assets/js/validation.js"></script>
<script type="text/javascript">
function openPage(pageURL)
{
window.location.href = pageURL;
}
</script>
<%

    ResultSet rs = (ResultSet) request.getAttribute("ticket");
    if (rs != null) {
        while (rs.next()) {%>
<div class="mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Information sur la réservation
        </div>
        <div class="tableContent col-lg-9 col-md-9 col-sm-9 col-xs-9">
            <table class="col-lg-6 col-md-6 col-sm-12 col-xs-12  table table-bordered">
                <tr>
                <tr>
                    <td>No Réservation</td>
                    <td>No Bus</td>
                    <td>Utilisateur</td>
                    <td>Date Départ</td>
                    <td>Heure Départ</td>
                    <td>Sièges</td>
                </tr>
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><%=rs.getString(6)%></td>
                </tr>
            </table>
        </div>
        <div class="form-group">
            <button class="btn btn-success" onclick="javascript:window.print()"><span class="glyphicon glyphicon-print">&nbsp;&nbsp;</span>Imprimer</button>
            <button class="btn btn-success" onclick="openPage('indexUser.jsp')"><span class="glyphicon glyphicon-home">&nbsp;&nbsp;</span>Accueil</button>
        </div>
    </div>
</div>



<%	}
    }%>