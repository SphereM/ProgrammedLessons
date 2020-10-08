import java.util.Scanner;

public class DistanceABrickTravels {

    public static void main(String[] args) {
        
        double g = 32.174;
        double t;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of seconds:");
        t = scan.nextDouble();
        double d = 0.5*g*t*t;
        System.out.println("Distance: "+d);
    }
}