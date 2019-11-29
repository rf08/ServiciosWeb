package Control;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConexionMySql {

    private final String user = "root";
    private final String pwd = "abc.1234";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/universidad";
    private Connection con = null;

    public Connection getConnectionMysql(){
        
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pwd);
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
}
