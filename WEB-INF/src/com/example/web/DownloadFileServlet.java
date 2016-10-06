package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class DownloadFileServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    response.setContentType("application/jar");
    ServletContext servletContext = getServletContext();
    InputStream inputStream = servletContext.getResourceAsStream("/servlet-api.jar");

    int numBytesRead = 0;
    byte[] byteBuffer = new byte[1024];

    OutputStream outputStream = response.getOutputStream();
    while ((numBytesRead = inputStream.read(byteBuffer)) != -1) {
      outputStream.write(byteBuffer, 0, numBytesRead);
    }
    outputStream.flush();
    outputStream.close();
  }
}
