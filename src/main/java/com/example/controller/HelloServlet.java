package com.example.controller;

import com.example.util.Hap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
// http://localhost:8081/s02/hello
@WebServlet("/hello") // Servlet Mapping(web.xml)
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                                                           throws ServletException, IOException {
        PrintWriter out =resp.getWriter();
        // 비즈니스로직(처리로직)
        Hap h=new Hap();
        int v=h.sum();
        // 프리젠테이션로직(죽음,,,)
        out.println("<html>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<td>");
        out.println(v); // 5050
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</html>");
    }
}
