public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        /*
        * Problem :
        * String = "Hello World"
        *
        * Output :
        * Vowels = 3
        * Consonants = 7
        *
        * and also space should not be counted
        * */

        String string = "Hello World";
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i <= string.length() - 1; i++){
            char ch = Character.toLowerCase(string.charAt(i)); // to avoid checking for capital A E I O U
            if (Character.isLetter(ch)){  // to avoid checking for blank spaces
                System.out.println("Checking Character : " + ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels Count : " + vowels);
        System.out.println("Consonants Count : " + consonants);
    }
}
