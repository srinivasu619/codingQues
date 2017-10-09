public class Solution1{
    public static boolean is_safe(int arr[][],int row,int col)
    {
        int i,j;
        // check up direction
        for(i=row;i>=0;i--)
        {
            if(arr[i][col] == 1)
                return false;
        }
        //check left diagonal
        for(i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(arr[i][j] == 1)
                return false;
        }
        //chech right diagonal
        for(i=row,j=col;i>=0 && j<arr.length;i--,j++)
        {
            if(arr[i][j] == 1)
                return false;
        }
        return true;
    }
    public static boolean n_queens(int arr[][],int row)
    {
        if(row == arr.length)
        {
            print(arr);
            System.out.println();
            return true;
        }
        for(int i=0;i<arr.length;i++)
        {
           // System.out.println(i);
            if(is_safe(arr,row,i))
            {
                arr[row][i] = 1;
                n_queens(arr,row+1);
                arr[row][i] = 0;
            }
        }
        return false;
    }
    public static void print(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr [][] =  new int[2][2];
        n_queens(arr,0);
    }
}