package ar.com.xeven;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	    ConexionDB conexionDB = new ConexionDB("prueba2","root","unafacil");

	    ResultSet resultados = conexionDB.consultar("SELECT * FROM empleados;");
	    try {
            while (resultados.next())
                System.out.println("Nombre: " + resultados.getString("nombre"));
        }catch (SQLException e){
	        e.printStackTrace();
        }

    }
}
