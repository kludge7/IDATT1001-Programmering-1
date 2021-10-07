import java.util.Scanner;

public class tekstanalyseKlient {
    public static void main(String[] args){
            boolean Running = true;
            while (Running){
                char[] bokstaver = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
                int[] antallTegn = new int[bokstaver.length];
                Scanner input = new Scanner(System.in);
                System.out.println("Skriv inn en text: ");
                String tekst_unfinished = input.nextLine();
                String tekst = tekst_unfinished.toLowerCase();
                boolean not_in_it = false;

                tekstanalyse texting = new tekstanalyse(bokstaver, antallTegn, tekst, not_in_it);
                texting.telling();
                System.out.println("Antall ulike bokstaver i teksten er: "+texting.antallForskjelligeBokstaver());
                System.out.println("Totalt antall bokstaver i teksten er: "+texting.totalAntallBokstaver());
                System.out.println("Andel ikke bokstaver er på: "+(texting.ikkeBokstav()));

                Scanner input_bokstav = new Scanner(System.in);
                System.out.println("Skriv inn bokstaven du vil finne: ");
                String bokstav = input_bokstav.nextLine();

                System.out.println("Bokstaven '"+bokstav+"' forekommer: "+(texting.forekomsterÉnBokstav(bokstav.charAt(0))+" gang(er)."));
                System.out.println("Bokstaven(e) "+(texting.hvileforekommerOftest(texting.forekommerOftest())+" forkommer oftest."));

                Scanner input_fortsette = new Scanner(System.in);
                System.out.println("Skriv 1 hvis du vil avslutte, og alt annet hvis du vil fortsette: ");
                int fortsette = input_fortsette.nextInt();

                if (fortsette == 1){
                    System.exit(0);
                }
        }
    }  
}
