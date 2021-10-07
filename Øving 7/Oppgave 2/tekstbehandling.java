public class tekstbehandling {
    private String text;

    public tekstbehandling(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
    public String getTextBig(){
        return text.toUpperCase();
    }
    public int AmountWords(){
        int SumWords = 1;
        for (int i=0;i<text.length();i++){
            if (text.charAt(i) == ' '){
                SumWords+=1;
            }
        }
        return SumWords;
    }


    public int AmountLetters(){
        int SumLetters = 0;
        for (int i=0;i<text.length();i++){
            if( (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') || (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')){
                SumLetters+=1;
            }
        }
        return SumLetters;
    }

    public double AvarageLength(){
        double AmountLetters = AmountLetters();
        double AmountWords = AmountWords();
        double Avarage = (AmountLetters/AmountWords);
        return Avarage;
    }

    public double AvarageWordPeriod(){
        double AmountWords = AmountWords();
        double AmountPeriods= 0;
        for (int z=0;z<text.length();z++){
            if ((text.charAt(z) == '.') || (text.charAt(z) == ',') || (text.charAt(z) == ':') || (text.charAt(z) == '?')){
                AmountPeriods+=1;
            }
        }
        double Avarage = (AmountWords/AmountPeriods);
        return Avarage;
    }

    public String ChangeWords(String NewWord, String OldWord){
        String NewText = "";
        String[] NewTextList = text.split(" ");
        int Counter = 0;
        for (int i=0;i<NewTextList.length;i++){
            String CheckWord = NewTextList[i];
            for (int z=0;z<NewTextList[i].length();z++){
                if (OldWord.length() != NewTextList[i].length()){
                    break;
                }
                if (CheckWord.charAt(z) == OldWord.charAt(z)){
                    Counter+=1;
                }
                if (Counter == OldWord.length()){
                    NewTextList[i] = NewWord;
                }
            }
        }
        for (int i=0;i<NewTextList.length;i++){
            NewText+=NewTextList[i]+" ";
        }

        return NewText;
    }  
}
