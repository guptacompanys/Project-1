
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register!</title>
    </head>
    <body>
        
        
        <%
            String username=request.getParameter("uname");
            String password=request.getParameter("psw");
            String email=request.getParameter("email");
        %>
        
        <%
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt=con.prepareStatement("insert into farmuser values(?,?,?)");
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setString(3, email);
                int i=stmt.executeUpdate();
                System.out.println(i+" records inserted");
            }
            catch(Exception e){}
        %>
        
        <jsp:forward page = "registersuccess.html" />
        
    </body>
</html>
