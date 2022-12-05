/*
Programa para ingresar vendedores y sus stributos con algunas funciones de calculo de sueldos y vacacioness
 */
package programasueldos;

import Entidades.Vendedores;
import Servicio.VendedoresServicio;

/**
 *
 * @author Leonardo ALvez
 */
public class ProgramaSueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos un objeto del tipo servicio 
        VendedoresServicio vs = new VendedoresServicio();
        // Instanciamos un objeto Vendedores para alojar el retorno 
        // de lo construido en la clase de servicio. El metodo altaVendedores
        // retorna un objeto que debemos alojar en el siguiente objeto.
        Vendedores v1 =  vs.altaVendedores();
        vs.SueldoMensual(v1);
        vs.vacaciones(v1);
        
    }
    
}
