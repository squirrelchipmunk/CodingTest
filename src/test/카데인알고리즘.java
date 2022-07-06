package test;

public class 카데인알고리즘 {

	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int subSum = nums[0];
		int maxSum = subSum; 
		
	
		for(int i=1; i<nums.length; i++) {
			subSum =  Math.max(nums[i]+subSum, nums[i]);
			if (maxSum < subSum) 
				maxSum = subSum;
		}
	
		
		System.out.println(maxSum);
	}
}
