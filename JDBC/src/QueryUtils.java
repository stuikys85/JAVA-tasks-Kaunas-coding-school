import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryUtils {

    public static boolean  isTableExist(Connection connection , String tableName){
        boolean result = false;

        if (connection != null && tableName!=null ){
            try {
                DatabaseMetaData data = connection.getMetaData();
                ResultSet resultSet = data.getTables(null, null, tableName, null);
                result = resultSet.next();// jeigu bent vienas irasas yra rezult set jis grazina irasa
            }catch (SQLException e){
                System.out.println("nera duomenu apie DB");
            }
        }
        return false;
    }
}

