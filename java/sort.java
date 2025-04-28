public class sort {

      public static  void bubblesort(int[] a){

        for(int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1])
                {
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;

                }
            }
        }

       
       for (int i : a)// for(int i=0;i<a.length;i++)
       {
              System.out.println(i); //System.out.println(a[i]);
       }                              
       

    }
    public static void main(String[] args){
        int[] a={22,34,12,3,56,87,2,3};
        bubblesort(a);
    }
}
