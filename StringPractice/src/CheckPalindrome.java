
public class CheckPalindrome {
    public static void main(String[] args) {
        /*Example :
         * String : madam
         * Output : true
         *
         * Palindrome Examples //same when you read them from forward or backward
         * madam, level, radar
         *
         * Not Palindrome Examples
         * java, hello
         *
         *
         *There are two approaches :
         * Approach 1: Reverse the string
         * Steps
         * 1 - Take the original string
         * 2 - Reverse it
         * 3 - Compare the original and reversed strings
         *
         * Approach 2: Two pointers
         * Steps : compare the characters from the outside toward the middle
         *  m a d a m
         *  ↑       ↑
         *
         *  m a d a m
         *    ↑   ↑

         *  m a d a m
         *      ↑
         *
         * We only need to check
         * first == last
         * second == second-last .....
         * If any pair doesn't match → not a palindrome.
         * */

        //Approach 1 :
        String str = "madam";
        String reversed = "";
        System.out.println("\nApproach 1 : Reverse a String");

        for(int i = str.length() - 1; i >= 0; i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is it a palindrome ? : " + reversed.equals(str));


//------------------------------------------------------------------------------------------

        //Approach 2
        // We'll use two variables as we are using two pointers approach
        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        System.out.println("\nApproach 2 : Two Pointers");

        while(left < right){
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);

            System.out.println("Comparing Characters : " + leftChar + " and " + rightChar);

            if (leftChar != rightChar) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
