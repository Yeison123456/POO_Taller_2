package Class1;

import java.util.Scanner;

public class Proof {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        
        Animal panda=new Animal();
        Movie titanic=new Movie();

        System.out.println("Ingrese el nombre del animal");
        String name=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        int age=lectura.nextInt();

        panda.registrarAnimal(name, age);//invocar o llamar un método
        panda.mostrarAnimal();

        int duplicado=panda.duplicarEdad(age);
        System.out.println("La edad ingresada duplicada es: "+ duplicado);
    }
}
