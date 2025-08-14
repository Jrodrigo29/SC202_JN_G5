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
    public void mostrar() {
        if (BaseDatosVehiculos.getCantidad() >= 5) {
            JOptionPane.showMessageDialog(null, "Parqueo lleno. No se pueden registrar más vehículos.");
            return;
        }

        Vehiculo vehiculo = new Vehiculo();

        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        if (placa == null) {
            JOptionPane.showMessageDialog(null, "Placa inválida.");
            return;
        }
        if (placa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Placa inválida.");
            return;
        }
        vehiculo.setPlaca(placa);

        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        if (modelo == null) {
            modelo = "";
        }
        vehiculo.setModelo(modelo);

        String color = JOptionPane.showInputDialog("Ingrese el color del vehículo:");
        if (color == null) {
            color = "";
        }
        vehiculo.setColor(color);

        if (BaseDatosVehiculos.agregarVehiculo(vehiculo)) {
            JOptionPane.showMessageDialog(null, 
                "Vehículo registrado con éxito.\n" +
                "Placa: " + vehiculo.getPlaca() + "\n" +
                "Modelo: " + vehiculo.getModelo() + "\n" +
                "Color: " + vehiculo.getColor() + "\n" +
                "Tiquete: " + vehiculo.getTiquete()
            );
        }
    }
}


