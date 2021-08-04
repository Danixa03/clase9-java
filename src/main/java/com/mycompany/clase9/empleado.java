
package com.mycompany.clase9;

//clase hija. Hereda atributos de la clase padre (Persona)
//para heredar una clase, no olvidar extends
public class empleado extends Persona{
    private int salario;
    private String departamento;
    private String puesto;
    //crear el constructor con herencia, que se heredan de la clase padre
    
    public empleado(){
        
    }

    public empleado(int salario, String departamento, String puesto, String nombre, int edad, char genero) {
        super(nombre, edad, genero); //atributos heredados de la clase padre
        this.salario = salario;
        this.departamento = departamento;
        this.puesto = puesto;
    }
//getter and setter
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
   //crear metodos
    public void mostrardatos(){ //imprimir get, set insertar
        System.out.println("Nombre: "+getNombre()
               +"\nEdad: " + getEdad()
                + "\nGenero: " + getGenero()
                + "\nSalario : " + salario
                + "\nDepartamento: " + getDepartamento()
                +"\nPuesto: "+puesto);
                
                        
        
    }
}
