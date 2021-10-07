import java.util.Scanner;

public class tekstbehandlingKlient {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn tekst: ");
        String txt = input.nextLine();
        tekstbehandling ExampleText = new tekstbehandling(txt);

        System.out.println(ExampleText.getText());
        System.out.println(ExampleText.getTextBig());
        System.out.println("The amount of letters are: "+ExampleText.AmountLetters());
        System.out.println("The avarage length of each word is: "+ExampleText.AvarageLength());
        System.out.println("The word to period ratio is: "+ExampleText.AvarageWordPeriod());

        Scanner inputOld = new Scanner(System.in);
        System.out.println("Write the old word you wanna change: ");
        String OldWord = input.nextLine();
        Scanner inputNew= new Scanner(System.in);
        System.out.println("Write the word you want to change it into: ");
        String NewWord = input.nextLine();
        System.out.println(ExampleText.ChangeWords(NewWord, OldWord));
    }
}
