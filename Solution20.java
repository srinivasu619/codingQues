import java.util.Scanner;
class Triad1{
    long gcd,x,y;
    Triad1(long gcd,long x,long y)
    {
        this.gcd = gcd;
        this.x = x;
        this.y = y;
    }
}
public class Solution20{
    public static Triad1 ext_euclid_algo(long a,long b)
    {
        if(a < b)
            {
                return ext_euclid_algo(b,a);
            }
        if(b==0)
            {
                return new Triad1(a,1,0);
            }
        Triad1 node = ext_euclid_algo(b,a%b);
        return new Triad1(node.gcd,node.y,(node.x-((a/b)*node.y)));
    }
    public static long gcd(long a,long b)
    {
        if(a < b)
            {
                return gcd(b,a);
            }
        if( b==0 )
            {
                return a;
            }
        return gcd(b,a%b);
    }
    public static long mmi(long a,long m)
    {
        long ans = ext_euclid_algo(a,m).x;
        return ((ans%m)+m)%m;
    }
    public static void main(String[] args) {
        //System.out.println(gcd(6,4));
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0;t<test;t++)
        {
          long a = sc.nextInt();
          long b = sc.nextInt();
          long d = sc.nextInt();
          long g = gcd(a,b);

        if(d==0)
            {
                System.out.println(1);
            }
        else
            {
                long y1 = ((d%a) * mmi(b,a))%a;
                if(d < b* y1)
                    {
                        System.out.println(0);
                        continue;
                    }
                long n = ((d/b)-y1)/a;
                System.out.println(n+1);
            }
        }
    }
}