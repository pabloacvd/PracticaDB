package ar.com.xeven;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sector {
    public void buscarYMostrar(String sql){
        ConexionDB conexionDB = new ConexionDB("empresa","root","unafacil");
        ResultSet resultados = conexionDB.consultar(sql);
        try{
            mostrarResultados(resultados);
        }catch(SQLException e){
            System.out.println("No se encontraron resultados.");
        }finally {
            conexionDB.cerrar();
        }
    }

    private void mostrarResultados(ResultSet resultados) throws SQLException {
        if(resultados != null)
            while(resultados.next())
                System.out.println("Nombre: "+resultados.getString("nombre"));
    }

    public void mostrarEmpleadoPorLegajo(int legajo){
        buscarYMostrar("SELECT nombre, apellido FROM empleados WHERE legajo = "+legajo);
    }
    public void listarEmpleados() {
        buscarYMostrar("SELECT nombre FROM empleados");
    }
}
