/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eacastro.main;

import com.eacastro.pojo.Cookie;
import com.eacastro.pojo.Employee;



/**
 *
 * @author Edisson Castro
 */
public class Application {
    // Mëtodo main
    public static void main(String[] args) {
        // Sintaxis TipoDato identificador = new Constructor();
        Cookie miguel = new Cookie();
        String sabor = "Mora";
        miguel.setFlavor(sabor);        
        System.out.println("El sabor de la galleta es: " + miguel.getFlavor());
        
        Employee empleado = new Employee();
        empleado.setSkinColor(sabor);
    }
}
