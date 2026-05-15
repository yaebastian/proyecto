
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection con;

    public Connection conectar(){

        try{

            con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/sistema_votacion",
            "root",
            "");

            System.out.println("Conexion Exitosa");

        }catch(Exception e){

            System.out.println("Error " + e);
        }

        return con;
    }
}