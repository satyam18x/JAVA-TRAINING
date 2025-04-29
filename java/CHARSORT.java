
public class CHARSORT {
    public static void main(String[] args) {
        int j;
        String[] str = {"B", "A", "C"};   
        for(int i=0;i<str.length-1;i++){
            for (j=0;j<str.length-i-1;j++){
                if(str[j].compareTo(str[j+1])>0)
                {
                   String  temp=str[j];
                   str[j]=str[j+1];
                   str[j+1]=temp;

                }
            }
        }

       
       for (int i=0;i<str.length;i++)// for(int i=0;i<a.length;i++)
       {
              System.out.println(str[i]); //System.out.println(a[i]);
       }               
       
    }
}