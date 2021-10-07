public class tekstanalyse {
    private char[] bokstaver; 
    private int[] antallTegn; 
    private String tekst; 
    private boolean not_in_it; 

    public tekstanalyse(char[] bokstaver, int[] antallTegn, String tekst, boolean not_in_it){
        this.bokstaver = bokstaver;
        this.antallTegn = antallTegn;
        this.tekst = tekst;
        this.not_in_it = not_in_it;
    }

    public void telling(){
        for (int i=0;i<tekst.length();i++){
            for (int z=0;z<bokstaver.length;z++){
                if (tekst.charAt(i) == bokstaver[z]){
                    antallTegn[z]++;
                }
            }
        }
    }

    public int antallForskjelligeBokstaver(){
        int antall = 0;
        for(int x=0;x<antallTegn.length;x++){
            if (antallTegn[x]>0){
                antall++;
            }
        }
        return antall;
    }

    public int totalAntallBokstaver(){
        int antall = 0;
        for (int i=0;i<bokstaver.length;i++){
            antall+=antallTegn[i];
        }
        return antall;
    }

    public float ikkeBokstav(){
        float antall_ikke=0;
        for (int i=0;i<tekst.length();i++){
            if (Character.isLetter(tekst.charAt(i)))
                    not_in_it = true;
                }
            if (!not_in_it){
                antall_ikke++;
            }
            not_in_it = false;
        float antall = totalAntallBokstaver();
        return (antall_ikke/antall)*100;
    }

    public int forekomsterÉnBokstav(char bokstaven){
        int antall = 0;
        for (int i=0;i<bokstaver.length;i++){
            if (bokstaver[i] == bokstaven){
                antall = antallTegn[i];
            }
        }
        return antall;
    }

    public int forekommerOftest(){
        int hoyest = 0;
        for(int x=0;x<antallTegn.length;x++){
            if (antallTegn[x]>hoyest){
                hoyest = antallTegn[x];
            }
        }
        return hoyest;
    }

    public String hvileforekommerOftest(int hoyest){
        String bokstavee = "";
        for(int x=0;x<antallTegn.length;x++){
            if (antallTegn[x]==hoyest){
                bokstavee+=bokstaver[x]+",";
            }
        }
        return bokstavee;
    }
}
