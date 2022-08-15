

package com.mycompany.algebra_lineal;


import javax.swing.JOptionPane;




public class Main {
    
    public static void main(String[] args) {
//        iniciar_Sistema();

       /* matriz = Matiz.tama(matriz);
        JOptionPane.showMessageDialog(null, "El tamaño de las filas es: "+ matriz.length);
        JOptionPane.showMessageDialog(null, "El tamaño de las columnas es: "+ matriz[0].length);
        Matiz.ingresar_datos(matriz);
        Matiz.resultados(matriz);*/
        
        Matiz matriz =new Matiz();
        matriz.cargar();
        matriz.imprimir();
        matriz.imprimirUltimaFila();

    }
    
//    public static void iniciar_Sistema(){
//        frm_PedirDatos_ pedirDatos = new frm_PedirDatos_();
//        pedirDatos.setVisible(true);
//    }
}
