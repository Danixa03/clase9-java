
package com.mycompany.clase9;

import javax.swing.JOptionPane;


public class principal {
    public static void main(String[] args) {
        //crear un objeto
        empleado datos=new empleado();
        datos.setNombre(JOptionPane.showInputDialog("Digite el nombre del empleado"));
        datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del empleado")));
        datos.setGenero(JOptionPane.showInputDialog("Ingrese género F o M").charAt(0));
        datos.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Ingrese salario")));
        datos.setDepartamento(JOptionPane.showInputDialog("Ingrese el departamento"));
        datos.setPuesto(JOptionPane.showInputDialog("Ingrese el puesto"));
        
        datos.mostrardatos();
    }
}
