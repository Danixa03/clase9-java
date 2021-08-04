
package notasestudiantes;

import javax.swing.JOptionPane;


public class Ejecutar {

    
    public static void main(String[] args) {
        notas datos=new notas();
        double suma=0,promedio=0;
        int i;
      int cantidad=4;
        for (i=1;i<=cantidad;i++){
         datos.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
        datos.setApellido(JOptionPane.showInputDialog("Digite el apellido"));
        datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
         datos.setNotas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota")));
         datos.setNivel(JOptionPane.showInputDialog("Ingrese el nivel"));
         datos.setNombrecolegio(JOptionPane.showInputDialog("Digite el nombre del colegio"));
         
         suma+=datos.getNotas();
         
         
         
         
         
        datos.mostrardatos();
            
         System.out.println("-----------------------------------------------------------------------");   
        }
        promedio=suma/cantidad;
        System.out.println("El promedio de notas es de: "+promedio);
            
        }
        
        
        
    }
 
 

