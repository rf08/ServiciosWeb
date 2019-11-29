package WS;

import Control.ConexionMySql;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(serviceName = "MaximoyMinimo")
public class MaximoyMinimo extends ConexionMySql{

    @WebMethod(operationName = "MaxyMin")
    public String MaxyMin() {
        
        Connection con = getConnectionMysql();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String p = "";
        
        String sql = "select MinyMax()";
        
        try {
            
            ps = (PreparedStatement) con.prepareStatement(sql); //
            rs = ps.executeQuery(sql);
            
            while(rs.next()){
                System.out.print(rs.getString(1));
                p = rs.getString(1);
            }
            
            return p;
        }catch(Exception ex){
            ex.printStackTrace();
            return "Error";
        }
    }

    
}
