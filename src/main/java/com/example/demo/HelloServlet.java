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

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        String navn = request.getParameter("navn");
        request.setAttribute("navn", navn);
        request.getSession().setAttribute("navn", navn);
        request.getRequestDispatcher("WEB-INF/minSide.jsp").forward(request, response);
    }

    public void destroy()
    {
    }
}