
package com.mycompany.clase9;


public class Persona {    //clase

    private String nombre; //atributos
    private int edad;
    private char genero;
    
    
    public Persona(){
        
    }

    public Persona(String nombre, int edad, char genero) {  //constructor
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    //metodo setter y getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    

}
