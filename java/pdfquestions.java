public class pdfquestions {
    public static void natural(int n) {
        for (int i = 1; i <= n; i++) {
            
        
        System.out.println(i);}
    }

    public static void even(int k) {
{
            if (k % 2 == 0) {
                System.out.println("even number");
            }
            else{
                System.out.println("odd number");
            }
        }
    }

    public static void sumnatural(int s) {
        int sum = 0;
        for (int i = 1; i <= s; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + s + " natural numbers is: " + sum);
    }

    public static void sumdigits(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }

    public static void  swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }

    public static void main(String[] args){
        int n = 10;
        natural(n);
      int k = 8;
        even(k);
        int s = 5;
        sumnatural(s);
        int a = 1234;
        sumdigits(a);
        int x = 5, y = 10;
        swap(x, y);

    }
}
