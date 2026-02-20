

public class sorting {

    public static boolean sorted(int arr[], int idx) {

        if(idx == arr.length - 1) {
            return true;
        }

        if(arr[idx] >= arr[idx+1]) {
            return false;
        }
        return sorted(arr, idx+1);
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 3, 4, 5, 12, 90};
        System.out.println(sorted(arr, 0));
        
    }
}