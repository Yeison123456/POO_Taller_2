package Health;

import java.util.Scanner;

public class Person {
    //Atributos
    private String typeDoc, name, lastName, gender;
    private int document, age;
    private double weight, height, weightCurrent, heightC;

    //método constructor
    public Person(){}//constructor vacio o por defecto
    public Person(String typeDoc, int document, String name, String lastName){
    this.typeDoc=typeDoc;
    this.document=document;
    this.name=name;
    this.lastName=lastName; 
    }

    

    public String getTypeDoc() {
        return typeDoc;
    }
    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getDocument() {
        return document;
    }
    public void setDocument(int document) {
        this.document = document;
    }



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

