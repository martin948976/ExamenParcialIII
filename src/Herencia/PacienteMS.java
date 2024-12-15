/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author USER
 */
public class PacienteMS extends PersonasMS{
    private int nroHistorialMS;
    private String EnfermedadMS;

    public PacienteMS(int nroHistorialMS, String EnfermedadMS, String nombreMS, int edadMS, String direccionMS) {
        super(nombreMS, edadMS, direccionMS);
        this.nroHistorialMS = nroHistorialMS;
        this.EnfermedadMS = EnfermedadMS;
    }

    public int getNroHistorialMS() {
        return nroHistorialMS;
    }

    public void setNroHistorialMS(int nroHistorialMS) {
        this.nroHistorialMS = nroHistorialMS;
    }

    public String getEnfermedadMS() {
        return EnfermedadMS;
    }

    public void setEnfermedadMS(String EnfermedadMS) {
        this.EnfermedadMS = EnfermedadMS;
    }

    
}
