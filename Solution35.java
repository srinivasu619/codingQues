class Solver{
    public int recursive_coin_change(int arr[],int money,int start)
    {
        if(start == arr.length||money<0)
            return 0;
        if(money ==0)
            return 1;
        return recursive_coin_change(arr,money-arr[start],start)+recursive_coin_change(arr,money,start+1);
    }
    public int coin_change(int arr[],int money,int start,int dp[][])
    {
        if(start == arr.length||money<0)
            return 0;
        if(money ==0)
            return 1;
        if(dp[money][arr.length - start] > -1)
            return dp[money][arr.length - start];
        dp[money][arr.length - start] = coin_change(arr,money-arr[start],start,dp)+coin_change(arr,money,start+1,dp);
        return dp[money][arr.length - start];
    }
}
public class Solution35{
    public static void main(String[] args) {
        int arr[] ={1,2};
        Solver solve = new Solver();
        int n=4;
        int dp[][]=new int[n+1][arr.length+1];
        for(int i=0;i<dp.length;i++)
            {
                for(int j=0;j<dp[0].length;j++)
                    {
                        dp[i][j] = -1;
                    }
            }
        System.out.println(solve.coin_change(arr,n,0,dp));
    }
}