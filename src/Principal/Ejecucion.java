package Principal;
import polimorfismo.Figura;

import java.util.Scanner;

import polimorfismo.Circulo;
import polimorfismo.Rectangulo;
import polimorfismo.Cuadrado;
import polimorfismo.Triangulo;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        Cuadrado figura1=new Cuadrado();
        Circulo figura2=new Circulo();
        Rectangulo figura3=new Rectangulo();
        Triangulo figura4=new Triangulo();

        int eleccion, op;

        
        op=1;
        while(op==1){
            System.out.println("¿Cual es la figura a la cual quieres sacarle el area? 1.Cuadrado  2.Circulo  3.Rectangulo  4.Triangulo");
            eleccion=lectura.nextInt();
            
            if(eleccion==1){
                figura1.calcularArea();
            }
            else if(eleccion==2){
                figura2.calcularArea();
            }
            else if(eleccion==3){
                figura3.calcularArea();
            }
            else {
                figura4.calcularArea();
            }

            System.out.println("¿Quiere saber el area de otra figura? 1. Si  2.No");
            op=lectura.nextInt();
        }

        lectura.close();
    }
}
