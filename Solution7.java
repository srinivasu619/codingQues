import java.util.Scanner;
import java.util.ArrayList;
public class Solution7{
    public static String[] getCode(String number)
    {
        //System.out.println('a'+number+'a');
        if(number.length()==1)
        {
            //System.out.println(number);
            String code[] = new String[1];
            code[0] = (char)(96 + Integer.parseInt(number))+"";
            return code;
        }
        ArrayList<String> list = new ArrayList<>();
        String arr [] = getCode(number.substring(1));
        for(int i=0;i<arr.length;i++)
        {
            list.add((char)(96+number.charAt(0)-'0')+arr[i]);
        }
        int num = Integer.parseInt(number.substring(0,2));
        if(num>=1&&num<=26)
        {
            String rest=number.substring(2);
            if(rest.length()==0)
            {
                list.add((char)(96 +num)+"");
            }
            else
            {
                arr= getCode(rest);
                for(int i=0;i<arr.length;i++)
                {
                    list.add((char)(96 +num)+arr[i]);
                }
            }
        }
        arr = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        String arr[] = getCode("1123");
        for(String str:arr)
        {
            System.out.println(str);
        }
    }
}