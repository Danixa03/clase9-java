//agregar atributos a la clase persona nombre, apellido,edad
//imprimir 4 estudiantes en main principal
//hacer una clase que se llame estudiante. agregar atributos --nota,nivel mas lo que se hereda de clase persona
package notasestudiantes;

public class Persona {

    private String nombre, apellido;
  private int edad;

  
  public Persona(){
      
  }
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
  
}
