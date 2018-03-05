import java.util.Scanner;

public class forthTask {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Programa apskaiciuos jusu kuno mases indeksa :");



                System.out.print(" 1-Iveskite savo svoris a");
                double a = sc.nextDouble();
                System.out.print("2-Iveskite savo ugis b");
                double b = sc.nextDouble();
                double rezult = kmiS(a,b);
                System.out.println("Jusu KMI indeksas yra:" + rezult);





    }
        private static double kmiS ( double a, double b){
            double rezult1 = a / (b*b);
            return rezult1;
        }



}











