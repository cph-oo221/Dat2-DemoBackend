package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "UserEmnerServlet", value = "/UserEmnerServlet")
public class UserEmnerServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        String emne = request.getParameter("emne");

        personMap.get(request.getSession().getAttribute("navn")).getEmner().add(emne);

        request.getRequestDispatcher("WEB-INF/minSide.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
