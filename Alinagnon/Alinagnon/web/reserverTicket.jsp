<%-- 
    Document   : reserverTicket
    Created on : 4 août 2016, 02:09:09
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel"%>
<%@page import="java.sql.ResultSet"%>
<jsp:include page="layout/header.jsp" />
<%
    HttpSession session1 = request.getSession();
    if (session1.getAttribute("id_user") != null) {
%>	
<jsp:include page="layout/userMenu.jsp" />
<% } %>
<script type="text/javascript" src="assets/js/validation.js"></script>

<%
    String id_bus = request.getParameter("id_bus");
%>

<div class="errordiv col-lg-9 col-md-9 col-sm-10 col-xs-10">
    <%
        if (request.getParameter("msg") != null) {
    %>
    <h4><%=request.getParameter("msg")%></h4>
    <%
        }
    %>
</div>
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Réserver un ticket
        </div>
        <%
            BusModel bm = new BusModel();
            ResultSet rs = bm.getBusInfo(request.getParameter("id_bus"));
            String date_depart = "";
            String heure_depart = "";
        %>
        <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <table class ="col-lg-6 col-md-6 col-sm-12 col-xs-12 table table-bordered">
                <tr>
                    <th>Nom</th>
                    <th>Type</th>
                    <th>Heure Départ</th>
                    <th>Heure Arrivée</th>
                    <th>De</th>
                    <th>A</th>
                    <th>Tarifs</th>
                </tr>
                <%
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
                </tr>
                <%
                        date_depart = request.getParameter("date");
                        heure_depart = rs.getString(4);
                    }
                    rs.close();
                %>
            </table>
        </div>
        <div class="centerformWrapper col-lg-4 col-md-6 col-sm-2 col-xs-2">
            <div class="centerform col-lg-12 col-md-4 col-sm-12 col-xs-12">
                <form name="reserverticket" action="ReserverTicket" onsubmit="return validation3();" method="post">

                    <div class="form-group">
                        <label for="sieges">Nombre de passagers</label>
                        <select name="sieges" class="form-control">
                            <option Value="1">1</option>
                            <option Value="2">2</option>
                            <option Value="3">3</option>
                            <option Value="4">4</option>
                            <option Value="5">5</option>
                            <option Value="6">6</option>
                            <option Value="7">7</option>
                            <option Value="8">8</option>
                            <option Value="9">9</option>

                        </select> 
                    </div>
                    <%
                        if (session1.getAttribute("id_user") == null) {
                    %>	
                    <div class="form-group">
                        <label for="email">E-mail/Téléphone</label>
                        <input type="text" name="email" class="form-control">
                    </div>			
                    <% }%>
                    <div class="form-group">
                        <label for="id_bus">No Bus</label>
                        <input type="text" name="id_bus"  class="form-control" value="<%=id_bus%>"/>
                    </div>
                    <div class="form-group">
                        <label for="date_depart">Date</label>
                        <input type="text" name="date_depart"  class="form-control" value="<%=date_depart%>"/>
                    </div>
                    <div class="form-group">
                        <label for="heure_depart">Heure Départ</label>
                        <input type="text" name="heure_depart"  class="form-control" value="<%=heure_depart%>"/>
                    </div>
                    <div class="form-group">
                        <button type="submit" name="submit" class="btn btn-danger">Réserver</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />