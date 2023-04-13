<%-- 
    Document   : getBus
    Created on : 4 août 2016, 02:12:39
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.controller.SupprimerBus"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.http.*"%>
<jsp:include page="layout/header.jsp" />
<%
    if (session.getAttribute("type") == null || (!session.getAttribute("type").equals("Compagnie"))) {
        response.sendRedirect("compagnieLogin.jsp");
    }
%>
<%
    String id_compagnie = String.valueOf(session.getAttribute("id_user"));
    System.out.print(id_compagnie);
    ResultSet rs = null;
    BusModel model = new BusModel();
    model.setId_compagnie(id_compagnie);
    rs = model.VoirBus();
%>
<div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
    <%
        if (request.getParameter("msg") != null) {
    %>
    <h4><%=request.getParameter("msg")%></h4>
    <%
        }
    %>
</div>
<div class="left-column col-lg-3 col-md-3 col-sm-3 col-xs-3">
    <ul>
        <li><a href="ajouterBus.jsp">Ajouter un bus</a></li>
        <li><a href="getBus.jsp">Voir les bus</a></li>
        <li><a href="modifierProfil.jsp">Modifier profil</a></li>
        <li><a href="changerMDP.jsp">Changer mot de passe</a></li>
        <li><a href="supprimerCompagnie.jsp">Supprimer compte</a></li>
        <li><a href="logout.jsp">Déconnexion</a></li>
    </ul>
</div>
<br/><br/>
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Bus de la compagnie
        </div>
        <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <table class ="table table-bordered">
                <tr>
                    <td>No Bus</td>
                    <td>Nom</td>
                    <td>Type</td>
                    <td>De</td>
                    <td>A</td>
                    <td>Heure Départ</td>
                    <td>Heure Arrivée</td>
                    <td>Prix</td>
                    <td>Jours de voyages</td>
                    <td>Sièges</td>
                    <td>  </td>
                    <td>  </td>
                </tr>
                <%
                    String id_bus = "";
                    String nom_bus = "";
                    String type_bus = "";
                    String heure_depart = "";
                    String duree_voyage = "";
                    String ville_depart = "";
                    String ville_arrivee = "";
                    float prix_voyage = 0;
                    int sieges = 0;
                    String jours = "";

                    while (rs.next()) {
                        if (id_bus.equals("")) {
                            id_bus = rs.getString(1);
                            nom_bus = rs.getString(2);
                            type_bus = rs.getString(3);
                            ville_depart = rs.getString(4);
                            ville_arrivee = rs.getString(5);
                            heure_depart = rs.getString(6);
                            duree_voyage = rs.getString(7);
                            prix_voyage = rs.getFloat(8);
                            jours = jours + rs.getString(9);
                            sieges = rs.getInt(10);
                        } else if (id_bus.equals(rs.getString(1))) {
                            jours = jours + " - ";
                            jours = jours + rs.getString(9);
                        } else {
                %>
                <tr>
                    <td><%=id_bus%></td>
                    <td><%=nom_bus%></td>
                    <td><%=type_bus%></td>
                    <td><%=ville_depart%></td>
                    <td><%=ville_arrivee%></td>
                    <td><%=heure_depart%></td>
                    <td><%=duree_voyage%></td>
                    <td><%=prix_voyage%></td>
                    <td><%=jours%></td>
                    <td><%=sieges%></td>
                    <td>
                        <a href="modifierBus.jsp?id_bus=<%=id_bus%>"><span class="glyphicon glyphicon-edit"></span></a>
                    </td>
                    <td>
                        <a href="SupprimerBus?id_bus=<%=id_bus%>"><span class="glyphicon glyphicon-trash"></span></a>
                    </td>
                </tr>
                <%
                            id_bus = rs.getString(1);
                            nom_bus = rs.getString(2);
                            type_bus = rs.getString(3);
                            ville_depart = rs.getString(4);
                            ville_arrivee = rs.getString(5);
                            heure_depart = rs.getString(6);
                            duree_voyage = rs.getString(7);
                            prix_voyage = rs.getFloat(8);
                            jours = rs.getString(9);
                            sieges = rs.getInt(10);
                        }
                    }
                %>
                <tr>
                    <td><%=id_bus%></td>
                    <td><%=nom_bus%></td>
                    <td><%=type_bus%></td>
                    <td><%=ville_depart%></td>
                    <td><%=ville_arrivee%></td>
                    <td><%=heure_depart%></td>
                    <td><%=duree_voyage%></td>
                    <td><%=prix_voyage%></td>
                    <td><%=jours%></td>
                    <td><%=sieges%></td>
                    <td>
                        <a href="modifierBus.jsp?id_bus=<%=id_bus%>"><span class="glyphicon glyphicon-edit"></span></a>
                    </td>
                    <td>
                        <a href="SupprimerBus?id_bus=<%=id_bus%>"><span class="glyphicon glyphicon-trash"></span></a>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</div>

<jsp:include page="layout/footer.jsp" />