import java.util.Scanner;

public class Solution32 {

	public static int give_no(String number)
    {
      int output [] = new int[number.length()+1];
      output[0] = 1;
      output[1] = 1;
      for(int i=2;i<=number.length();i++)
      {
        if((number.charAt(i-1)-'0') > 0)
          output[i] = output[i-1]%1000000007;
        else
          output[i] = 0;
        int num = (number.charAt(i-2)-'0')*10+(number.charAt(i-1)-'0');
        if(num>=10 && num<= 26)
        {
          output[i] = (output[i]%1000000007+output[i-2]%1000000007)%1000000007;
        }
      }
      return output[number.length()];
    }
	public static void main(String[] args) {
		// Write your code here
		Scanner sc =  new Scanner(System.in);
      	String input = sc.next();
      	while(!input.equals("0"))
        {
      		System.out.println(give_no(input));
          	input = sc.next();
        }
	}

}