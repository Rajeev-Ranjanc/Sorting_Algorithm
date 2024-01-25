import java.util.Arrays;

//whenever there is no 1 to N always go for cyclic sort
//amazon google asks vary frequently
public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,6};
        applycyclicsort(nums);
        System.out.println ( Arrays.toString ( nums ) );
    }

    private static void applycyclicsort(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums , i , correctIndex);
            }
            else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }

}

//Missing number -> because there is no from 1 to N
