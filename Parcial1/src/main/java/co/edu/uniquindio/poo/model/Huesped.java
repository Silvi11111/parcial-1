package co.edu.uniquindio.poo.model;

/**
 *Esta clase representa el huesped de un hotel
 *@version 1.0
 *@autor Silvana López
 *@fecha 24/09/2026
 */


public class Huesped {
    private String documento;
    private String nombreCompleto;
    private byte edad;
    private String telefono;
    private String ciudadProcedencia;

    //constructor

    public Huesped(String documento, String nombreCompleto, byte edad, String numero, String ciudadProcedencia) {
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.telefono = telefono;
        this.ciudadProcedencia = ciudadProcedencia;
    }
    // getters y setters

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String numero) {
        this.telefono = numero;
    }

    public String getCiudadProcedencia() {
        return ciudadProcedencia;
    }

    public void setCiudadProcedencia(String ciudadProcedencia) {
        this.ciudadProcedencia = ciudadProcedencia;
    }
    //toString

    @Override
    public String toString() {
        return "Huesped{" +
                "documento='" + documento + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", ciudadProcedencia='" + ciudadProcedencia + '\'' +
                '}';
    }
}
