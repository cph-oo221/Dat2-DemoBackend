package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "OpretUserServlet", value = "/OpretUserServlet")
public class OpretUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String navn = request.getParameter("navn");
        String password = request.getParameter("password");

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        if(personMap.containsKey(navn))
        {
            request.setAttribute("errorUsername", "Brugernavn er allerede taget");
            request.getRequestDispatcher("registersUser.jsp").forward(request, response);
        }

        if (password.length() <= 4)
        {
            request.setAttribute("errorPassword", "Password skal være længere end 4 tegn");
            request.getRequestDispatcher("registersUser.jsp").forward(request, response);
        }

        System.out.println("navn = " + navn);
        System.out.println("password = " + password);
        personMap.put(navn, new Person(navn, password));

        HttpSession session = request.getSession();

        session.setAttribute("bruger", personMap.get(navn));
        session.setAttribute("id", session.getId());

        session.setAttribute("navn", navn);
        session.setAttribute("password", password);

        request.getRequestDispatcher("WEB-INF/minSide.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
