package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends Figura {
  Scanner lectura=new Scanner(System.in);

    private float lado; //Atributo encapsulado 
  
    //Metodos accesores get y set
    public float lado(){
      return lado;
    }
  
    public void setlado(){
      this.lado = lado;
    }
  
    //Sobreescritura metodo calcularArea()
    @Override
    
    public void calcularArea(){
      
      System.out.println("Ingrese el valor del lado");
      lado=lectura.nextInt();
      //area del cuadro;
      float area = lado*lado;
      
      System.out.println("El lado del cuadro es " + lado + " el area es " +area);
    }
  }
  
