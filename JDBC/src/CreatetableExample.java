import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatetableExample {

    public static void main ( String[]args){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaunascodingschool", "root", "");
            if (connection != null) {

                Statement statement = connection.createStatement();
                if(QueryUtils.isTableExist(connection, "students")){
                    statement.execute("create table students (\n" +
                            "  Id INT NOT NULL  AUTO_INCREMENT,\n" +
                            "  name VARCHAR(50) not null,\n" +
                            "  surname VARCHAR(50) not null,\n" +
                            "  phone VARCHAR(30) not null,\n" +
                            "  email VARCHAR(50) not null,\n" +
                            "  PRIMARY KEY (Id)\n" +
                            ")");
                }else{
                    System.out.println("Lentele jau yra");
                }
                if(QueryUtils.isTableExist(connection, "students_address")){
                    statement.execute("create table students_address (\n" +
                            "  Id INT NOT NULL  AUTO_INCREMENT,\n" +
                            "  country VARCHAR(50) not null,\n" +
                            "  city VARCHAR(50) not null,\n" +
                            "  street VARCHAR(30) not null,\n" +
                            "  post_code INT (50) not null,\n" +
                            "  PRIMARY KEY (Id)\n" +
                            ")");
                }else{
                    System.out.println("Lentele jau yra");

                }

                if(QueryUtils.isTableExist(connection, "student_marks")){
                    statement.execute("create table student_marks (\n" +
                            "  Id INT NOT NULL  AUTO_INCREMENT,\n" +
                            "  student_id INT (50) not null,\n" +
                            "  title VARCHAR(50) not null,\n" +
                            "  mark INT (30) not null,\n" +
                            "  TIMESTAMP INT (50) not null,\n" +
                            "  PRIMARY KEY (Id)\n" +
                            ")");
                }else{
                    System.out.println("Lentele jau yra");
                }



            }
        }catch (SQLException e){
            System.out.println("neprisijungem");
        }
    }
}
