package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class orders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Welcome Farmers!</title>\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" title=\"style\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("      <div id=\"logo\">\n");
      out.write("        <div id=\"logo_text\">\n");
      out.write("          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\n");
      out.write("          <h1><a href=\"profile.html\">Welcome<span class=\"logo_colour\"> Farmers!</span></a></h1>\n");
      out.write("          <h2>FarmerVarmer at your Service!</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"menubar\">\n");
      out.write("        <ul id=\"menu\">\n");
      out.write("          <!-- put class=\"selected\" in the li tag for the selected page - to highlight which page you're on -->\n");
      out.write("          <li><a href=\"profile.html\">Home</a>></li>\n");
      out.write("          <li><a href=\"crop.html\">Crops</a></li>\n");
      out.write("          <li><a hre=\"tools.html\">Request a Tool</a></li>\n");
      out.write("          <li class=\"selected\"><a href=\"orders.jsp\">Orders and Earnings</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"site_content\">\n");
      out.write("      <div class=\"sidebar\">\n");
      out.write("        <h3>Latest News</h3>\n");
      out.write("        <h3>Useful Links</h3>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"http://rural.nic.in/\">Ministry of Rural Development</a></li>\n");
      out.write("          <li><a href=\"http://www.mca.gov.in/\">Ministry of Corporate Affairs</a></li>\n");
      out.write("          <li><a href=\"http://pmkvyofficial.org/\">PMKVY</a></li>\n");
      out.write("          <li><a href=\"http://agriculture.gov.in/\">Ministry of Agriculture</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <h3>Search</h3>\n");
      out.write("        <form method=\"post\" action=\"search.jsp\" id=\"search_form\">\n");
      out.write("          <p>\n");
      out.write("            <input class=\"search\" type=\"text\" name=\"search_field\" value=\"Enter keywords.....\" />\n");
      out.write("            <input name=\"search\" type=\"image\" style=\"border: 0; margin: 0 0 -9px 5px;\" src=\"style/search.png\" alt=\"Search\" title=\"Search\" />\n");
      out.write("          </p>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"content\">\n");
      out.write("        <!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even){background-color: #f2f2f2}\n");
      out.write("\n");
      out.write("th {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<h2>My Orders!</h2>\n");
      out.write("\n");

    try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt=con.prepareStatement("select * from tools");
                ResultSet rs=stmt.executeQuery();
                out.println("<table>"+
 "<tr>"+
    "<th>Tools</th>"+
    "<th>Address</th>"+
    "<th>Cost</th>"+
  "</tr>");
                while(rs.next())
                {
                    
                    out.println(""+


  "<tr>"+
    "<td>"+rs.getString(1)+"</td>"+
    "<td>"+rs.getString(2)+"</td>"+
    "<td>"+rs.getString(3)+"</td>"+
  "</tr>"+
  

"");
                }
                out.println("</table>");
            }catch(Exception e){}


      out.write("    \n");
      out.write("\n");
      out.write("<h2>My Earnings!</h2>\n");
      out.write("\n");

    try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
                PreparedStatement stmt=con.prepareStatement("select * from crops");
                ResultSet rs=stmt.executeQuery();
                out.println("<table>"+
 "<tr>"+
    "<th>Name</th>"+
    "<th>Description</th>"+
    "<th>Sold in Kgs</th>"+
  "</tr>");
                while(rs.next())
                {
                    
                    out.println(""+


  "<tr>"+
    "<td>"+rs.getString(1)+"</td>"+
    "<td>"+rs.getString(3)+"</td>"+
    "<td>"+rs.getString(2)+"</td>"+
  "</tr>"+
  

"");
                }
                out.println("</table>");
            }catch(Exception e){}


      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
