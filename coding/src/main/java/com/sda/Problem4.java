public class Problem4 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 9;
        short shortSum = (short) (var1 + var2);
        System.out.println(shortSum);
        System.out.println(shortSum++);
        System.out.println(shortSum);
        byte byteSum = (byte)(var1+var2);
        System.out.println(byteSum);
        System.out.println(++byteSum);
    }
}
