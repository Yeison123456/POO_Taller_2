package Principal;

import Health.ChallengeOne;

public class Inicio {
    public static void main(String[] args) {
        ChallengeOne persona=new ChallengeOne();

        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }
}
