package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Habitacion;
import co.edu.uniquindio.poo.model.Hotel;

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

        Hotel hotel = new Hotel("Hotel StayPlus", "874.654.315-1", "Av. Principal", "3123456789",);
        //CRUD create, read, update,delete
        int opcion;

        do{
            opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Por favor selecciones una opcion :\n"+
                            "1. Registrar huesped\n" +
                            "2. Consultar huesped por número de teléfono\n" +
                            "3. Analizar matriz de ocupación semanal\n" +
                            "4. Identificar reservas especiales\n" +
                            "5. Consultar ingresos por fecha"+

                            ""));

            switch (opcion){
                case 1:
                    crearHuesped(hotel);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Muchas gracias por usar nuestro sistema");
                    break;
                default:JOptionPane.showMessageDialog(null,"Opcion Invalida");

            }

        }while(opcion != 0);

        private void crearHuesped(Hotel hotel) {

            String documento= JOptionPane.showInputDialog(null,"Ingrese el documento de identidad: ");
            String nombreCompleto = JOptionPane.showInputDialog(null,"Ingrese su nombre completo: ");
            String edad = JOptionPane.showInputDialog(null,"Ingrese su edad: ");
            byte edadHuesped = Byte.valueOf(edad);
            String ciudadProcedencia = JOptionPane.showInputDialog(null,"Ingrese la ciudad de donde proviene: ");
            String telefono = JOptionPane.showInputDialog(null,"ingrese su número telefónico: ");

            String resultado = hotel.registrarHuesped(documento,nombreCompleto,edad,ciudadProcedencia,telefono);

            JOptionPane.showMessageDialog(null,resultado);


        }


    }
}

