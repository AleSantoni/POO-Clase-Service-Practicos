/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.entidades;

import java.util.Scanner;

/**
 *
 * @author BeluS
 */
public class Persona {
       Scanner leer =new Scanner(System.in);
    //Atributos
    private String nombre;
    private int edad;
    private String Sexo;
    private double peso;
    private double altura;
    //constructores 

    public Persona() {
    }

    public Persona(String nombre, int edad, String Sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.Sexo = Sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //getter

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
}
