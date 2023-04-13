<%-- 
    Document   : rechercheBus
    Created on : 4 août 2016, 02:16:41
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.BusModel"%>
<%@page import="java.sql.ResultSet"%>
<jsp:include page="layout/header.jsp" />
<jsp:include page="layout/userMenu.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Rechercher un bus
        </div>
        <%
            String msg = request.getParameter("msg");
            if (msg != null) {
                out.print(msg);
            }
        %>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="rechercherbus" action="RechercherBus"
                  onsubmit="return validateLogin12();" method="post">
                <div class="form-group">
                    <label for="depart">De</label>
                    <select name="depart" id="depart" class="flexselect form-control">						
                        <option value=""></option>
                        <%
                            BusModel model = new BusModel();
                            ResultSet rs = model.getBusInfo1(1);

                            while (rs.next()) {%>

                        <option value="<%=rs.getString(1)%>"><%=rs.getString(1).toUpperCase()%></option>
                        <%} %>
                    </select>
                </div>
                <div class="form-group">
                    <label for="arrivee">A</label>
                    <select name="arrivee" id="arrivee" class="flexselect form-control">
                        <option value=""></option>
                        <%
                            ResultSet rs1 = model.getBusInfo1(2);

                            while (rs1.next()) {%>
                        <option value="<%=rs1.getString(1)%>"><%=rs1.getString(1).toUpperCase()%></option>
                        <%}%>	
                    </select>
                </div>
                <div class="form-group">
                    <label for="date_depart">Date</label>
                    <input class="tcal" type="text" name="date_depart" />
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-danger">Rechercher</button>
                    <button type="reset" class="btn btn-danger">Annuler</button>
                </div>
            </form>	
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />
