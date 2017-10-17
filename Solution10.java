public class Solution10{
    public static void main(String[] args) {
        int n = 30;
        if(n == 1)
        {
          System.out.println(0);
          return;
        }
      	int count= 1;
      	for(int i=3;i<=n;i++)
        {
          boolean flag = true;
          for(int j=2;j<=Math.floor(java.lang.Math.sqrt(i));j++)
          {
            //System.out.println(i+" "+j);
            if(i%j == 0)
              {
                flag=false;
                break;
              }
          }
          if(flag)
            {
                System.out.println("Prime "+i);
                count++;
            }
        }
      	System.out.println(count);
    }
}