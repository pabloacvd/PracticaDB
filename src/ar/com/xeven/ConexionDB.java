package ar.com.xeven;

import java.sql.*;

public class ConexionDB {
    private Connection conexion = null;
    private Statement st = null;
    private ResultSet rs = null;

    private String dbURL;
    private String dbUSER;
    private String dbPWD;

    public ConexionDB(String dbName, String dbUSER, String dbPWD) {
        this.dbURL = "jdbc:mysql://localhost/"+dbName;
        this.dbUSER = dbUSER;
        this.dbPWD = dbPWD;
        iniciarConexion();
    }

    private void iniciarConexion() {
        try {
            conexion = DriverManager.getConnection(dbURL,dbUSER,dbPWD);
            st = conexion.createStatement();
        } catch (SQLException e) {
            System.out.println("No se ha podido conectar con la base de datos.");
        }
    }

    public ResultSet consultar(String sql){
        try {
            rs = st.executeQuery(sql);
        } catch (SQLException | NullPointerException e) {
            System.out.println("No se ha podido realizar su búsqueda.");
        }
        return rs;
    }
}
