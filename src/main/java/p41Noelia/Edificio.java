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

    }

    public static void fechaProximaRevision(Elevador fechaRevision) {

        fechaRevision.getFechaRevision().getMonth().plus(6);

    }

}
