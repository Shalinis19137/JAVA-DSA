import java.util.*;
public class Bit_manipulation {
    public static void main(String[] args) {

        // Get bit   Operation
        // using And opeation

        /* 
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos ;
        if((bitMask & n) == 0)
        {
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is one");
        }
            */




        // Set Bit Operation
        // Using OR opeartion

        /* 

       int n = 5;
       int pos = 1;
       int bitmask = 1<<pos;
       int newNumber = bitmask | n ;
       System.out.println(newNumber);
       */


       // Clear bit operation
       // Using AND with NOT(bit mask) operation

       /* 
       int n = 5;
       int pos = 2;
       int bitMask = 1<<pos;
       int notbitmask = ~(bitMask);
       int newNumber = notbitmask & n;
       System.out.println(newNumber);
       */

       // Update bit operayion
       // For 0 : AND with NOT operation
       // Foe 1 : OR opeartion
Scanner sc = new Scanner(System.in);
int oper = sc.nextInt();
// oper = 1 : set oper = 0 : clear
    int n = 5;
    int pos = 1;
    int bitMask = 1<<pos ;
   if(oper == 1)
   {
     // set oper
    int newNumber = bitMask | n ;
    System.out.println(newNumber);
  }
  else{
    int newBitMask = ~(bitMask);
    int newNumber = newBitMask & n;
    System.out.println(newNumber);
  }





    }
    
}
