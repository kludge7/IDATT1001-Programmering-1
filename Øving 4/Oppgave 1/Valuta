public class Valuta{

    private String navn;
    private double kurs;

    public Valuta(String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
    }

    public double convertToNOK (double amount){
        return amount / this.kurs;
    }

    public double ConvertFromNOK (double amount){
        return amount * this.kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public String getName(){
        return navn;
    }

    public String toString(){
        return "Skriv inn antall " + navn + " du ønsker å regne om til NOK:" ;
    }

    public String toStringFraNok(){
        return "Skriv inn antall NOK du ønsker å regne om til " + navn; 
    }
}
