What will be the result of the following program?
```java
public class A {
    private static int a;

    public static void main(String[] args) {
        int a = 5;
        System.out.println(f(a));
        System.out.println(f(a));
        System.out.println(a);
    }

    public static int f(int x) {
        a++;
        return a + x;
    }  
}
```