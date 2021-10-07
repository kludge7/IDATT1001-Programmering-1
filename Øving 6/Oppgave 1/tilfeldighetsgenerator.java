public class tilfeldighetsgenerator {
    public static  void main(String[] args){
        java.util.Random random = new java.util.Random();
        int[] tab = new int[10];
        for (int i=0;i<1000;i++){
            tab[random.nextInt(10)]++;
        }
        for (int i=0;i<10;i++){
            int amount_stars = (tab[i]+5)/10;
            String stars = "";
            for (int z=0;z<amount_stars;z++){
                stars+="*";
            }
            System.out.println(amount_stars);
            System.out.println(i+": "+tab[i]+" "+stars+"\n");
        }
    }
}
