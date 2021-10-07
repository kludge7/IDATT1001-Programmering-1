import java.util.Scanner;

class SekunderTil{

    public static void main(String args[]){
        int time = 3600;
        int minutt = 60;

        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn antall sekunder: ");
        int testVerdi = input.nextInt();
        input.close();

        int test_timer = testVerdi/time;
        int test_minutter = (testVerdi%time)/minutt;
        int sekunder = testVerdi%minutt;

        System.out.println(testVerdi + " sekunder er det samme som:");
        System.out.println("==> "+ test_timer + " timer, " + test_minutter + " minutter og " + sekunder + " sekunder.");
    }
}
