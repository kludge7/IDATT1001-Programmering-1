public class tekstanalyseKlientTest {
    public static void main(String[] args){
        char[] bokstaver = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','"'};
        int[] antallTegn = new int[bokstaver.length];
        String tekst = "hello@908 world";
        boolean not_in_it = false;
        
        for (int i=0;i<tekst.length();i++){
            for (int z=0;z<bokstaver.length;z++){
                if (tekst.charAt(i) == bokstaver[z]){
                    antallTegn[z]++;
                    not_in_it = true;
                }
            }
            if (!not_in_it){
                antallTegn[antallTegn.length-1]++;
            }
            not_in_it = false;
        }
        for (int x=0;x<bokstaver.length-1;x++){
            if (antallTegn[x]>0){
                System.out.println(bokstaver[x]+": "+antallTegn[x]);
            }
        }
        int antall_bokstaver = 0;
        for (int i=0;i<bokstaver.length;i++){
            antall_bokstaver+=antallTegn[i];
        }
        System.out.println("Antall bokstaver: "+antall_bokstaver);

        float antell_bokstaver = antall_bokstaver;
        float antall_ukjent = antallTegn[antallTegn.length-1];
        System.out.println("Prosent ikke bokstaver: "+((antall_ukjent/antell_bokstaver)*100));
    }
}
