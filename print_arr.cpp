#include <iostream>
#include<string>
using namespace std;

void print_sub(int *arr,int index,string output)
{
	if(index == arr.size())
	{
		cout<< output<<endl;
		return;
	}
	print_sub(arr,index+1,output);
	print_sub(arr,index+1,output+to_string(arr[index]));
}

int main()
{
    int arr[] = {1,2,3};
	print_sub(arr,0,"a");
	return 0;
}
