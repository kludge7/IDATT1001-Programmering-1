import java.util.Scanner;

public class NyStringKlient{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn tekst: ");
        String txt = input.nextLine();
        NyString ExampleString = new NyString(txt);
        NyString ExampleStringShort = ExampleString.Abbreviation();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Skriv symbol du vil fjerne: ");
        char symbol = input2.next().charAt(0);

        NyString ExampleStringRemoveSymbol = ExampleString.RemoveSymbol(symbol);

        System.out.println(ExampleString.getText());
        System.out.println("Setningen forkortet blir: "+ExampleStringShort.getText());
        System.out.println("Etter vi fjerner '"+symbol+"' blir setningen: "+ExampleStringRemoveSymbol.getText());

    }
}
