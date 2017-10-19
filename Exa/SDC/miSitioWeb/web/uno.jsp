<%-- 
    Document   : uno
    Created on : 22/08/2017, 08:35:39 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado Suma</title>
        <style>
            h1 {
                text-align:center;
            }
            p {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>Resultado de la suma</h1>
        <hr>
        
            <%
                String strOpA,strOpB;
                int a,b,c;
                strOpA = request.getParameter("a");
                strOpB = request.getParameter("b");
                
                a = Integer.parseInt(strOpA);
                b = Integer.parseInt(strOpB);
                c = a + b;
              
            %>
            
            <p>El resultado de la suma de <%= a %> + <%= b %> = <%= c %></p>
        
    </body>
</html>
