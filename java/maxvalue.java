public class maxvalue {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] max = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr2[i]) {
                max[i] = arr[i];
            } else {
                max[i] = arr2[i];
            }
            System.out.println("Maximum value at index " + i + " is: " + max[i]);
    }
    }
}
