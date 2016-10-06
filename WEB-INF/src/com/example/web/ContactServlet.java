package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ContactServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    ServletConfig servletConfig = getServletConfig();
    out.println(servletConfig.getInitParameter("adminEmail")); // Servlet-scoped parameter

    ServletContext servletContext = getServletContext();
    out.println("<br><br>");
    out.println(servletContext.getInitParameter("admin")); // App-scoped parameter
  }
}
