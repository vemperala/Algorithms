package twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public int[] getIndices(int[] nums, int target){
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)){
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("no two argument");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum ts = new TwoSum();
		int[] result = ts.getIndices(new int[] {3,2,4}, 8);
		
		for(int j: result){
			System.out.println(j);
		}
	}

}
