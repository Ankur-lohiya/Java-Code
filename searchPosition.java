import java.util.*;
import java.io.*;
public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int ret = new Solution().searchInsert(nums, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
//Sorted array is given
class Solution {
    public int searchInsert(int[] nums, int target) {
        int j=0;
        for(j=0;j<nums.length;j++){
            if(nums[j]==target) return j;
            else if(nums[j]>target) return j;
        }
        return j;
    }
}