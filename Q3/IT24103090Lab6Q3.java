import java.util.Scanner;

public class IT24103090Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;  
        int count = 0;
	int sumofsquares = 0;
	

        
        System.out.println("Enter Positive integers(terminate input with -99):");

        
        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();
		if(number==-99)
			{
			break;
			} 
		if (number < 0) 
			{
                	System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                	continue;
            		} 
             sumofsquares += number * number;
             count++;
        }

        
      
        
	double rms = Math.sqrt((double) sumofsquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        
    }
}
