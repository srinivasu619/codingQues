import java.util.Arrays;
import java.util.Scanner;
public class Solution15{
    public static int solver(int arr[],int k)
    {
        Arrays.sort(arr);
        int min = 0,max = arr[arr.length-1]-arr[0],mid=-1,minDist=0,cow=0;
        while(min<=max)
            {
                mid = ((int)((long)min+max))/2;
               //System.out.println("mid :"+mid);
                cow=1;
                boolean possible=false;
                int prev=arr[0];
                for(int i=1;i<arr.length;i++)
                    {
                        if(cow == k)
                            {
                                possible=true;
                                break;
                            }
                        int val = arr[i]-prev;
                        if(val >= mid)
                            {
                               // System.out.println("elem "+arr[i]);
                                prev=arr[i];
                                cow++;
                            }
                    }
                if(possible||cow == k)
                    {
                        min=mid+1;
                        minDist = mid;
                    }
                else
                    {
                        max=mid-1;
                    }
              // System.out.println("min: "+min+" max: "+max);
            }
        return minDist;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
       for(int t=0;t<test;t++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                {
                    arr[i] = sc.nextInt();
                }
            System.out.println(solver(arr,k));
        }
    }
}