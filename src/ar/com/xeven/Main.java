package ar.com.xeven;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Sector sector = new Sector();
	    sector.listarEmpleados();

        System.out.print("Ingrese un legajo: ");
        Scanner sc = new Scanner(System.in);
        int legajo = Integer.parseInt(sc.nextLine());

        sector.mostrarEmpleadoPorLegajo(legajo);


    }
}
