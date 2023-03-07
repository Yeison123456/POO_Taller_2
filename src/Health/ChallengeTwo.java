package Health;

import java.util.Scanner;

public class ChallengeTwo {
//Atributos
String typeDoc, name, lastName, gender;
int document, age;
double weight, height, weightCurrent, heightC;

Scanner lectura=new Scanner(System.in);

//metodos
public void pedirDatos( String t, String n, String l, String g, int d, int a, 
double w, double h, double we, double he){
   
    typeDoc=t;
    name=n;
    lastName=l; 
    gender=g;
    document=d;
    age=a;
    weight=w;
    height=h;
    weightCurrent=we;
    heightC=he;

}

public void mostrarPersona(){
    System.out.println("el tipo de documento es "+ typeDoc+ ", el numero de documento es "+document+", el nombre de la persona es "+name+", el apellido es "+lastName+", el peso es "+ weight+ "kg, la estatura es "+height+ ", la edad es "+age+" y el sexo es "+gender);
}

public String calcularImc( double height){
    heightC=Math.pow(height, 2);
    weightCurrent=weight/heightC;
    String heightF;
    if(weightCurrent<20){
        heightF="PESOBAJO";
    }
    else if ( weightCurrent>=20 && weightCurrent<=25){
        heightF="PESOIDEAL";
    }
    else{
        heightF="SOBREPESO";
    }
    return heightF;
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
