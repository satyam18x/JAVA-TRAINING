import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
         /*Scanner sc= new Scanner (System.in);
         System.out.println("Ente the number of elements in an array :");
         int n=sc.nextInt();
         int[] arr= new int[n];
         System.out.println("enter "+n+" elements ");
         for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
         }
         System.out.println("array elements are ");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");
         }

         Scanner sc= new Scanner (System.in);
         System.out.print("enter a number : ");
         int n= sc.nextInt();
         if(n<=1){
            System.out.println("number is not prime");
            
         }
         else {
            for (int i=2;i<n/2;i++){
                if(n%i==0){
                System.out.println("numberr is not prime ");
                return;
            }
               
            }
 
            System.out.println("number is prime");
         }
        
        Scanner sc=new Scanner (System.in);
        System.out.println("enterr a character : ");
        char ch= sc.next().charAt(0);
        if((ch=='a' || ch == 'A') ||ch=='e'|| ch=='i'|| ch=='o' || ch=='u')
        System.out.println("vowel");
        else
        System.out.println("consonant");
        */
        Scanner sc= new Scanner (System.in);
        System.out.print("enter the number : ");
        int n= sc.nextInt();
        long fact=1;
        for (int i=1;i<n;i++){
            fact*=i;
          
        }
        System.out.println(fact);
        





         
    }
}
