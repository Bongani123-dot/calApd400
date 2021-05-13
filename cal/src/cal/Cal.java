
package cal;

import java.util.Scanner;


public class Cal {

  
    public static void main(String[] args) {
        
       Scanner cal = new Scanner(System.in);
        System.out.println("Please Enter Your First Number");
        int firstNumber = cal.nextInt();
        System.out.println("Please Enter Your Second Number");
        int secondNumber =cal.nextInt();
        
        System.out.println("Please Enter Your Second Number"+" "+(firstNumber+secondNumber));
        System.out.println("Please Enter Your Second Number"+" "+(firstNumber-secondNumber));
        System.out.println("Please Enter Your Second Number"+" "+(firstNumber*secondNumber));
        System.out.println("Please Enter Your Second Number"+" "+(firstNumber/secondNumber)); 
    }
    
}
