class Solver{
    public int max_sum_subarr(int arr[])
    {
        int max=0,prev=0;
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i] > 0)
                    {
                        prev += arr[i];
                        if(prev > max)
                            {
                                max=prev;
                            }
                    }
                else{
                    prev = 0;
                }
            }
        return max;
    }
}
public class Solution36{
    public static void main(String[] args) {
        int arr[]= {-5,6,7,-20,3,5,8,-9};
        Solver solve = new Solver();
        System.out.println("max: "+solve.max_sum_subarr(arr));
    }
}