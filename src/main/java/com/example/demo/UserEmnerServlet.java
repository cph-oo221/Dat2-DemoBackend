package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "UserEmnerServlet", value = "/UserEmnerServlet")
public class UserEmnerServlet extends HttpServlet
{
    @Override
    public void init() throws ServletException
    {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String emne = request.getParameter("emne");
        String navn = request.getSession().getAttribute("navn").toString();

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        personMap.get(navn).getEmner().add(emne);

        request.getRequestDispatcher("WEB-INF/minSide.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
