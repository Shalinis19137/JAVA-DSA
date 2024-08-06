/* 1. Tower Of Hanoi
public class recursion_questions {
    public static void TowerOfHanoi(int n , String src, String helper,String dest)
    { 
            if( n==1)
        {
            System.out.println("Transfer disk"+ n + " from  " +src+ " to "+dest);
            return;

        }
        TowerOfHanoi(n-1, src ,dest,helper);
        System.out.println("Transfer disk"+ n + " from "  +src+ " to "+dest);
           TowerOfHanoi(n-1, helper ,src,dest);
    
        }

    public static void main(String[] args) {
        // Question 1 (Tower of Hanoi)
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
    }
}
*/



//2. Reverse the String
/* 
public class recursion_questions {
    public static void PrintRev(String str,int index)
    { 
         if(index == 0)
        {
         System.out.println(str.charAt(index));
         return;
        }
        System.out.print(str.charAt(index));
        PrintRev(str,index-1);
        
        }

    public static void main(String[] args) {
        // Question 2 (string in reverse)
        String str = "abcd";
        PrintRev(str,str.length()-1);
}
}

*/


// 3. First or last occurence of element a
/* 
public class recursion_questions {
    public static int first = -1 ;
    public static int last = -1 ;

    public static void FindOccurance(String str,int idx,char element)
    { if(idx == str.length())
        { 
            System.out.println(first);
            System.out.println(last);
            return ;
        }
            char currchar = str.charAt(idx);
            if(currchar == element)
            {
                if(first == -1)
                {
                    first = idx;
                }else{
                    last = idx;
                }
            }
            FindOccurance(str, idx+1, element);
        }
        

    public static void main(String[] args) {
        // Question 2 (string in reverse)
        String str = "abaacdaefaah";
FindOccurance(str, 0, 'a');}
}
*/


//4. Check array is sorted or strictly increasing
/* 
public class recursion_questions {
    public static boolean isSorted(int arr[], int idx)
    {
        if(idx == arr.length-1)
        {
            return true;
        }
        if (arr[idx]< arr[idx+1])
        {
            //array is sorted till now
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    } 
    public static void main(String[] args) {
        int arr[] = {1,3,5};
      System.out.println(isSorted(arr, 0));  
}
}
*/


//5. add all x character at the end of the string
/* 
public class recursion_questions {
    public static void moveAllx(String str, int idx, int count,String newString)
    { if(idx == str.length())
        { for(int i=0 ; i<count;i++)
            {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x')
        {
            count++;
            moveAllx(str, idx+1, count, newString);
        }else{
            newString += currchar; // newString = newString + currchar
            moveAllx(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str  =  "axbcxxd";
        moveAllx(str, 0, 0, "");
}
}
*/



//6. Remove duplicates
/* 
public class recursion_questions {
    public static boolean [] map = new boolean[26];
    public static void removeDuplicates(String str, int idx,String newString)
    {     if(idx == str.length())
        {
            System.out.println(newString);
            return;

        }
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'])
        { removeDuplicates(str, idx+1, newString);
   } else
   {
        newString += currchar;
        map[currchar-'a'] = true;
        removeDuplicates(str, idx+1, newString);
   }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");

}
}
*/


//7. Print Subsequences
/* 
public class recursion_questions {
    public static void subsequences(String str, int idx, String newString)
    {  if(idx == str.length())
        {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        // to be
        subsequences(str, idx+1, newString+currchar);
        // or not to be
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
        
}
}
*/


//8.print Unique subsequences of a string

/* 

import java.util.HashSet;

public class recursion_questions {
    public static void subsequences(String str, int idx, String newString,HashSet<Strings>set)
    {  if(idx == str.length())
        {
        if(set.contains(newString))
        {
            return;
        }
        else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
        }
      
        char currchar = str.charAt(idx);
        // to be
        subsequences(str, idx+1, newString+currchar,set);
        // or not to be
        subsequences(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet <Strings> set = new HashSet<>();
        subsequences(str, 0, "",set);
        
}
}
*/


//9. Print Keyped combination
public class recursion_questions {
    public static String[]keypad =  { ".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void PrintComb(String str, int idx, String combination)
    {  if(idx == str.length())
        {
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping  = keypad[currchar -'0'];
        for(int i = 0; i<mapping.length();i++)
        {
            PrintComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        PrintComb(str, 0, "");


       
}
}