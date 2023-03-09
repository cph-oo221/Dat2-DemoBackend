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

@WebServlet(name = "ChangePasswordServlet", value = "/change-password-servlet")
public class ChangePasswordServlet extends HttpServlet
{
    // USER CAN CHANGE THERE OWN PASSWORD

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String newpassword = request.getParameter("newpassword");

        String username = (String) request.getSession().getAttribute("navn");

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("personMap");

        if(personMap.containsKey(username))
        {
            Person person = personMap.get(username);
            person.setKode(newpassword);
        }

        System.out.println("ChangePasswordServlet new password: " + newpassword);
        System.out.println("ChangePasswordServlet, for user: " + username);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
