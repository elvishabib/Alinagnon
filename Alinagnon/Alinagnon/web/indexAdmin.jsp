<%-- 
    Document   : indexAdmin
    Created on : 4 août 2016, 02:06:43
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp" />
<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<jsp:include page="layout/adminMenu.jsp" />
<div class="dashboard container col-lg-9 col-md-9 col-sm-9 col-xs-7">
    <div class="dashboardBody col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12">Tableau de bord</div>
        <div class="dashboarddiv col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="odd col-lg-3 col-md-3 col-sm-3 col-xs-3">
                <div class="dashimg">
                    Voir les compagnies
                </div>
                <div class="dashcontent">
                    <a href="voirCompagnies.jsp">Voir</a>
                </div>
            </div>
            <div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
                <div class="dashimg">
                    Ajouter une compagnie
                </div>
                <div class="dashcontent">					
                    <a href="ajouterCompagnie.jsp">Ajouter</a>
                </div>
            </div>
            <div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
                <div class="dashimg">
                    Supprimer une compagnie
                </div>
                <div class="dashcontent">					
                    <a href="supprimerCompagnieByAdmin.jsp">Supprimer</a>
                </div>
            </div>
            <div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
                <div class="dashimg">
                    Voir les users
                </div>
                <div class="dashcontent">					
                    <a href="voirUsers.jsp">Voir</a>
                </div>
            </div>
            <div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
                <div class="dashimg">
                    Voir les réservations
                </div>
                <div class="dashcontent">					
                    <a href="voirReservations.jsp">Voir</a>
                </div>
            </div>
            <div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
                <div class="dashimg">
                    Déconnexion
                </div>
                <div class="dashcontent">					
                    <a href="logout.jsp">Se déconnecter</a>
                </div>
            </div>
        </div>
    </div>
</div>


<jsp:include page="layout/footer.jsp" />
