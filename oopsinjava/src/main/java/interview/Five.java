package interview;

public class Five {
	
	public static boolean isPalindrome(String s) {
		 s = s.replaceAll("([^a-zA-Z])+", " ");
	        s = s.replaceAll("\\s", "").toLowerCase();
	        int start=0, end=s.length()-1;
	        while(start<=end){
	            if(s.charAt(start)==s.charAt(end)){
	                start++;
	                end--;
	            }
	            else{
	                return false;
	            }
	        }
	        System.out.println(s);
	        return true;
    }

	public static void main(String[] args) {
		String s = "0P";
		System.out.println(isPalindrome(s));
//		isPalindrome(s);
	}

}
