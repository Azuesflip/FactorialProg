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
        int outputNum;
        Scanner in = new Scanner(System.in);
        Boolean run = true;
        String go = "y";
        
        
        while (run)
        {
            outputNum = 1;
            while (true)
            {
                System.out.println("Enter a real number you wish to get the factorial "
                        + "solution of.");
            
                inputNum = in.nextInt();
        
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
            System.out.print("The solution is: " + outputNum + "\n");
        
            System.out.println("Would you like to do another? Enter y or n");
            
            go = in.next();
            go = go.toLowerCase();
            run = "y".equals(go);
        }
    }
    
}
