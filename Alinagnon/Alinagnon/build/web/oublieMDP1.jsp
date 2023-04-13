<%-- 
    Document   : oublieMDP1
    Created on : 4 août 2016, 02:12:00
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Mot de passe oublié</div>
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%
                String type = "";
                if (request.getParameter("msg") != null) {
                    type = request.getParameter("msg");
                }
                if (type.equalsIgnoreCase("Compagnie")) {
            %>
        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="oubliemdp" action="#"
                  onsubmit="return validation10();" method="post">
                <div class="form-group">
                    <label for="email">E-mail</label> <input
                        type="text" name="email" class="form-control" />
                </div>
            </form>
        </div>
        <%
        } else {
        %>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form action="oublieMDP2.jsp" method="post">
                <div class="form-group">
                    <label for="email">E-mail</label> <input
                        type="text" name="email" class="form-control" />
                </div>
                <div class="form-group">
                    <input type="hidden" name="type" value="User">
                    <button type="submit" class="btn btn-danger" name="submit">Valider</button>
                </div>
            </form>
        </div>
        <%
            }
        %>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />