public class linearsearch {

    public static void sort(int key,int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
    public static void main(String[] args) {
        int[] a = { 22, 34, 12, 3, 56, 87, 2, 3 };
        int key =3;
        sort(key,a);
    
        }
    }

