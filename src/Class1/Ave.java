package Class1;


public class Ave extends Animal{
    
    //Atributos
    private String envergadura;


    //Método constructor
    public Ave(){

    }

    public Ave(String name, int age, String envergadura){
        super(name, age);
        this.envergadura=envergadura;

    }

    //Métodos accesores getters y setters 
    public String getEnvergadura(){
        return envergadura;
    }

    public void setEnvergadura(String envergadura) {
        this.envergadura=envergadura;
    }

    //Métodos propios 
    public void mostrarAve(){
        System.out.println("El nombre del animal es "+getName()+"tiene "+getAge()+" años y la envergadura del ave es "+ envergadura);
    }
    

}
