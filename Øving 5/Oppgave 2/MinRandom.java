import java.util.Random;

public class MinRandom{
    private Random number;
    
    public MinRandom(){
        this.number = new Random();
    }
    public int nesteHeltall(int nedre, int ovre){
        return number.nextInt(ovre-nedre+1)+nedre; // For å få intervallet fra og med nedre til og med ovre.
    }
    public double nesteDesimaltall(double nedre, double ovre){
        return nedre*(ovre-nedre)*number.nextDouble();
    }  

}
