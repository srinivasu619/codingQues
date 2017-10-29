import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution30{
    public static int[] lpd(int n)
    {
      int arr[] = new int[n+1];
      for(int i=2;i<=Math.floor(Math.sqrt(n));i++)
        {
            //System.out.println(i);
            if(arr[i] == 0)
                {
                    int k=2;
                    while(k*i<=n)
                        {
                            if(arr[k*i] == 0)
                                {
                                    arr[k*i]=i;
                                }
                            k++;
                        }
                }
        }
        // for(int i=2;i<arr.length;i++)
        //     {
        //         System.out.println(i+" "+arr[i]);
        //     }
      return arr;
    }
    public static void display_arr(int n)
    {
        int lpd_arr[] = lpd(n);
        boolean status [] =new boolean[n+1];
        for(int i=n;i>1;i--)
            {
             //   System.out.println(i+" "+status[i]);
                if(status[i] == false)
                    {
                        int x = lpd_arr[i]; // lowest prime factor
                        if(x == 0)
                            {
                                System.out.print(i+" ");
                                continue;
                            }
                        //System.out.println("i "+ i);
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(i);
                        int start = i;
                        status[i] = true;
                        boolean flag= true;
                        while(flag)
                            {
                                int current = i;
                                //System.out.println("x : "+x);
                                while(current - x >= x)
                                    {

                                        if(!status[current-x])
                                            {
                                                list.add(current-x);
                                            }
                                         current-=x;
                                         status[current] = true;
                                    }
                                while(start%x==0)
                                    {
                                        if(start == x)
                                            {
                                                flag=false;
                                                break;
                                            }
                                        start = start / x;
                                    }
                                x = start;
                            }
                        Collections.sort(list, Collections.reverseOrder());
                        for(Integer val:list)
                            {
                              System.out.print(val+" ");
                            }
                        System.out.println();
                    }
            }
        System.out.print(1);
    }
	public static void main(String[] args) {
		// Write your code here
		Scanner sc= new Scanner(System.in);
      	int n = sc.nextInt();
        display_arr(n);
	}
}