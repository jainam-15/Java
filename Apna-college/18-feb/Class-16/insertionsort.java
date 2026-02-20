
public class insertionsort {

    public static void printarr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {7, 2, 3, 11, 8, 1};

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current; 
        }
        printarr(arr);
    }
}
