package Principal;

import Health.Person;

public class Inicio {
    public static void main(String[] args) {
        Person datos=new Person();

        datos.pedirDatos();
        datos.mostrarPersona();
        datos.calcularImc();
        datos.mayorEdad();
    }
}
