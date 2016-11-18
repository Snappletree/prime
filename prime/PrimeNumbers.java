
/**
 * Write a description of class PrimeNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PrimeNumbers
{
    public static void main(String[] args) {   
        Scanner reader = new Scanner(System.in);
        int n;
        System.out.println("Please enter a number (Zero Quits)");
        n = reader.nextInt();
        
        
        
        
        while (n !=0){ 
        if (n%2==0) //System.out.println("This number isnt prime")
        {
            System.out.println("This number isnt prime");
            for(int i=3;i*i<=n;i+=2) 
            {
                if(n%i==0)
                {
                    System.out.println("This number isnt prime");
                }
            }
        }

        else
        { 
                System.out.println("This number is prime");
                
            }
            System.out.println("Enter a number (Zero Quits)");
                n = reader.nextInt();
        }
       }
     }
