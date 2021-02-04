import java.util.Scanner;

public class StringProject2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter;
        boolean end = false;
        String input = "";
        String newString = " ";
        String newString2 = "";


        System.out.println("Welcome to the short hand message generator");

        while(!end) {
                //Ask for string
                System.out.println("Enter a phrase to receive the short hand message");
                input = sc.nextLine();
                newString = input + " "; //adds a space to beginning and end so that .contains can recognize better

                //Check for 'Q'
                if(input.equals("Q")) {
                    end = true;
                }

            if(!end) {
                //Do the replacment (without using .replace)
                //newString = input.replace("and ", "& ");
                if(input.contains(" and ") || input.contains("and ") || input.contains(" and") || input.contains("And ")) {
                    newString = "  " + input.substring(0, input.indexOf("and"))  + "&" + input.substring((input.indexOf("and") + 3), input.length()) + " ";
                }

                //newString = newString.replace("to ", "2 ");
                if(input.contains(" to ") || input.contains(" to") || input.contains("to ") || input.contains("To "))  {
                    newString = " " + newString.substring(0, newString.indexOf("to")) + "2" + newString.substring((newString.indexOf("to") + 2), newString.length()) + " ";
                    System.out.println("Test");
                }

                //newString = newString.replace("you ", "U ");
                if(input.contains(" you ") || input.contains("you ") || input.contains(" you") || input.contains("You "))  {
                    newString = " " + newString.substring(0, newString.indexOf("you")) + "U" + newString.substring((newString.indexOf("you") + 3), newString.length()) + " ";
                }

                //newString = newString.replace("for ", "4 ");
                if(input.contains(" for ") || input.contains("for ") || input.contains(" for") || input.contains("For ")) {
                    newString = " " + newString.substring(0, newString.indexOf("for")) + "4" + newString.substring((newString.indexOf("for") + 3), newString.length()) + " ";
                }


                for (int i = 0; i < newString.length(); i++) {
                    letter = newString.charAt(i);
                    //Check for vowels
                    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O') {
                        //just for the condition
                    } else {
                        newString2 = newString2 + letter;
                    }
                }

                System.out.println(newString2);


            }
        }

    }
}