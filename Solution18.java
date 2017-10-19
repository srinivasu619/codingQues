import java.util.Scanner;
public class Solution18{
    public static int[] make_sieve(int n)
    {
        int arr[] = new int[n+1];
        for(int i=2;i<=Math.floor(Math.sqrt(n));i++)
            {
                if(arr[i]!=-1)
                    {
                        int k=2;
                        while(k*i<=n)
                            {
                                arr[k*i]=-1;
                                k++;
                            }
                    }
            }
        for(int i=2;i<=n;i++)
            {
                if(arr[i] == 0)
                    {
                        int k=2;
                        while(k*i<=n)
                            {
                                if(arr[k*i] == -1)
                                    arr[k*i]=1;
                                else
                                    arr[k*i]++;
                                k++;
                            }
                        arr[i] = 1;
                    }
            }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = make_sieve(1000000);
        int test = sc.nextInt();
        for(int t=0;t<test;t++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int k = sc.nextInt();
                int count = 0;
                for(int i=a;i<=b;i++)
                    {
                        if(arr[i] == k)
                            count++;
                    }
                System.out.println(count);
                // for(int i=0;i<arr.length;i++)
                //     {
                //         System.out.println("i: "+i+" arr[i]: "+arr[i]);
                //     }
            }
    }
}
