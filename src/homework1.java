import java.util.Scanner;

public class homework1{



        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = in.nextInt();
            evenOdd(number);

        }

        public static String evenOdd(int n) {


            if (n % 2 == 0) {
                System.out.print("skaicius yra lyginis");
            } else {
                System.out.println("Skaicius nelyginis");
            }


            return null;
        }
    }
