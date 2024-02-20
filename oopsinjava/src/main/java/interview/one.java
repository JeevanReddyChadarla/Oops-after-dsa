package interview;

import java.util.HashMap;

public class one {
	public static int search(int[] nums, int target) {
        int start=0, end=nums.length-1, mid=0;
        HashMap<Integer, Integer>map = new HashMap();
        map.put(1, map.getOrDefault(1, 9)+1);
        System.out.println(map.get(3));
        while(start<=end){
            mid=(end+start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
			
	public static void main(String[] args) {
		int arr[] = {2,5};
		int x = 5;
		System.out.println(search(arr, x));
	}

}
