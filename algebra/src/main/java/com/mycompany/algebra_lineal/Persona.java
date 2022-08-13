
package com.mycompany.algebra_lineal;

import javax.swing.JOptionPane;


public class Persona {
    protected String nom_Empleado;
    protected String cedula;
    protected String primer_Apellido;
    protected String segundo_Apellido;

    public Persona(String nom_Empleado, String cedula, String primer_Apellido, String segundo_Apellido) {
        this.nom_Empleado = nom_Empleado;
        this.cedula = cedula;
        this.primer_Apellido = primer_Apellido;
        this.segundo_Apellido = segundo_Apellido;
    }
    
    public Persona() {
        this.nom_Empleado = "";
        this.cedula = "";
        this.primer_Apellido = "";
        this.segundo_Apellido = "";
    }

    public String getNom_Empleado() {
        return nom_Empleado;
    }

    public void setNom_Empleado(String nom_Empleado) {
        this.nom_Empleado = nom_Empleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }

    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }
    
     public void pedir_datos(){
         
         this.nom_Empleado = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del Empleado");
        this.cedula = JOptionPane.showInputDialog(null, "Digite la cédula "
                + "del Empleado");
        this.primer_Apellido = JOptionPane.showInputDialog(null, "Digite el "
                + "primer apellido del Empleado");
        this.segundo_Apellido = JOptionPane.showInputDialog(null, "Digite el "
                + "segundo apellido del Empleado");
     }
}
