public class MaxElement {
    // TC : O(n^2)
    static void approach_1(int arr[], int n) {
        boolean isMax;
        for(int i = 0; i < n; i++) {
            isMax = true;
            for(int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) {
                    isMax = false;
                    break;
                }
            }
            if(isMax) {
                System.out.println("Largest Element : " + arr[i]);
                return;
            }
        }
    }

     static void approach_2() {
         Arrays.sort();
     }

    static void approach_3(int arr[], int n) {
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Element is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = {3,1,5,7,8,13};
        int n = arr.length;
        approach_1(arr, n);
    }
}