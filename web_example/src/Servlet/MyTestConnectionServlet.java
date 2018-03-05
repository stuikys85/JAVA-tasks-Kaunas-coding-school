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

@WebServlet(value = "/getStudents")//anotacija ir 'value' kelias nurodomas cia
public class MyTestConnectionServlet extends HttpServlet {// sukurem klase extendinom i hhttp

    @Override//pakeiciam kontenta
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = new ArrayList<>();
       try {
           Class.forName("com.mysql.jdbc.Driver");//nurodom kad tai  yra my sql driver


           //kuriames prisijungima iki duomenu bazes apacioje
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaunascodingschool", "root", "");
           if(connection != null){
               System.out.println("prisijungeme");// prisijungiam prie duomenu bazes

               Statement statement = connection.createStatement();//sukuriam statment
               ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENTS");//ir isrenkam visus rezultatus
               while(resultSet.next()){//jei butu vienas metodas lenteleje students  darytumem be while,keli metodai su while
                Student student = new Student(resultSet.getInt("Id"), resultSet.getString("name"),
                        resultSet.getString("surname"),resultSet.getString("phone"),
                        resultSet.getString("email"));//while viduje ivyko, i konstruktoriu sudejom informacija
                    students.add(student);
               }
           }

       }catch(ClassNotFoundException e) {//catch krenta jei neranda drivers
           e.printStackTrace();
       } catch (SQLException e){// sql klaidu catchas
           e.printStackTrace();
       }


       req.setAttribute("studentList", students);

       req.getRequestDispatcher("students.jsp").forward(req, resp);// visada eina paskutinis grazinam rezultatata kaip html



    }
}
