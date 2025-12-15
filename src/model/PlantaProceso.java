package model;

import javax.swing.*;

public class PlantaProceso extends UnidadOperativa implements Registrable{
    private double capacidadproceso;
    private int numerolineas;

    /**
     * Constructor de PlantaProceso
     * @param nombre
     * @param comuna
     * @param capacidadproceso
     * @param numerolineas
     */
    public PlantaProceso(String nombre, String comuna, double capacidadproceso, int numerolineas) {
        super(nombre, comuna);
        this.capacidadproceso = capacidadproceso;
        this.numerolineas = numerolineas;
    }

    public double getCapacidadproceso() {
        return capacidadproceso;
    }
    public int getNumerolineas() {
        return numerolineas;
    }


    @Override
    public void mostrarInformacion(){
        mostrarResumen();
    }

    //Metodo mostrarResumen sobreescrito
    @Override
    public void mostrarResumen() {
        JOptionPane.showMessageDialog(null,"************ Planta de Procesos ************"+ "\n" + "Nombre de planta: " + getNombre() +
                ", Comuna: " + getComuna() + ", Capacidad de proceso: " + capacidadproceso + ", Numero de Lineas: " + numerolineas);
    }


}
