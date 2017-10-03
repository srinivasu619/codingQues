import java.util.*;
public class lcs{
    public static ArrayList<Integer> longestSubsequence(int[] arr){
         HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }  
      	int startpos=-1,length=0;
		for(int i=0;i<arr.length;i++)
        {
          if(!set.contains(arr[i]-1))
          {
            int inter = 1,currentpos=i;
            int next = arr[i]+1;
            while(set.contains(next))
            {
              next++;
              inter++;
            }
            if(inter > length)
            {
              length=inter;
              startpos=i;
            }
          }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(length == 1)
        {
            list.add(arr[0]);
        }
        // System.out.println(arr[startpos]+" "+length);
        // for(int i=0;i<length;i++)
        // {
        //     System.out.print(arr[startpos]+i+" ");
        // }
        else
        {
            for(int i=0;i<length;i++)
            {
                list.add(arr[startpos]+i);
            }
        }
        return list;
	}
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]  =sc.nextInt();
        }
        ArrayList<Integer> list = longestSubsequence(arr);
        for(Integer i:list)
        {
            System.out.println(i);
        }
    }
}