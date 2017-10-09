public class Solution {
    
        public static String removeConsecutiveDuplicates(String s) {
            // Write your code here
            if(s.length() == 1)
            {
              return s;
            }
              char start = s.charAt(0);
              int i=1;
              while(i<s.length())
            {
              if(s.charAt(i) != start)
              {
                break;
              }
              i++;
            }
              return start+removeConsecutiveDuplicates(s.substring(i));
        }
        public static void main(String[] args) {
            System.out.println(removeConsecutiveDuplicates("aabccba"));
        }
    
    }