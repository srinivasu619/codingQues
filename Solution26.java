public class Solution26{
    public static long modExpo(long a,long b)
    {
        if(b == 0)
            return 1;
        if(b % 2 == 0)
            return modExpo((a*a)%1000000007,b/2);
        else
            return((a%1000000007)* modExpo((a*a)%1000000007,b/2))%1000000007;
    }
    public static void main(String[] args) {
        System.out.println(modExpo(2,5));
    }
}