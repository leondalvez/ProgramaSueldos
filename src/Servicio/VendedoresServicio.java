/*
Clase con la que operaremos con los datos de los vendedores.
 */
package Servicio;

import Entidades.Vendedores;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Leonardo Daniel Alvez
 */
public class VendedoresServicio {
    
    public Vendedores altaVendedores(){
        
        // Instanciamos un objeto del tipo vendedor.
        
        Vendedores v1 = new Vendedores();
        
        // Pedimos que ingresen los datos y para eso utilizamos un Scanner.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor introduzca el nombre del Vendedor/a/e");
        v1.setNombre(leer.next());
        System.out.println("Por favor introduzca el DNI del Vendedor/a/e");
        v1.setDni(leer.nextInt());
        System.out.println("Por favor introduzca el Sueldo básico del Vendedor/a/e");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Por favor introduzca el día que comenso a trabajar le Vendedor/a/e");
        int dia = leer.nextInt();
        System.out.println("Por favor introduzca el mes que comenso a trabajar le Vendedor/a/e");
        int mes = leer.nextInt();
        System.out.println("Por favor introduzca el año que comenso a trabajar le Vendedor/a/e");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        v1.setFechaInicio(fecha);
        return v1;
        
    }
}
