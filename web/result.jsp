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

      out.print("<br><br>");

      String[] options = (String[]) request.getAttribute("options");
      for (int i = 0; i < options.length; i++) {
        out.print("<br>With option: " + options[i]);
      }
      %>
    </p>
  </body>
</html>
