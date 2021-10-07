import java.util.Scanner;
import java.lang.System;

public class MinRandomKlient {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Vil du ha Heltall eller Desimaltall?\n1.Heltall\n2.Desimaltall");
        int choice = input.nextInt();
        if (choice==1){
            
            System.out.println("Skriv inn Nedre Heltall: ");
            int nedreH = input.nextInt();

            System.out.println("Skriv inn Ovre Heltall: ");
            int ovreH = input.nextInt();

            MinRandom randHeltall = new MinRandom();
            System.out.println("Et tall i intervallet er "+randHeltall.nesteHeltall(nedreH, ovreH)+".");
        }

        else if (choice==2){
            System.out.println("Skriv inn Nedre Desimaltall: ");
            double nedreD = input.nextDouble();

            System.out.println("Skriv inn Ovre Desimaltall: ");
            double ovreD = input.nextDouble();

            MinRandom randDesimaltall = new MinRandom();
            System.out.println("Et tall i intervallet er "+randDesimaltall.nesteDesimaltall(nedreD, ovreD)+".");
        }
        else{
            System.out.println("INVALID CHOICE");
        }
    }   
}
