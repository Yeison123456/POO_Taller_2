import Class1.Animal;
import Class1.Movie;
import Class1.Ave;
import Health.Empleado;

public class App1 {
    public static void main(String[] args) throws Exception {
        Animal tigre=new Animal();
        Ave condorito=new Ave();
        Movie minions=new Movie();
        Movie avatar= new Movie();
        Empleado empleado=new Empleado();

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

        condorito.setName("Condorito");
        condorito.setAge(50);
        condorito.setEnvergadura("300cm");
        condorito.mostrarAve();

        avatar.setName("Avatar");
        avatar.setCategory("Ciencia ficción");
        avatar.setDuration(162);
        avatar.setYear(2009);

        System.out.println("El nombre de la pelicula es "+avatar.getName()+", su categoria es de "+avatar.getCategory()+", el año de estreno es "+avatar.getYear()+" y su duración es de "+avatar.getDuration()+"min");

    }
}
