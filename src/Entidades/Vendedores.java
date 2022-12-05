/*
Acá vamos a construir la clase vendedores.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Vendedores {

    
    
    // Declaramos los atributos de la clase
    
    private String nombre;
    private Integer dni;
    private double sueldoBasico;
    private double comisiones;
    private double sueldoMensual;
    private Date fechaInicio;
    
    // Construimos un constructor por defecto.
    
    public Vendedores() {
    }
    
    // Construimos un constructor por parametros.

    public Vendedores(String nombre, Integer dni, double sueldoBasico, double comisiones, double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    
    // Getters an Setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    
    // Método toString para mostrar todos los valores.

    @Override
    public String toString() {
        return "Vendedores{" + "nombre=" + nombre + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
    
    
}
