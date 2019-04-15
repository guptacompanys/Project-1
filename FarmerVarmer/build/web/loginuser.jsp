
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login!</title>
    </head>
    <body>
        
        <%
            String username=request.getParameter("uname");
            String password=request.getParameter("psw");
            int flag=0;
        %>
        
        <%
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt=con.prepareStatement("select * from farmuser");
                ResultSet rs=stmt.executeQuery();
                while(rs.next())
                {
                    if(username.equals(rs.getString(1)) && password.equals(rs.getString(2)))
                    {
                        flag=1;
                    }
                    else
                    {
                        
                    }
                }
                
                
            }
            catch(Exception e){}
        %>
        
        <%
                if(flag==1)
                {
                    RequestDispatcher rd=request.getRequestDispatcher("/profile.html");
                    rd.forward(request, response);
                }
                else
                {
                    RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
                    rd.forward(request, response);
                }
        %>
        
        <jsp:forward page = "/profile.html" />
    </body>
</html>
