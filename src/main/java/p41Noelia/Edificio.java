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

    }

    public static void fechaProximaRevision(Elevador fechaRevision) {

        fechaRevision.getFechaRevision().getMonth().plus(6);

    }

}
