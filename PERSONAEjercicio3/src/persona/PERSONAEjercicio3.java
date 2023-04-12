package persona;

import PersonaService.PersonaService;
import persona.entidades.Persona;


public class PERSONAEjercicio3 {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona persona = new Persona();
        int[] IMC = new int[4];//creo vector para imc
        boolean[] EDADES = new boolean[4];//creo el vector para edades
        Persona[] personas = new Persona[4];//creo el vector para cargar personas 

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese los datos para la persona " + (i + 1) + ":");

            personas[i] = ps.crearPersona(persona);//creo el objeto persona
            ps.mostrarDatos(persona);//muestor los datos
            int imc = ps.calcularImc(persona);//calculo su imc
//agrego al vector imc los datos obtenidos y muestro el resultado
            if (imc == -1) {

                IMC[i] = imc;
                System.out.println("Segun su IMC la persona tiene bajo su peso");
            } else if (imc == 0) {

                IMC[i] = imc;
                System.out.println("Segun su IMC la persona tiene su peso ideal");
            } else if (imc == 1) {

                IMC[i] = imc;
                System.out.println("Segun su IMC la persona tiene Sobrepeso");
            }
            // agrego al vector edad los resultados 
            boolean verificador = ps.esMayorDeEdad(persona);
            if (verificador == true) {
                EDADES[i] = verificador;
                System.out.println("La persona es Mayor de EDAD");
            } else {
                EDADES[i] = verificador;
                 System.out.println("La persona es Menor de EDAD");
            }
            System.out.println("*************************************************************");
        }

        ps.porcentajePeso(IMC);//calculo el porcentaje del peso
        ps.porcentajeEdad(EDADES);//calculo el porcentaje de edades 
    }

}
