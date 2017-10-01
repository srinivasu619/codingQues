#include <iostream>
using namespace std;

string keypad_strings(int number)
{
	string key[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	return key[number];
}
int keypad(string comb, string output[])
{
	if (comb.size() == 1)
	{
		//cout<<"Entered";
		string temp = keypad_strings(comb[0] - '2');
		//		cout<<"Entered :" << temp;
		for (int i = 0; i < temp.size(); i++)
		{
			output[i] = "";
			output[i] += temp[i];
		}
		return temp.size();
	}
	int sublength = keypad(comb.substr(1), output);
	//	cout<<"Sublength: "<<sublength;
	string pres = keypad_strings(comb[0] - '2');
	int k = sublength;
	for (int i = 0; i < pres.size() - 1; i++)
	{
		for (int j = 0; j < sublength; j++)
		{
			output[k] = output[j];
			k++;
		}
	}
	k = 0;
	for (int i = 0; i < pres.size(); i++)
	{
		for (int j = 0; j < sublength; j++)
		{
			output[k] = pres[i] + output[k];
			k++;
		}
	}
	return pres.size() * sublength;
}
int main()
{
	string output[100];
	string test;
	cin >> test;
	int length = keypad(test, output);
	for (int i = 0; i < length; i++)
	{
		cout << output[i] << endl;
	}
	return 0;
}
