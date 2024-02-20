package interview;

public class Seven {

	
	public static int reverse(int x) {
        int flag=0, ans=0;
        if(x<0){
            x=-x;
            flag=1;
        }
        if(x>Integer.MAX_VALUE){
            return 0;
        }
        while(x>0){
        	if(ans>(Integer.MAX_VALUE-(x%10))/10){
                return 0;
            }
            ans=ans*10;
            ans += x%10;
            x=x/10;
            
        }
        if(flag==1){
            return -ans;
        }
        return ans;
    }
	public static void main(String[] args) {
	 System.out.println(reverse(1534236469));
	 System.out.println(Integer.MAX_VALUE);
	}
}
