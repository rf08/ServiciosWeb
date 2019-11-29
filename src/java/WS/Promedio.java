package WS;

import Control.ConexionMySql;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(serviceName = "Promedio")
public class Promedio extends ConexionMySql{

    @WebMethod(operationName = "GenerarPromedio")
    public int GenerarPromedio() {
        
        
        Connection con = getConnectionMysql();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int p = 0;
        
        String sql = "select promedioNota()";
        
        try {
            
            
            ps = (PreparedStatement) con.prepareStatement(sql); //
            rs = ps.executeQuery(sql);
            
            while(rs.next()){
                System.out.print(rs.getInt(1));
                p = rs.getInt(1);
            }
            
            return p;
        }catch(Exception ex){
            ex.printStackTrace();
            return 0;
        }
    }

    
}
