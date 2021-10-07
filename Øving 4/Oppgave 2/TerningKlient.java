class TerningKlient{
    public static void main(String[] args){
        Terning a = new Terning(0,0);
        Terning b = new Terning(0,0);

        while (!a.erFerdig() && !b.erFerdig()){
            a.kastTerningen();
            b.kastTerningen();

            System.out.println("-- Antall Kast: "+a.getAntRunder()+" -- \nAntall Oyne:\n A: "+a.getSumPoeng()+" \n B: "+b.getSumPoeng());
        }

        if (a.getSumPoeng() == 100){
            System.out.println("Spiller A vinner!");
        }
        else{
            System.out.println("Spiller B vinner!");
        }
    }
}
