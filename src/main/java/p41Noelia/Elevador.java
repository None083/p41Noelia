/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p41Noelia;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class Elevador {

    //Atributos
    private String numeroSerie;
    private String fabricante;
    private int maxPersonas;
    private double maxPeso;
    private LocalDate fechaFabricacion;
    private LocalDate fechaRevision;
    private int planta;
    private String estado;

    public Elevador(String fabricante, int maxPersonas, double maxPeso, LocalDate fechaFabricacion, LocalDate fechaRevision, int planta, String estado) {
        this.numeroSerie = numeroSerie();
        this.fabricante = fabricante;
        if (maxPersonas > 0 && maxPersonas <= 10) {
            this.maxPersonas = maxPersonas;
        }

        if (maxPeso > 0 && maxPeso <= 800) {
            this.maxPeso = maxPeso;
        }

        this.fechaFabricacion = fechaFabricacion;
        this.fechaRevision = fechaRevision;

        if (planta >= 0 && planta <= 8) {
            this.planta = planta;
        }
        
        if (planta == 0) {
            this.estado = null;
        } else {
            this.estado = estado;
        }

    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public double getMaxPeso() {
        return maxPeso;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public LocalDate getFechaRevision() {
        return fechaRevision;
    }

    public int getPlanta() {
        return planta;
    }

    public String getEstado() {
        return estado;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Elevador{" + "numeroSerie=" + numeroSerie + ", fabricante=" + fabricante + ", maxPersonas=" + maxPersonas + ", maxPeso=" + maxPeso + ", fechaFabricacion=" + fechaFabricacion + ", fechaRevision=" + fechaRevision + ", planta=" + planta + ", estado=" + estado + '}';
    }

    private static String numeroSerie() {
        String numero = "";
        for (int i = 0; i < 10; i++) {
            numero = RandomStringUtils.randomNumeric(8);
        }
        return numero;
    }
    
    private static boolean mover(int maxPersonas, double maxPeso, int planta){
        if(maxPersonas)
    }

}
