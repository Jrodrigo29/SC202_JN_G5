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

public class SalidaVehiculo {
    public void mostrar() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo que sale:");
        if (placa == null || placa.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Placa inválida.");
            return;
        }

        Vehiculo vehiculo = BaseDatosVehiculos.buscarPorPlaca(placa);

        if (vehiculo == null) {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
        } else {
            BaseDatosVehiculos.eliminarVehiculo(placa);
            JOptionPane.showMessageDialog(null, 
                "Salida registrada:\n" +
                "Placa: " + vehiculo.getPlaca() + "\n" +
                "Modelo: " + vehiculo.getModelo() + "\n" +
                "Color: " + vehiculo.getColor() + "\n" +
                "Tiquete: " + vehiculo.getTiquete()
            );
        }
    }
}
