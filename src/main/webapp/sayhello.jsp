<%-- 
    Document   : sayhello
    Created on : 08/02/2021, 23:08:15
    Author     : viter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SayHello.jsp</title>
    </head>
    <header>
        <h1>Cabeçalho</h1>
    </header>
    <body>
        <jsp:useBean id="myBean" class="hello.MessageBean"/>
        <h1>Aplicativo HelloWorld</h1>
        <% String lang = request.getParameter("lang"); %>
        <h2><jsp:setProperty name="myBean" property="lang" value="<%=lang%>"/>
        <jsp:getProperty name="myBean" property="msg"/>, <jsp:getProperty name="myBean" property="cumprimento"/>, <%=request.getParameter("nome")%>!</h2>
        <jsp:getProperty name="myBean" property="msg2"/> <jsp:getProperty name="myBean" property="aut"/>
    </body>
    <footer>
        <h1>Rodapé</h1>
    </footer>
</html>
