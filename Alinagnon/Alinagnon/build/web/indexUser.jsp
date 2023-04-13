<%-- 
    Document   : indexUser
    Created on : 4 août 2016, 02:07:25
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp" />
<jsp:include page="layout/userMenu.jsp" />

<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }
%>

<div class="dashboard container col-lg-9 col-md-9 col-sm-12 col-xs-12">
    <div class="dashboardBody col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12">Tableau de bord</div>
        <div class="dashboarddiv col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="odd col-lg-3 col-md-4 col-sm-12 col-xs-12">
                <div class="dashimg">
                    <span class="glyphicon glyphicon-search"></span>Rechercher un bus
                </div>
                <div class="dashcontent">
                    <a href="rechercheBus.jsp">Rechercher</a>
                </div>
            </div>
            <div class="even col-lg-3 col-md-3 col-sm-12 col-xs-12">
                <div class="dashimg">
                    <span class="glyphicon glyphicon-list-alt"></span>Réserver un ticket
                </div>
                <div class="dashcontent">					
                    <a href="reserverTicket.jsp">Réserver</a>
                </div>
            </div>
            <div class="odd  col-lg-3 col-md-3 col-sm-12 col-xs-12">		
                <div class="dashimg">
                    <span class="glyphicon glyphicon-eye-open"></span>Voir les réservations
                </div>
                <div class="dashcontent">
                    <a href="getReservationHist.jsp">Voir</a>	
                </div>
            </div>
            <div class="even  col-lg-3 col-md-3 col-sm-12 col-xs-12">						
                <div class="dashimg">
                    <span class="glyphicon glyphicon-remove"></span>Annuler un ticket
                </div>
                <div class="dashcontent">
                    <a href="getReservationHist.jsp">Annuler</a>
                </div>
            </div>
            <div class="odd  col-lg-3 col-md-3 col-sm-12 col-xs-12">
                <div class="dashimg">
                    <span class="glyphicon glyphicon-print"></span>Imprimer un ticket
                </div>
                <div class="dashcontent">
                    <a href="getReservationInfo.jsp">Imprimer</a>
                </div>			
            </div>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />


