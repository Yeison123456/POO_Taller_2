package Health;

public class ChallengerThree extends ChallengerOne{
    

    //Atributos 
    private String cargo;
    private int horasTrabajadas,  departamento, valorHora;
    private double reteica, totalPagar, totalHorasPagar;
    //Metodo constructor
    public ChallengerThree(){

    }

    public ChallengerThree(String typeDoc, int document, String name, String lastName, String cargo, int horasTrabajadas, int valorHora, Double totalHorasPagar, Double totalPagar , Double reteica ) {
        super(typeDoc, document, name, lastName);
        this.cargo=cargo;
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
        this.totalHorasPagar=totalHorasPagar;
        this.totalPagar=totalPagar;
        this.reteica=reteica;
    }

    //Métodos accesores getters y setters 
        
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public int getValorHora() {
        return valorHora;
    }
    
    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }
    
    public double getTotalPagar() {
        return totalPagar;
    }
    
    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    public double getReteica() {
        return reteica;
    }

    public void setReteica(Double reteica) {
        this.reteica = reteica;
    }
    
    public double calcularTotalPago( int valorHora){
        totalHorasPagar=valorHora*horasTrabajadas;
        reteica=(totalHorasPagar*0.966)/100;
        totalPagar=totalHorasPagar-reteica;
        return totalPagar;
    }
}
