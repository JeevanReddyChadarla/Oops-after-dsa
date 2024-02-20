package interview;

import java.util.Arrays;

public class Two {

	public static int[] testChanges(String s, int arr[]) {
		int ans[] = new int[arr.length];
		int length = arr.length;
		String p = s+s;
		int n = p.length();
		int x = s.length();
		System.out.println(p);
		for(int i=0;i<length;i++) {
			char ch = p.charAt(arr[i]);
			for(int j=arr[i]+1;j<n;j++) {
				ans[i]=-1;
				if(p.charAt(j)==ch && j%x!=j) {
					ans[i]=j%x;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(ans));
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "raja";
		int arr[]= {1,2,3}; // {3,-1,1}
		testChanges(s, arr);
	}

}
