package Strings;

public class FrequencyOfCharacter {

        public static void main(String[] args) {

            String text = "It was good to learn something.";
            char ch = 'o';


            int match = 0;

            // Access each character of string
            for (int i = 0; i < text.length(); ++i) {

                // Compare each character with the given character
                // If match is found, increase the match variable
                if (ch == text.charAt(i)) {
                    ++match;
                }
            }


            System.out.println("Frequency: " + match);
        }
    }

