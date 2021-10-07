import java.util.Scanner;

public class matrixKlient{
    public static void main(String[] args){
        Scanner inputC1 = new Scanner(System.in);
        System.out.println("Vennligst skriv inn antall kolonner på forste matrise: ");
        int columns1 = inputC1.nextInt();
        Scanner inputR1 = new Scanner(System.in);
        System.out.println("Vennligst skriv inn antall rader på forste matrise: ");
        int rows1 = inputR1.nextInt();

        java.util.Random random = new java.util.Random();
        int[][] mat = new int[columns1][rows1];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = random.nextInt(10)+1;
                }
            }
        matrix matrix1 = new matrix(mat);

        
        boolean running = true;


        while (running){
            Scanner input = new Scanner(System.in);
            System.out.println("Velg hva vil du gjore: \n1. Addisjon\n2. Multiplikasjon\n3. Transponering\n4. Exit.");
            int choice = input.nextInt();
            System.out.println("\n\n\n\n\n\n");
            if (choice == 1){
                System.out.println(matrix1+"\n---- + ----");

                int[][] matrix2 = new int[columns1][rows1];
                String output = "";
                for (int i = 0; i < matrix2.length; i++) {
                    output+="[";
                    for (int j = 0; j < matrix2[i].length; j++) {
                        matrix2[i][j] = random.nextInt(10)+1;
                        output += (matrix2[i][j] + ", ");
                    }
                    output+="]";
                    output+="\n";
                }
                System.out.println(output);

                System.out.println("\n---- = ----");

                matrix matrix3 = matrix1.addere(matrix2);
                System.out.println(matrix3);

            }
            else if (choice == 2){
                System.out.println(matrix1+"\n---- * ----");

                int[][] matrix2 = new int[columns1][rows1];
                String output = "";
                for (int i = 0; i < matrix2.length; i++) {
                    output+="[";
                    for (int j = 0; j < matrix2[i].length; j++) {
                        matrix2[i][j] = random.nextInt(10)+1;
                        output += (matrix2[i][j] + ", ");
                    }
                    output+="]";
                    output+="\n";
                }
                System.out.println(output);
                System.out.println("\n---- = ----");

                matrix matrix4 = matrix1.multiplisere(matrix2);
                System.out.println(matrix4);

            }
            else if (choice == 3){
                System.out.println("----T----\n"+matrix1+"\n---- = ----");
                matrix matrix5 = matrix1.transponere();
                System.out.println(matrix5);
    

            }
            else if (choice == 4){
                running = false;
                 
            }
            else{
                System.out.println("Invalid choice.");
            }
        }
    }
}
