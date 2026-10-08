
public class ReverseString {
    public static void main(String[] args) {
        /*Example :
        * String : Java
        * Output : avaJ
        *
        * J a v a
        * 0 1 2 3     ------> Java uses 0 based indexing
        *
        * To reverse the string we need to start from the last character and
        * move toward the first
        *
        * */

        String str = "Java";
        String reversed = "";
        //str.length() = 4    ---->> length() gives the number of characters
        System.out.println("Reversing a String without using reverse method (Using String Example)");
        for (int i = str.length() - 1; i >= 0; i--){
            //charAt(int index) is used to fetch character at a given index
            reversed = reversed + str.charAt(i);
            System.out.println(reversed);
        }
        System.out.println("Whole reversed String : " + reversed + "\n");
//--------------------------------------------------------------------------------------------------------------
        StringBuilder reversed1 = new StringBuilder();
        //str.length() = 4    ---->> length() gives the number of characters
        System.out.println("Reversing a String without using reverse method (Using StringBuilder Example)");
        for (int i = str.length() - 1; i >= 0; i--){
            //charAt(int index) is used to fetch character at a given index
            reversed1.append(str.charAt(i));
            System.out.println(reversed1);
        }
        System.out.println("Whole reversed String : " + reversed1 + "\n");
//--------------------------------------------------------------------------------------------------------------

        System.out.println("Reversing a String by using reverse method (Using StringBuilder Example)");
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println("Whole reversed String : " + reversedString);
    }
}
