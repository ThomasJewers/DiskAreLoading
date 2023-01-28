public class Circle {
    private double radius;
    private String colour;

    //Default Constructor
    public Circle(){
        this.radius = 2;
        this.colour = "Green";
    }

    //Overloaded Constructor
    public Circle(double radius){
        this.radius = radius;
        this.colour = "Green";
    }

    //Second Overloaded Constructor
    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    //Getters
    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    //Methods
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return "Radius = "+radius+", Colour = "+colour;
    }


}
