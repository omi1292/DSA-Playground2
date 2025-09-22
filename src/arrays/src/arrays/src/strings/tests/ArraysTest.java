package tests;
import arrays.TwoSum;

public class ArraysTest {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = TwoSum.twoSum(nums, target);
        if (res[0]==0 && res[1]==1) System.out.println("TwoSum Test Passed");
        else System.out.println("TwoSum Test Failed");
    }
}
