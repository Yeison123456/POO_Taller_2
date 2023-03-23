package polimorfismo;

import java.util.Scanner;

public class Circulo extends Figura{
    Scanner lectura=new Scanner(System.in);
    private double radio, radioC;
    double pi=3.1416; //Atributo encapsulado 
  
    //Metodos accesores get y set
    public double radio(){
      return radio;
    }
  
    public void setRadio(){
      this.radio = radio;
    }
  
    //Sobreescritura metodo calcularArea()
    
    public void calcularArea(){
        System.out.println("Ingrese el valor del radio");
        radio=lectura.nextInt();
      //area del cuadro;
      radioC= Math.pow(radio, 2);
      double area = pi*radioC;
  
      System.out.println("El radio del circulo es " + radio + " y el area es " +area);
    }
}
