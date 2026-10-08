public class CountCharacters {
    public static void main(String[] args) {
        /*
        * Problem :
        * String : "Programming"
        *
        * Count how many times each character occurs.
        * p = 1
        * r = 2
        * o = 1
        * g = 2
        * a = 1
        * m = 2
        * i = 1
        * n = 1
        *
        * Approach :
        * 1. Take one character. (Start from beginning)
        * 2. Check how many times that character occurs in the String.
        * 3. Print the character and its count.
        * 4. Avoid printing the same character repeatedly.
        *
        * Now There are two approaches to do it
        * Approach 1 — Using charAt() + indexOf()
        * Approach 1 - Using HashMap (Will cover later in HashMapPractice)
        *
        * */

        String string = "Programming Language";

        for (int i = 0; i <= string.length() - 1; i++){
            char ch = string.charAt(i);

            if (string.indexOf(ch) != i){
                continue;
            }

            int count = 0;
            for (int j = 0; j <= string.length() - 1; j++){
                if (string.charAt(j) == ch){
                    count++;
                }
            }
            System.out.println("[" + ch + "] character count : " + count);
        }
    }
}
