public class Solution5{
    public static void main(String args[])
    {
        String str = "helloworld";
        for(int i=0;i<str.length();i+=2)
        {
            String inter="";
            for(int j=i;j<i+2;j++)
            {
                inter+=str.charAt(j);
            }
            System.out.println(inter);
        }
    }
}