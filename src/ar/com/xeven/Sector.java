package ar.com.xeven;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sector {

    public void listarEmpleados() {
        ConexionDB conexionDB = new ConexionDB("empresa","root","unafacil");
        ResultSet resultados = conexionDB.consultar("SELECT nombre FROM empleados");
        try {
            if(resultados != null)
                while (resultados.next())
                    System.out.println("Nombre: " + resultados.getString("nombre"));
        }catch (SQLException e){
            System.out.println("No se encontraron resultados.");
        }
    }
}
