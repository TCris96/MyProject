public class ValidatePIN {
    public static void main(String[] args) {
        String pin ="1214";
        System.out.println(isAValidPIN(pin));

    }
    public static boolean isAValidPIN(String pin){
        if(pin.isEmpty() == true){
            return false;
        }
        if(pin.length() != 4 && pin.length() != 6){
            return false;
        }
        if(pin.contains(" ")){
            return false;
        }
        if(pin.matches("/d/d/d/d") == true){
            return false;
        }
        return true;
    }
}
