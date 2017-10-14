public class Solution9{
    public static  void print_subset_k(int arr[],int start,int end,int sum,int k,String output)
    {
        if(sum == k)
        {
            System.out.println(output);
            return;
        }
        if(start > end)
        {
            if(sum == k)
            {
                System.out.println(output);
            }
            return;
        }
        if(start == end)
        {
            if(arr[start]+sum == k)
            {
                System.out.println(output+" "+arr[start]);
            }
            return;
        }
        for(int i=start;i<=end;i++)
        {
            if(arr[i] <= k)
            {
                // int sum1= sum+arr[i];
                // System.out.println("sum : "+ arr[i]+"  "+sum);
                if(!output.isEmpty())
                    print_subset_k(arr,i+1,end,sum+arr[i],k,output+" "+arr[i]);
                else
                    print_subset_k(arr,i+1,end,sum+arr[i],k,output+arr[i]);                                    
            }
        }
    }
    public static void main(String[] args) {
        // int arr[]={5,12,3,17,1,18,15,3,17};
        // print_subset_k(arr,0,arr.length-1,0,6,"");
        int arr[]={5,2,5};
        print_subset_k(arr,0,2,0,9,"");
    }
}