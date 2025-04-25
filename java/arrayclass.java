public class arrayclass {
          
    void min(int a[]) {
        int min=a[0];
        for(int i=0;i<a.length;i++) {
            if(a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("Minimum value is: " + min);
    }

    public static void main (String[] args) {
         
        int a[] = {5,6,7,4,5};
        arrayclass obj = new arrayclass();
        obj.min(a);

        
        }
    }

