package Class1;
import java.util.Scanner;
public class Animal {
    //atrbutos
    private String name;
    public int age;


    Scanner lectura= new Scanner(System.in);
    //Metodos u operaciones 
    public void registrarAnimal() {
        //cuerpo del metodo
        System.out.println("Ingrese el nombre del animal");
        name=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        age=lectura.nextInt();
    }

    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es " + name+ " y tiene "+age+" años");
    }
}
