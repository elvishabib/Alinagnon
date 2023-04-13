<%-- 
    Document   : userMenu
    Created on : 4 août 2016, 02:23:13
    Author     : akadjelvis
--%>

<div class="left-column col-lg-3 col-md-3 col-sm-12 col-xs-12">
    <div class="userdetails">
        <%
            try {
                String msg = "";
                if (request.getParameter("msg") != null) {
                    out.print("<div class='errorMessage'>" + msg + "</div>");
                }
            } catch (Exception e) {

            }

            try {
                if (session.getAttribute("type").equals("User")) {
                    out.print("Bienvenue, "
                            + session.getAttribute("email"));
                }
            } catch (Exception e) {

            }
        %>
    </div>
    <ul>
        <li><a href="indexUser.jsp">Accueil</a></li>
        <li><a href="rechercheBus.jsp">Rechercher un bus</a></li>
        <li><a href="getReservationInfo.jsp">Imprimer un ticket</a></li>
        <li><a href="annulerTicket.jsp">Annuler un ticket</a></li>
        <li><a href="getReservationHist.jsp">Voir l'historique des réservations</a></li>
        <li><a href="modifierProfil.jsp">Modifier profil</a></li>
        <li><a href="changerMDP.jsp">Changer mot de passe</a></li>
        <li><a href="supprimerUser.jsp">Supprimer compte</a></li>
        <li><a href="logout.jsp">Déconnexion</a></li>
    </ul>
</div>