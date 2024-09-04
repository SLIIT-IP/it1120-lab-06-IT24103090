import java.util.Scanner;

public class IT24103090Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];  
        int counter = 0;
	int total = 0;
	double average = 0;

        
        System.out.println("Please enter 10 numbers:");

        
        while (counter < 10) {
            System.out.print("Enter number " + (counter + 1) + ": ");
            numbers[counter] = input.nextInt();  
            counter++; 
        }

        
        System.out.println("The numbers you entered are:");
        for (int number : numbers) {
		
	    total=total+number;
            System.out.print(number + " ");
        }
	average=total/counter;
	System.out.println();
	System.out.println("The sum of the numbers:" +total);
	System.out.println("The average of the numbers:" +average);
        
    }
}
