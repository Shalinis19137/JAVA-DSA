import java.util.*;
public class  functions_methods{

    /* 
    public static int CalculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = CalculateSum(x, y);   // call our function
         System.out.println(sum);     
         */
        

/* 
        public static int CalculateMultiply(int a, int b){
        int product = a*b;
        return product;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
    
        int product = CalculateMultiply(x, y);   // call our function
        System.out.println(product); 
        
        */

        public static void PrintFactorial(int n){
            int factorial = 1;
            for(int i = n; i>=1; i--)
            {
             factorial = factorial*i;
            }

            System.out.println(factorial);
            return;
            
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                PrintFactorial(n);
                
        
            
        
             
         
        
    }
} 