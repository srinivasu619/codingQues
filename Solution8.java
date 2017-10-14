public class Solution8{
    public static void print_codes(String input,String output)
    {
        if(input.length()==0)
        {
            System.out.println(output);
            return;
        }
        if(input.length()==1)
        {
            System.out.println((char)(96+Integer.parseInt(input))+output);
            return;
        }
        print_codes(input.substring(0,input.length()-1),(char)(96+(input.charAt(input.length()-1)-'0'))+output);
        int res = Integer.parseInt(input.substring(input.length()-2,input.length()));
        if(res >=1 && res<=26)
        {
            print_codes(input.substring(0,input.length()-2),(char)(res+96)+output);
        }
    }
    public static void main(String[] args) {
        print_codes("1123","");
    }
}