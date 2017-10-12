import java.util.HashMap;

public class Solution2{
    public static int evenCount(int[] arr, int n) {
		HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<n;i++)
      {
        if(map.get(arr[i])==null)
        {
          map.put(arr[i],1);
        }
        else
        {
          map.put(arr[i],map.get(arr[i])+1);
        }
      }
      int num=-1,count=0;
      for(int i=0;i<arr.length;i++)
      {
        int c = map.get(arr[i]);
        if( c%2 == 0 && c > count)
        {
          num=arr[i];
          count = c;
        }
      }
      return num;
	}
    public static void main(String[] args) {
        int arr[] ={2,5,3,5,3,4};
        System.out.println(evenCount(arr,6));
    }
}