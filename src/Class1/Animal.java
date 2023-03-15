package Class1;
public class Animal {
    //atributos
    private String name;
    private int age;
    private String type;



    //método constructor
    public Animal(){}//constructor vacio o por defecto
    public Animal(String name, int age){
    this.name=name;
    this.age=age; 
    }

    //Métodos accesores 
    public int getAge(){  //Método get o getter 
        return age;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public void setAge(int age){  //Método set o setter
        this.age=age;    
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }

    
    //Métodos u operaciones 
    public void registrarAnimal(String n, int a) {
        //cuerpo del método
    
        name=n;
        age=a;
    }

    public void mostrarAnimal(){
        System.out.println("El nombre del animal ingresado es " + name+ " y tiene "+age+" años");
    }

    public int duplicarEdad( int age){  
        int duplicado=age*2;
        return duplicado;
    }
}
