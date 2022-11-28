/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corregido;

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
    private Estado estado;

    public Elevador(String fabricante, int maxPersonas, double maxPeso) {
        this.numeroSerie = RandomStringUtils.randomNumeric(8);
        this.fabricante = fabricante;
        if (maxPersonas >= 0 && maxPersonas <= 10) {
            this.maxPersonas = maxPersonas;
        }

        if (maxPeso >= 0 && maxPeso <= 800) {
            this.maxPeso = maxPeso;
        }

        this.fechaFabricacion = LocalDate.now();
        this.fechaRevision = LocalDate.now();
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

    public Estado getEstado() {
        return estado;
    }

    public void setFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elevador{");
        sb.append("numeroSerie=").append(numeroSerie);
        sb.append(", fabricante=").append(fabricante);
        sb.append(", maxPersonas=").append(maxPersonas);
        sb.append(", maxPeso=").append(maxPeso);
        sb.append(", fechaFabricacion=").append(fechaFabricacion);
        sb.append(", fechaRevision=").append(fechaRevision);
        sb.append(", planta=").append(planta);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    public boolean mover(int numeroPersonas, double pesoPersonas, int numPlanta){
        boolean resultado = false;
        //compruebo pesos y numero de personas
        if(maxPersonas >= 0 && numeroPersonas <= this.maxPersonas && 
                pesoPersonas >= 0 && pesoPersonas <= this.maxPeso){
            if(numPlanta!=this.planta && numPlanta >= 0 && numPlanta <= 8){
                // Puedo hacer el viaje
                if(this.planta > numPlanta){
                    this.estado = Estado.BAJANDO;
                } else{
                    this.estado = Estado.SUBIENDO;
                }
                this.planta = numPlanta;
                resultado = true;
            }
        }
        return resultado;
    }
    
}
