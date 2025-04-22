public class palindrome {
    public static void main(String[] args){

        int a = 121;
        int reverse = 0;
        int original = a;
        while (a>0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a /= 10;
        }


        if (original == reverse) {
            System.out.println(" it is Palindrome");
        } else {
            System.out.println(" it is Not Palindrome");
        }
    }
}
 