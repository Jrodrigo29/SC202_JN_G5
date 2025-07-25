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

public class PanelAdministracion {
    public void mostrar() {
        boolean volver = false;

        while (!volver) {
            String opcion = JOptionPane.showInputDialog(
                "Panel de Administración\n\n" +
                "1. Visualización en tiempo real\n" +
                "2. Gestión de tarifas\n" +
                "3. Configuración del sistema\n" +
                "4. Reportes\n" +
                "5. Volver al menú principal\n\n" +
                "Ingrese el número de la opción:");

            if (opcion == null || opcion.equals("5")) {
                volver = true;
            } else if (opcion.equals("1")) {
                JOptionPane.showMessageDialog(null, "Visualización en tiempo real - En proceso.");
            } else if (opcion.equals("2")) {
                JOptionPane.showMessageDialog(null, "Gestión de tarifas - En proceso.");
            } else if (opcion.equals("3")) {
                JOptionPane.showMessageDialog(null, "Configuración del sistema - En proceso.");
            } else if (opcion.equals("4")) {
                JOptionPane.showMessageDialog(null, "Reportes - En proceso.");
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }
}

