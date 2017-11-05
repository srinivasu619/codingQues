
public class Solution34 {
	
		
public static long staircase(int n){
		if(n==1)
          return 1;
  		if(n==2)
          return 2;
  		if(n==3)
          return 4;
  		long output[] = new long[n+1];
  		output[1] =1;output[2] =2;output[3] =4;
  		for(int i=4;i<=n;i++)
        {
          output[i] =  output[i-1]+output[i-2]+output[i-3];
        }
  		return output[n];
	}
	
}
