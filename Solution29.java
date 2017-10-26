public class Solution29{
    public static void is_strong(String test)
    {
        if(test.length() < 8)
            {
                System.out.println("password must be atleast 8 characters long");
                return;
            }
        else
            {
                int count[] = new int[3];
                for(int i=0;i<test.length();i++)
                    {
                        char code = test.charAt(i);
                        if((code >= 'A'&& code <='Z')||(code >='a' && code <= 'z'))
                            count[0] = 1;
                        if(code>='0'&&code<='9')
                            count[1] = 1;
                        else
                            count[2] = 1;
                    }
                int points = count[0]+count[1]+count[2];
                if(points == 1)
                    System.out.println("Poor Password");
                else if(points == 2)
                    System.out.println("Moderate Password");
                else
                    System.out.println("Strong Password");
            }
    }
    public static void main(String[] args) {
        is_strong("Mypass");
        is_strong("MyPassword");
        is_strong("MyPassword");
    }
}