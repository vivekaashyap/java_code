
public class LinearSearch {

    public static void main(String[] args) {
        int[] num = {2, 4, 56, 8, 6, 4, 7, 9};
        int target = 4;
        int t = LinearSearch(num, target);
        System.out.print(t);
    }

    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
