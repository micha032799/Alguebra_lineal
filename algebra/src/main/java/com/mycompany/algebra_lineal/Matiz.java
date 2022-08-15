package com.mycompany.algebra_lineal;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Matiz {

    public static int[][] matriz = null;

    public static int[][] tama(int[][] x) {
        JOptionPane.showMessageDialog(null, "Proyecto Álgebra lineal");
        JOptionPane.showMessageDialog(null, "Ingrese el tamaño de la matriz fila y columnas");

        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas: "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas: "));

        x = new int[filas][columnas];
        return x;
    }

    public static void ingresar_datos(int[][] x) {
        JOptionPane.showMessageDialog(null, "Ingrese los valores para llenar la Matriz");
        for (int f = 0; f < x.length; f++) {
            for (int c = 0; c < x[f].length; c++) {
                x[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor "));
            }
        }
    }

    public static void resultados(int[][] x) {
        String resultado="";
         for (int f = 0; f < x.length; f++) {
            for (int c = 0; c < x[f].length; c++) {
             resultado +=  x[f][c] + "\t";
             resultado+= "      ";
            }
            resultado+= "\n";
        }
         JOptionPane.showMessageDialog(null, resultado);
    }

}
