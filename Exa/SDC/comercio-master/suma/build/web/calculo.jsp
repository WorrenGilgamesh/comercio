<%-- 
    Document   : calculo
    Created on : 22/08/2017, 08:35:50 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado suma</title>
    </head>
    <body>
        <h1 style="text-align: center">Este es tu resultado</h1><br>
        <%
            String strOpA, strOpB;
            int a,b,c;
            strOpA=request.getParameter("a");
            strOpB=request.getParameter("b");
            a=Integer.parseInt(strOpA);
            b=Integer.parseInt(strOpB);
            c=a+b;
            response.getWriter().print("Tu resiltado de "+ a + " + " + b +" =" +c);
            %>
    </body>
</html>
