import java.util.Scanner;
import java.lang.Character;

public class PigLatin {
    public static void main(String[] args) {
        int vowel, end;
        int x = 0;
        char firstLetter;
        String word, newWord = " ", reverseWord = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to convert to pig latin");
        word = sc.next();
        firstLetter = word.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            vowel = word.charAt(i);

            if ((vowel == 'a' || vowel == 'e' || vowel == 'o' || vowel == 'i' || vowel == 'u') && x == 0) {
                if (i == 0) {
                    newWord = word + "way";
                    x++;
                }
                else if(vowel == 'u' && word.charAt(i - 1) == 'q') {
                    newWord = word.substring(i, word.length()) + (word.substring(0, i + 1)) + "ay";
                }
                else {
                    newWord = word.substring(i, word.length()) + (word.substring(0, i)) + "ay";
                    x++;
                }



            }


        }
        if(x == 0) {
            System.out.println("invalid");
        }
        else {
            if(Character.isUpperCase(firstLetter)) {
                System.out.println(newWord.substring(0, 1).toUpperCase() + newWord.substring(1, newWord.length()).toLowerCase());
            }
            else {
                System.out.println(newWord);
            }
        }

        //Extra Creidt
//        if(x == 0) {
//            System.out.println("invalid");
//        }
//        else {
//            if(Character.isUpperCase(firstLetter)) {
//                for(int i = newWord.length(); i >= 0; i++) {
//                    if(i == 0) {
//                        reverseWord = reverseWord + newWord.charAt(i - 1);
//                        reverseWord.toUpperCase();
//                    }
//                    else {
//                        reverseWord = reverseWord + newWord.charAt(i - 1);
//                    }
//                }
//            }
//            else {
//                for(int i = newWord.length(); i >= 0; i++) {
//                    reverseWord = reverseWord + newWord.charAt(i - 1);
//                }
//            }
//        }
//
//        System.out.println(reverseWord);


    }
}