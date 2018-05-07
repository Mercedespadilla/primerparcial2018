/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author mercedes padilla
 */
public class RegistroReserva {
    private String codigoreserva;
    private String fechareserva;
    private String fechaentrada;
    private String fechasalida;
    public Habitaciones habitaciones;
    public Paquete paquete;
    private Huesped cliente;
    private double cantpersona;
    private double precio;
    
    public RegistroReserva(){
    }
    public RegistroReserva(Huesped cliente,double cantpersona,double precio, Habitaciones habitaciones, Paquete paquete, String codigoreserva, String fechaentrada, String fechasalida, String fechareserva) {
        this.cliente = cliente;
        this.codigoreserva = codigoreserva;
        this.habitaciones = habitaciones;
        this.paquete = paquete;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
    }

    public RegistroReserva(String codigoreserva){
        this.codigoreserva = codigoreserva;
        cliente = new Huesped();
    }

  

    public String getCodigo() {
        return codigoreserva;
    }
    public void setCodigo (String codigoreserva) {
        this.codigoreserva = codigoreserva;
    }

     public Huesped getHuesped() {
        return cliente;
    }

    public void setHuesped(Huesped cliente) {
        this.cliente = cliente;
    }
    public Habitaciones getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitaciones habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    public String getFechareserva() {
        return fechaentrada;
    }

    public void setFechareserva (String fechareserva) {
        this.fechareserva = fechareserva;
    }

    public String getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(String fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public double getCantpersona() {
        return cantpersona;
    }

    public void setCantpersona(double cantpersona) {
        this.cantpersona = cantpersona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
