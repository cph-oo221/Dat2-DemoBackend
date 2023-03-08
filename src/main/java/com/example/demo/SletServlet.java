package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "SletServlet", value = "/SletServlet")
public class SletServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String valg = request.getParameter("Valg");

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        personMap.remove(valg);

        request.getRequestDispatcher("WEB-INF/oversigt.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
