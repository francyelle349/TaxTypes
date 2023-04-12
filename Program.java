package Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        List<Tax> lista = new ArrayList<Tax>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers:");
        int number = sc.nextInt();

        for(int i = 0; i < number;i++){
           System.out.println("Tax payer #"+(i+1)+" data");
           System.out.print("Individual or company (i/c)?");
           char choice = sc.next().charAt(0);
           sc.nextLine();
           System.out.print("Name:");
           String name = sc.nextLine();
           
           System.out.print("Anual income:");
           Double income = sc.nextDouble();
           sc.nextLine();
           if(choice == 'i'){

            System.out.print("Health Expenditures:");
            Double healthExpenditures = sc.nextDouble();
            Tax individual = new IndividualTax(name, income, healthExpenditures);
            lista.add(individual);

           }
           else{
            System.out.println("Number of employees: ");
            int numberOfEmployees = sc.nextInt();
            CompanyTax company = new CompanyTax(name, income, numberOfEmployees);

            lista.add(company);
           }

          


        }
        
        for(Tax tax : lista){
         System.out.println(tax);
        }

        sc.close();

    }
}
