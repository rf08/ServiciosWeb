package WS;

import Control.ConexionMySql;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "insertar")
public class insertar extends ConexionMySql{

    @WebMethod(operationName = "insetar")
    public String insetar(@WebParam(name = "nota") int nota) {
                
        Connection con = getConnectionMysql();
        PreparedStatement ps = null;
        
        String sql = "select insertarNota(" + nota + ")";
        
        try {
            
            ps = (PreparedStatement) con.prepareStatement(sql); //
            ps.execute(); 
            
            return "insertado";
        }catch(Exception ex){
            ex.printStackTrace();
            return "falló";
        }
        
    }

}
