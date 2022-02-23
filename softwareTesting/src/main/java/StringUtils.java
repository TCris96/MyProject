public class StringUtils {

    public static Double convertToDouble(String number){
        if(number == null){
            return null;
        }
        return Double.valueOf(number);
    }
    public static String getStringInCapitalLetters(String myString){
        if (myString != null) {
            return myString.toUpperCase();
        }
        return null;
    }
    public static boolean isNullOrBlank(String myString){
        return myString == null || myString.trim().length() ==0;
    }
    public static String getDefaultIfNull(String myString, String defaultString){
        if (myString == null) {
            return defaultString;
        } else return myString;
        //return myString == null ? defaultString : myString;
    }
    public static String concat(String[] strings){
        String returnedString = null;
        if (strings != null && strings.length>0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                String stringFromArray = strings[i];
                if(stringFromArray != null ){
                    stringBuilder.append(stringFromArray);
                }
            }
            returnedString = stringBuilder.toString();

        }
        return returnedString;
    }
}
