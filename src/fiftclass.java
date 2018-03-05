import Utils.MyNumberUtils;

import java.util.Scanner;

public class fiftclass {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Programa apskaiciuos jusu kuro sanaudas :");



        System.out.print(" 1-Iveskite kiek sudege litru ");
        double a = MyNumberUtils.getCorrectNumberDouble(sc);
        System.out.print("2-Iveskite kiek nuvaziavote kilometru ");
        double b = MyNumberUtils.getCorrectNumberDouble((sc));
        double rezult = kursan(a,b);
        System.out.println("jusu kuro sanaudos 100 kilometru yra:" + rezult);





    }
    private static double kursan ( double a, double b){
        double rezult1 = (a* 100)/b;
        return rezult1;
    }



}

