
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us!</title>
    </head>
    <body>
        
        <%
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String country=request.getParameter("country");
            String subject=request.getParameter("subject");
        %>
        
        <%
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt=con.prepareStatement("insert into contact values(?,?,?,?)");
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, country);
                stmt.setString(4, subject);
                int i=stmt.executeUpdate();
                System.out.println(i+" records inserted");
            }
            catch(Exception e){}
        %>
        <jsp:forward page = "request.html" />
    </body>
</html>
