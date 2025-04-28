public class binarysearch {

    public static int sort(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        
       for(int i=0;i<arr.length-1;i++){
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        System.out.println("Element not found in the array.");
        return -1;
       }
       
    
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        sort(target, arr);
        
        }

    }
    

