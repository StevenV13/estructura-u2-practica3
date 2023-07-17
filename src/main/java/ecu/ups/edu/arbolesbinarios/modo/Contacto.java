/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecu.ups.edu.arbolesbinarios.modo;

/**
 *
 * @author ESTUDIANTE
 */
public class Contacto {
    private String contacto;
    private String telefono;

    public Contacto(String contacto, String telefono) {
        this.contacto = contacto;
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "contacto=" + contacto + ", telefono=" + telefono + '}';
    }
    
    
  
}
