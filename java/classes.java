public class classes {
    void sum(int a) {
        int sum=0;
        while(a!=0) {
            int digit=a%10;
            sum=sum+digit;
            a=a/10;
        }

        
        System.out.println("Sum of the digits is: " + sum);
    }
    public static void main(String[]args)
    {
        classes obj=new classes();
        obj.sum(123);
        
    }
    
}
