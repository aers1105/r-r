/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

/**
 *
 * @author 52644
 */
public class Citas{

    /**
     * @return the idCita
     */
    public int getIdCita() {
        return idCita;
    }

    /**
     * @param idCita the idCita to set
     */
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the abogado
     */
    public String getAbogado() {
        return abogado;
    }

    /**
     * @param abogado the abogado to set
     */
    public void setAbogado(String abogado) {
        this.abogado = abogado;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the cubiculo
     */
    public int getCubiculo() {
        return cubiculo;
    }

    /**
     * @param cubiculo the cubiculo to set
     */
    public void setCubiculo(int cubiculo) {
        this.cubiculo = cubiculo;
    }

    public Citas(int idCita, String fecha, String hora, String abogado, String nombreCliente, String motivo, int cubiculo) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.abogado = abogado;
        this.nombreCliente = nombreCliente;
        this.motivo = motivo;
        this.cubiculo = cubiculo;
    }
    private int idCita;
    private String fecha;
    private String hora;
    private String abogado; 
    private String nombreCliente;
    private String motivo;
    private int cubiculo;
    
}
