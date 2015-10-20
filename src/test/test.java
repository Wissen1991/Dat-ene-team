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

        System.out.println("BMI Waardes");
        System.out.println("Ondergewicht: Onder 18.5");
        System.out.println("Normaal: 18.5-24.9 ");
        System.out.println("Overgewicht: 25-29.9");
        System.out.println("Obesitas: 30 of hoger");
    }
}


