package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SelectItemServlet extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    String item = request.getParameter("item");
    ItemAdvisor advisor = new ItemAdvisor();
    List recommendations = advisor.getRecommendations(item);

    // response.setContentType("text/html");
    // PrintWriter out = response.getWriter();
    // out.println("Item Selection Advice<br>");
    // Iterator it = recommendations.iterator();
    // while (it.hasNext()) {
    //   out.println("<br>Try: " + it.next());
    // }
    request.setAttribute("recommendations", recommendations);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
  }
}
