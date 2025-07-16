package string;

public class Practice {
    // ("<<>>", "Yay") → "<<Yay>>"
    public static String makeText(String a, String b){
        return a.substring(0,2)+ b + a.substring(2);
    }

    //("redxx") → "red"
    //("blueTimes") → "blue"
    //(xxred) -> "";

    public static String getColour(String text){
        if(text.startsWith("red")){
            return  "red";
        } else if (text.startsWith("blue")) {
            return  "blue";
        }else {
            return "$$$";
        }
    }

    //("Hi", "Bye") → "HiByeByeHi"
    protected static String doConcat(String text1, String text2){
        return text1+text2+text2+text1;
    }

    //("Hello") → "lololo"
    //("Love") -> "veveve"

    protected static String getEnd(String text){
        String k =text.substring(text.length()-2,text.length());
        return k+k+k;
    }
    //String name = "Aida" -> daAi

}
