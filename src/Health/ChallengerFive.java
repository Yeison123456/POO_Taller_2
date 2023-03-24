package Health;

import java.util.Scanner;
import polimorfismo.Juego;

public class ChallengerFive implements Juego {
    Scanner lectura=new Scanner(System.in);

    private String nombre;
    private int elecion;
    private int resultado;

    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador ");
        nombre=lectura.nextLine();
    }

    @Override
    public void jugar() {
        System.out.println(nombre+" selecione 1. Piedra 2. Papel 3.Tijera ");
        elecion=lectura.nextInt();
    }
    
    @Override
    public void finalizar() {
        int resultado=(int)(Math.random()*3+1);
        if(resultado==1 && elecion==1){
            System.out.println(nombre+" ha salido piedra, usted seleciono piedra, empataste");
        }
        else if(resultado==1 && elecion==2){
            System.out.println(nombre+" ha salido piedra, usted seleciono papel, ganaste :D");
        }
        else if(resultado==1 && elecion==3){
            System.out.println(nombre+" ha salido piedra, usted seleciono tijera, perdiste :(");
        }
        else if(resultado==2 && elecion==1){
            System.out.println(nombre+" ha salido papel, usted seleciono piedra, perdiste :(");
        }
        else if(resultado==2 && elecion==2){
            System.out.println(nombre+" ha salido papel, usted seleciono papel, empataste ");
        }
        else if(resultado==2 && elecion==3){
            System.out.println(nombre+" ha salido papel, usted seleciono tijera, ganaste :D");
        }
        else if(resultado==3 && elecion==1){
            System.out.println(nombre+" ha salido tijera, usted seleciono piedra, ganaste :D");
        }
        else if(resultado==3 && elecion==2){
            System.out.println(nombre+" ha salido tijera, usted seleciono papel, perdiste :( ");
        }
        else if(resultado==3 && elecion==3){
            System.out.println(nombre+" ha salido tijera, usted seleciono tijera, empataste");
        }
    }
    
}
