import java.util.Scanner;

public class harmonicMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X: ");
        float x = scan.nextFloat();
        System.out.println("Enter Y: ");
        float y = scan.nextFloat();

        float h = 2 / (1/x + 1/y);
        float a = (x + y)/2;
        System.out.println("Arithmetic mean: "+a+"\nHarmonic mean: "+h);
    }
}