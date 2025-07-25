/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avance2;
import javax.swing.JOptionPane;

/**
 *
 * @author AMD
 */

public class MenuPrincipal {
    public void mostrar() {
       boolean salir = false;

        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                "Bienvenido al Sistema de Parqueo\n\n" +
                "1. Registro de Vehículo\n" +
                "2. Salida de Vehículo\n" +
                "3. Panel de Administración\n" +
                "4. Historial de Movimientos\n" +
                "5. Salir del Sistema\n\n" +
                "Ingrese el número de la opción:");

            if (opcion == null || opcion.equals("5")) {
                salir = true;
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
            } else if (opcion.equals("1")) {
                new RegistroVehiculo().mostrar();
            } else if (opcion.equals("2")) {
                new SalidaVehiculo().mostrar();
            } else if (opcion.equals("3")) {
                new PanelAdministracion().mostrar();
            } else if (opcion.equals("4")) {
                new HistorialMovimientos().mostrar();
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }

    public static void main(String[] args) {
        new MenuPrincipal().mostrar();
    }
}
