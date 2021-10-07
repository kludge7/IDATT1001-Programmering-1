import java.util.Scanner;

public class BrokerKlient{
    public static void main(String[] args){
        Scanner inputT1 = new Scanner(System.in);
        System.out.println("Skriv inn Teller til første brøken: ");
        int teller1 = inputT1.nextInt();
        Scanner inputN1 = new Scanner(System.in);
        System.out.println("Skriv inn Nevner til første brøken: ");
        int nevner1 = inputN1.nextInt();

        Broker brok1 = new Broker(teller1, nevner1);

        Scanner inputT2 = new Scanner(System.in);
        System.out.println("Skriv inn Teller til andre brøken: ");
        int teller2 = inputT2.nextInt();
        Scanner inputN2 = new Scanner(System.in);
        System.out.println("Skriv inn Nevner til andre brøken: ");
        int nevner2 = inputN2.nextInt();

        Scanner inputC = new Scanner(System.in);
        System.out.println("Velg hvilken operasjon du vil utføre på brøkene:\n1. Addisjon\n2. Subtraksjon\n3. Multiplikasjon\n4. Divisjon");
        int choice = inputC.nextInt();

        if (choice == 1){
            brok1.sumBroker(teller2, nevner2);
        }
        else if (choice == 2){
            brok1.subBroker(teller2, nevner2);
        }
        else if (choice == 3){
            brok1.multiBroker(teller2, nevner2);
        }
        else if (choice == 4){
            brok1.diviBroker(teller2, nevner2);
        }
        else{
            System.out.println("Ugyldig valg.");
        }
        brok1.forkortBroker();
        System.out.println(brok1);

        inputT1.close();
        inputN1.close();
        inputT2.close();
        inputN2.close();
        inputC.close();
    }       
}
