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
    private Habitacion[] arregloHabitaciones;
    private Reserva[] arregloReservas;
    private char [][] matrizOcupacion;
    private List<Huesped> listaHuespedes;
    private List<Habitacion> listaHabitaciones;
    private List<Reserva> listaReservas;


    //constructor

    public Hotel(String nombreComercial, String nit, String direccion, String telefono, Habitacion[] arregloHabitaciones, Reserva[] arregloReservas, char[][] matrizOcupacion, List<Huesped> listaHuespedes, List<Habitacion> listaHabitaciones, List<Reserva> listaReservas) {
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.arregloHabitaciones = arregloHabitaciones;
        this.arregloReservas = arregloReservas;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Reserva[] getArregloReservas() {
        return arregloReservas;
    }

    public void setArregloReservas(Reserva[] arregloReservas) {
        this.arregloReservas = arregloReservas;
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
                ", arregloHabitaciones=" + Arrays.toString(arregloHabitaciones) +
                ", arregloReservas=" + Arrays.toString(arregloReservas) +
                ", matrizOcupacion=" + Arrays.toString(matrizOcupacion) +
                ", listaHuespedes=" + listaHuespedes +
                ", listaHabitaciones=" + listaHabitaciones +
                ", listaReservas=" + listaReservas +
                '}';
    }

    public String registrarHuesped(String documento, String nombreCompleto, byte edad, String ciudadProcedencia, String telefono ){
        String mensaje = "";
        Huesped buscado = buscarHuesped(telefono);
        if(buscado != null){
            return "Error, el huesped que usted desea registrar ya se encuentra registrado";
        }else{
            Huesped huespedNuevo = new Huesped(documento,nombreCompleto,edad,ciudadProcedencia,telefono);
            listaHuespedes.add(huespedNuevo);
            mensaje = "Huesped registrado con exito";
        }
        return mensaje;
    }
    public Huesped buscarHuesped (String telefono){
        for(Huesped aux : listaHuespedes){
            if(aux.getTelefono().equals(telefono)){
                return aux;
            }
        }
        return null;
    }
}
