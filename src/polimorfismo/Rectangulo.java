package polimorfismo;

import java.util.Scanner;

public class Rectangulo extends Figura{
    Scanner lectura=new Scanner(System.in);
    private float largo, ancho; //Atributo encapsulado 
  
    //Metodos accesores get y set
    public float largo(){
        return largo;
      }
    
    public void setLargo(){
        this.largo = largo;
      }
    public float altura(){
        return ancho;
      }
    
    public void setAltura(){
        this.ancho = ancho;
      }

  
    //Sobreescritura metodo calcularArea()
    
    public void calcularArea(){
        System.out.println("Ingrese el valor del largo");
        largo=lectura.nextInt();
        System.out.println("Ingrese el valor del ancho");
        ancho=lectura.nextInt();
      //area del cuadro;
      float area = largo*ancho;
  
      System.out.println("El largo del rectangulo es " + largo + ", el ancho es "+ ancho + " y el area es " +area);
    }
}
