public class pattern2_hw {
    public static void main(String[] args) {

        //  Butterfly pattern

        /* 
        int n =4;
        for(int i= 1 ; i<=n ; i++)
        {
            for(int j= 1; j<=i ; j++)
            {
                System.out.print("*");
            }
            int space = 2* (n-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
    
        }
        for(int i=n ; i>=1 ; i--)
        {
            for(int j= 1; j<=i ; j++)
            {
                System.out.print("*");
            }
            int space = 2* (n-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            */


            /*   Question 2 
             //REctangle

          int n = 5;
          for(int i=1 ; i<=n ; i++)
          {
            for(int j=1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            
            for(int j=1 ; j<=n ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
          }  
        */
         
        /* Question 3 (Number Pyramid)

        int n = 5;
        for(int i=1 ; i<=n ; i++)
        {
            for(int j= 1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }

      */


      /*  Question 4 (Number pyramid in diff.form)

      int n = 5;
      for(int i=1 ; i<=n; i++)
      {
        for(int j=1; j<=n-i ; j++)
        {
            System.out.print(" ");
        }
        for(int j=i; j>=1; j--)
        {
            System.out.print(j);
        }
        for(int j=2; j<=i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
      }
        */



        /* Question 5 (Diamond)
        int n = 5;
        for(int i=1; i<=n ; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=2*i-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1 ; i--)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=2*i-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            */



            


    }
}
