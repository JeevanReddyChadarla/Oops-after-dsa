package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Six {
	
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        int j=0, end=nums.length-1, sum=0, end2=0,x=0;
        for(int i=0;i<=end;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int arr[] = new int[set.size()];
        for(int p : set){
            arr[x]=p;
            x++;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
         if(arr[0]>0){
            return list;
        }
        end2=arr.length-1;
        while(j<=end2){
            sum = arr[j]+arr[end2];
            for(int i=j+1;i<end2;i++){
                if(arr[i]+sum==0){
                    list.add(Arrays.asList(arr[j],arr[i], arr[end2]));
                    break;
                }
            }
            j++;
            end2--;
        }
        System.out.println(list);
      return list;
    }

	public static void main(String[] args) {
		int arr[]= {-1,0,1,2,-1,-4};
		threeSum(arr);
	}

}
