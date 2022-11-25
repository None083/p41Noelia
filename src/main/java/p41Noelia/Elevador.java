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
    String numeroSerie;
    String fabricante;
    int maxPersonas;
    double maxPeso;
    LocalDate fechaFabricacion;
    LocalDate fechaRevision;

    public Elevador(String numeroSerie, String fabricante, int maxPersonas, double maxPeso, LocalDate fechaFabricacion, LocalDate fechaRevision) {
        this.numeroSerie = numeroSerie();
        this.fabricante = fabricante;     
        if (maxPersonas > 0 && maxPersonas <= 10){
            this.maxPersonas = maxPersonas;
        }
        
        if (maxPeso > 0 && maxPeso <= 800){
            this.maxPeso = maxPeso;
        }
        
        this.fechaFabricacion = fechaFabricacion;
        this.fechaRevision = fechaRevision;
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

    public void getFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void getFechaRevision(LocalDate fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public void setMaxPeso(double maxPeso) {
        this.maxPeso = maxPeso;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setFechaRevision(String fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    private static String numeroSerie() {
        String numero = "";
        for (int i = 0; i < 10; i++) {
            numero = RandomStringUtils.randomNumeric(8);
        }
        return numero;
    }
    
    
    

}
