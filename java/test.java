import java.util.Scanner;

public class test{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int val = sc.nextInt();

        if(val%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }


        }
}
