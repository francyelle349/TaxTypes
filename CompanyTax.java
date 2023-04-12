package Tax;

public class CompanyTax extends Tax {
    private int numberOfEmployees;

   

    public CompanyTax(String name, Double anual, int numberOfEmployees) {
        super(name, anual);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    public Double total(){
        Double total;
        if(getNumberOfEmployees() > 10){
                 total = getAnual() - getAnual() * 0.14;
          
            
        }
        else{
             total = getAnual() -(getAnual() * 0.16);
        }

        return total;
        
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName() +": $ "+ total());

        return sb.toString();

    }
}
