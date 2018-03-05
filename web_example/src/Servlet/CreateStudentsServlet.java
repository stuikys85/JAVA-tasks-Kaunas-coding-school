package Servlet;

import writableObject.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/createStudent")//anotacija ir 'value' kelias nurodomas cia
class CreateStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String text = "labas";
        req.setAttribute("dummy text", text);
        req.getRequestDispatcher("index.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = "labas";
        String userParam = req.getAttribute("userText");
        req.setAttribute("dummyText",text + userParam);
        req.getRequestDispatcher("index.jsp").forward(req, resp);


    }
}



