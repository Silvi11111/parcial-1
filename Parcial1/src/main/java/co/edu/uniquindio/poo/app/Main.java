package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Habitacion;
import co.edu.uniquindio.poo.model.Hotel;
import co.edu.uniquindio.poo.model.Huesped;
import co.edu.uniquindio.poo.model.Reserva;

import javax.swing.*;

/**
 *Esta clase representa el main de un hotel
 *@version 1.0
 *@autor Silvana López
 *@fecha 24/09/2026
 */

public class Main {
    static void main() {
        JOptionPane.showMessageDialog(null,"Bienvenidos al sistema de gestión del hotel StayPlus");
        Habitacion [] arregloHabitacion={};
        Reserva[] arregloReserva={};
        String[] dias = {"Lunes", "Martes", "Miércoles"};
        char matrizOcupacion[][]={{'D','O','O'},
                                {'O','D','D'},
                                {'D','O','D'}};

        Hotel hotel = new Hotel("Hotel StayPlus", "874.654.315-1", "Av. Principal", "3123456789",arregloHabitacion,arregloReserva,matrizOcupacion);
        //CRUD create, read, update,delete
        int opcion;

        do{
            opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Por favor selecciones una opcion :\n"+
                            "1. Registrar huesped\n" +
                            "2. Consultar huesped por número de teléfono\n" +
                            "3. Analizar matriz de ocupación semanal\n" +
                            "4. Crear reservaciones \n"+
                            "5. Identificar reservas especiales\n" +
                            "6. Consultar ingresos por fecha"
                            ));

            switch (opcion){
                case 1:
                    crearHuesped(hotel);

                case 2:
                    consultarHuesped(hotel);

                case 3:
                    analizarMatrizOcupacion(hotel,matrizOcupacion,dias);
                case 4:
                    crearReservaciones(hotel);
                case 5:
                    identificarReservasEspeciales(hotel);

                case 6:
                    ingresosFecha(hotel);

                case 0:
                    JOptionPane.showMessageDialog(null,"Muchas gracias por usar nuestro sistema");
                    break;
                default:JOptionPane.showMessageDialog(null,"Opcion Invalida");

            }

        }while(opcion != 0);



        }
        private static void crearHuesped (Hotel hotel){
            String documento= JOptionPane.showInputDialog(null,"Ingrese el documento de identidad: ");
            String nombreCompleto = JOptionPane.showInputDialog(null,"Ingrese su nombre completo: ");
            String edad = JOptionPane.showInputDialog(null,"Ingrese su edad: ");
            byte edadHuesped = Byte.valueOf(edad);
            String ciudadProcedencia = JOptionPane.showInputDialog(null,"Ingrese la ciudad de donde proviene: ");
            String telefono = JOptionPane.showInputDialog(null,"ingrese su número telefónico: ");

            String resultado = hotel.registrarHuesped(documento,nombreCompleto,edadHuesped,ciudadProcedencia,telefono);

            JOptionPane.showMessageDialog(null,resultado);

        }
        private static void consultarHuesped(Hotel hotel){
            String telefono= JOptionPane.showInputDialog(null,"ingrese su número telefónico para hacer la busqueda: ");
            String resultado = hotel.buscarHuesped(telefono);
            JOptionPane.showMessageDialog(null,resultado);
        }
        private static void analizarMatrizOcupacion(Hotel hotel,char matrizOcupacion[][],String []dias){
        String resultado=hotel.calcularOcupacionMayor(matrizOcupacion,dias);
        String resultado2=hotel.calcularOcupacionMenor(matrizOcupacion,dias);
        JOptionPane.showMessageDialog(null,resultado+resultado2);
        }
        private static void crearReservaciones(Hotel hotel){
            String codigoReserva=JOptionPane.showInputDialog(null,"ingrese el código de su reservación: ");
            String fecha=JOptionPane.showInputDialog(null,"ingrese la fecha de su reservación: ");
            String habitacion=JOptionPane.showInputDialog(null,"ingrese el número del tipo de habitación que quiere: 1.Individual 2.Doble 3. Suite ");
            int tipoHabitacion=Integer.valueOf(habitacion);
            String noches=JOptionPane.showInputDialog(null,"ingrese la cantidad de noches que desea quedarse: ");
            int numeroNoches= Integer.valueOf(noches);
            String huespedes=JOptionPane.showInputDialog(null,"ingrese la cantidad de huespedes: ");
            int cantidadHuespedes= Integer.valueOf(huespedes);
            String estado=JOptionPane.showInputDialog(null,"ingrese el estado de su reservación: ");
            JOptionPane.showMessageDialog(null,"El valor total se lo dará el recepcionista");
            double valorTotal=0;
            String metodoPago=JOptionPane.showInputDialog(null,"ingrese el método de pago que desea usar: ");

            String resultado = hotel.registrarReservacion(codigoReserva,fecha,tipoHabitacion,numeroNoches,cantidadHuespedes,estado,valorTotal,metodoPago);

            JOptionPane.showMessageDialog(null,resultado);

    }
    public static void identificarReservasEspeciales(Hotel hotel){
        String codigo=JOptionPane.showInputDialog(null,"ingrese el código de su reservación: ");
        String resultado=hotel.reservacionEspecial(codigo);
        JOptionPane.showMessageDialog(null,resultado);
    }
    public static void ingresosFecha(Hotel hotel){
        String fecha=JOptionPane.showInputDialog(null,"Ingrese la fecha que quiera consultar: ");
        String resultado=hotel.consultarFechaingresos(fecha);
        JOptionPane.showMessageDialog(null,resultado);
    }

}