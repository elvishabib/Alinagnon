<%-- 
    Document   : compagnieLogin
    Created on : 4 août 2016, 02:09:24
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<div class="mainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Connexion Compagnie
        </div>
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%if (request.getParameter("msg") != null) {%>
            <h4><%=request.getParameter("msg")%></h4>	
            <%}%>
        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <form name="logincompagnie" action="Login" onsubmit="return validation4();" method="post" >

                <div class="form-group">
                    <label for="email">E-mail</label>
                    <input type="text" name="email" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="mdp">Mot de passe</label>
                    <input type="password" name="mdp" class="form-control"/>
                </div>		
                <div class="form-group">
                    <input type="hidden" name="type" value="Compagnie"/>
                </div>		
                <div class="form-group">
                    <input type="submit" class="btn btn-danger" value="Connexion"/>
                    <input type="reset" class="btn btn-danger" value="Annuler"/>
                </div>
            </form>			
        </div>
    </div>
</div>

<jsp:include page="layout/footer.jsp" />