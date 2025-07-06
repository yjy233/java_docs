package base;

public class Arry {
    public static void main(String[] args) {

        System.out.println("Hello");
        initA();
        doubleB();

    }

    public  static void initA(){
        int[] nums = new int[3];
        nums[2] = 4;

        System.out.println(nums.length);

        for (int n:nums) {
            System.out.println(n);
        }
    }

    public  static void doubleB(){
        double[] nums = new double[3];
        nums[2] = 4.0;

        System.out.println(nums.length);

        for (double n:nums) {
            System.out.println(n);
        }
    }
}