#include <iostream>
using namespace std;

long merge(int arr[],int start,int end)
{
    int mid = (start+end)/2,i=start,j=mid+1,temp[end-start],k=0;
    long count=0;
	while(i <= mid && j <=end)
	{
		if(arr[i]<arr[j])
		{
			temp[k] = arr[i];
			i++;
			k++;
		}
		else
		{
            temp[k] = arr[j];
            count+=mid-i+1;
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
	return count;
}
long merge_sort(int arr[],int start,int end)
{
	if(start >= end)
	{
		return 0;
	}
    int mid = (start+end)/2;
    long sum=0;
    sum+= merge_sort(arr,start,mid);
    //cout<<"left "<<sum<<endl;
    sum+= merge_sort(arr,mid+1,end);
    //cout<<"right "<<sum<<endl;
    sum+= merge(arr,start,end);
    //cout<<"merge "<<sum<<endl;
	return sum;
}
int main()
{
    int arr[]={5,4,3,2,1};
    cout<< merge_sort(arr,0,4);
}
