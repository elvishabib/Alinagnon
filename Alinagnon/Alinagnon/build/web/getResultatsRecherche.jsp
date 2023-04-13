<%-- 
    Document   : getResultatsRecherche
    Created on : 4 août 2016, 02:14:22
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<jsp:include page="layout/header.jsp" />
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Résultats de la recherche
        </div>
        <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <table class ="col-lg-6 col-md-6 col-sm-12 col-xs-12 table table-bordered">
                <tr>
                    <td>Nom</td>
                    <td>Type</td>
                    <td>Heure Départ</td>
                    <td>Heure Arrivée</td>
                    <td>De</td>
                    <td>A</td>
                    <td>Tarifs</td>
                    <td></td>
                </tr>
                <%
                    ResultSet rs = (ResultSet) request.getAttribute("InfoBus");
                    try {
                        while (rs.next()) {
                %>
                <tr>
                    <td><%=rs.getString(2)%>
                    <td><%=rs.getString(3)%>
                    <td><%=rs.getString(4)%>
                    <td><%=rs.getString(5)%>
                    <td><%=rs.getString(6)%>
                    <td><%=rs.getString(7)%>
                    <td><%=rs.getString(8)%>
                    <td><a href="reserverTicket.jsp?id_bus=<%=rs.getString(1)%>&date=<%=String.valueOf(request.getAttribute("Date"))%>">Réserver</a>
                </tr>
                <%
                        }
                        rs.close();

                    } catch (Exception e) {

                    }
                %>
            </table>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />
