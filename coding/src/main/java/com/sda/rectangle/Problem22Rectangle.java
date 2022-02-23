public class Problem22Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8,5);
        int area = Rectangle.getArea(rectangle.a,rectangle.b);
        int perimeter = Rectangle.getPerimeter(rectangle.a,rectangle.b);
        System.out.println("The area of the rectangle is "+area);
        System.out.println("The perimeter of the rectangle is "+perimeter);
    }
}
