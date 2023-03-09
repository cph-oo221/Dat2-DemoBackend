package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RedirectTilMinSide", value = "/RedirectTilMinSide")
public class RedirectTilMinSide extends HttpServlet
{
    // REDIRECT TO MIN SIDE IF YOU ARE ADMIN FROM OVERSIGT.JSP
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // gå til min side hvis du er admin
        request.getRequestDispatcher("WEB-INF/minSide.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
