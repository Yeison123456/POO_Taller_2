package Principal;

import Health.Person;
import Health.Empleado;

public class Inicio {
    public static void main(String[] args) {
        Person persona=new Person();
        Empleado empleado=new Empleado();

        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();

        //reto 3
        empleado.setName("Yeison");
        empleado.setLastName("Rodriguez");
        empleado.setDocument(1014859746);
        empleado.setTypeDoc("Tarjeta de identidad");
        empleado.setCargo("Adimistrador");
        empleado.setHorasTrabajadas(24);
        empleado.setValorHora(3000);
        
        double totalPagar=empleado.calcularTotalPago(3000);
        System.out.println("El tipo de documento del empleado es "+empleado.getTypeDoc()+", el numero de documento es "+empleado.getDocument()+", su nombre es "+empleado.getName()+", su apellido "+empleado.getLastName()+", el cargo es "+empleado.getCargo()+", las horas trabajadas son "+empleado.getHorasTrabajadas()+", el valor por hora es "+empleado.getHorasTrabajadas()+" y el total a pagar es "+totalPagar);
        
    }
}
