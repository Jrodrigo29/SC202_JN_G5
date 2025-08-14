/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance2;

/**
 *
 * @author kattl
 */
public class BaseDatosVehiculos {
    
    private static Vehiculo[] arrVehiculos = new Vehiculo[5];
    private static int contador = 0;

    public static boolean agregarVehiculo(Vehiculo vehiculo) {
        if (contador < arrVehiculos.length) {
            arrVehiculos[contador] = vehiculo;
            vehiculo.setTiquete(contador + 1); 
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public static Vehiculo buscarPorPlaca(String placa) {
        for (int i = 0; i < contador; i++) {
            if (arrVehiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                return arrVehiculos[i];
            }
        }
        return null;
    }

    
    public static boolean eliminarVehiculo(String placa) {
        for (int i = 0; i < contador; i++) {
            if (arrVehiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                for (int j = i; j < contador - 1; j++) {
                    arrVehiculos[j] = arrVehiculos[j + 1];
                }
                arrVehiculos[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public static Vehiculo[] getVehiculos() {
        return arrVehiculos;
    }

    public static int getCantidad() {
        return contador;
    }
}


