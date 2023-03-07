package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MinServlet", value = "/min-servlet")
public class MinServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int tal = Integer.parseInt(request.getParameter("tal"));
        request.setAttribute("tal", tal);
        request.getSession().setAttribute("tal", tal);

        request.setAttribute("navn", request.getSession().getAttribute("navn"));
        request.getRequestDispatcher("WEB-INF/duErIMaal.jsp").forward(request, response);
    }
}
