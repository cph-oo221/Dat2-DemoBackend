package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SletUserServlet", value = "/slet-user-servlet")
public class SletUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HelloServlet helloServlet = new HelloServlet();


        HttpSession session = request.getSession();


        request.getRequestDispatcher("WEB-INF/sletUser.jsp").forward(request, response);
    }
}
