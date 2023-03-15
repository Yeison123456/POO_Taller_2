package Principal;

import java.util.Scanner;

import Health.ChallengeTwo;

public class Inicio2 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        ChallengeTwo persona=new ChallengeTwo();

        System.out.println("Ingrese el tipo de documento de la persona ");
        String typeDoc=lectura.nextLine();
        System.out.println("Ingrese el numero de documento de la persona");
        int document=lectura.nextInt();
        System.out.println("Ingrese el nombre de la persona");
        String name=lectura.next();
        System.out.println("Ingrese el apellido de la persona");
        String lastName=lectura.next();
        System.out.println("Ingrese el peso en kg de la persona");
        double weight=lectura.nextDouble();
        System.out.println("Ingrese la estatura de la persona");
        double height=lectura.nextDouble();
        System.out.println("Ingrese la edad de la persona");
        int age=lectura.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        String gender=lectura.next();
        persona.pedirDatos(typeDoc, name, lastName, gender, document, age, weight, height, weight, height);
        persona.mostrarPersona();

        String heightF=persona.calcularImc(height);
        if(heightF.equals("PESOBAJO")){
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if (heightF.equals("PESOIDEAL")){
            System.out.println("El peso es ideal");
        }
        else{
            System.out.println("Tienes sobrepeso paisano");
        }

        
        persona.mayorEdad();
        lectura.close();
    }
}

