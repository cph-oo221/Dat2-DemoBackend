package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "RedirectTilEmneSide", value = "/RedirectTilEmneSide")
public class RedirectTilEmneSide extends HttpServlet
{
    // ADDS ALL "EMNER" TO THE SET "EMNELIST" AND SENDS IT TO OVERSIGTAFEMNER.JSP
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

        ArrayList<String> SortedEmneList = new ArrayList<>();
        for (String emne : emneList)
        {
            SortedEmneList.add(emne);
        }

        // SORTS THE EMNE LIST
        Collections.sort(SortedEmneList);

        getServletContext().setAttribute("emneList", SortedEmneList);

        // THE UNSORTED EMNE LIST
        // getServletContext().setAttribute("emneList", emneList);

        request.getRequestDispatcher("WEB-INF/oversigtAfEmner.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
