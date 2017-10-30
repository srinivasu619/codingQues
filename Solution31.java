import java.util.*;
public class Solution31 {

	public static long good_sets(int arr[])
    {
      //HashMap<Integer,Integer> map = new HashMap<>();
      int max = arr[arr.length-1];
      int map[] = new int[max+1];
      for(int i=0;i<arr.length;i++)
      {
        //map.put(arr[i],1);
        map[arr[i]] = 1;
      }
      for(int i=0;i<arr.length;i++)
      {
        int val = map[arr[i]];
        //map.get(arr[i]);
        int k=2;
        while(arr[i] * k <= max)
        {
          Integer new_val = map[arr[i]*k];
          if(new_val != null)
          {
            //map.put(arr[i]*k,new_val+val);
            map[arr[i]*k] = new_val+val;
          }
          k++;
        }
      }
      long sum =0;
      for(int i=0;i<arr.length;i++)
      {
        sum=(sum%1000000007+map[arr[i]]%1000000007)%1000000007;
      }
      return sum;
    }
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
      	int test = sc.nextInt();
      	for(int t=0;t<test;t++)
        {
          int n = sc.nextInt();
          int arr [] =new int[n];
          for(int i=0;i<n;i++)
          {
            arr[i] = sc.nextInt();
          }
          Arrays.sort(arr);
          System.out.println(good_sets(arr));
        }
	}

}