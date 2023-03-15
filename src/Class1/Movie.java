package Class1;

public class Movie {
    //atributos
    private String name;
    private String category;
    private int year;
    private  int duration;


    public Movie(){}
    public Movie(String name, String category, int year, int duration){
        this.name=name;
        this.category=category;
        this.year=year;
        this.duration=duration;
    }
  
    public String getName(){  //Método get o getter 
        return name;
    }

    public String getCategory(){
        return category;
    }

    public int getYear(){
        return year;
    }
    public int getDuration(){
        return duration;
    }

    public void setName(String name){  //Método set o setter
        this.name=name;    
    }

    public void setCategory(String category) {
        this.category= category;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }


    //metodos u operaciones
    public void addMovie() {}
    public void mostrarMovie(int year, String name){
        System.out.println("El año de estreno de la pelicula es "+year+" y el nombre de la pelicula es "+name);
    }

    public void mostrarMovie(String name, String category){
        System.out.println("El nombre de la pelicula es "+name+" y la categoria es "+category);
    }

    public void mostrarMovie(  String name,int duration){
        System.out.println("El nombre de la pelicula es "+name+" y la duracion es de "+duration+"min");
    }
}
