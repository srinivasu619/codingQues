#include <iostream>
using namespace std;

string keypad_strings(int number)
{
	string key[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	return key[number];
}
void print_keypad(string input,string output)
{
	if(input.size()==0)
	{
		cout<<output<<endl;
		return;
	}
	string temp = keypad_strings(input[0]-'2');
	for(int i=0;i<temp.size();i++)
	{
		print_keypad(input.substr(1),output+temp[i]);
	}
}
int main()
{
	print_keypad("23","");
}
