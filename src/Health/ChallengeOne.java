package Health;

import java.util.Scanner;

public class ChallengeOne {
    //Atributos
    String typeDoc, name, lastName, gender;
    int document, age;
    double weight, height, weightCurrent, heightC;

    Scanner lectura=new Scanner(System.in);

    //metodos
    public void pedirDatos(){
        System.out.println("Ingrese el tipo de documento de la persona ");
        typeDoc=lectura.nextLine();
        System.out.println("Ingrese el numero de documento de la persona");
        document=lectura.nextInt();
        System.out.println("Ingrese el nombre de la persona");
        name=lectura.next();
        System.out.println("Ingrese el apellido de la persona");
        lastName=lectura.next();
        System.out.println("Ingrese el peso en kg de la persona");
        weight=lectura.nextDouble();
        System.out.println("Ingrese la estatura de la persona");
        height=lectura.nextDouble();
        System.out.println("Ingrese la edad de la persona");
        age=lectura.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        gender=lectura.next();
    }

    public void mostrarPersona(){
        System.out.println("el tipo de documento es "+ typeDoc+ ", el numero de documento es "+document+", el nombre de la persona es "+name+", el apellido es "+lastName+", el peso es "+ weight+ "kg, la estatura es "+height+ ", la edad es "+age+" y el sexo es "+gender);
    }

    public void calcularImc(){
        heightC=Math.pow(height, 2);
        weightCurrent=weight/heightC;

        if(weightCurrent<20){
            System.out.println("El peso esta por debajo de lo ideal con un IMC de "+weightCurrent);
        }
        else if ( weightCurrent>=20 && weightCurrent<=25){
            System.out.println("El peso es ideal con un IMC de "+weightCurrent);
        }
        else{
            System.out.println("Tienes sobrepeso paisano con un IMC de "+weightCurrent);
        }

    }
    public void mayorEdad(){
        if(age<18){
            System.out.println("La persona es menor de edad");
        }
        else{
            System.out.println("La persona es mayor de edad");
        }
    }

    
}

