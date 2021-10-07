public class NyString{
    private String text;

    public NyString(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public NyString Abbreviation(){
        boolean SpaceCheck = false;
        String NewText = "";
            for (int i=0;i<text.length();i++){
                if (!SpaceCheck){
                    NewText+=text.charAt(i);
                    SpaceCheck = true;
                }
                if (text.charAt(i) == ' '){
                    SpaceCheck = false; 
                }
            }
        return new NyString(NewText);
    }
    public NyString RemoveSymbol(char Symbol){
        String NewTekst = "";
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)!=Symbol){
                NewTekst+=text.charAt(i);
            }
        }
        return new NyString(NewTekst);

    }

}
