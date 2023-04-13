<%-- 
    Document   : supprimerUser
    Created on : 4 août 2016, 02:11:04
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp" />
<jsp:include page="layout/userMenu.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
    <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
        <%
            if (request.getParameter("msg") != null) {
        %>
        <h4><%=request.getParameter("msg")%></h4>
        <%
            }
        %>
    </div>
    <div class="centerformWrapper col-lg-6 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Supprimer user
        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="suppruser" action="SupprimerUser"
                  onsubmit="return validation7();" method="post">
                <form name="form" method="get" action="SupprimerUser">
                    <div class="form-group">
                        <label for="telephone">Téléphone</label>
                        <input type="text" id="phonenumber" name="telephone" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="mdp">Mot de passe</label>
                        <input type="password" id="password" class="form-control" name="mdp">
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-danger" value="Supprimer">
                        <input type="reset"  class="btn btn-danger" value="Annuler">
                    </div>	
                </form>	
        </div>
    </div>
</div>	
<jsp:include page="layout/footer.jsp" />
