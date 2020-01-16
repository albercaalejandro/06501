/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import org.japo.java.entities.Cosa;



/**
 *
 * @author Alejandro Alberca Gallardo - alejandro.alberca.alum@iescamp.es
 */
public final class App {

    public void launchapp() {
        //1
        Cosa m1 = new Cosa();
        m1.mostrarInfo();
        System.out.println("Actualizando ...");
        m1.setComestibleOK(true);
        m1.mostrarInfo();
        
        //2
         Cosa m2 = new Cosa();
        m2.mostrarInfo();
        System.out.println("Actualizando ...");
        m2.setComestibleOK(false);
        m2.mostrarInfo();
        
        //3 VS
        
        System.out.println(String.format("Los objetos %s son iguales",
                m1.equals(m2)? "SI" : "NO"));
    }
}
