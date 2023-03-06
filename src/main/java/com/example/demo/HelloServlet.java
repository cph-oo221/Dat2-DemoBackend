package com.example.demo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet
{
    private String message;

    public void init()
    {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        String navn = request.getParameter("navn");

        // System.out.println("Du hedder " + navn);

        // out.println("<h1>" + "Du hedder " + navn + "</h1>");

        request.getRequestDispatcher("WEB-INF/indefor.jsp").forward(request, response);
    }

    public void destroy()
    {
    }
}