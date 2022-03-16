
package carseller;

import java.util.Scanner;


public class SecondManager implements Persons {
    private String Designation = "Second Manager";
    protected int CanOrderCar;
    protected String P_id = "SC-40-234";
    protected String P_name = "Arafat";
    protected String Email = "Arafat@gamil.com";
    protected String PhoneNo = "01923412879";
    
    
    Scanner input = new Scanner(System.in);
    
    protected String getDesignation(){
       return Designation;
    }
    protected void PrintDesignation(){
        System.out.println("Designation: "+Designation);
    }
    protected void CanOrderCar(){
        System.out.println("\nDo you want to see the car list?\n"+
        "Yes = 1 input or NO = 0 input");
        int see = input.nextInt();
        System.out.println("You input:"+see);
        if(see == 1){
        CanOrderCars iCanOrderCars = new CanOrderCars();
        iCanOrderCars.ViewCarList();
        iCanOrderCars.OrderCar();
        }
    }

    @Override
    public void PrintP_id() {
        System.out.println("Id: "+P_id);
    }


    @Override
    public void PrintP_name() {
        System.out.println("Name: "+P_name);
    }


    @Override
    public void PrintEmail() {
        System.out.println("Email: "+Email);
    }

    @Override
    public void PrintPhoneNo() {
        System.out.println("Phone number: "+PhoneNo);
    }

    @Override
    public void inputP_id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputP_name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputPhoneNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
