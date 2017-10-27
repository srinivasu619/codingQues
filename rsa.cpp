#include <iostream>
#include <stdlib.h>
#include <math.h>
using namespace std;
class Triplet{
public:
	int gcd;
	int x;
	int y;
};
int modRecursive(int a, int b, int c)
{
    if (b == 0)
    {
        return 1;
    }

    if (b % 2 == 0)
    {

        //Even
        return modRecursive((a * a) % c, b / 2, c);
    }
    else
    {
        // Odd
        return ((a % c) * (modRecursive((a * a) % c, b / 2, c))) % c;
    }
}
int primeNumber(int e)
{
    if (e == 1)
        return 0;
    int flag = 0;
    for (int i = 2; i <= sqrt(e); i++)
    {
        if (fmod(e, i) == 0)
        {
            flag = 1;
            break;
        }
    }
    if (flag == 0)
    {
        return 1;
    }
    return 0;
}
Triplet gcdExtendedEuclid(int a,int b){
	//Base Case
	if(b==0){
		Triplet myAns;
		myAns.gcd = a;
		myAns.x = 1;
		myAns.y = 0;
		return myAns;

	}
	Triplet smallAns = gcdExtendedEuclid(b,a%b);
	//Extended euclid says

	Triplet myAns;
	myAns.gcd = smallAns.gcd;
	myAns.x  = smallAns.y;
	myAns.y = (smallAns.x - ((a/b)*(smallAns.y)));
	return myAns;	
}
int modInverse(int A, int M)
{
    Triplet ans = gcdExtendedEuclid(A, M);
    return ans.x;
}
void rsa_algo(int p, int q, int plain_text)
{
    int n = p * q;
    int z = (p - 1) * (q - 1);
    int e, d = 1;
    while (1)
    {
        int random = rand() % z + 1;
        cout << "r " << random << endl;
        if (random % 2 != 0 &&primeNumber(random)&& z%random !=0)
        {
            e = random;
            break;
        }
    }
    // while (1)
    // {
    //     int inter = ((d % z) * (e % z)) % z;
    //     //cout<<inter<<endl;
    //     if (inter == 1)
    //     {
    //         break;
    //     }
    //     d++;
    // }
    cout << e << " and " << d << endl;
    int cipher = modRecursive(plain_text, e, n);
    cout << "Cipher: " << cipher << endl;
    int decrypt = modRecursive(cipher, d, n);
    cout << "Decrypt: " << decrypt << endl;
}
int main()
{

    rsa_algo(3, 11, 15);

    return 0;
}