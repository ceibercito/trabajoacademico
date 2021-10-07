
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    private final String baseDatos = "buboqcgafe5saicep2z0";
    private final String servidor = "jdbc:mysql://localhost/" + baseDatos;
    private final String usuario = "u3tdcx9pzvmv7rkp";
    private final String clave = "4r4AI0Zn7PMv8quJGnUU";
    
    public Connection conectar(){
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(servidor, usuario, clave);
        }catch(Exception e){
            System.out.println("Error al conectar" + e.getMessage());
        }
        return cn;
    }
            
}
