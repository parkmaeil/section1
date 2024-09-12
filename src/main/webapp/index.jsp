<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8"%>
<html>
<head>
   <title>Hello JSP</title>
   </head>
   <body>
      <h1>Hello from JSP!</h1>
      <%
          com.example.util.Hap h=new com.example.util.Hap();
          int v=h.sum();
      %>
      <table border="1">
      <tr>
      <td><%=v%></td>
      </tr>
      </table>
   </body>
</html>