
package com.mycompany.algebra_lineal;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Matiz {
   /* public static int [][] matriz = null;
    
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
    }*/
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public void imprimirUltimaFila() {
    	System.out.println("Ultima fila");
        for(int c=0;c<mat[mat.length-1].length;c++) {
             System.out.print(mat[mat.length-1][c]+" ");
        }
    }
    
    public static void main(String[] ar) {
       
    }   
    
    
    
}
