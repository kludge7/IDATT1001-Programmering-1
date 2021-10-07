class Terning{

    private int sumPoeng;
    private int antRunder;

    public Terning(int sumPoeng, int antRunder){
        this.sumPoeng = sumPoeng;
        this.antRunder = antRunder;
    }
    public int getSumPoeng(){
        return sumPoeng;
    }
    public int getAntRunder(){
        return antRunder; 
    }
    public int kastTerningen(){
        java.util.Random dice = new java.util.Random();
        int terningkast = dice.nextInt(6)+1;
        if (sumPoeng > 100){
            sumPoeng -= terningkast;
        }
        else if (sumPoeng < 100){
            sumPoeng += terningkast;
        }
        antRunder++;
        if (terningkast == 1){
            sumPoeng = 0;
        }
        return sumPoeng;
    } 
    public boolean erFerdig(){
        return (sumPoeng == 100);
    }
}

