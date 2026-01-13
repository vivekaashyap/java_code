
public class All_Sort {

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // BubbleSort(arr);
        SelectionSort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void SelectionSort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (num[minpos] > num[j]) {
                    minpos = j;
                }
            }
            int temp = num[minpos];
            num[minpos] = num[i];
            num[i] = temp;
        }
    }

    public static void BubbleSort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swaped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
    }
}
