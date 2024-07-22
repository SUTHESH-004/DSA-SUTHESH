package Programs;
import java.util.*;
public class circle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int speed = 20 ; // degree per minute
        double radius = 5;
        int time = 1;
        int start = 0;
        int distance = speed * time; // in degrees
        Boolean direction = false; // false - anticlockwise | true - clockwise 
        int degrees =  direction == false ?  (start+distance)%360 :360 -((start+distance)%360);
        System.out.println("degrees : "+ degrees);
        int xc = 0;
        int yc = 0;

        System.out.println("X : "+(xc+(radius*(Math.cos(Math.toRadians(degrees))))));
        System.out.println("Y : "+(yc+(radius*(Math.sin(Math.toRadians(degrees))))));
    }
    public static void mycos(double val)
    {
            double val  = Math.cos(Math.toRadians(val));     
    }
}
