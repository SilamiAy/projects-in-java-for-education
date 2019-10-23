package Silami;

public class CircleMain {
    public static void main(String[]args){
        Circle cr = new Circle();
        cr.phi = 3.14;
        cr.r = 5;
        double areas = cr.area();
        System.out.println("Area of the circle is "+cr.area() );
        System.out.println("Surface of the circle is "+ cr.surface());
    }
}
