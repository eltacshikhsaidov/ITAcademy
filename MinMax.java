public class MaxMin {

    public static void main(String[] args) {
        int arr[] = {2,2,3,4,5,6,7,8};
        int max = arr[0], min = arr[0];

        for (int anArr : arr) {
            max = Math.max(max, anArr);
            min = Math.min(min, anArr);
        }

        System.out.println(max*min);
    }

}