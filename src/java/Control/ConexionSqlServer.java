package Control;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionSqlServer {
    
    private final String user = "root";
    private final String pwd = "abc.1234";
    private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String url = "jdbc:sqlserver://DESKTOP-4TVMU01:1433/curso";
    private Connection con = null;
    
    public Connection getConnectionSQLServer(){
        
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pwd);
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
}
