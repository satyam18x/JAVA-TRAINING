import java.util.Scanner;

public class test2 {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a number : ");
       int val= sc.nextInt();

        if(val==0){
        System.out.println("zero");
       }
       else if (val>0){
        System.out.println("positive");

       }
       else {
        System.out.println("negative");
       }
    }
    
}
