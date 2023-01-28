public class Main {
    public static void main(String[] args) {
        //object instantiation
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(0.4);
        Circle circle3 = new Circle(0.6, "Red");
        //printing
        System.out.println(circle1.getColour());
        System.out.println(circle1.getRadius());
        System.out.println(circle2);
        System.out.println(circle3.getArea());
    }
}