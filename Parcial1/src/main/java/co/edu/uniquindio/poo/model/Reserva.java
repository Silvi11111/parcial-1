package co.edu.uniquindio.poo.model;

import java.util.Arrays;

public class Reserva {
    private String codigo;
    private String fecha;
    private int numeroNoches;
    private int cantidadHuespedes;
    private String [] estado={"pendiente","confirmada","finalizada"};
    private String[] metodoPago={"efectivo","tarjeta","transferencia bancaria"};
    private double valorTotal;

    //constructores

    public Reserva(String codigo, String fecha, int numeroNoches, int cantidadHuespedes, String[] estado, String[] metodoPago, double valorTotal) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.numeroNoches = numeroNoches;
        this.cantidadHuespedes = cantidadHuespedes;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
    }

    //getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public int getCantidadHuespedes() {
        return cantidadHuespedes;
    }

    public void setCantidadHuespedes(int cantidadHuespedes) {
        this.cantidadHuespedes = cantidadHuespedes;
    }

    public String[] getEstado() {
        return estado;
    }

    public void setEstado(String[] estado) {
        this.estado = estado;
    }

    public String[] getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String[] metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    //to string

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", numeroNoches=" + numeroNoches +
                ", cantidadHuespedes=" + cantidadHuespedes +
                ", estado=" + Arrays.toString(estado) +
                ", metodoPago=" + Arrays.toString(metodoPago) +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
