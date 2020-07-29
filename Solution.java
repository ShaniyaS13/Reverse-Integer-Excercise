import java.util.Scanner;
import java.math.*;
public class Solution {
	public int reverse(int x) {
		boolean negative = x < 0;
		if(x < 0) {
			x *= -1;
		}
		long reversed = 0;
		while(x > 0) {
			reversed = (reversed * 10) + (x %10);
			x /= 10;
		}
		if(reversed > Integer.MAX_VALUE) {
			return 0;
		}
		return (int) (negative ? (reversed * -1): reversed);
		
	}
	 
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int x = input.nextInt();
		 Solution Reversed = new Solution();
		 System.out.println(Reversed.reverse(x));
		
	 }
}