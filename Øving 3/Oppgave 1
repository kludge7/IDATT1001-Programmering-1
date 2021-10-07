import java.util.Scanner;

class gangetabell{
    public static void main(String args[]){

        boolean loop = true;
        while (loop) {
            Scanner input_1 = new Scanner(System.in); //Trenger ikke å lage scanners i en loop, fordi da lukkes de på slutt
            System.out.println("Skriv inn et tall: ");
            int low_num = input_1.nextInt();
            Scanner input_2 = new Scanner(System.in);
            System.out.println("Skriv inn et tall: ");
            int high_num = input_2.nextInt();
            
            loop = low_num>high_num;
            if (loop) {
                System.out.println("Det andre tallet må være lavere enn det første!!");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }

            input_1.close();
            input_2.close();

            int avstand_mellom_tall = high_num-low_num;
            for (int i = 0; i < avstand_mellom_tall+1; i++){
                System.out.println((low_num+i)+"-gangen:");
                for (int e = 1; e <= 10; e++){
                    System.out.println(((low_num+i)+" x "+e+" = "+(low_num+i)*e));
                }
            }
        }
    }
}



