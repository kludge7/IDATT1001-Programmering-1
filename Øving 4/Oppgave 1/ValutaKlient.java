import java.util.Scanner;

public class ValutaKlient{
    public static void main(String[] args){
        Valuta usd = new Valuta("USD", 8.64);
        Valuta eur = new Valuta("EUR", 10.20);
        Valuta rupi = new Valuta("RUPI", 0.12);
        
        boolean running = true;

        while (running){
            Scanner input = new Scanner(System.in);
            System.out.println("Velg valuta du vil overfore til NOK (eller 4): \n1. USD \n2. EUR \n3. RUPI\n4. Gjore om til NOK \n5. Avslutt");
            int choice = input.nextInt();
            Valuta chosen;

            if (choice<4 && choice> 0){
                
            }

            if (choice == 1){
                chosen = usd;

        
            } if (choice == 2){
                chosen = eur;

        
            } if (choice == 3){
                chosen = rupi;

        
            } if (choice == 4){

                Scanner input1 = new Scanner(System.in);
                System.out.println("Velg valuta du vil at NOK skal bli overført til:\n1. USD\n2. EU\n3. RUPI");
                int choice1 = input1.nextInt();

                if (choice1 == 1){
                    System.out.println(usd.toStringFraNok());
                    double penger = input.nextDouble();
                    double konvertert = usd.convertToNOK(penger);
                    System.out.println(penger + " NOK, er det samme som " + konvertert + " USD.");
    
            
                } if (choice1 == 2){
                    System.out.println(eur.toStringFraNok());
                    double penger = input.nextDouble();
                    double konvertert = eur.convertToNOK(penger);
                    System.out.println(penger + " NOK, er det samme som " + konvertert + " EUR.");
    
            
                } if (choice1 == 3){
                    System.out.println(rupi.toStringFraNok());
                    double penger = input.nextDouble();
                    double konvertert = rupi.convertToNOK(penger);
                    System.out.println(penger + " NOK, er det samme som " + konvertert + " RUPI.");
                    

            } 
            
            }  if (choice == 5){
               running = false;
            }
            
        }
    }
}
