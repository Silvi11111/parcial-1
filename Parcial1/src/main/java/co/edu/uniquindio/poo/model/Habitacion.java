package co.edu.uniquindio.poo.model;
/**
 *Esta clase representa la habitacion de un hotel
 *@version 1.0
 *@autor Silvana López
 *@fecha 24/09/2026
 */

import java.util.Arrays;

public class Habitacion {
    private String numeroHabitacion;
    private String[] tipo={"individual","doble","suite"};
    private byte piso;
    private int capacidad;
    private double precioNoche;
    private String[] estado={"disponible","rrservada","ocupada"};

    //constructor
    public Habitacion(String numeroHabitacion, String[] tipo, byte piso, double precioNoche, int capacidad, String[] estado) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.piso = piso;
        this.precioNoche = precioNoche;
        this.capacidad = capacidad;
        this.estado = estado;
    }
    //getters y setters

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public byte getPiso() {
        return piso;
    }

    public void setPiso(byte piso) {
        this.piso = piso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String[] getEstado() {
        return estado;
    }

    public void setEstado(String[] estado) {
        this.estado = estado;
    }

    //toString

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion='" + numeroHabitacion + '\'' +
                ", tipo=" + Arrays.toString(tipo) +
                ", piso=" + piso +
                ", capacidad=" + capacidad +
                ", precioNoche=" + precioNoche +
                ", estado=" + Arrays.toString(estado) +
                '}';
    }
    private static String []recorrerArreglohabitacion(String numeroHabitacion, String[] tipo, byte piso, double precioNoche, int capacidad, String[] estado){

    }

}