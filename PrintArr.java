/**
 * PrintArr
 */
public class PrintArr {
    public static void printSubsets(int input[],int index,String output) {
		// Write your code here
        if(index == input.length)
        {
            System.out.println(output);
            return;
        }
        printSubsets(input,index+1,output);
        printSubsets(input,index+1,output+" "+input[index]);
    }
    public static void main(String[] args) {
        int arr[] = {15,20,12};
        printSubsets(arr,0,"");
    }
}