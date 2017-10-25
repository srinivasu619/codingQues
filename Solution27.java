class Solution27{
	public static void product_without_self(int[] arr, int size, long[] result) {
		//write your code here
      long prod =1;
      for(int i=0;i<size;i++)
      {
        prod *= arr[i];
      }
      for(int i=0;i<size;i++)
      {
        result[i] =  prod/arr[i];
      }
	}
}