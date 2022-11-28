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
        
        Elevador ascensor1 = new Elevador("Ascensores Guays", 6, 600);
        Elevador ascensor2 = new Elevador ("Ascensores no tan Guays", 8, 700);
        Elevador ascensor3 = new Elevador ("Ascensores medio Guays", 12, 600);
        Elevador ascensor4 = new Elevador ("Ascensores que no molan", 12, 1600);
        System.out.println(ascensor1);
        System.out.println(ascensor2);
        System.out.println(ascensor3);
        System.out.println(ascensor4);
        System.out.println("----------------------");
        ascensor1.mover(5, 345, 3);
        System.out.println(ascensor1);
        
        System.out.println(fechaProximaRevision(ascensor1));
        
        

    }

    public static LocalDate fechaProximaRevision(Elevador e) {
        
        LocalDate fechaRevision = e.getFechaRevision().plusMonths(6);
        return fechaRevision;

    }

}
