
package carseller;

import java.util.Scanner;

public class Cars {
    protected String P_Type;
    protected String Owner;
    protected String Producedby;
    protected String Country;
    protected String Since;
    protected String RelatedBrands;
    protected String Markets;
    protected double Price;
    protected double Qunatity;
    protected double tax;
    protected int CarNo;
    
    Scanner input = new Scanner(System.in);
    
    protected void carsName(){
        System.out.println("1)Jaguar Cars\n"+"2)Ferrari Cars\n"+"3)BMW Cars\n"+"4)Mercedes-Benz Cars\n"+"5)Lamborghini Cars\n"+"6)Rolls-Royce Cars\n"+
                "7)Porsche Cars\n"+"8)Honda Cars\n"+"9)Toyota Corolla Cars\n"+"10)Bugatti Veyron Cars\n");
    }
    
    protected void Carsinfo(int CarNo){
        this.CarNo = CarNo;
        if (CarNo == 1){
            System.out.println("\n||||||||||||||| Jaguar Cars |||||||||||||||\n"+
                    "Product type	Cars\n" +
"Owner	Jaguar Land Rover (since 2013)[1]\n" +
"Produced by	Jaguar Land Rover\n" +
"Country	United Kingdom\n" +
"Introduced	1935\n" +
"Related brands	Land Rover\n" +
"Markets	Worldwide\n" +
"Previous owners	Jaguar Cars (1935–2012)\n"+"Price = 10 mln\n"+
                    "tax = 0.10");
            
        }
        else if(CarNo == 2){
            System.out.println("\n||||||||||||||| Ferrari Cars |||||||||||||||\n"+
                    "Type\n" +
"Public\n" +
"Traded as	\n" +
"BIT: RACE\n" +
"NYSE: RACE\n" +
"FTSE MIB Component (BIT)\n" +
"Industry	Automotive\n" +
"Founded	13 September 1939; 79 years ago in Modena, Italy (as Auto Avio Costruzioni)[1]\n" +
"Founder	Enzo Ferrari\n" +
"Headquarters	\n" +
"Amsterdam, Netherlands (de jure)\n" +
"Maranello, Emilia-Romagna, Italy (de facto)\n" +
"Area served\n" +
"Worldwide\n" +
"Key people\n" +
"John Elkann (Chairman)\n" +
"Piero Ferrari (Vice Chairman)\n" +
"Louis Camilleri (CEO)\n" +
"Products	Sports cars\n"+"Price = 15 mln\n"+
                    "tax = 0.10");
            
        }
        else if(CarNo == 3){
            System.out.println("\n||||||||||||||| BMW Cars |||||||||||||||\n"+
                    "Predecessor	Rapp Motorenwerke\n" +
"Bayerische Flugzeugwerke\n" +
"Fahrzeugfabrik Eisenach\n" +
"Founded	7 March 1916\n" +
"Founders	Camillo Castiglioni\n" +
"Franz Josef Popp\n" +
"Karl Rapp\n" +
"Headquarters	Munich, Germany\n" +
"Products	\n" +
"Carsmotorcycles\n" +
"Brands	\n" +
"Automobiles\n" +
"BMW\n" +
"Mini\n" +
"Rolls-Royce\n" +
"Motorcycles\n" +
"BMW Motorrad\n"+"Price = 13 mln\n"+
                    "tax = 0.10");
            
        }
        else if(CarNo == 4){
            System.out.println("\n||||||||||||||| Mercedes-Benz Cars |||||||||||||||\n"+
                    "Type\n" +
"Brand\n" +
"Industry	Automotive\n" +
"Predecessor	\n" +
"Benz & Cie.\n" +
"(1883–1926)\n" +
"Daimler-Motoren-Gesellschaft\n" +
"(1890–1926)\n" +
"Founded	28 June 1926; 93 years ago\n" +
"Founders	\n" +
"Karl Benz\n" +
"Gottlieb Daimler\n" +
"Headquarters	Stuttgart, Germany\n" +
"Area served\n" +
"Worldwide\n" +
"Key people\n" +
"Ola Källenius, Head of Mercedes-Benz Cars\n" +
"Products	\n" +
"Automobiles\n" +
"Trucks\n" +
"Buses\n" +
"Internal combustion engines\n" +
"Luxury vehicles\n"+"Price = 11 mln\n"+
                    "tax = 0.10");
            
        }
        else if(CarNo == 5){
            System.out.println("\n||||||||||||||| Lamborghini Cars |||||||||||||||\n"+
                    "Type\n" +
"Private subsidiary[1]\n" +
"Industry	Automotive\n" +
"Founded	1963; 56 years ago\n" +
"Founder	Ferruccio Lamborghini\n" +
"Headquarters	Sant'Agata Bolognese, Italy\n" +
"Number of locations\n" +
"135 dealerships\n" +
"Area served\n" +
"Worldwide\n"+"Price = 16 mln\n"+
                    "tax = 0.10");
            
        }
        else if(CarNo == 6){
            System.out.println("\n||||||||||||||| Rolls-Royce Cars |||||||||||||||\n"+
                    "Predecessor	partnership of Rolls and Royce\n" +
"Successor	Rolls-Royce Holdings plc\n" +
"Founded	\n" +
"Manchester, England\n" +
"1904 (partnership)\n" +
"1906 (private company per March 15, 1906)\n" +
"New company: February 23, 1971\n" +
"Founder	\n" +
"Charles Rolls\n" +
"Henry Royce\n" +
"Defunct	Public float: 1987; 32 years ago\n" +
"Headquarters	Derby, England, United Kingdom\n" +
"Key people\n" +
"Claude Johnson\n" +
"Ernest Hives\n" +
"Products	\n" +
"Automobiles\n" +
"Civil and military aero engines\n" +
"Marine propulsion systems\n" +
"Power generation equipment\n"+"Price = 15.5 mln\n"+
                    "tax = 0.10");
            
        }
        else if(CarNo == 7){
            System.out.println("\n||||||||||||||| Porsche Cars |||||||||||||||\n"+
                    "Type\n" +
"Aktiengesellschaft\n" +
"Industry	Automotive\n" +
"Founded	1931; 88 years ago in Stuttgart, Germany\n" +
"Founder	Ferdinand Porsche\n" +
"Headquarters	Stuttgart, Baden-Württemberg, Germany\n" +
"Area served\n" +
"Worldwide\n" +
"Key people\n" +
"Wolfgang Porsche, Chairman\n" +
"Oliver Blume, CEO[1]\n" +
"Products	Automobiles\n" +
"Production output\n" +
"Increase 246,375 vehicles (2017)[2]\n" +
"Services	Automotive financial services, engineering services, investment managemen\n"+"Price = 13.5 mln\n"+
                    "tax = 0.10");
           
        }
        else if(CarNo == 8){
            System.out.println("\n||||||||||||||| Honda Cars |||||||||||||||\n"+
                    "Type\n" +
"Public KK\n" +
"Traded as	TYO: 7267\n" +
"NYSE: HMC\n" +
"TOPIX Core 30 Component\n" +
"Industry	Conglomerate\n" +
"Founded	Hamamatsu, Japan (October 1946, incorporated 24 September 1948; 70 years ago)\n" +
"Founder	Soichiro Honda\n" +
"Takeo Fujisawa\n" +
"Headquarters	Minato, Tokyo, Japan\n" +
"Area served\n" +
"Worldwide\n"+"Price = 5 mln\n"+
                    "tax = 0.10");
            
        }
        else if(CarNo == 9){
            System.out.println("\n||||||||||||||| Toyota Corolla Cars |||||||||||||||\n"+
                    "Manufacturer	Toyota\n" +
"Production	November 1966 – present\n" +
"Body and chassis\n" +
"Class	Subcompact car (1966–1991)\n" +
"Compact car (1991–present)\n" +
"Chronology\n" +
"Predecessor	Toyota Publica\n"+"Price = 4.5 mln\n"+
                    "tax = 0.10");
            
        }
        else if(CarNo == 10){
            System.out.println("\n||||||||||||||| Bugatti Veyron Cars |||||||||||||||\n"+
                    
                    "Assembly	France: Alsace, Molsheim\n" +
"Designer	Jozef Kabaň[1]\n" +
"Body and chassis\n" +
"Class	Sports car (S)\n" +
"Body style	\n" +
"2-door coupé (16.4, Super Sport)\n" +
"2-door targa top (Grand Sport, Grand Sport Vitesse)\n" +
"Layout	Mid-engine, all-wheel drive\n" +
"Related	Audi Rosemeyer \n" +
"Bentley Hunaudières\n" +
"Powertrain\n" +
"Engine	8.0 L (488 cu in) quad-turbocharged W16\n" +
"Power output	\n" +
"Standard (Coupé), Grand Sport Roadster: 1,001 PS (987 hp; 736 kW)[2]\n" +
"Super Sport (Coupé), Grand Sport Vitesse (Roadster): 1,200 PS (1,184 hp; 883 kW)[3][4]\n" +
"Transmission	7-speed Direct Shift automatic\n"+"Price = 18 mln\n"+
                    "tax = 0.10");
            
            
        }
        
   
    }
    
    protected void Carsprice(int CarNo){
        this.CarNo=CarNo;
        if(CarNo==1){
            Price = 10*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==2){
            Price = 15*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==3){
            Price = 13*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==4){
            Price = 11*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==5){
            Price = 16*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==6){
            Price = 15.5*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==7){
            Price = 13.5*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==8){
            Price = 5*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==9){
            Price = 4.5*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        else if(CarNo==10){
            Price = 18*1000000;
            Qunatity = 5;
            tax = 0.10;
        }
        
        
    }
    protected void set_Qunatity(int CarNo){
         Qunatity = Qunatity-CarNo;
    }
    
    protected void inputCarinfo(){
        System.out.println("Input Product Type: ");
        P_Type = input.next();
        System.out.println("Input Owner: ");
        Owner = input.next();
        System.out.println("Input Produced by: ");
        Producedby = input.next();
        System.out.println("Input Country: ");
        Country = input.next();
        System.out.println("Input Since: ");
        Since = input.next();
        System.out.println("Input Related Brands: ");
        RelatedBrands = input.next();
        System.out.println("Input Markets: ");
        Markets = input.next();
        input.next();
        System.out.println("Input Price: ");
        Price = input.nextDouble();
        System.out.println("Input Qunatity: ");
        Qunatity = input.nextDouble();
        System.out.println("Input tax: ");
        tax = input.nextDouble();
        System.out.println("Input CarNo: ");
        CarNo = input.nextInt();
        
         
    }
    protected void printCarinfo(){
        System.out.println("Product Type: "+P_Type);
        System.out.println("Owner: "+Owner);
        System.out.println("Produced by: "+Producedby);;
        System.out.println("Country: "+Country);
        System.out.println("Since: "+Since);
        System.out.println("Related Brands: "+RelatedBrands);
        System.out.println("Markets: "+Markets);
        System.out.println("Price: "+Price);
        System.out.println("Qunatity: "+Qunatity);
        System.out.println("tax: "+tax);
        System.out.println("CarNo: "+CarNo);     
    }
    
}
