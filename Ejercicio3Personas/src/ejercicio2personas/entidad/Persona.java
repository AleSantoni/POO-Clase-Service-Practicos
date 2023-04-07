/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2personas.entidad;

import javax.swing.JOptionPane;

/**
 *
 * @author BeluS
 */
public class Persona {
    // atributos
    private String nombre;
    private int edad;
    private long dni;
    private String sexo="H";
    private float peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, long dni, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void cargarDatos() {

        nombre = JOptionPane.showInputDialog("Digite el nombre del usuario: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad ->: "));
  dni = 0;
do {
    String entrada = JOptionPane.showInputDialog("Ingrese un número de DNI de 8 dígitos: ");
    if (entrada.matches("[0-9]+") && entrada.length() == 8) {
        dni = Long.parseLong(entrada);
        break;
    } else {
        JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico de 8 dígitos. Intente nuevamente.");
    }
} while (true);
      
      
        do {      
            String entrada=JOptionPane.showInputDialog("Ingrese M para masculino o F para femenino o O para otros");
            if (entrada.equalsIgnoreCase("m")||entrada.equalsIgnoreCase("f")||entrada.equalsIgnoreCase("o")){
                sexo=entrada;
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor correcto. Intente nuevamente.");
            }

  
        } while (true);
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite su peso ->: "));

     altura = Float.parseFloat(JOptionPane.showInputDialog("Digite su altura ->: "));
    }
    
   

    public int calcularIMC(Persona persona ) {

double IMC = (persona.getPeso() / Math.pow(persona.getAltura(), 2));
        if (IMC < 20) {
            return -1;
        } else if (IMC > 20 || IMC < 25) {
            return 0;
        } else {

            return -1;

        }
    }

    public boolean esMayorDeEdad() {
        if (edad > 18) {
            boolean bandera = true;
            return bandera;
        } else {
            boolean bandera = false;
            return bandera;
        }

    }
   

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

}
