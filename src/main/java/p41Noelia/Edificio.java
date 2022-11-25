/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p41Noelia;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public class Edificio {

    /**
     *
     */
    public static void main(String[] args) {
        
        Elevador ascensor1 = new Elevador("Ascensores Guays", 
                7, 700, LocalDate.MIN, 
                LocalDate.MIN, 2, "Subiendo");
        Elevador ascensor2 = new Elevador ("Ascensores no tan Guays", 
                8, 900, LocalDate.MIN, 
                LocalDate.MIN, 0, "");
        System.out.println(ascensor1);
        System.out.println(ascensor2);
        
        System.out.println("La fecha de la próxima revision del ascensor 1 es: " + 
                fechaProximaRevision(ascensor1.getFechaRevision()));

    }

    public static Elevador fechaProximaRevision(Elevador fechaRevision) {
        
        Elevador proximaRevision = fechaRevision.getFechaRevision().getMonth().plus(6);

        return proximaRevision;

    }

}
