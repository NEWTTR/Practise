package Solution;

public class Solution {
	public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int len = nums.length;
        int temp;
        for(int i = 0; i < nums.length; i++){
        	if(val == nums[i]){
        		for(int j = nums.length-1; j > i; j--){
            		if(nums[j] != nums[i]){
            			temp = nums[i];
            			nums[i] = nums[j];
            			nums[j] = temp;
            			break;
            		}
        		}
        	}
        }
        for(int i = 0; i < nums.length; i++){
        	if(val == nums[i]){
        		len -= 1;
        	}
        }
		return len;
    }
}

