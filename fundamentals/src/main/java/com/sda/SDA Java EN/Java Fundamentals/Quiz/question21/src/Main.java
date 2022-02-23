public class Main {
    private  int a;

    public void main(String[] args, int a) {
        int a = 5;
        this.a = 4;
        System.out.println(f(a));
        System.out.println(f(a));
        System.out.println(a);
    }

    public static int f(int x) {
        a++;
        return a + x;
    }
}