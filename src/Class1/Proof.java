package Class1;

import java.util.Scanner;

public class Proof {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        
        Animal panda=new Animal();
        Movie titanic=new Movie();
        Animal guacamayo= new Animal("blue", 10);
        Movie up=new Movie("Up","Aventura",2009, 96);
        Movie laNoche=new Movie("La noche del demonio","Terror",2010, 104);

        up.mostrarMovie("Up", "Aventura");
        up.mostrarMovie("Up", 96);
        up.mostrarMovie(2009, "Up");

        panda.setName("Pancho");
        panda.setAge(10);
        panda.setType("panda");

        System.out.println("El nombre del panda es "+panda.getName()+" y su edad es de "+panda.getAge());

        guacamayo.mostrarAnimal();

        System.out.println("Ingrese el nombre del animal");
        String name=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        int age=lectura.nextInt();

        panda.registrarAnimal(name, age);//invocar o llamar un método
        panda.mostrarAnimal();

        int duplicado=panda.duplicarEdad(age);
        System.out.println("La edad ingresada duplicada es: "+ duplicado);

        lectura.close();
    }
}
