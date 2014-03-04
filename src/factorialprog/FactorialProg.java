/*
The purpose of this program is to take in a a number from the user. Then
it will do the factorial math and print out the solution to the user.
 */

package factorialprog;

import java.util.*;

public class FactorialProg 
{

    
    public static void main(String[] args) 
    {
        
        int inputNum;                        // Takes in the users input
        int outputNum;                       // Holds the result
        Scanner in = new Scanner(System.in); // Scanner to take input
        Boolean run = true;                  // To see if the user wants to do more
        String go;                           // User input to end program
        
        // While loop to run through program and reset outputNum.
        while (run)
        {
            outputNum = 1;
            
            // Main bulk of program
            while (true)
            {
                // Takes in the number to be used.
                System.out.println("Enter a real number you wish to get the factorial "
                        + "solution of.");
            
                inputNum = in.nextInt();
                
                // Checks which way to do the factorial
                if (inputNum > 0)
                {
                    for (int i = inputNum; i > 0; i--)
                    {
                        outputNum = outputNum * i;
                    }
                    break;
                }
                else if (inputNum < 0)
                {
                    for (int i = inputNum; i < 0; i++)
                    {
                        outputNum = outputNum * i;
                    }
                    break;
                }
                else
                {
                    outputNum = 0;
                    break;
                }
        
            }
            
            // Output of the solution.
            System.out.print("The solution is: " + outputNum + "\n");
            
            // Checks to see if the user wants to do another.
            System.out.println("Would you like to do another? Enter y or n");
            
            go = in.next();
            go = go.toLowerCase();
            run = "y".equals(go);
        }
        
        // Exits program.
        System.exit(0);
    }
    
}
