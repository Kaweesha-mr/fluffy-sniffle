package com.example.demo8;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;

public class addservlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i + j;

        Cookie cookie = new Cookie("k", k + "");
        response.addCookie(cookie);

        //todo::this is the method called url re-writting
        response.sendRedirect("sq");

        //!request.setAttribute("k", k);

        //creates the request dispatcher object to "sq" servlet
        //!RequestDispatcher rd = request.getRequestDispatcher("sq");

        //forwards the current request and response variables with the same request and response objects to the "sq" servlet
        //!rd.forward(request, response);

    }
}
