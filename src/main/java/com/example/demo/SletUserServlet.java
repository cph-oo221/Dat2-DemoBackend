package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "SletUserServlet", value = "/slet-user-servlet")
public class SletUserServlet extends HttpServlet
{
    //private List<Person> personList = new ArrayList<>();

    private HelloServlet helloServlet = new HelloServlet();
    private List<Person> personList = helloServlet.getPersonList();
    @Override
    public void init()
    {
        Map<String, Person> personMap = new HashMap<>();
        for (Person person : personList)
        {
            personMap.put(person.getNavn(), person);
        }

        getServletContext().setAttribute("personMap", personMap);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        String navn = request.getParameter("navn");
        String password = request.getParameter("password");

        if(personMap.containsKey(navn))
        {
            personMap.remove(navn, password);
        }

        request.getSession().invalidate();
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
