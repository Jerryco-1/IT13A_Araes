

package midterm;

public class basic_calculator {

    public static int Addition(int a, int b) {
        return a + b;
    }

    public static int Subraction(int a, int b) {
        return a - b;
    }

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        return a / b;
    }

    public static float Module(float a, float b ) {
        return (float) a/ b*100;

    }

    public static void main(String[] args) {
        int result = Addition(3, 10);
        System.out.println("Sum: " + result);

        int result2 = Subraction(8, 10);
        System.out.println("Difference: " + result2);

        int result3 = Multiplication(2, 10);
        System.out.println("Product: " + result3);

        int result4 = Division(10, 10);
        System.out.println("Quotient: " + result4);

        float result5 = Module (90, 60);
        System.out.println("Mod: " + result5);
    }
}
   
        
        
        
        
    
    
