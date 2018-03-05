package Servlet;

import sun.net.httpserver.HttpsServerImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/secondexample")
public class MySecondServletExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String name = "Andrius";
       String surname = "Spygis";
       int age = 124;
       String city = "Kaunas";
       String car = "bmw";


       req.setAttribute("vardas", name);
       req.setAttribute("pavarde", surname);
       req.setAttribute("amzius", age);
       req.setAttribute("miestas", city);
       req.setAttribute("automobilis", car);



       req.getRequestDispatcher("result.jsp").forward(req, resp);


    }
}
