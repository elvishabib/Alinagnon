<%-- 
    Document   : indexCompagnie
    Created on : 4 août 2016, 02:07:41
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp"/>
<%
    if (session.getAttribute("type") == null || (!session.getAttribute("type").equals("Compagnie"))) {
        response.sendRedirect("compagnieLogin.jsp");
    }
%>
<div class="left-column col-lg-3 col-md-3 col-sm-3 col-xs-3">
    <ul>
        <li><a href="ajouterBus.jsp">Ajouter un bus</a></li>
        <li><a href="getBus.jsp">Voir les bus</a></li>
        <li><a href="modifierProfil.jsp">Modifier profil</a></li>
        <li><a href="changerMDP.jsp">Changer mot de passe</a></li>
        <li><a href="supprimerCompagnie.jsp">Supprimer compte</a></li>
        <li><a href="logout.jsp">Déconnexion</a>
    </ul>
</div>

<div class="dashboard container col-lg-9 col-md-9 col-sm-9 col-xs-7">
    <div class="dashboardBody col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12">Tableau de bord</div>
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%
                try {
                    String msg = "";
                    if (request.getParameter("msg") != null) {
                        msg = request.getParameter("msg");
                        out.print("<div><p>" + msg + "</p></div>");
                        System.out.print("");
                    }
                } catch (Exception e) {
                }
            %>
        </div>
        <div class="dashboarddiv col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="odd col-lg-3 col-md-3 col-sm-3 col-xs-3">
                <div class="dashimg">
                    Ajouter un bus
                </div>
                <div class="dashcontent">
                    <a href="ajouterBus.jsp">Ajouter</a>
                </div>
            </div>
            <div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
                <div class="dashimg">
                    Voir les bus
                </div>
                <div class="dashcontent">					
                    <a href="getBus.jsp">Voir</a>
                </div>
            </div>
            <div class="odd  col-lg-3 col-md-3 col-sm-3 col-xs-3">			
                <div class="dashimg">
                    Changer mot de passe
                </div>
                <div class="dashcontent">
                    <a href="changerMDP.jsp">Changer</a>	
                </div>
            </div>
            <div class="odd  col-lg-3 col-md-3 col-sm-3 col-xs-3">			
                <div class="dashimg">
                    Supprimer compte
                </div>
                <div class="dashcontent">
                    <a href="supprimerCompagnie.jsp">supprimer</a>	
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />

