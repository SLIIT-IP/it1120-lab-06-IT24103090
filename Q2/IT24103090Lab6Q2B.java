import java.util.Scanner;

public class IT24103090Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];  
        int counter = 0;

        
        System.out.println("Please enter 10 numbers:");

        
        while (counter < 10) {
            System.out.print("Enter number " + (counter + 1) + ": ");
            numbers[counter] = input.nextInt();  
            counter++; 
        }

        
        System.out.println("The numbers you entered are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        
    }
}
