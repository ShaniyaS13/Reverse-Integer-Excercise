import java.util.Scanner;
import java.math.*;
public class Solution{
	public int reverse(int n) {
		long rev = 0;
		boolean negative = n < 0;
		if(n < 0) {
			n= n * -1;
		}
		while(n> 0) {
			rev = (rev * 10) + (n % 10);
			n = n / 10;			
		}
		if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
			return 0;
		}
		
		return(int) (negative ? (rev * -1) : rev);
}
	 
	 public static void main(String[] args) {
		 
		 Solution Reversed = new Solution();
		 System.out.println(Reversed.reverse(121));
		 System.out.println(Reversed.reverse(1534236469));
		 System.out.println(Reversed.reverse(-123));
		
	 }
}