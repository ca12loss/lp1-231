package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


// JDBC - Java Database Connection 
// Conjunto de interface e classe para acesso a SGBDs
// Java App --> JDBC --> Driver (biblioteca que implementa JDBC) - -> SGBD
// App Desktop --> JDBC --> Driver MySQL ---> MySQL

public class Main {
    public static void main(String[] args) throws SQLException{

      String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        String sql = "CREATE TABLE alunos( id INT PRIMARY KEY, nome VARCHAR(100), email VARCHAR(255), ATIVO BOOL);";
        Statement  statement = connection.createStatement();
        statement.execute(sql);

        statement.close();
        connection.close();
    }
}
