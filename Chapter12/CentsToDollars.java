import java.util.Scanner;

public class CentsToDollars{

    public static void main(String[] args) {
        int cents;
        int dollars;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the cents:");
        
        cents = scanner.nextInt();
        dollars = cents / 100;
        cents = cents % 100;
        System.out.println("That is "+dollars+" dollars and "+cents+" cents");
    }
}