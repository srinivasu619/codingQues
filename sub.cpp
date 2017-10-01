#include <iostream>
using namespace std;

int sub(string input,string output[])
{
	if(input == "")
	{
		output[0] = "";
		return 1;
	}
	int sublength =  sub(input.substr(1),output);
	for(int i=sublength;i<2*sublength;i++)
	{
		output[i] = input[0]+output[i-sublength];
	}
	return 2*sublength;
}
int main()
{
	string test = "abc";
	string output[100];
	int length = sub(test,output);
	for(int i=0;i<length;i++)
	{
		cout<<output[i]<<endl;
	}
	return 0;
}
