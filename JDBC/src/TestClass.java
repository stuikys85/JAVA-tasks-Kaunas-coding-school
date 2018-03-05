
import java.sql.*;

public class TestClass {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaunascodingschool", "root", "");
            if (connection != null) {
                System.out.println("prisijungimas prie kaunascodingschool");

                Statement statement = connection.createStatement();//pasiruosimas uzklausoms

                ResultSet rezultSet= statement.executeQuery("select * from students");
                while(rezultSet.next()){
                    System.out.println("ID"+ rezultSet.getInt("id")+ " " + rezultSet.getString("name")+ " "
                            + rezultSet.getString("surname")+ " " + rezultSet.getString(4));


                }

                statement.execute("delete from student_marks where mark<5 ");

            }
        } catch (SQLException e) {
            System.out.println("Nepavyko prisijungti" + e);
        }
    }
}
