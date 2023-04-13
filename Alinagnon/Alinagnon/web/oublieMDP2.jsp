<%-- 
    Document   : oublieMDP2
    Created on : 4 août 2016, 02:12:17
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.awt.geom.QuadCurve2D"%>
<%@page import="bj.uac.ifri.lc2016.akadjelvis.pfe.alinagnon.model.UserModel"%>
<jsp:include page="layout/header.jsp" />
<script type="text/javascript" src="assets/js/validation.js"></script>
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Mot de passe oublié</div>
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">

            <%
                String email = "";
                String question = "";
                String type = "";
                if (request.getParameter("msg") != null) {
                    type = request.getParameter("msg");
                }
                type = request.getParameter("type");
                if (type.equalsIgnoreCase("User")) {
                    UserModel u1 = new UserModel();
                    email = request.getParameter("email");
                    u1.setEmail(email);
                    question = u1.getSecQ();
                }
            %>
        </div>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="oubliemdp" action="OublieMDP"
                  onsubmit="return validateLogin10();" method="post">
                <div class="form-group">
                    <label for="secQst">Votre question de sécurité</label> <input
                        type="text" name="as" class="form-control" value="<%=question%>" disabled />
                </div>
                <div class="form-group">
                    <label for="secAns">Votre réponse</label> <input type="text"
                                                                     name="secAns" class="form-control" />
                </div>
                <div class="form-group">
                    <input type="hidden" name="type" value="<%=type%>">
                    <input type="hidden" name="email" value="<%=email%>">
                    <input
                        type="hidden" name="secQstn" value="<%=question%>"/>
                    <button type="submit" class="btn btn-danger" name="submit">Valider</button>
                </div>
            </form>
        </div>
    </div>
</div>
<jsp:include page="layout/footer.jsp" />
