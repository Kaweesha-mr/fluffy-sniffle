package com.example.demo8;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class sqServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int k =0;
        Cookie cookie[] = request.getCookies();

        for(Cookie c: cookie){
            if(c.getName().equals("k")){
                k = Integer.parseInt(c.getValue());
            }
        }

        //cookies files are tested

        //todo::getting the values comes from url re-writting
        //int k = Integer.parseInt(request.getParameter("k"));



        k = k * k;

//        print k using session
        PrintWriter out = response.getWriter();
        out.println("Result is " + k);
    }


}
