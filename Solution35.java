class Solver{
    public int recursive_coin_change(int arr[],int money,int start)
    {
        if(start == arr.length||money<0)
            return 0;
        if(money ==0)
            return 1;
        return recursive_coin_change(arr,money-arr[start],start)+recursive_coin_change(arr,money,start+1);
    }
}
public class Solution35{
    public static void main(String[] args) {
        int arr[] ={1,2};
        Solver solve = new Solver();
        System.out.println(solve.recursive_coin_change(arr,4,0));
    }
}