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
            } 
            else if (opcion.equals("1")) {
                String info = "Vehículos actualmente en el parqueo:\n";
                if (BaseDatosVehiculos.getCantidad() == 0) {
                    info += "No hay vehículos en el parqueo.";
                } else {
                    for (int i = 0; i < BaseDatosVehiculos.getCantidad(); i++) {
                        Vehiculo v = BaseDatosVehiculos.getVehiculos()[i];
                        info += "- " + v.getPlaca() + " (" + v.getModelo() + ", " + v.getColor() + ")\n";
                    }
                }
                JOptionPane.showMessageDialog(null, info);
            } 
            else if (opcion.equals("2")) {
                String tarifaStr = JOptionPane.showInputDialog("Ingrese la tarifa por hora (colones):");
                if (tarifaStr != null && tarifaStr.matches("\\d+")) {
                    int tarifa = Integer.parseInt(tarifaStr);
                    JOptionPane.showMessageDialog(null, "Tarifa actualizada a: " + tarifa + " colones/hora.");
                } else {
                    JOptionPane.showMessageDialog(null, "Tarifa inválida.");
                }
            } 
            else if (opcion.equals("3")) {
                JOptionPane.showMessageDialog(null, 
                    "Configuración del sistema:\n" +
                    "- Capacidad máxima: 5 vehículos\n" +
                    "- Tarifa configurable\n" +
                    "- Datos en memoria");
            } 
            else if (opcion.equals("4")) {
                JOptionPane.showMessageDialog(null, 
                    "Reporte General:\n" +
                    "- Vehículos actualmente en el parqueo: " + BaseDatosVehiculos.getCantidad() + "\n" +
                    "- Capacidad restante: " + (5 - BaseDatosVehiculos.getCantidad()));
            } 
            else {
                JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }
}


