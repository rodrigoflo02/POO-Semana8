package model;

import javax.swing.*;

public class Empleado extends Persona implements Registrable{
    private String area;
    private String rol;

    /**
     * Constructor de Empleado
     * @param nombre
     * @param apellido
     * @param area
     * @param rol
     */
    public Empleado(String nombre, String apellido, String area, String rol) {
        super(nombre, apellido);
        this.area = area;
        this.rol = rol;
    }

    public String getArea() {
        return area;
    }
    public String getRol() {
        return rol;
    }

    @Override
    public void MostrarPersona() {
        mostrarResumen();
    }

    //Metodo mostrarResumen sobreescrito
    @Override
    public void mostrarResumen() {
        JOptionPane.showMessageDialog(null,"       ************ EMPLEADOS SALMONTT ************"+ "\n" +"Empleado: " + getNombre() + " " + getApellido() +
                " | Area: " + area + " | Rol: " + rol);
    }
}
