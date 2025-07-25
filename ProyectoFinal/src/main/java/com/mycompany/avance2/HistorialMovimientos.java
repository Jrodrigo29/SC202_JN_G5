/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance2;
import javax.swing.JOptionPane;

/**
 *
 * @author AMD
 */

public class HistorialMovimientos {
    public void mostrar() {
        boolean volver = false;

        while (!volver) {
            String opcion = JOptionPane.showInputDialog(
                "Historial de Movimientos\n\n" +
                "1. Buscar por número de placa\n" +
                "2. Buscar por fecha\n" +
                "3. Buscar por número de tiquete\n" +
                "4. Ver pagos realizados\n" +
                "5. Volver al menú principal\n\n" +
                "Ingrese el número de la opción:");

            if (opcion == null || opcion.equals("5")) {
                volver = true;
            } else if (opcion.equals("1")) {
                JOptionPane.showMessageDialog(null, "Buscar por placa - En proceso.");
            } else if (opcion.equals("2")) {
                JOptionPane.showMessageDialog(null, "Buscar por fecha - En proceso.");
            } else if (opcion.equals("3")) {
                JOptionPane.showMessageDialog(null, "Buscar por número de tiquete - En proceso.");
            } else if (opcion.equals("4")) {
                JOptionPane.showMessageDialog(null, "Ver pagos realizados - En proceso.");
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }
}
