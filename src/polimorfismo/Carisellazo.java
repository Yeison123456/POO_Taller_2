package polimorfismo;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego {
Scanner lec =new Scanner(System.in);
private String nombre;
private int elecion;
private int lanzamiento;
@Override
public void iniciar() {
    System.out.println("ingrese el nombre del jugador ");
    nombre=lec.nextLine();
}

@Override
public void jugar() {
   int lanzamiento=(int)(Math.random()*2+1);
   System.out.println(nombre+"selecione 1 cara 2 sello ");
   elecion=lec.nextInt();
}

@Override
public void finalizar() {
    if(lanzamiento==1 && elecion==1){
        System.out.println(nombre+" ha salido cara, usted seleciono cara, GANO");
    }
}
    
}