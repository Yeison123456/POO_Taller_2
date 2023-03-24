package Principal;
import Health.ChallengerFive;
import polimorfismo.Carisellazo;

public class Start {
  
    public static void main(String[] args) {
        Carisellazo juego = new Carisellazo();
        ChallengerFive juego2=new ChallengerFive();


        juego.iniciar();
        juego.jugar();
        juego.finalizar();

        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
        
    }
 }    

