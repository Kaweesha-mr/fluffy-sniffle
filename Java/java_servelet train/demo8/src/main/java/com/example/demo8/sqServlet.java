package com.example.demo8;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class sqServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int k = (int) request.getAttribute("k");
        k = k * k;
        PrintWriter out = response.getWriter();
        out.println("sqaure : " + k);
    }


}
