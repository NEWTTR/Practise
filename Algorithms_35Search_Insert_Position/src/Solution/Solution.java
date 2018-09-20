package Solution;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		if(target <= nums[0]){
			return 0;
		}
		if(target > nums[nums.length-1]){
			return nums.length;
		}
		int left = 0;
		int right = nums.length - 1;
		while(left <= right){
			int mid = (right - left)/2 + left;
			if(nums[mid] == target){
				return mid;
			}
			else if(nums[mid] > target){
				right = mid - 1;
			}
			else
				left = mid + 1;
		}
		return left;
		/*if(target < nums[0]){
    		return 0;
    	}
		if(target > nums[nums.length-1]){
			return nums.length;
		}
		if(target == nums[nums.length-1]){
			return nums.length-1;
		}
        for(int i = 0; i < nums.length-1; i++){
        	if(target == nums[i]){
        		return i;
        	}
        	if((target > nums[i]) && (target < nums[i+1])){
        		return i+1;
        	}
        }
		return target;*/
    }
}
