package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/testRequest")

public class MyFirstServletExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // resp.getWriter().println("Cia atejo is serverio postas"); Sito dalyko nenaudoti senas metodas
req.getRequestDispatcher("welcome.jsp").forward(req, resp);
    }
}