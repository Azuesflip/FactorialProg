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
        int inputNum;
        int outputNum = 1;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a real number you wish to get the factorial "
                + "solution of.");
        
        inputNum = in.nextInt();
        
        if (inputNum > 0)
        {
            for (int i = inputNum; i > 0; i--)
            {
                outputNum = outputNum * i;
            }
        }
        else if (inputNum < 0)
        {
            for (int i = inputNum; i < 0; i++)
            {
                outputNum = outputNum * i;
            }
        }
        else
        {
            outputNum = 0;
        }
        
        System.out.println("The solution is: " + outputNum);
    }
    
}
