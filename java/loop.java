import java.util.*;
public class loop {
    public static void main (String[] args){
        Scanner st = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=st.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
