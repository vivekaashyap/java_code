
public class _6LinearSearch {

    public static void main(String[] args) {
        int[] num = {2, 4, 56, 8, 6, 4, 7, 9};
        int target = 4;

        int index = linearSearch(num, target);
        System.out.println(index);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
