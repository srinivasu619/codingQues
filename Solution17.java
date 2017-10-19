import java.util.Scanner;

public class Solution17{
    public static int[] solver()
    {
        int arr[] =new int[1000001];
        for(int i=2;i<=1000;i++)
            {
                int mul=1,cube=(i*i*i);
                while(mul*cube<=100)
                    {
                        arr[mul*cube] = -1;
                        mul++;
                    }
            }
        int k = 2;
        for(int i=2;i<arr.length;i++)
            {
                if(arr[i] != -1)
                    {
                        arr[i]=k;
                        k++;
                    }
            }
        return arr;
    }
    public static void main(String[] args) {
       int arr[] = solver();
       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       for(int t = 0;t < test;t++)
        {
            int num = sc.nextInt();
            if(num == 1)
                System.out.println("Case "+ (t+1) +": 1");
            else if(arr[num] == -1)
                System.out.println("Case "+ (t+1) +": Not Cube Free");
            else
                System.out.println("Case "+ (t+1) +": "+arr[num]);
        }
    }
}