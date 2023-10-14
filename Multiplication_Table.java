import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the range of the table (e.g., 1 to 10): ");
        int range = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("Multiplication Table for " + number + " (1 to " + range + "):");
        for (int i = 1; i <= range; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
