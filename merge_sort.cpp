#include <iostream>
using namespace std;

void merge_sort(int arr[],int start,int end)
{
	if(start >= end)
	{
		return;
	}
	int mid = (start+end)/2;
	merge_sort(arr,start,mid);
	merge_sort(arr,mid+1,end);
	merge(arr,start,end);
}
void merge(int arr[],int start,int end)
{
	int mid = (start+end)/2,i=start,j=mid+1,temp[end-start],k=0;
	while(i <= mid && j <=end)
	{
		if(arr[i]<arr[j])
		{
			temp[k] = arr[i];
			i++;
			k++
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
}
int main()
{
	int arr [] = {6,5,4,3,2,1};
	for(int i=0;i<6;i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	merge_sort(arr,0,5);
	for(int i=0;i<6;i++)
	{
		cout<<arr[i]<<" ";
	}
}
