package arrays;

public class changeIndex {
        public static void main(String[] args) {

            // Create double array
            int[] age = {24, 23, 18, 19, 20};

            // Change the value of second element
            age[1] = 28;

            // Change the value of fourth element
            age[3] = 21;

            // Access array using loop
            for (int index = 0; index < 5; ++index) {
                System.out.println(age[index]);
            }
        }
    }

