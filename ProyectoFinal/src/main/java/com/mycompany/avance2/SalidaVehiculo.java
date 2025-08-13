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

        // Aquí podrías validar o buscar la placa si tuvieras una lista de vehículos registrados

        JOptionPane.showMessageDialog(null, "Procesando salida para vehículo con placa: " + placa);
        JOptionPane.showMessageDialog(null, "Cálculo de tiempo y monto - En proceso.");
        JOptionPane.showMessageDialog(null, "Registro de pago - En proceso.");
        JOptionPane.showMessageDialog(null, "Apertura de barrera automática - En proceso.");
    }
}
