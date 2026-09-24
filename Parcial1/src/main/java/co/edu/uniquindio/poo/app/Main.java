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
                            "2. Consultar huesped\n" +
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

        private static void crearHuesped(Hotel hotel) {

            String nombres = JOptionPane.showInputDialog(null,"Ingrese los nombres del estudiante nuevo");
            String apellidos = JOptionPane.showInputDialog(null,"Por favor ingresar los apellidos del estudiante nuevo");
            String identificacion = JOptionPane.showInputDialog(null,"Por favor ingresar la indentificaion del estudiante nuevo");
            String edad = JOptionPane.showInputDialog(null,"Por favor ingresar la edad del estudiante nuevo");
            byte edadEstudiante = Byte.valueOf(edad);
            String correo = JOptionPane.showInputDialog(null,"Por favor ingresar el correo del estudiante nuevo");
            String telefono = JOptionPane.showInputDialog(null,"Por favor ingresar el telefono del estudiante nuevo");

            String resultado = hotel.registrarEstudiante(nombres,apellidos,identificacion,edadEstudiante,correo,telefono);

            JOptionPane.showMessageDialog(null,resultado);


        }


    }
}

