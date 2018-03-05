import java.sql.*;

public class myTestConnection {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaunascodingschool", "root", "");
            if (connection != null) {
                System.out.println("prisijungimas prie kaunascodingschool");

                Statement statement = connection.createStatement();

                ResultSet rezultSet= statement.executeQuery("select * from students");
                while(rezultSet.next()){
                    System.out.println("ID"+ rezultSet.getInt("id")+ " " + rezultSet.getString("name")+ " "
                    + rezultSet.getString("surname")+ " " + rezultSet.getString(4));


                }
                statement.execute("INSERT  INTO students (id, name, surname, phone, email)VALUES (10, algis, algimantas, 86539292,algis@gmail )");

                if(QueryUtils.isTableExist(connection ,"students")){
                    System.out.println("Lentele neegzistuoja");
                }

            }
        } catch (SQLException e) {
            System.out.println("Nepavyko prisijungti" + e);
        }


    }
}
