<%@ page import='java.util.*' %>
<html>
  <body>
    <h1 align='center'>Item Recommendations JSP</h1>
    <p>
      <%
      List recommendations = (List) request.getAttribute("recommendations");
      Iterator it = recommendations.iterator();
      while (it.hasNext()) {
        out.print("<br>Try: " + it.next());
      }
      %>
    </p>
  </body>
</html>
