
package carseller;

import java.util.Scanner;

public class Customer extends Person{
    protected String Adress;
    protected int CustomerType;
    protected double discount;
    protected double TotalPrice;
    protected int CarNo;
    
    Scanner input = new Scanner(System.in);
    
     protected void inputAdress(){
        System.out.println("Please enter your Adress: ");
        Adress= input.nextLine();
    }
    protected String getAdress(){
       return Adress;
    }
    protected void PrintAdress(){
        System.out.println("Adress: "+Adress);
    }
    
    protected void inputCustomerType(){
        System.out.println("Customer Type: 1 equals Regular Customer or 0 equals Member Customer");
        CustomerType= input.nextInt();
    }
    protected int getCustomerType(){
       return CustomerType;
    }
    protected void PrintCustomerType(){
        System.out.println("Customer Type: "+CustomerType);
    }
    protected void CarPriceDiscount(){
        if(CustomerType == 1){
            discount = 0.07;
        }
        else if(CustomerType == 0){
            discount = 0.00;
        }
        else{
            discount = 0.00;
        }
    }
    protected void getCarPrice(){
        Cars iCars = new Cars();
        System.out.println("Which car number would you like buy?");
            CarNo = input.nextInt();
            System.out.print("Number of Cars: ");
            int NoCar = input.nextInt();
            iCars.Carsprice(CarNo);
            iCars.set_Qunatity(NoCar);
        if (iCars.Qunatity>0) {
            TotalPrice = ((iCars.Price+(iCars.Price*iCars.tax))-(iCars.Price*discount))*NoCar;
            System.out.println("TotalPrice:"+TotalPrice);
        
        }
        else{
             System.out.println("This product is not available"); 
        }
        System.out.println("\nWhich cars information do you want?");
            int CarNo = input.nextInt();
            System.out.println("You input:"+CarNo);
            iCars.Carsinfo(CarNo);
                                            
                    
                    
    }
}
