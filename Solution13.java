
public class Solution13{
    public static void print(int arr1[][])
    {
        for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr1[i].length;j++)
                    {
                        System.out.print(arr1[i][j]+" ");
                    }
                    System.out.println();
            }
    }
    public static int[][] find(int[] A, int currSum, int index, int sum,int[] solution) {
        if (currSum == sum) {
            //System.out.println("\nSum found");
            
            int count = 0;
            for (int i = 0; i < solution.length; i++) {
                if (solution[i] == 1) {
                    count++;
                }
            }
            int arr[][] =new int[1][count];
            int k=0;
            for (int i = 0; i < solution.length; i++) {
                if (solution[i] == 1) {
                    arr[0][k] = A[i];
                    k++;
                }
            }
            //print(arr);
            return arr;
        } 
        else if (index == A.length) {
            return null;
        } else {
            solution[index] = 1;// select the element
            currSum += A[index];
            int arr1[][] = find(A, currSum, index + 1, sum, solution);
            currSum -= A[index];	
            solution[index] = 0;// do not select the element
            int arr2[][] = find(A, currSum, index + 1, sum, solution);
            int arr[][]=null;
            if(arr1 != null && arr2!=null)
            {
                arr = new int[arr1.length+arr2.length][];
                int k=0;
                for(int i=0;i<arr1.length;i++)
                {
                    arr[k] = new int[arr1[i].length];
                    for(int j=0;j<arr1[i].length;j++)
                    {
                        arr[k][j] = arr1[i][j];
                    }
                    k++;
                }
                for(int i=0;i<arr2.length;i++)
                {
                    arr[k] = new int[arr2[i].length];
                    for(int j=0;j<arr2[i].length;j++)
                    {
                        arr[k][j] = arr2[i][j];
                    }
                    k++;
                }
            }
            else if(arr1!=null && arr2 == null)
            {
                arr=arr1;
            }
            else if(arr1==null&&arr2 != null)
            {
                arr=arr2;
            }
            else
            {
                arr = null;
            }
            return arr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,12,3,17,1,18,15,3,17};
        int solution[]=new int[arr.length];
        int arr1[][] = find(arr,0,0,6,solution);
        print(arr1);
        /*
        9 
5 12 3 17 1 18 15 3 17 
6
        */
    }
}