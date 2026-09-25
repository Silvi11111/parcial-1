package co.edu.uniquindio.poo.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

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
    private char[][] matrizOcupacion;
    private ArrayList<Huesped> listaHuespedes;
    private ArrayList<Habitacion> listaHabitaciones;
    private ArrayList<Reserva> listaReservas;


    //constructor

    public Hotel(String nombreComercial, String nit, String telefono, String direccion, Habitacion[] arregloHabitaciones, Reserva[] arregloReservas, char[][] matrizOcupacion) {
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.arregloHabitaciones = arregloHabitaciones;
        this.arregloReservas = arregloReservas;
        this.matrizOcupacion = matrizOcupacion;
        listaHuespedes = new ArrayList<>();
        listaHabitaciones = new ArrayList<>();
        listaReservas = new ArrayList<>();

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

    public ArrayList<Huesped> getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(ArrayList<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
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

    public String registrarHuesped(String documento, String nombreCompleto, byte edad, String ciudadProcedencia, String telefono) {
        String mensaje = "";
        Huesped buscado = verificarHuesped(telefono);
        if (buscado != null) {
            return "Error, el huesped que usted desea registrar ya se encuentra registrado";
        } else {
            Huesped huespedNuevo = new Huesped(documento, nombreCompleto, edad, ciudadProcedencia, telefono);
            listaHuespedes.add(huespedNuevo);
            mensaje = "Huesped registrado con exito";
        }
        return mensaje;
    }

    public Huesped verificarHuesped(String telefono) {
        for (Huesped aux : listaHuespedes) {
            if (aux.getTelefono().equals(telefono)) {
                return aux;
            }
        }
        return null;
    }
    public String buscarHuesped(String telefono) {
        String mensaje = "";
        for (Huesped aux : listaHuespedes) {
            if (aux.getTelefono().equals(telefono)) {
                mensaje+="Se encontró un huesped.";
            }else{
                mensaje+="No se encontró ningún huésped registrado con el teléfono: ";
            }
        }

        return mensaje;
    }
    public String calcularOcupacionMayor(char matriz[][],String[] dias){
        int numHabitaciones = matriz.length;
        int numDias = matriz[0].length;
        int maxOcupadas = -1;
        String diaMasOcupado = "";
        for (int col = 0; col < numDias; col++) {
            int ocupadas = 0;
            for (int fila = 0; fila < numHabitaciones; fila++) {
                if (matriz[fila][col] == 'O') {
                    ocupadas++;
                }
            }
            // Guardamos el día que supere el récord de ocupación
            if (ocupadas > maxOcupadas) {
                maxOcupadas = ocupadas;
                diaMasOcupado = dias[col];
            }
        }
        return"el dia con más habitaciones ocupadas: "+ diaMasOcupado + " con " + maxOcupadas + " habitaciones ocupadas)";

    }
    public String calcularOcupacionMenor(char matriz[][],String[] dias){
        int numHabitaciones = matriz.length;
        int numDias = matriz[0].length;

        int minOcupadas = Integer.MAX_VALUE; // Iniciamos con el valor más alto posible
        String diaMenosOcupado = "";

        for (int col = 0; col < numDias; col++) {
            int ocupadas = 0;
            for (int fila = 0; fila < numHabitaciones; fila++) {
                if (matriz[fila][col] == 'O') {
                    ocupadas++;
                }
            }

            // Guardamos el día con el conteo más bajo
            if (ocupadas < minOcupadas) {
                minOcupadas = ocupadas;
                diaMenosOcupado = dias[col];
            }
        }

        return"El dia con menos habitaciones ocupadas:"+ diaMenosOcupado + " con " + minOcupadas + " habitaciones ocupadas)";
    }
    public String registrarReservacion(String codigoReserva,String fecha,int tipoHabitacion,int numeroNoches,int cantidadHuespedes,String estado,double valor,String metodoPago) {
        String mensaje = "";
        Reserva buscado = verificarReserva(codigoReserva);
        if (buscado != null) {
            return "Error, la reserva que usted desea registrar ya se encuentra registrada";
        } else {
            Reserva reservaNuevo = new Reserva(codigoReserva, fecha, numeroNoches, cantidadHuespedes, estado,metodoPago,valor);
            listaReservas.add(reservaNuevo);
            mensaje = "Reserva registrada con exito";
        }
        return mensaje;

    }
    public Reserva verificarReserva(String codigoReserva){
        for (Reserva aux : listaReservas) {
            if (aux.getCodigo().equals(codigoReserva)) {
                return aux;
            }
        }
        return null;
    }
    public String reservacionEspecial(String codigo){
        String mensaje="";
        String invertida = "";

        for (int i = codigo.length() - 1; i >= 0; i--) {
            invertida += codigo.charAt(i);
        }
        if (codigo.equals(invertida)){
            mensaje+="Es una reserva especial (capicua)";
        }else{
            mensaje+="Es una reserva común (no es capicua)";
        }

        return mensaje;
    }
    public String consultarFechaingresos(String fecha){
        String mensaje="";
        Reserva buscado = verificarFechaingresos(fecha);
        if (buscado != null) {
            return "La fecha aparece en una reserva";
        } else {
            mensaje = "Por el momento, no hay reservas en esa fecha";
        }

        return mensaje;
    }
    public Reserva verificarFechaingresos(String fecha){
        for (Reserva aux : listaReservas) {
            if (aux.getFecha().equals(fecha)) {
                return aux;
            }
        }
        return null;
    }
}