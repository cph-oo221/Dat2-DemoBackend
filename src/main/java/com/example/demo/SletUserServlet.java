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
    // USER CAN DELETE THERE OWN ACCOUNT
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String valg = request.getParameter("Valg");

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        System.out.println("SletUserServlet: " + valg);
        personMap.remove(valg);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
