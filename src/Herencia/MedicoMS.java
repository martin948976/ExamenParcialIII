/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author USER
 */
public class MedicoMS extends PacienteMS{
    private String especialidadDS;
    private int aniosExperienciaDS;

    public MedicoMS(String especialidadDS, int aniosExperienciaDS, int nroHistorialMS, String EnfermedadMS, String nombreMS, int edadMS, String direccionMS) {
        super(nroHistorialMS, EnfermedadMS, nombreMS, edadMS, direccionMS);
        this.especialidadDS = especialidadDS;
        this.aniosExperienciaDS = aniosExperienciaDS;
    }

    public String getEspecialidadDS() {
        return especialidadDS;
    }

    public void setEspecialidadDS(String especialidadDS) {
        this.especialidadDS = especialidadDS;
    }

    public int getAniosExperienciaDS() {
        return aniosExperienciaDS;
    }

    public void setAniosExperienciaDS(int aniosExperienciaDS) {
        this.aniosExperienciaDS = aniosExperienciaDS;
    }
    
}
