import java.util.Arrays;
import java.util.Scanner;

// Solution with methods

public class MaxMin {

    private static int max(int arr[]){
        int max = arr[0];
        for (int anArr : arr)
            if (anArr > max) max = anArr;
        return max;
    }

    private static int min(int arr[]){
        int min = arr[0];
        for (int anArr : arr)
            if (anArr < min) min = anArr;
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr_length = scanner.nextInt();
        int arr[] = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(max(arr) * min(arr));


    }

}
