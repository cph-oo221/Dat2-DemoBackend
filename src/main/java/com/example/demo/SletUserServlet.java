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

        String SletValg = request.getParameter("SletValg");

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        personMap.remove(SletValg);

        // request.getServletContext().setAttribute("personMap", personMap);

        // request.getRequestDispatcher("WEB-INF/userDelete.jsp").forward(request, response);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
