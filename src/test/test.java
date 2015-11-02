package test;
import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        double gewicht = 0.0;
        double lengte = 0.0;
        double bmi = 0.0;

        System.out.print("Vul je gewicht in Kg: ");
        gewicht = input.nextInt();

        System.out.print("Vul je lengte in cm: ");
        lengte = input.nextInt();

        bmi = (gewicht/((lengte/100)*(lengte/100)));

        System.out.printf("Je BMI is %f\n", bmi);

        System.out.println("BMI Waarde");
        
        if (bmi < 18.5) {
        	System.out.println("Ondergewicht: Onder 18,5");
        	System.out.println("Doe eens effe snel naar McDonalds gaan!");
        } else if (18.4<bmi && bmi< 25.0) {
        	System.out.println("Normaal: 18,5-24,9");
        	System.out.println("Goed bezig, volhouden!");
        } else if (24.9<bmi && bmi<30.0) {
        	System.out.println("Overgewicht: 25-29,9");
        	System.out.println("Tijd voor de sportschool!");
        } else if (bmi > 29.9){	
        	System.out.println("Obesitas: 30 of hoger");
        	System.out.println("Raadpleeg professionele hulp of ga op het strand liggen, dan word je vanzelf weer de zee ingetrokken!");
        }
    }
}