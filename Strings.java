import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String defination


        /* 
     Scanner sc = new Scanner(System.in);
     String name = sc.nextLine();
     System.out.println("Your name is :"+ name);
     */

    //   Functions in string


    // 1. Concatination
    /* 
     String firstName = "Shalini";
     String lastName = "Kumari";
     String fullName = firstName + " " +lastName;
     System.out.println(fullName);
     */



     //2. Length
     /* 
     String firstName = "Shalini";
     String lastName = "Kumari";
     String fullName = firstName + " " +lastName;
     System.out.println(fullName.length());
     */


    //   3.charAt
    /* 
    String firstName = "Shalini";
     String lastName = "Kumari";
     String fullName = firstName + " " +lastName;
     System.out.println(fullName.length());

    for(int i =0; i<fullName.length() ; i++)
    {
        System.out.println(fullName.charAt(i));
    }
        */

    // 4. Compare the Strings


    /* 
     String name1 = "Mohit";
     String name2 = "Shalini";
    //  case1 s1>s2 : return : +ve valye
    // case2 s1=s2 : return : 0
    // csae3 s1<s2 : return : -ve value
     if(name1.compareTo(name2) == 0 )
     {
          System.out.println("strings are equal");
     }else{
        System.out.println("strings are not equal");
     }
        */


        

    //  5. Sub Strings

    /* 
 String sentence = "My name is Shalini";
 String name = sentence.substring(11,sentence.length());
System.out.println(name);
*/

String sentence = "ShaliniKumari";
 String name = sentence.substring(0,7);
System.out.println(name);
    }
    
}
