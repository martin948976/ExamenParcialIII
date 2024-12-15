/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia;

/**
 *
 * @author USER
 */
public class PersonasMS {
    private String nombreMS;
    private int edadMS;
    private String direccionMS;

    public PersonasMS(String nombreMS, int edadMS, String direccionMS) {
        this.nombreMS = nombreMS;
        this.edadMS = edadMS;
        this.direccionMS = direccionMS;
    }

    public String getNombreMS() {
        return nombreMS;
    }

    public void setNombreMS(String nombreMS) {
        this.nombreMS = nombreMS;
    }

    public int getEdadMS() {
        return edadMS;
    }

    public void setEdadMS(int edadMS) {
        this.edadMS = edadMS;
    }

    public String getDireccionMS() {
        return direccionMS;
    }

    public void setDireccionMS(String direccionMS) {
        this.direccionMS = direccionMS;
    }
}


