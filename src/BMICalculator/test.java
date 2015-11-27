package BMICalculator;

import java.util.Scanner;

public class test
{
	
	private static boolean nogEenKeer()
	{
		System.out.println("Wil je nog een berekening uitvoeren? ('ja' voor nog een keer; 'nee' om te stoppen)");
        try(Scanner scanner = new Scanner(System.in)){
        
	        while(scanner.hasNextLine())
	        {
	           String token = scanner.nextLine().trim();
	
	           if(token.equalsIgnoreCase("j")||token.equalsIgnoreCase("ja")) 
	           {
	               System.out.println("Geweldig!");
	               return true;
	           }
	           else if (token.equalsIgnoreCase("n")||token.equalsIgnoreCase("nee"))
	           {
	               System.out.println("Dat is jammer!");
	               return false;
	           }
	           else
	           {
	               System.out.println("Oops, geen valide input!");
	               System.out.println("Wil je nog een berekening uitvoeren? ('ja' voor nog een keer; 'nee' om te stoppen)");
	               continue;
	           }
	           
	         }		
	        return false;
        }
	}
	
    public static void main(String[] args)
    {

        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        
        double gewicht = 0.0;
        double lengte = 0.0;
        double bmi = 0.0;
        double taille = 0.0;
        double tailleOnderwaarde = 68.0;
        double tailleBovenwaarde = 80.0;

        while (true) {

	        System.out.print("Vul je geslacht in (m/v): ");
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        String geslacht = scanner.nextLine().trim();
	        
	        //Indien f ingevoerd danvervangen voor v
	        geslacht = StringHelper.replaceFwithV(geslacht);
	              
	        System.out.print("Vul je gewicht in Kg: ");
	        gewicht = input.nextInt();
	
	        System.out.print("Vul je lengte in cm: ");
	        lengte = input.nextInt();
	     
	        bmi = (gewicht/((lengte/100)*(lengte/100)));
       
            System.out.print("Vul de omvang van je taille in: ");
            taille = input.nextInt();
            
            System.out.println("");
            System.out.println("Je hebt opgegeven:");
            System.out.printf("Geslacht: %s\n", geslacht);
            System.out.printf("Lengte: %.0f cm\n", lengte);
            System.out.printf("Gewicht: %.1f kg\n", gewicht);
            System.out.printf("Taille: %.0f cm\n", taille);
            System.out.println("");
	        System.out.printf("Je BMI is %.2f\n", bmi);
	        System.out.println("");
	        System.out.println("BMI Waarde");
	    
	        if (bmi < 18.5) {
	        	System.out.println("Ondergewicht: Onder 18,5");
	        	System.out.println("Doe eens effe snel naar McDonalds gaan!");
	        } else if (18.4<bmi && bmi< 25.0) {
	        	System.out.println("Normaal: 18,5-24,9");
	        	System.out.println("Goed bezig, volhouden!");        
	        } 
	        else if (24.9<bmi && bmi<30.0) {
	        	System.out.println("Overgewicht: 25-29,9");
	        	System.out.println("Tijd voor de sportschool!");
	        } else if (bmi > 29.9){	
	        	System.out.println("Obesitas: 30 of hoger");
	        	System.out.println("Raadpleeg professionele hulp of ga op het strand liggen, dan word je vanzelf weer de zee ingetrokken!");
	        }
	        
	        System.out.println("");
	    	System.out.println("Je taille is:");
	        if (taille < tailleOnderwaarde ) {
            	System.out.println("Niet ok, je hebt een kleine taille"); 
            }
            else if (tailleOnderwaarde<=taille && taille< tailleBovenwaarde) {
            	System.out.println("Ok, je taille is top!");
            }
            else if (taille>=tailleBovenwaarde) {
            	System.out.println("Niet ok, denk om je buik!");
            }   
	        
	        System.out.println("");
	        System.out.println("Disclaimer: Aan deze uitkomsten kunnen geen rechten ontleend worden.");
	        System.out.println("");
	        
	        if (nogEenKeer()){
	        	continue;
	        }
	        else {
	        	System.exit(0);
	        }
        }
    }
}


