

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>search</title>
    </head>
    <body>
        
        <%
            String searchText=request.getParameter("search_field");
        %>
        <%
            response.sendRedirect("https://www.google.com/#q="+searchText);
        %>
    </body>
</html>
