
// public class Traping_Rain_Water {
//     public static void main(String[] args) {
//         int[] nums = {4, 2, 0, 3, 2, 5};
//         int n = nums.length;
//         int l = 0, r = n - 1;
//         int leftmax = 0, rightmax = 0;
//         int trap = 0;
//         while (l < r) {
//             if (nums[l] <= nums[r]) {
//                 if (leftmax <= nums[l]) {
//                     leftmax = nums[l];
//                 } else {
//                     trap += leftmax - nums[l];
//                 }
//                 l++;
//             } else {
//                 if (rightmax <= nums[r]) {
//                     rightmax = nums[r];
//                 } else {
//                     trap += rightmax - nums[r];
//                 }
//                 r--;
//             }
//         }
//         System.out.println(trap);
//     }
// }
public class Traping_Rain_Water {

    public static void main(String[] args) {
        int[] nums = {4, 2, 0, 3, 2, 5};
        int n = nums.length;
        int l = 0, r = n - 1;
        int leftmax = 0, rightmax = n - 1;
        int trapwater = 0;
        while (l < r) {
            if (nums[l] <= nums[r]) {
                if (leftmax < nums[l]) {
                    leftmax = nums[l];
                } else {
                    trapwater += leftmax - nums[l];
                }
                l++;
            } else {
                if (rightmax < nums[r]) {
                    rightmax = nums[r];
                } else {
                    trapwater += rightmax - nums[r];
                }
                r--;
            }
        }
        System.out.println(trapwater);
    }
}
