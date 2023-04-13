<%-- 
    Document   : voirReservations
    Created on : 4 août 2016, 02:18:02
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.AdminModel"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.UserModel"%>
<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("adminLogin.jsp");
    }
%>
<jsp:include page="layout/header.jsp" />
<jsp:include page="layout/adminMenu.jsp" />
<%
    ResultSet rs = null;
    AdminModel am = new AdminModel();
    am.setId_user(String.valueOf(session.getAttribute("id_user")));
    rs = am.VoirReservations();
%>
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-9 col-xs-9">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Réservations </div>
        <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <table class="table table-bordered">
                <tr>
                    <td>No Réservation</td>
                    <td>No Bus</td>
                    <td>Date</td>
                    <td>Heure</td>
                </tr>
                <%
                    while (rs.next()) {
                %>
                <tr>
                    <td><%=rs.getString(1)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                </tr>
                <%
                    }
                    rs.close();
                %>
            </table>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />







