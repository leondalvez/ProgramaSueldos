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

    public Vendedores altaVendedores() {

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
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    //Generamos un método donde calculemos las comisiones que tuvo en el mes
    // y el sueldo mensual que le corresponde a los vendedores.
    public void SueldoMensual(Vendedores v1) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo mensual del vendedo/a/e es: " + v1.getNombre() + " cobra este mes la suma de $" + v1.getSueldoMensual());
    }
        
    public void vacaciones(Vendedores v1){
        
        //Calculamos la antigüedad
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        // Ahora utilizamos estructuras if para calcular la cantidad de días de vacaciones
        
        if(antiguedad<5){
            System.out.println("Le corresponden 15 días habiles de vacaciones");}
            else if(antiguedad<10){
                    System.out.println("Le corresponden 21 días habiles de vacaciones");
                    }
            else if(antiguedad<20){
                    System.out.println("Le corresponden 30 días habiles de vacaciones");
                    }
            else if(antiguedad>20){
                    System.out.println("Le corresponden 35 días habiles de vacaciones");
                    }
            else {
                    System.out.println("Tiene vacaciones proporcionales");
                    }
        }
        
    }
    
}
