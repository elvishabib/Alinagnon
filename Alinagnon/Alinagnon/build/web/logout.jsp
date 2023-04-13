<%-- 
    Document   : logout
    Created on : 4 août 2016, 02:14:48
    Author     : akadjelvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Déconnexion | Alinagnon</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("index.jsp?msg=Deconnexion reussie!");
        %>
    </body>
</html>
