#include <iostream>
#include <string.h>
using namespace std;
void print_subset_k(int arr[],int start,int end,int sum,int k,string output)
{
    if(sum == k)
    {
        cout<<output<<endl;
        return;
    }
    if(start > end)
    {
        if(sum == k)
        {
            cout<<output<<endl;
            return;
        }
    }
    if(start == end)
    {
        if(arr[start]+sum == k)
        {
            cout<<output+" "+to_string(arr[start])<<endl;
            return;
        }
    }
    for(int i=start;i<=end;i++)
    {
        if(arr[i] <= k)
        {
            // int sum1= sum+arr[i];
            // System.out.println("sum : "+ arr[i]+"  "+sum);
            if(!output.length()==0)
                print_subset_k(arr,i+1,end,sum+arr[i],k,output+" "+to_string(arr[i]));
            else
                print_subset_k(arr,i+1,end,sum+arr[i],k,output+to_string(arr[i]));                                    
        }
    }
}
int main()
{
    int arr[]={5,12,3,17,1,18,15,3,17};
    print_subset_k(arr,0,8,0,6,"");
    arr={4,3,1};
    print_subset_k(arr,0,3,0,5,"");
    arr={14,17,17,2,20,3,16,14,2,14,15,4,13,8,15};
    print_subset_k(arr,0,14,0,2,"");
}