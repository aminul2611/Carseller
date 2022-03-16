
package carseller;

import java.util.Scanner;


public class CanOrderCars implements OrderCars {
    
    protected int[] CarNo;
    Scanner input = new Scanner(System.in);

    @Override
    public void ViewCarList() {
        Cars iCars = new Cars();
        iCars.carsName();
    }

    @Override
    public void OrderCar() {
        System.out.println("How much would you order a car?");
        int NoOfCar = input.nextInt();
        CarNo = new int[NoOfCar];
        System.out.println("Please enter Order car number: ");
        for (int i = 0; i < NoOfCar; i++) {
            CarNo[i] = input.nextInt();
        }
        System.out.println("\n# Print order car list:\n");
        
        for (int i = 0; i < NoOfCar; i++) {
        
        if(CarNo[i]==1){
            System.out.println("* Jaguar Cars\n");
        }
        if(CarNo[i]==2){
            System.out.println("* Ferrari Cars\n");
        }
        if(CarNo[i]==3){
            System.out.println("* BMW Cars\n");
        }
        if(CarNo[i]==4){
            System.out.println("* Mercedes-Benz Cars\n");
        }
        if(CarNo[i]==5){
            System.out.println("* Lamborghini Cars\n");
        }
        if(CarNo[i]==6){
            System.out.println("* Rolls-Royce Cars\n");
        }
        if(CarNo[i]==7){
            System.out.println("* Porsche Cars\n");
        }
        if(CarNo[i]==8){
            System.out.println("* Honda Cars\n");
        }
        if(CarNo[i]==9){
            System.out.println("* Toyota Corolla Cars\n");
        }
        if(CarNo[i]==10){
            System.out.println("* Bugatti Veyron Cars\n");
        } 
        }
        
    }


    
                
    }
    
