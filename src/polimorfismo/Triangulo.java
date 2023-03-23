package polimorfismo;

import java.util.Scanner;

public class Triangulo extends Figura {
    Scanner lectura=new Scanner(System.in);
    private float base, altura; //Atributo encapsulado 
  
    //Metodos accesores get y set
    public float base(){
        return base;
      }
    
    public void setBase(){
        this.base = base;
      }
    public float altura(){
        return altura;
      }
    
    public void setAltura(){
        this.altura = altura;
      }

  
    //Sobreescritura metodo calcularArea()
    
    public void calcularArea(){
        System.out.println("Ingrese el valor de la base");
        base=lectura.nextInt();
        System.out.println("Ingrese el valor de la altura");
        altura=lectura.nextInt();
      //area del cuadro;
      float area = (base*altura)/2;
  
      System.out.println("La base del triangulo es " + base + ", la altura es "+ altura + " y el area es " +area);
    }
}
