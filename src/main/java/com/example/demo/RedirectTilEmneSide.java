package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "RedirectTilEmneSide", value = "/RedirectTilEmneSide")
public class RedirectTilEmneSide extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Set<String> emneList = new HashSet<>();

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        for (Person person : personMap.values())
        {
            for (String emne : person.getEmner())
            {
                emneList.add(emne.toLowerCase());
            }
        }

        getServletContext().setAttribute("emneList", emneList);

        request.getRequestDispatcher("WEB-INF/oversigtAfEmner.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}