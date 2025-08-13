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

public class RegistroVehiculo {
    private Vehiculo vehiculo = new Vehiculo();
    public void mostrar() {
        // Solicitar datos
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        vehiculo.setPlaca(placa);

        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        vehiculo.setModelo(modelo);

        String color = JOptionPane.showInputDialog("Ingrese el color del vehículo:");
        vehiculo.setColor(color);

        // Mostrar resumen
        String mensaje = "Registro exitoso:\n"
                + "Placa: " + vehiculo.getPlaca() + "\n"
                + "Modelo: " + vehiculo.getModelo() + "\n"
                + "Color: " + vehiculo.getColor();

        JOptionPane.showMessageDialog(null, mensaje);
    }
}

