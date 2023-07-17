/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ecu.ups.edu.arbolesbinarios;

import ecu.ups.edu.arbolesbinarios.controller.ArbolContactos;
import ecu.ups.edu.arbolesbinarios.modo.Contacto;

/**
 *
 * @author ESTUDIANTE
 */
public class ArbolesBinarios {

    public static void main(String[] args) {
        ArbolContactos arbol = new ArbolContactos();
        
        Contacto c1 = new Contacto("Juan", "12345");
        Contacto c2 = new Contacto("Maria", "12345");
        Contacto c3 = new Contacto("Pedro", "12345");
        Contacto c4 = new Contacto("Pablo", "12345");

        arbol.insert(c1);
        arbol.insert(c2);
        arbol.insert(c3);
        arbol.insert(c4);
        arbol.insert(new Contacto("Julina", "1324"));
        arbol.insert(new Contacto("Jhon", "1324"));
        
        
    }
}
