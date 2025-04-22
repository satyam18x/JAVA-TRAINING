import java.util.*;
public class loop1 {
    public static void main (String[] args){
        Scanner st = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=st.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
               System.out.println();
              
        }
    }
}
 
