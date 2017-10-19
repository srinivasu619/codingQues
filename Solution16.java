public class Solution16{
    public static void make_sieve(int n)
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
                if(arr[i]!=-1)
                    {
                        System.out.print(i+" ");
                    }
            }
    }
    public static void main(String[] args) {
        make_sieve(50);
    }
}