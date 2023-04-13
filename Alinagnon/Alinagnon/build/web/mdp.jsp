<%-- 
    Document   : mdp
    Created on : 4 août 2016, 02:06:24
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mot de passe oublié | Alinagnon</title>
    </head>
    <body>
        <%
            String pass = request.getParameter("msg");
            out.print(pass);
        %>
    </body>
</html>
