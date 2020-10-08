import java.util.Scanner;

public class FurtherSubstringFun {

    public static void main(String[] args) {

        
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string:");
        
        String originalString = scan.nextLine();

        System.out.println("Enter beginning index:");
        int beginIndex = scan.nextInt();
        System.out.println("Enter ending index:");
        int endIndex = scan.nextInt();
        String newString = originalString.substring(beginIndex, endIndex);

        System.out.println("Substring: "+newString);

    }
}