/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Caso_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se hace una instancia a la clase
        Hotel app = new Hotel();
        boolean salir = false;
// se hace un bucle para modelar el ingreso y salida de la info
        while (!salir) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el número de la operación que desea realizar:\n"
                    + "1. Modificar habitaciones\n"
                    + "2. Mostrar habitaciones\n"
                    + "3. Mostrar resumen\n"
                    + "4. Salir"));

            switch (opcion) {
                case 1:
                    app.modificar();
                    break;
                case 2:
                    app.mostrar();
                    break;
                case 3:
                    app.resumen();
                    app.resumen1();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }
    }
}
