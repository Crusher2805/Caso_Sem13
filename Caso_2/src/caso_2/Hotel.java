/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Hotel {
//iniciar los arreglos con los atributos necesarios
    private String[] habitaciones = {"habitacion", "habitacion2", "habitacion3", "habitacion4", "habitacion5"};
    private int[] pisos = {1, 2, 3, 4, 5};
    private int[] codigo = {101, 202, 303, 404, 505};
    private double[] precio = {50, 60, 40, 30, 20};
    private String[] estado = {"libre", "sucia", "ocupada", "ocupada", "mantenimiento"};
    private String[] tipo = {"simple", "doble", "grande", "premium", "extra_grande"};
    
// se muestran los arreglos
    public void mostrar() {
        String info = "";
        for (int i = 0; i < habitaciones.length; i++) {
            info += "Habitacion: " + habitaciones[i] + "\n";
            info += "Piso: " + pisos[i] + "\n";
            info += "codigo: " + codigo[i] + "\n";
            info += "precio por noche: " + precio[i] + "\n";
            info += "estado: " + estado[i] + "\n";
            info += "tipo: " + tipo[i] + "\n";
            info += "\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }
// Se hace un calculo con una condicional sobre el estado de las habitaciones
    public void resumen1() {
        int suma = 0;
        for (int i = 0; i < estado.length; i++) {
            if (estado[i].equals("ocupada") || estado[i].equals("libre") || estado[i].equals("sucia") || estado[i].equals("libre")) {
                suma += 1;
            }
            
        }
        JOptionPane.showMessageDialog(null, "Resumen de habitaciones " + suma);
    }
// Se hace un calculo con una condicional sobre el estado de las habitaciones, pero esta vez para calcular el valor de las ganancias

    public void resumen() {
        double suma = 0;
        for (int i = 0; i < precio.length; i++) {
            if (estado[i].equals("ocupada")) {
                suma += precio[i];

            }
        }
        JOptionPane.showMessageDialog(null, "La ganancia de las habitaciones ocupadas es de " + suma + "$");
    }
// Se hace un metodo para modificar el arreglo mediante un indice -1 que ayuda para mover espacios sobre las variables a modificar
    public void modificar() {
        String nombreM = JOptionPane.showInputDialog(null, "Ingrese el nombre de la habitacion que desea modificar ");
        int indice = -1;
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i].equalsIgnoreCase(nombreM)) {
                indice = i;
                break;
            }
        }
        // Se hacen los inputs para las modificaciones
        if (indice != -1) {
            String nombreN = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de la habitacion ");
            int codigoN = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo codigo de la habitacion "));
            String estadoN = JOptionPane.showInputDialog(null, "Ingrese el nuevo tipo de estado de la habitacion ");
            String tipoN = JOptionPane.showInputDialog(null, "Ingrese el nuevo tipo de habitacion");
            habitaciones[indice] = nombreN;
            codigo[indice] = codigoN;
            estado[indice] = estadoN;
            tipo[indice] = tipoN;
            JOptionPane.showMessageDialog(null, "Informacion actualizada ");
        } else {
            JOptionPane.showMessageDialog(null, "La habitacion no existe ");
        }
    }

}
