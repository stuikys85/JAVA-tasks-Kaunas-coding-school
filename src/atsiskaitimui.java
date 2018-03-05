import Utils.MyNumberUtils;

import java.util.Scanner;

public class atsiskaitimui {
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa atliekanti DALYBOS veiksmus");
        System.out.println("Iveskite du skaicius ir dalybos'/'  zenkla tarp ju: '10 / 10' ");
        String line = scanner.nextLine();
        String[] items = line.split(" ");


        if (items.length == 3)
        { menu(items, scanner);

        }

            else {
            System.out.println("Blogai ivestas formatas");
        }


    }

    private static void menu(String[] items, Scanner sc)

    {
        double numb = MyNumberUtils.getCorrectDouble(sc, items[0]);
        double numb1 = MyNumberUtils.getCorrectDouble(sc, items[2]);
        switch (items[1]) {
            case "/":
                sum(numb, numb1);
                break;
            default:
                System.out.println("Nera tokio veiksmo");

        }
    }

    private static void sum(double numb, double numb1) {
        double mySum = numb / numb1;
        System.out.println(" padalinus, suma yra :" + mySum);
    }

}