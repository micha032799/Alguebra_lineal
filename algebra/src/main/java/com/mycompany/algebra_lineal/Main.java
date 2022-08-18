

package com.mycompany.algebra_lineal;


import static com.mycompany.algebra_lineal.Matriz.matriz;
import javax.swing.JOptionPane;




public class Main {
    
    public static void main(String[] args) {


        matriz = Matriz.tama(matriz);
        JOptionPane.showMessageDialog(null, "El tamaño de las filas es: "+ matriz.length);
        JOptionPane.showMessageDialog(null, "El tamaño de las columnas es: "+ matriz[0].length);
        Matriz.ingresar_datos(matriz);
        Matriz.resultados(matriz);
        

    }
    

}
