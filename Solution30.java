import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution30 {
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
                    arr[i] = i;
                }
        }
        for(int i=2;i<arr.length;i++)
            {
                if(arr[i] == 0)
                    {
                        arr[i] = i;
                    }
            }
      return arr;
    }
    public static void display_arr(int n)
    {
        int lpd_arr[] = lpd(n);
        boolean status [] =new boolean[n+1];
        for(int i=n;i>1;i--)
            {
             //   System.out.println(i+" "+status[i]);
                //System.out.println("i : "+i);
                if(status[i] == false)
                    {
                        int x = lpd_arr[i]; // lowest prime factor
                        //System.out.println("x lpd: "+x);
                        if(x == i)
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
                               // System.out.println("Start");
                               System.out.println("x: "+x+" start: "+start);
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
                                    if(start == x)
                                        {
                                            break;
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
                                x = lpd_arr[start];
                                // System.out.println("end");
                            }
                        Collections.sort(list, Collections.reverseOrder());
                        for(Integer val:list)
                            {
                              System.out.print(val+" ");
                            }
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