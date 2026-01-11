
public class Color_Sort {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int st = 0, ed = nums.length - 1, index = 0;
        while (st < ed) {
            if (nums[st] == 0) {
                int temp = nums[st];
                nums[st] = nums[index];
                nums[index] = temp;
                st++;
                index++;
            } else if (nums[st] == 2) {
                int temp = nums[ed];
                nums[ed] = nums[index];
                nums[index] = temp;
                index++;
                ed--;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
