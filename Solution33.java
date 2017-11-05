import java.util.Scanner;
public class Solution33{
    //n^2 Solution
    public static int longest_inc_subs(int arr[])
    {
        int prefix_arr [] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
            {
                prefix_arr[i] = 1;
                for(int j=i-1;j>=0;j--)
                    {
                        if(arr[i] > arr[j])
                            {
                                if(prefix_arr[j]+1 > prefix_arr[i])
                                    {
                                        prefix_arr[i] = prefix_arr[j] + 1;
                                    }
                            }
                    }
            }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<prefix_arr.length;i++)
            {
                if(prefix_arr[i] > max)
                    {
                        max=  prefix_arr[i];
                    }
            }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            } 
        System.out.println(longest_inc_subs(arr));
    }
}