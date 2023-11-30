/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

/**
 *
 * @author 52644
 */
public class Casos {

    public Casos(int idCaso, String nombreCaso, String nombreCliente, String nombreAbogado, String expediente) {
        this.idCaso = idCaso;
        this.nombreCaso = nombreCaso;
        this.nombreCliente = nombreCliente;
        this.nombreAbogado = nombreAbogado;
        this.expediente = expediente;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreAbogado() {
        return nombreAbogado;
    }

    public void setNombreAbogado(String nombreAbogado) {
        this.nombreAbogado = nombreAbogado;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }
    private int idCaso;
    private String nombreCaso;
    private String nombreCliente;
    private String nombreAbogado;
    private String expediente;
    
}
