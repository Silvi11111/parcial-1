package co.edu.uniquindio.poo.model;

import java.util.Arrays;

public class Hotel {
    private String nombreComercial;
    private String nit;
    private String direccion;
    private String telefono;
    private Habitacion[] arregloHabitaciones;
    private Reserva[] arregloReserva;
    private char [][] matrizOcupacion;


    //constructor

    public Hotel(String nombreComercial, String nit, String direccion, String telefono, Habitacion[] arregloHabitaciones, Reserva[] arregloReserva, char[][] matrizOcupacion) {
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.arregloHabitaciones = arregloHabitaciones;
        this.arregloReserva = arregloReserva;
        this.matrizOcupacion = matrizOcupacion;
    }
    //getters y setters :p
    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Habitacion[] getArregloHabitaciones() {
        return arregloHabitaciones;
    }

    public void setArregloHabitaciones(Habitacion[] arregloHabitaciones) {
        this.arregloHabitaciones = arregloHabitaciones;
    }

    public Reserva[] getArregloReserva() {
        return arregloReserva;
    }

    public void setArregloReserva(Reserva[] arregloReserva) {
        this.arregloReserva = arregloReserva;
    }

    public char[][] getMatrizOcupacion() {
        return matrizOcupacion;
    }

    public void setMatrizOcupacion(char[][] matrizOcupacion) {
        this.matrizOcupacion = matrizOcupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //to String

    @Override
    public String toString() {
        return "Hotel{" +
                "nombreComercial='" + nombreComercial + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", arregloHabitaciones=" + Arrays.toString(arregloHabitaciones) +
                ", arregloReserva=" + Arrays.toString(arregloReserva) +
                ", matrizOcupacion=" + Arrays.toString(matrizOcupacion) +
                '}';
    }
}
