class Triad{
    int gcd,x,y;
    Triad(int gcd,int x,int y)
    {
        this.gcd = gcd;
        this.x = x;
        this.y = y;
    }
}
public class Solution19{
    public static Triad ext_euclid_algo(int a,int b)
    {
        if(a < b)
            {
                return ext_euclid_algo(b,a);
            }
        if(b==0)
            {
                return new Triad(a,1,0);
            }
        Triad node = ext_euclid_algo(b,a%b);
        return new Triad(node.gcd,node.y,(node.x-((a/b)*node.y)));
    }
    public static int gcd(int a,int b)
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
    public static void main(String[] args) {
        //System.out.println(gcd(6,4));
        Triad ans = ext_euclid_algo(16,10);
        System.out.println(ans.gcd+" "+ans.x+" "+ans.y);
    }
}