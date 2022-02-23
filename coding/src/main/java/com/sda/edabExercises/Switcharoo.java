public class Switcharoo {
    public static void main(String[] args) {
        System.out.println(reverseCharacters("Cat, dog, and mouse."));

    }
    public static String reverseCharacters(String text){
        if(text.length()<=1){
            return "Incompatible.";
        }
        if(text.charAt(0) == text.charAt(text.length()-1)){
            return "Two's a pair.";
        }

        String newText = text.charAt(text.length()-1) + text.substring(1,text.length()-1) + text.charAt(0);



        return newText;
    }
}
