#include <iostream>
using namespace std;

int merge(int arr[],int start,int end)
{
	int mid = (start+end)/2,i=start,j=mid+1,temp[end-start],k=0,sum=0;
	while(i <= mid && j <=end)
	{
		if(arr[i]<arr[j])
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
	while(i <= mid)
	{
		temp[k] = arr[i];
		i++;
		k++;
	}
	while(j <= end)
	{
		temp[k] = arr[j];
		j++;
		k++;
	}
	for(i=start ; i <= end ;i++)
	{
		arr[i] = temp[i-start];
	}
	return sum;
}
int merge_sort(int arr[],int start,int end)
{
	if(start >= end)
	{
		return 0;
	}
	int mid = (start+end)/2,sum=0;
	sum+= merge_sort(arr,start,mid);
	sum+= merge_sort(arr,mid+1,end);
	sum+= merge(arr,start,end);
	return sum;
}
int main()
{
    int test;
    cin>>test;
    for(int t=0;t<test;t++)
    {
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        cout<<"sum: "<<merge_sort(arr,0,n-1)<<endl;
    }
}
