package com.example.demo4;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class addServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int j = Integer.parseInt(request.getParameter("num1"));
        int k = Integer.parseInt(request.getParameter("num2"));
        int sum = j + k;
        System.out.println("The result is " + sum);

//print to webpage
        PrintWriter out = response.getWriter();
        out.println("The result is " + sum);
    }
}
