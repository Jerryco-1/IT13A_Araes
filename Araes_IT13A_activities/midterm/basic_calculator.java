

package midterm;

import java.util.Scanner;


public class basic_calculator {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter first number: ");
        double x = scanner.nextDouble();
      
        System.out.print("Enter first number: ");
        char y = scanner.next(). charAt(0);
        
        System.out.print("Enter first number: ");
        double z = scanner.nextDouble();
        
        double result = 0;
        boolean valid = true;
        
        if (y == '+') result = x + z;
        else if (y == '-')result = x - z;
        else if (y == '*')result = x * z;
        else if (y == '/') {
              
        if (z !=0) result = (x / z);
               else{System.out.println("Cannotdivide by zero!"); valid = false; }
    }
        else if (y == '%') result = (x * z) / 100;
        
                else {System.out.println("invalid operator!"); valid = false; }
        
        if (valid)System.out.println("Result: " + result);
        
        scanner.close();
        
    }
    }
        
        
        
        
        
        
        
    
    
