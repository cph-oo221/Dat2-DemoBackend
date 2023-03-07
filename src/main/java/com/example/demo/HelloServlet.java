package com.example.demo;

import com.example.demo.entities.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet
{
    private String message;

    public void init()
    {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Oskar", "123"));
        personList.add(new Person("Lars", "420"));
        personList.add(new Person("Bob", "360"));
        personList.add(new Person("Bo", "69"));

        Map<String, Person> personMap = new HashMap<>();
        for (Person person : personList)
        {
            personMap.put(person.getNavn(), person);
        }

        getServletContext().setAttribute("personMap", personMap);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        /*response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");*/
        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        String navn = request.getParameter("navn");
        String password = request.getParameter("password");
        String uglydigLogin = "Din kode eller brukernavn er forkert !";

        if(!personMap.containsKey(navn))
        {
            request.setAttribute("errorMSG", uglydigLogin);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        if(!personMap.get(navn).getKode().equals(password))
        {
            request.setAttribute("errorMSG", uglydigLogin);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        HttpSession session = request.getSession();

        request.setAttribute("navn", navn);
        request.setAttribute("id", session.getId());

        session.setAttribute("navn", navn);

        request.getRequestDispatcher("WEB-INF/minSide.jsp").forward(request, response);
    }

    public void destroy()
    {
    }
}