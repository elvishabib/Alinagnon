<%-- 
    Document   : getReservationInfo
    Created on : 4 août 2016, 02:13:29
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.*"%>
<%@page import="java.sql.ResultSet"%>
<jsp:include page="layout/header.jsp" />
<jsp:include page="layout/userMenu.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>

<%
    try {
        String bookingID = "";
        if (request.getParameter("Reservation") != null) {
            out.print("<div class=''>" + bookingID + "</div>");
            ResultSet rs = null;
            ReservationModel bm = new ReservationModel();
            bm.setId_user(String.valueOf(session.getAttribute("id_user")));
            bm.setId_reservation(request.getParameter("Reservation"));
            rs = bm.getInfoReservation("User", "rien");
            rs.last();
            int numRows = rs.getRow();
            if (numRows <= 0) {
                String msg = "Auncune information sur cette réservation!";
                response.sendRedirect("getReservationInfo.jsp?msg="
                        + msg);
            } else {
                rs.beforeFirst();
                while (rs.next()) {
%>
<div class="mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Informations sur les réservations
        </div>
        <div class="errordiv col-lg-12 col-md-12 col-sm-12 col-xs-12">
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
        <div class="tableContent col-lg-9 col-md-9 col-sm-9 col-xs-9">
            <table class="table table-bordered">
                <tr>
                <tr>
                    <td>No Réservation</td>
                    <td>No Bus</td>
                    <td>No User</td>
                    <td>Date Départ</td>
                    <td>Heure</td>
                    <td>Sieges</td>
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
    </div>

    <%
                rs.close();
            }
        }
    } else {
    %>
    <%
        ResultSet rs = null;
        UserModel um = new UserModel();
        um.setEmail(String.valueOf(session.getAttribute("id_user")));
        rs = um.VoirReservationsUser();
    %>
    <div class="mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12">
        <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
                Informations sur les réservations
            </div>
            <div class="errordiv col-lg-12 col-md-12 col-sm-12 col-xs-12">
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
            <div class="tableContent col-lg-9 col-md-9 col-sm-9 col-xs-9">
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
                    <%
                        }
                        rs.close();
                    %>
                </table>
            </div>
            <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
                <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    Informations sur les réservations
                </div>
                <div class="centerform col-lg-9 col-md-12 col-sm-12c col-xs-12">
                    <form name="form" action="GetReservationInfo"
                          onsubmit="return validation11();" method="post">

                        <div class="form-group">
                            <label>No Réservation</label> 
                            <input type="text" name="reservation" class="form-control">
                        </div>
                        <div class="form-group">
                            <button type="submit" name="submit" class="btn btn-danger">Imprimer</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <%
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    %>

</div>
<jsp:include page="layout/footer.jsp" />
