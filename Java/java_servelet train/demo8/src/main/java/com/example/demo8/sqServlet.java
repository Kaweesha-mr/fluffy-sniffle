package com.example.demo8;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class sqServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();
        int k = (int) session.getAttribute("k");

        //todo::getting the values comes from url re-writting
        //int k = Integer.parseInt(request.getParameter("k"));

        k = k * k;

//        print k using session
        PrintWriter out = response.getWriter();
        out.println("Result is " + k);
    }


}
