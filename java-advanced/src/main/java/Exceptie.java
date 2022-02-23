public class Exceptie {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println("Before validation");
            validateName(name);
            System.out.println("After validating");
        } catch (IllegalStateException e) {
            System.out.println("Catch illegal");
        } catch(NullPointerException e) {
            System.out.println("Catch runtime");
        }
        catch(RuntimeException e) {
            System.out.println("Catch runtime");
        }finally{
            System.out.println("Aloha");
        }
    }

    public static void validateName(String name) {
        if (name == null) {
            //throw new IllegalArgumentException("Name is not valid");
            throw new IllegalStateException("Name is not valid");
        }
        if(name.isEmpty()){
            throw new NullPointerException("Empty name");
        }
    }
}
