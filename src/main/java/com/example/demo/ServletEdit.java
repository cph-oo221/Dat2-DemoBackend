package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletEdit", value = "/ServletEdit")
public class ServletEdit extends HttpServlet
{
    // SENDS THE ADMIN TO ADMINEDIT.JSP WITH THE SELECTED USER DATA

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        /*TODO 1. take the given name from the request,
           2. you can change all passwords,
           3. see all there elemnets(emner)
         */

        String editUserName = request.getParameter("Valg");

        request.setAttribute("editUserName", editUserName);

        request.getRequestDispatcher("WEB-INF/adminEdit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
