import java.util.Scanner;

public class Exc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            try{
                System.out.println(numerator/denominator);
            }catch(ArithmeticException e){
                System.out.println("Divided by zero cannot possible");
            }
            
            int result = numerator / denominator;
            System.out.println("Result: " + result);
    
    }
}