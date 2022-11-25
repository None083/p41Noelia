/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package p41Noelia;

/**
 *
 * @author noelia
 */
public enum Estado {
    
    SUBIENDO(1, "Subiendo"),
    BAJANDO(2, "Bajando");
    
    private int codigoEstado;
    private String estado;

    private Estado(int codigoEstado, String estado) {
        this.codigoEstado = codigoEstado;
        this.estado = estado;
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public String getEstado() {
        return estado;
    }
    
    
    
    
}
