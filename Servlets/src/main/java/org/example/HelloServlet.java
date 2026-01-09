package org.example;

import jakarta.annotation.Nonnull;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.IOException;


public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, @Nonnull HttpServletResponse resp) throws IOException {

        System.out.println("Hello Servlets");
        resp.setContentType("text/html");
        resp.getWriter().println("<h2><b>Hello Servlet</b></h2>");

    }
}
