import java.util.Scanner;

public class logarithmBaseTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a double");
        double x = scan.nextDouble();

        double baseTwoLog = Math.log(x)/Math.log(2);

        System.out.println("Base 2 log of "+x+" is "+baseTwoLog);
    }
}