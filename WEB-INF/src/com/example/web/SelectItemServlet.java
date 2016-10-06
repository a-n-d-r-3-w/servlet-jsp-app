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
    List<String> recommendations = advisor.getRecommendations(item);
    request.setAttribute("recommendations", recommendations);

    String[] options = request.getParameterValues("options");
    request.setAttribute("options", options);

    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
  }
}
