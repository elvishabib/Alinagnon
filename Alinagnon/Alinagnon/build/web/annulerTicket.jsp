<%-- 
    Document   : annulerTicket
    Created on : 4 août 2016, 02:10:01
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*"%>
<%@page import="java.sql.ResultSet"%>
<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<jsp:include page="layout/userMenu.jsp" />
<%
    ResultSet rs = null;
    UserModel um = new UserModel();
    um.setEmail(String.valueOf(session.getAttribute("id_user")));
    rs = um.VoirReservationsUser();
%>
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-9 col-xs-9">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Historique des réservations
        </div>
        <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <table class ="table table-bordered">
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
                <%}
                    rs.close();
                %>
            </table>
        </div>
    </div>
</div>
<div class="centerformWrapper col-lg-5 col-md-5 col-sm-2 col-xs-2">
    <div class="formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12">Annuler un ticket</div>
    <div class="errordiv col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <%
            if (request.getParameter("msg") != null) {
        %>
        <h4><%=request.getParameter("msg")%> for id_reservation <%=request.getParameter("id_bus")%></h4>
        <%
            }
        %>
    </div>
    <div class="centerform col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <form name="form" action="AnnulerTicket" method="post">
            <%
                HttpSession session1 = request.getSession();
                if (session1.getAttribute("id_user") != null) {
            %>	
            <div class="form-group">
                <label for="id_reservation">No de la réservation</label>
                <input type="text" name="id_reservation" class="form-control">
            </div>		
            <% } else { %>
            <div class="form-group">
                <label for="id_reservation">No de la réservation</label>
                <input type="text" name="id_reservation" class="form-control">
            </div>
            <div class="form-group">
                <label for="email">E-mail</label>
                <input type="text" name="email" class="form-control">
            </div>
            <% }%>
            <div class="form-group">
                <button type="submit" name="submit" class="btn btn-danger">Annuler le ticket</button>
            </div>
        </form>
    </div>

</div>

<jsp:include page="layout/footer.jsp" />