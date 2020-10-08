import java.util.Scanner;

public class OhmsLaw {

    public static void main(String[] args) {
        double I;
        int V;
        int R;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input voltage:");
        V = scanner.nextInt();
        System.out.println("Input resistance:");
        R = scanner.nextInt();
        
        I = (V + 0)/R;
        System.out.println("Current: "+I);
    }

}