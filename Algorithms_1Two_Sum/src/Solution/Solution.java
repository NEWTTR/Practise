package Solution;

public class Solution {
    public int[] twoSum(int[] nums, int target){
  	  int[] result = new int[2];
  	  for(int i = 0; i < nums.length; i++){
  		  int first = nums[i];
  		  for(int j = i+1; j < nums.length; j++){
  			  int second = nums[j];
  			  if(second == target - first){
  				  result[0] = i;
  				  result[1] = j;
  			  }
  		  }
  	  }
  	  return result; 	  
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {2,7,11,15};
		int[] result = s.twoSum(nums, 9);
		System.out.println("[" + result[0] +"," + result[1] + "]");
	}
}
