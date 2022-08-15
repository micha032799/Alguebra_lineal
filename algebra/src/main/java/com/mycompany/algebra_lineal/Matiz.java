
package com.mycompany.algebra_lineal;

import javax.swing.JOptionPane;

/**
 *
 * @author micha
 */
public class Matiz {
    public static int [][] matriz = null;
    
    public static int [][] tama(int [][] x){
        JOptionPane.showMessageDialog(null, "Proyecto Álgebra lineal");
        JOptionPane.showMessageDialog(null, "Ingrese el tamaño de la matriz fila y columnas");
        
        int filas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas: " ));
        int columnas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas: " ));
        
        x= new int[filas][columnas];
        return x;
    }
    public static void ingresar_datos(int [][] x){
        JOptionPane.showMessageDialog(null, "Ingrese los valores pata llenar la Matriz");
        for (int i = 0; i < x[i].length; i++) {
            for (int j = 0; j < x[j].length; j++) {
         i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas: " ));
         j=  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas: " ));
            }   
        }
    }
    public static void resultados(int [][]x){
       for (int i = 0; i < x[i].length; i++) {
            for (int j = 0; j < x[j].length; j++) {     
       JOptionPane.showMessageDialog(null, x[i][j]);  
            }
        } 
    }
}
