package agenciasisii;

/**
 *
 * @author alvaro
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    
    private String driver="org.postgresql.Driver";
    private String nombreDB="AgenciaImportadora1";
    private String url="jdbc:postgresql://localhost:5432/"+nombreDB;

    private String user="alecita";
    private String password="alecita";
    //private String user="postgres";
    //private String password="root";

    
    private Connection con;
    Statement st;
    
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            
             con=DriverManager.getConnection(url,user,password);
             st=con.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
    public ResultSet resultado(String consulta){
        ResultSet rs=null;
        try {
           rs=st.executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public void insertar(String consulta){
        try {
            //st.executeQuery(consulta);
            st.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void cerrarConexion(){
    
        try {
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}