package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TilbageOversigtServlet", value = "/TilbageOversigtServlet")
public class TilbageOversigtServlet extends HttpServlet
{

    // GO BACK TO OVERSIGT.JSP FROM ADMINEDIT.JSP

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("WEB-INF/oversigt.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
