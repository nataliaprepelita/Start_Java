package L5_Classes;

public class MinMax {
    public static void main(String[] args) {

        int [] nums = {99, -9, 198899, 979, -990, 2, 27, 14, 0, 3 };
        int min, max;


        min = max = nums[0];

        for (int x : nums){
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
}
