<%-- 
    Document   : supprimerCompagnieByAdmin
    Created on : 4 août 2016, 02:10:52
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*" %>
<%@ page import="java.sql.ResultSet" %>
<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("adminLogin.jsp");
    }
%>
<jsp:include page="layout/header.jsp" />
<%
    CompagnieModel model = new CompagnieModel();
    ResultSet rs = model.getAllCompagnies();
%>
<div class="left-column col-lg-3 col-md-3 col-sm-12 col-xs-12">
    <ul>
        <li><a href="ajouterCompagnie.jsp">Ajouter une compagnie</a></li>
        <li><a href="supprimerCompagnieByAdmin.jsp">Supprimer une compagnie</a></li>
        <li><a href="logout.jsp">Déconnexion</a></li>
    </ul>
</div>
<div class="errordiv">
    <%
        if (request.getParameter("msg") != null) {
    %>
    <h4 style="color:red"><%=request.getParameter("msg")%></h4>
    <%
        }
    %>
</div>
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Supprimer une compagnie
        </div>
        <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <table class ="table table-bordered">
                <tr>
                    <td>No Compagnie</td>
                    <td>Nom</td>
                    <td>Adresse</td>
                    <td>E-mail</td>
                    <td>Ville</td>
                    <td>Téléphone</td>
                    <td>Mot de passe</td>
                    <td>  </td>
                </tr>
                <%
                    while (rs.next()) {
                %>
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                    <td><%=rs.getString(6)%></td>
                    <td><%=rs.getString(7)%></td>
                    <td><a href="SupprimerCompagnieByAdmin?id_compagnie=<%=rs.getString(1)%>"><span class="glyphicon glyphicon-trash"></span></a></td>
                </tr>
                <%}%>
            </table>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />