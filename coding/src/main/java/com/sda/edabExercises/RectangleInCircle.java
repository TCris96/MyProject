public class RectangleInCircle {
    public static void main(String[] args) {
        System.out.println(doesItFits(8,6,5));
        System.out.println(doesItFits(5,9,5));
        System.out.println(doesItFits(4,7,4));

    }

    public static boolean doesItFits(int width, int height, int radius) {
        double rectanglesDiameter = Math.sqrt(width * width + height * height);
        double circlesDiameter = 2 * radius;
        return rectanglesDiameter <= circlesDiameter;
    }
}
