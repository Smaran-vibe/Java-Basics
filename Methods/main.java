package Methods;


    import java.util.Scanner;

    public class main {

        public static double calculateTotalAfterDiscount(double total) {
            double discountPercent = 10.0;

            if (total > 100) {
                double excess = total - 100;
                double discount = (discountPercent / 100) * excess;
                total = total - discount;
            }

            return total;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // For the first customer
            System.out.print("Total? ");
            double total = scanner.nextDouble();
            total = calculateTotalAfterDiscount(total);
            System.out.printf("The final amount to pay is: $%.2f\n", total);

            // For the second customer
            System.out.print("Total? ");
            total = scanner.nextDouble();
            total = calculateTotalAfterDiscount(total);
            System.out.printf("The final amount to pay is: $%.2f\n", total);
        }
    }

