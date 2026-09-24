package co.edu.uniquindio.poo.model;

import java.util.Arrays;
import java.util.List;

/**
 *Esta clase representa la clase principal del hotel
 *@version 1.0
 *@autor Silvana López
 *@fecha 24/09/2026
 */

public class Hotel {
    private String nombreComercial;
    private String nit;
    private String direccion;
    private String telefono;
    private char [][] matrizOcupacion;
    private List<Huesped> listaHuespedes;
    private List<Habitacion> listaHabitaciones;
    private List<Reserva> listaReservas;


    //constructor


    public Hotel(String nombreComercial,String nit, String direccion, String telefono, Habitacion[] arregloHabitaciones, Reserva[] arregloReserva, char[][] matrizOcupacion, List<Huesped> listaHuespedes, List<Habitacion> listaHabitaciones, List<Reserva> listaReservas) {
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.matrizOcupacion = matrizOcupacion;
        this.listaHuespedes = listaHuespedes;
        this.listaHabitaciones = listaHabitaciones;
        this.listaReservas = listaReservas;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char[][] getMatrizOcupacion() {
        return matrizOcupacion;
    }

    public void setMatrizOcupacion(char[][] matrizOcupacion) {
        this.matrizOcupacion = matrizOcupacion;
    }

    public List<Huesped> getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(List<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(List<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    //to String


    @Override
    public String toString() {
        return "Hotel{" +
                "nombreComercial='" + nombreComercial + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", matrizOcupacion=" + Arrays.toString(matrizOcupacion) +
                ", listaHuespedes=" + listaHuespedes +
                ", listaHabitaciones=" + listaHabitaciones +
                ", listaReservas=" + listaReservas +
                '}';
    }
}
