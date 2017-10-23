public class Solution22
{
    public static void print_sequence(int start,String output,int n)
    {
        if(n==0)
            {
                System.out.print(output+" ");
            }
        for(int i=start;i<=9;i++)
            {
                print_sequence(i+1,output+i,n-1);
            }
    }
    public static void printIncreasingNumber(int n) {
        print_sequence(1,"",3);
	}
    public static void main(String[] args) {
        print_sequence(1,"",3);
    }
}