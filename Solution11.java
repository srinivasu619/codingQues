import java.util.Scanner;
public class Solution11{
    public static int solver(int n,int k,int arr[])
    {
        int min=0,max=Integer.MIN_VALUE,mid=0,maxCandies=0;
        for(int i=0;i<n;i++)
            {
                if(max < arr[i])
                    {
                        max=arr[i];
                    }
            }
        while(min<=max)
            {
                mid = ((int)((long)min+max))/2;
                //System.out.println("mid "+mid);
                int k1=0;
                boolean possible = false;
                for(int i=0;i<n;i++)
                    {
                        k1+=(arr[i]/mid);
                    }
                //System.out.println("k1 "+mid);
                if(k1 >= k)
                    {
                        min=mid+1;
                        maxCandies=mid;
                    }
                else
                    {
                        max=mid-1;
                    }
            }
        return maxCandies;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0;t<test;t++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr [] =new int[n];
            for(int i=0;i<n;i++)
                {
                    arr[i] = sc.nextInt();
                }
            System.out.println("candies: "+solver(n,k,arr));
        }
    }
}