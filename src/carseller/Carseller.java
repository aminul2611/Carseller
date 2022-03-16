
package carseller;

import java.util.Scanner;


public class Carseller {

    
    public static void main(String[] args) {
        
        Mainmanu obj = new Mainmanu();
        obj.setVisible(true);
        
        Scanner input = new Scanner(System.in);
        while(true){
            Person iPerson = new Person();
            iPerson.PersonInfo();
            System.out.println("Do you want to know about which Parsons information?");
            int pName = input.nextInt();
        
            if(pName==1){
                System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n"+
                                   "||||||||||||| Manager info ||||||||||||||\n"+
                                   "|||||||||||||||||||||||||||||||||||||||||\n");
                
                Manager iManager = new Manager();
                iManager.inputP_id();
                iManager.inputP_name();
                iManager.inputEmail();
                iManager.inputPhoneNo();
                iManager.approvSalary();
                
                
                iManager.PrintP_id();
                iManager.PrintP_name();
                iManager.PrintEmail();
                iManager.PrintPhoneNo();
                iManager.PrintDesignation();
                System.out.println("|||||||||||||||||||||||||||||||||||||||||\n"+"|||||||||||||||||||||||||||||||||||||||||\n");
            
            }
            else if(pName==2){
                System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n"+
                                   "|||||||||| Second Manager info ||||||||||\n"+
                                   "|||||||||||||||||||||||||||||||||||||||||\n");
                
                SecondManager iSecondManager = new SecondManager();
                iSecondManager.PrintP_id();
                iSecondManager.PrintP_name();
                iSecondManager.PrintEmail();
                iSecondManager.PrintPhoneNo();
                iSecondManager.PrintDesignation();
                iSecondManager.CanOrderCar();
                System.out.println("|||||||||||||||||||||||||||||||||||||||||\n"+"|||||||||||||||||||||||||||||||||||||||||\n");
                
            }
            else if(pName==3){
                System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n"+
                                   "||||||||||||| customer info |||||||||||||\n"+
                                   "|||||||||||||||||||||||||||||||||||||||||\n");
        
                System.out.print("Input no of customer: ");
                int C_no = input.nextInt();
        
                Customer[] iCustomer = new Customer[C_no];
                for (int i = 0; i < C_no; i++) {
                iCustomer[i]=new Customer();
                iCustomer[i].inputP_id();
                iCustomer[i].inputP_name();
                iCustomer[i].inputEmail();
                iCustomer[i].inputPhoneNo();
                iCustomer[i].inputAdress();
                iCustomer[i].inputCustomerType();
                iCustomer[i].CarPriceDiscount(); 
            }
        
        
            for (int i = 0; i < C_no; i++) {
            
                iCustomer[i].PrintP_id();
                iCustomer[i].PrintP_name();
                iCustomer[i].PrintEmail();
                iCustomer[i].PrintPhoneNo();
                iCustomer[i].PrintAdress();
                iCustomer[i].PrintCustomerType();
                iCustomer[i].CarPriceDiscount();
                iCustomer[i].getCarPrice();
                System.out.println("------------------------------------------\n");
            }
            System.out.println("|||||||||||||||||||||||||||||||||||||||||\n"+"|||||||||||||||||||||||||||||||||||||||||\n");
            }
            else if(pName==4){
                System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n"+
                                   "|||||||| Financial officer info |||||||||\n"+
                                   "|||||||||||||||||||||||||||||||||||||||||\n");
                
                FinancialOfficer iFinancialOfficer = new FinancialOfficer();
                iFinancialOfficer.PrintP_id();
                iFinancialOfficer.PrintP_name();
                iFinancialOfficer.PrintEmail();
                iFinancialOfficer.PrintPhoneNo();
                iFinancialOfficer.set_salary();
                System.out.println("|||||||||||||||||||||||||||||||||||||||||\n"+"|||||||||||||||||||||||||||||||||||||||||\n");
                
            }
            else if(pName==5){
                System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n"+
                                   "|||||||| Marketing officer info |||||||||\n"+
                                   "|||||||||||||||||||||||||||||||||||||||||\n");
        
                Marketing iMarketing = new Marketing();
                iMarketing.PrintP_id();
                iMarketing.PrintP_name();
                iMarketing.PrintEmail();
                iMarketing.PrintPhoneNo();
                iMarketing.viewCarList(); 
                System.out.println("|||||||||||||||||||||||||||||||||||||||||\n"+"|||||||||||||||||||||||||||||||||||||||||\n");
            }
            else if(pName==6){
                System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n"+
                                   "|||||||||| Sales Officer info |||||||||||\n"+
                                   "|||||||||||||||||||||||||||||||||||||||||\n");

                System.out.print("Input no of Sales Officer: ");
                int SaOfficer_no = input.nextInt();
                SalesOfficer[] iSalesOfficer = new SalesOfficer[SaOfficer_no];
                for (int i = 0; i < SaOfficer_no; i++) {
                    iSalesOfficer[i]=new SalesOfficer();
                    iSalesOfficer[i].inputP_id();
                    iSalesOfficer[i].inputP_name();
                    iSalesOfficer[i].inputEmail();
                    iSalesOfficer[i].inputPhoneNo();
            
                }
                for (int i = 0; i < SaOfficer_no; i++) {
                    iSalesOfficer[i].PrintP_id();
                    iSalesOfficer[i].PrintP_name();
                    iSalesOfficer[i].PrintEmail();
                    iSalesOfficer[i].PrintPhoneNo();
                    iSalesOfficer[i].PrintDesignation();
            }
            SalesOfficer iSalesOffice = new SalesOfficer();
            iSalesOffice.Carsales();
            System.out.println("|||||||||||||||||||||||||||||||||||||||||\n"+"|||||||||||||||||||||||||||||||||||||||||\n");
            }

            else if(pName==7){
                System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n"+
                                   "||||||||||||||| Cars info |||||||||||||||\n"+
                                   "|||||||||||||||||||||||||||||||||||||||||\n");
        
                System.out.println("Do you want to see the car list?\n"+
                "Yes = 1 input or NO = 0 input");
                int see = input.nextInt();
                System.out.println("You input:"+see);
                if(see == 1){
                    Cars iCars = new Cars();
                    iCars.carsName();
            
                    System.out.println("Which cars information do you want?");
                    int CarNo = input.nextInt();
                    System.out.println("You input:"+CarNo);
                    iCars.Carsinfo(CarNo);
                }
                System.out.println("|||||||||||||||||||||||||||||||||||||||||\n"+"|||||||||||||||||||||||||||||||||||||||||\n");
        
            }
        }
   
        
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
