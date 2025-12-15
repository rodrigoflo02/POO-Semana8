package model;

import javax.swing.*;

public class CentroCultivo  extends UnidadOperativa implements Registrable {

    private double toneladasproduccion;
    private int numerojaulas;


    /**
     * Constructor de CentroCultivo
     * @param nombre
     * @param comuna
     * @param toneladasproduccion
     * @param numerojaulas
     */
    public CentroCultivo(String nombre, String comuna, double toneladasproduccion, int numerojaulas) {
        super(nombre, comuna);
        this.toneladasproduccion = toneladasproduccion;
        this.numerojaulas = numerojaulas;

    }

    public double getToneladasproduccion() {
        return toneladasproduccion;
    }
    public int getNumerojaulas() {
        return numerojaulas;
    }

    @Override
    public void mostrarInformacion() {
        mostrarResumen();
    }

    //Metodo mostrarResumen sobreescrito
    @Override
    public void mostrarResumen() {
        JOptionPane.showMessageDialog(null,"************ Centro de Cultivos ************" + "\n" + "Centro de Cultivos: " + getNombre() +
                ", Comuna: " + getComuna() + ", Toneladas de produccion: " + toneladasproduccion + ", Numeros de jaulas: " + numerojaulas);
    }
}
