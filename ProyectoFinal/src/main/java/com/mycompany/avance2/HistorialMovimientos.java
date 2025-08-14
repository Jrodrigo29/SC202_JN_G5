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
        String historial = "Vehículos en el parqueo:\n\n";

        if (BaseDatosVehiculos.getCantidad() == 0) {
            historial += "No hay vehículos registrados.";
        } else {
            for (int i = 0; i < BaseDatosVehiculos.getCantidad(); i++) {
                Vehiculo vehiculo = BaseDatosVehiculos.getVehiculos()[i];
                historial += "Tiquete: " + vehiculo.getTiquete()
                            + " - Placa: " + vehiculo.getPlaca()
                            + " - Modelo: " + vehiculo.getModelo()
                            + " - Color: " + vehiculo.getColor()
                            + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, historial);
    }
}
 
