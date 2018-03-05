package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyNumberUtils {

    private static int getCorrectNumber(Scanner sc) //
    {    int numb = 0;
        while (true) {
            System.out.println("Iveskite skaicius");
            try {
                sc.nextInt();
                numb = sc.nextInt();
                break;
            } catch (InputMismatchException e)
            {
                System.out.println("Juk sakiau ivesti skaiciu ");
                                sc.nextLine();
            }
        }
        return numb;
    }

    public static double getCorrectNumberDouble (Scanner sc){
        double numb = 0.0;
        while( true){
            System.out.println("Iveskite skaiciu");
            try {
                numb =sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("blogas skaicius");
                sc.nextLine();

            }
        }
        return numb;

    }
    public static double getCorrectDouble(Scanner sc, String numb)
    {double n = 0;
    try {
        n= Double.valueOf(numb);


    }catch(NumberFormatException e){
        System.out.println("Blogai ivestas skaicius pakartoti");
        n = getCorrectNumberDouble(sc);

    }
    return n;

    }
}