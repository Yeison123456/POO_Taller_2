package Class1;
import java.util.Scanner;
public class Animal {
    //atrbutos
    private String name;
    public int age;


    
    //Metodos u operaciones 
    public void registrarAnimal(String n, int a) {
        //cuerpo del metodo
    
        name=n;
        age=a;
    }

    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es " + name+ " y tiene "+age+" años");
    }

    public int duplicarEdad( int age){  
        int duplicado=age*2;
        return duplicado;
    }
}
