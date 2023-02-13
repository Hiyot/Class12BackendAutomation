import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
    private static final String USER_NAME = "sql12596775";
    private static final String DATABASE_NAME = "sql12596775";
    private static final String PASSWORD = "vT2SeHQCFL";
    private static final String PORT = "3306";
    private static final String SERVER = "sql12.freemysqlhosting.net";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT,USER_NAME,PASSWORD);

//        createTable(con);
        insertDog(con, 12 , "Charlie" , "Border coli");
    }

    private static void createTable(Connection con) throws SQLException{

        String statementToExecute = "CREATE TABLE " + DATABASE_NAME + ".`dog`(`age` INT NOT NULL, `name` VARCHAR(40) NOT NULL, `breed` VARCHAR(30) NOT NULL);";
        con.createStatement().execute(statementToExecute);
    }

    private static void insertDog(Connection con ,int age, String name, String breed ) throws SQLException {

        String statementToExecute = "INSERT INTO" + DATABASE_NAME + ".dog (`age` , `name` , `breed` VALUES ('" + age + "', '" + name + "', '" + breed + "');";
        con.createStatement().execute(statementToExecute);
    }

}
