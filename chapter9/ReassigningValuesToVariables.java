public class ReassigningValuesToVariables
{

    public static void main(String[] args) 
    {
        double x = 0.0;
        double sum = 3 * (x * x) - 8 * x + 4;
        System.out.println("At x = " + x);
        System.out.println(" the value is " + sum);
        x = 2.0;
        sum = 3 * (x * x) - 8 * x + 4;
        System.out.println("At x = " + x);
        System.out.println(" the value is " + sum);
        x = 4.0;
        sum = 3 * (x * x) - 8 * x + 4;
        System.out.println("At x = " + x);
        System.out.println(" the value is " + sum);
    } 
}
