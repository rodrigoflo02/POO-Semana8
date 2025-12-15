package data;

import model.CentroCultivo;
import model.Empleado;
import model.PlantaProceso;
import model.Registrable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class GestorUnidades {
    private List<Registrable> listaEntidades = new ArrayList<>();


    public void instanciasGraficas(){
        boolean ciclo = true;
        while(ciclo){
            try {
                //menu
                String menu = JOptionPane.showInputDialog(null, """
                SISTEMA DE REGISTRO DE SALMONTT
                Favor seleccione el tipo de datos que desea trabajar:
                1. Centro de Cultivos
                2. Plantas de procesos
                3. Empleados
                4. Impresion de datos Almacenados
                5. Salir
                """);

                int seleccion = Integer.parseInt(menu);
                switch (seleccion){
                    case 1:
                        seleccionCentroCultivos();
                        break;
                    case 2:
                        seleccionPlantaProceso();
                        break;
                    case 3:
                        seleccionEmpleados();
                        break;
                    case 4:
                        recorrerLista();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"Presione ENTER para finalizar el programa");
                        ciclo=false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Favor seleccione un valor correspondiente...");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Favor seleccione un valor correspondiente...");
            }
        }

    }

    public void seleccionCentroCultivos(){
        boolean ciclocentro = true;
        while(ciclocentro) {
            try {
                String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre del Centro: ");
                String comuna = JOptionPane.showInputDialog(null,"Ingrese comuna del Centro: ");
                double toneladasproduccion = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese capacidad de toneladas de produccion del centro: "));
                int numerojaulas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numeros de jaulas del centro: "));
                CentroCultivo centrocultivo = new CentroCultivo(nombre,comuna,toneladasproduccion,numerojaulas);
                listaEntidades.add(centrocultivo);
                JOptionPane.showMessageDialog(null,"DATOS INGRESADOS CON EXITO..." + "\nNombre: " + nombre + "\nComuna: " + comuna +
                        "\nToneladas de produccion: " + toneladasproduccion + "\nNumero de jaulas: " + numerojaulas);
                ciclocentro = false;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Favor seleccione un valor correspondiente...");
            }
        }
    }

    public void seleccionPlantaProceso(){
        boolean cicloplanta = true;
        while(cicloplanta){
            try {
                String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre de la planta: ");
                String comuna = JOptionPane.showInputDialog(null,"Ingrese comuna de la planta: ");
                double capacidadproceso = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese capacidad de proceso de la planta: "));
                int numerojaulas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numeros de jaulas de la planta: "));
                PlantaProceso plantaproceso = new PlantaProceso(nombre,comuna,capacidadproceso,numerojaulas);
                listaEntidades.add(plantaproceso);
                JOptionPane.showMessageDialog(null,"DATOS INGRESADOS CON EXITO..." + "\nNombre: " + nombre + "\nComuna: " + comuna +
                        "\nCapacidad de proceso: " + capacidadproceso + "\nNumero de jaulas: " + numerojaulas);
                cicloplanta = false;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Favor seleccione un valor correspondiente...");
            }
        }
    }

    public void seleccionEmpleados(){
        boolean cicloempleado = true;
        String nombre = "";
        String apellido = "";
        String area = "";
        String rol = "";
        while (cicloempleado){
             nombre = JOptionPane.showInputDialog(null,"Ingrese nombre del empleado: ");
             apellido = JOptionPane.showInputDialog(null,"Ingrese apellido del empleado: ");
             area = JOptionPane.showInputDialog(null,"Ingrese departamento perteneciente al empleado: ");
             rol = JOptionPane.showInputDialog(null,"Ingrese rol del empleado: ");
            if (nombre.isEmpty() || apellido.isEmpty() || area.isEmpty() || rol.isEmpty()){
                JOptionPane.showMessageDialog(null,"Espacio en blancos no pueden ser ingresados...");
            } else{
                cicloempleado = false;
            }
        }
        Empleado empleado = new Empleado(nombre,apellido,area,rol);
        listaEntidades.add(empleado);
        JOptionPane.showMessageDialog(null,"DATOS INGRESADOS CON EXITO..." + "\nNombre: " + nombre + "\nApellido: " + apellido +
                "\nArea: " + area + "\nRol: " + rol);

    }



    //CREAMOS UN GETTER PARA FACILITAR LA OBTENCION DE INFORMACION DE LA LISTA
    public List<Registrable> getListaEntidades() {
        return listaEntidades;
    }

    public void recorrerLista(){
        if (getListaEntidades().isEmpty()){
            JOptionPane.showMessageDialog(null,"No hay elementos almacenados...");
        } else {
            for (Registrable RG : getListaEntidades()){
                if (RG instanceof PlantaProceso){
                    RG.mostrarResumen();
                } else if (RG instanceof CentroCultivo){
                    RG.mostrarResumen();
                } else if (RG instanceof Empleado){
                    RG.mostrarResumen();
                }
            }
        }
    }
}
