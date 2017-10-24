#include <bits/stdc++.h>
#include <unordered_map>
using namespace std;

int countPalindromes(string s)
{
	unordered_map<string, int> m;
	for (int i = 0; i < s.length(); i++) {
		for (int j = 0; j <= i; j++) {

			if (!s[i + j])
				break;

			if (s[i - j] == s[i + j]) {
				if ((i + j + 1) - (i - j) >= 1)
					m[s.substr(i - j, (i + j + 1) - (i - j))]++;

			} else
				break;
		}
		for (int j = 0; j <= i; j++) {
			if (!s[i + j + 1])
				break;
			if (s[i - j] == s[i + j + 1]) {
				if ((i + j + 2) - (i - j) > 1)
					m[s.substr(i - j, (i + j + 2) - (i - j))]++;

			} else
				break;
		}
	}
	int sum = 0; 
	for (auto it : m) 
        sum+=it.second;
	return sum;
}

// Driver code
int main()
{
    // 
    char s[]="abc";
    string t = s;
    cout<<s;
	return 0;
}
