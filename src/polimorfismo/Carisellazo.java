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
   System.out.println(nombre+" selecione 1 cara 2 sello ");
   elecion=lec.nextInt();
}

@Override
public void finalizar() {
    int lanzamiento=(int)(Math.random()*2+1);

    if(lanzamiento==1 && elecion==1){
        System.out.println(nombre+" ha salido cara, usted seleciono cara, GANO");
    }
    else if(lanzamiento==1 && elecion==2){
        System.out.println("ha salido sello, usted seleciono cara, perdio");
    }
    if(lanzamiento==2 && elecion==2){
        System.out.println(nombre+" ha salido sello, usted seleciono sello, GANO");
    }
    else if(lanzamiento==2 && elecion==1){
        System.out.println("ha salido cara, usted seleciono sello, perdio");
    }
}
    
}