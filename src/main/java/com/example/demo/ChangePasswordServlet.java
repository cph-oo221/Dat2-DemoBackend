package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ChangePasswordServlet", value = "/change-password-servlet")
public class ChangePasswordServlet extends HttpServlet
{
    @Override
    public void init()
    {
        HelloServlet helloServlet = new HelloServlet();

        Map<String, Person> personMap = new HashMap<>();
        for (Person person : helloServlet.getPersonList())
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
        String newPassword = request.getParameter("newpassword");

        if(personMap.containsKey(navn))
        {
            personMap.put(navn, new Person(navn, newPassword));
        }

        System.out.println(newPassword);

        HttpSession session = request.getSession();

        request.setAttribute("navn", request.getSession().getAttribute("navn"));
        request.setAttribute("password", request.getSession().getAttribute(newPassword));
        request.setAttribute("id", request.getSession().getId());

        request.getRequestDispatcher("WEB-INF/minSide.jsp").forward(request, response);
    }
}
