import java.util.Scanner;

public class AnnualApplianceCost {

    public static void main(String[] args) {
        double costPer;
        int hours;
        double annualCost;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter cost per kilowatt-hour in cents");
        costPer = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        hours = scan.nextInt();

        annualCost = costPer * hours;
        System.out.println("Annual cost: "+annualCost);
    }

}