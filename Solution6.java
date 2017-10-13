public class Solution6{
    public static int merge(int arr[],int start,int end)
    {
        int sum = 0;
        int mid = (start+end)/2;
        int temp [] =new int[end-start];
        int i=start,j=mid+1,k=0;
        while (i<=mid && j<=end) {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                sum+=arr[i]*(end-j+1);
                i++;
                k++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(i=start;i<=end;i++)
        {
            arr[i] = temp[i-start];
        }
        return sum;
    }
    public static int spl_merge_sort(int arr[],int start,int end)
    {
        if(start >= end)
        {
            return 0;
        }
        int sum=0;
        int mid = (start+end)/2;
        sum += spl_merge_sort(arr,start,mid);
        sum += spl_merge_sort(arr,mid+1,end);
        sum += merge(arr,start,end);
        return sum;
    }
    public static void main(String[] args) {
        int arr[] ={2,6,5,7};
        System.out.println(spl_merge_sort(arr,0,arr.length-1));
    }
}