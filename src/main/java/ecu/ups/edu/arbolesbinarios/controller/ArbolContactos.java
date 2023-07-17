/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecu.ups.edu.arbolesbinarios.controller;

import ecu.ups.edu.arbolesbinarios.modo.Contacto;
import ecu.ups.edu.arbolesbinarios.modo.Node;

/**
 *
 * @author ESTUDIANTE
 */
public class ArbolContactos {

    private Node raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void insert(Contacto newContacto) {
        if (raiz == null) {
            raiz = new Node(newContacto);
        } else {
            insertRecursivo(raiz, newContacto);
        }
    }

    private void insertRecursivo(Node node, Contacto newContacto) {

        if (newContacto.getContacto().compareTo(node.getContacto().getContacto()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(newContacto));
            } else {
                insertRecursivo(node.getLeft(), newContacto);
            }

        } else if (newContacto.getContacto().compareTo(node.getContacto().getContacto()) > 0) {
            if (node.getRight() == null) {
                node.setRight(new Node(newContacto));
            } else {
                insertRecursivo(node.getLeft(), newContacto);
            }
        } else {
            insertRecursivo(node.getRight(), newContacto);
        }
    }

    public boolean estaEquilibrado() {
        return verificarBalance(raiz);
    }

    private boolean verificarBalance(Node node) {
        if (node == null) {
            return true; //Arbol vacio, se considera equilibrado
        }

        int alturaIzquierda = obtenerAltura(node.getLeft());
        int alturaDerecha = obtenerAltura(node.getRight());

        int direrencia = Math.abs(alturaIzquierda - alturaDerecha);
        //verificamos la direrencia de las alturas
        if (direrencia > 1) {

            return false;
        }

        return verificarBalance(node.getLeft()) && verificarBalance(node.getRight());
    }

    private int obtenerAltura(Node node) {
        if (node == null) {
            return 0;
        }
        int alturaIzquierda = obtenerAltura(node.getLeft());
        int alturaDrerecha = obtenerAltura(node.getRight());

        return Math.max(alturaIzquierda, alturaDrerecha) + 1;
    }
}
