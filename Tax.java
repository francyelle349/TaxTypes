package Tax;

public abstract class Tax {
    private String name;
    private Double anual;

   
    public Tax(String name, Double anual) {
        this.name = name;
        this.anual = anual;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getAnual() {
        return anual;
    }
    public void setAnual(Double anual) {
        this.anual = anual;
    }
   

    public Double total(){
        Double total = 0.0;
        return total;
    }
}
