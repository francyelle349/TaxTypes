package Tax;

public class IndividualTax extends Tax {
    private Double HealthExpenditures;

   

    public IndividualTax(String name, Double anual, Double healthExpenditures) {
        super(name, anual);
        HealthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return HealthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        HealthExpenditures = healthExpenditures;
    }
    @Override
    public Double total(){
        double total;
        if(getAnual() <20000.00){
             total = getAnual() - (0.15 * getAnual());


        }
        else{
            total = 0.25 * getAnual() - (getHealthExpenditures() * 0.5);
        }
        return total;

        
    }

    public String toString(){
        
        

        return " "+ getName() + String.format(": $ %.2f", total());

        
    }

    
}
