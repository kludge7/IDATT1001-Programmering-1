public class Broker {
    private int teller;
    private int nevner;

    public Broker(int teller, int nevner){
        this.teller = teller;
        this.nevner = nevner;
        if (nevner == 0){
            throw new IllegalArgumentException("Ugyldig nevner, kan ikke være 0.");
        }
    }

    public Broker(int teller){
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller(){
        return teller;
    }

    public int getNevner(){
        return nevner;
    }

    public void sumBroker(int teller2, int nevner2){
        this.teller = (this.teller*nevner2)+(teller2*this.nevner);
        this.nevner = (this.nevner*nevner2);

    }

    public void subBroker(int teller2, int nevner2){
        this.teller = (this.teller*nevner2)-(teller2*this.nevner);
        this.nevner = (this.nevner*nevner2);
    }

    public void multiBroker(int teller2, int nevner2){
        this.teller = this.teller * teller2;
        this.nevner = this.nevner * nevner2;
    }

    public void diviBroker(int teller2, int nevner2){
        this.teller = this.teller * nevner2;
        this.nevner = this.nevner * teller2;
    }

    public void forkortBroker(){
        for (int i = 1; i <= java.lang.Math.abs(teller); i++){
            if (teller%i == 0){
                if (java.lang.Math.abs(nevner%i)==0){
                    this.teller = this.teller/i;
                    this.nevner = this.nevner/i;
                    i = 1;
                }
            }
        }
    }

    public String toString(){
        return this.teller + "/" + this.nevner;
    }
}

