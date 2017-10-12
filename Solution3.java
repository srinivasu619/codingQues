import java.util.Stack;
import java.util.Scanner;
public class Solution3{
    public static int[] stockspan(int arr[])
    {
        int span[] =new int[arr.length];
        Stack<Integer> index= new Stack<>();
        index.push(0);
        span[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            int h=0;
            while(!index.isEmpty())
            {
                if(arr[i] > arr[index.peek()])
                {
                    index.pop();
                }
                else
                {
                    h=i-index.peek();
                    break;
                }
            }
            if(index.isEmpty())
                span[i] = i+1;
            else
                span[i] = h;
            index.push(i);
        }
        return span;
    }
    public static void print_arr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // int arr [] = {60,70,80,100,90,75,80,120};
        // print_arr(stockspan(arr));
        System.out.println();
        int arr2[]= {92,60,29,118,124,32,91,58,7,63,125,177,156,51,60,15,65,194,119,154};
        print_arr(arr2);
        System.out.println();
        print_arr(stockspan(arr2));
        //1 1 1 4 5 1 2 1 1 3 11 12 1 1 2 1 4 18 1 2 
    }
}