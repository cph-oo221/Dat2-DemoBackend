package com.example.demo;

import com.example.demo.entities.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "UserEmnerSletServlet", value = "/UserEmnerSletServlet")
public class UserEmnerSletServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String emneItem = request.getParameter("emneItem");
        String navn = request.getSession().getAttribute("navn").toString();

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        personMap.get(navn).getEmner().remove(emneItem);

        request.getRequestDispatcher("WEB-INF/minSide.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
