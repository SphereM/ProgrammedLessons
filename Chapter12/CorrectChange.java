import java.util.Scanner;

public class CorrectChange {
        public static void main(String[] args) {
            
            int dollar;
            int quarter;
            int dime;
            int nickel;
            int cents;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input cents:");
            cents = scanner.nextInt();
            dollar = cents / 100;
            cents = cents % 100;
            quarter = cents / 25;
            cents = cents % 25;
            dime = cents / 10;
            cents = cents % 10;
            nickel = cents / 5;
            cents = cents % 5;
            System.out.println("Your change is : "+dollar+" dollars, "+quarter+" quarters, "+dime+" dimes, "+nickel+" nickels, and "+cents+" cents");
        }
}