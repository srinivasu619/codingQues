public class Solution28{
    public static int[] sieve()
    {
       int arr[] = new int[1000],count=0;
        for(int i=2;i<Math.floor(Math.sqrt(1000));i++)
            {
                if(arr[i]!=-1)
                    {
                        int k=2;
                        while(k*i<1000)
                            {
                                arr[k*i]=-1;
                                k++;
                            }
                  		count++;
                    }
            }
      	int new_arr [] = new int[count];
      	int k=0;
      	for(int i=2;i<=1000;i++)
        {
          if(arr[i] != -1)
          {
            new_arr[k] = arr[i];
            k++;
          }
        }
      	return new_arr;
    }
	public static int greatesCommonPrimeDivisor(int a, int b) {
		//write your code here
      	int arr [] = sieve();
      	int common = -1;
      	int min = (int)Math.floor(Math.sqrt(Math.min(a,b)));
      	for(int i=0;i<arr.length;i++)
        {
          if(arr[i] <= min)
          {
            if(a%arr[i] == 0 && b%arr[i] == 0 )
              common = arr[i];
          }
        }
		return common;                             
	}
    public static void main(String[] args) {
        greatesCommonPrimeDivisor(12,18);
    }
}