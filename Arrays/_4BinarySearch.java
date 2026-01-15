
public class _4BinarySearch {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int target = 2;
        int st = 0, ed = num.length - 1;
        int index = -1;
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if (num[mid] == target) {
                index = mid;
                break;
            } else if (num[mid] > target) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        System.out.println(index);
    }
}
