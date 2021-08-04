
package notasestudiantes;




public class notas extends Persona{
   private int notas;
   private String nivel;
   private String nombrecolegio;
   double promedio,suma;
   
   public notas(){
       
   }

    public notas(int notas, String nivel, String nombrecolegio) {
        this.notas = notas;
        this.nivel = nivel;
        this.nombrecolegio = nombrecolegio;
        
    }
//get imprime, set ingresa
    
    public int getNotas() {
        return notas;
         
        
    }

    public void setNotas(int notas) {
        this.notas = notas;
        
        
       
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNombrecolegio() {
        return nombrecolegio;
    }

    public void setNombrecolegio(String nombrecolegio) {
        this.nombrecolegio = nombrecolegio;
    }

    
   
   public void mostrardatos(){
       System.out.println("Nombre: "+getNombre()
               +"\nApellido: "+getApellido()
               +"\nEdad: "+getEdad()
               +"\nNotas: "+notas
               +"\nNivel : "+nivel
               +"\nNombreColegio: "+getNombrecolegio()
               
               +"\nPromedio: "+notas/4
               
       );
   }
}
