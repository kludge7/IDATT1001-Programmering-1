public class ArbTaker{
    private Person personalia;
    private int arbtakernr;
    private int ansettelsesår;
    private double månedslønn;
    private double skatteprosent;
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();

    
    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesår, double månedslønn, double skatteprosent){
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia(){
        return personalia;
    }
    public int getArbtakernr(){
        return arbtakernr;
    }
    public int getAnsettelsesår(){
        return ansettelsesår;
    }
    public double getMånedslønn(){
        return månedslønn;
    }
    public double getSkatteprosent(){
        return skatteprosent;
    }

    public void setMånedslønn(double newMånedslønn){
        månedslønn = newMånedslønn;
    }
    public void setSkatteprosent(double newSkatteprosent){
        skatteprosent = newSkatteprosent;
    }
    public double getSkattPerMåned(){
        return månedslønn*(skatteprosent/100);
    }
    public double getBruttolønn(){
        return månedslønn*12;
    }
    public double getSkattetrekkPerÅr(){
        return (getSkattPerMåned()*21/2);
    }
    public String getNavnPåFormen(){
        return getPersonalia().getEtternavn() + ", " + getPersonalia().getFornavn();
    }
    public int getAlder(){
        int år = kalender.get(java.util.Calendar.YEAR);
        return (år - getPersonalia().getFødselsår());
    }
    public int getÅrAnsattBedrift(){
        int år = kalender.get(java.util.Calendar.YEAR);
        return (år - getAnsettelsesår());
    }
    public boolean getÅrAnsattMer(int år_mer_enn){
        return getÅrAnsattBedrift()>=år_mer_enn;
    }


}
