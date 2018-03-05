import java.util.InputMismatchException;
import java.util.Scanner;

public class thirdTask {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite Metoda plotam apskaiciuoti  nuo 1 iki 4 :");
        System.out.println("1-Trikampio plotas");
        System.out.println("2-Staciakampio plotas");
        System.out.println("3-Kvadrato plotas");
        System.out.println("4-Apskritimo plotas");
        int action =getCorrectNumber (sc);// nuskaito is konsoles ka parase ir pavercia i int(sukuria kintamaji)
        switch (action){

            case 1:
                System.out.println("Iveskite krastine a");//pirma salyga iveda pirma krastine.
                int a = getCorrectNumber(sc);//patikrina ka vartotojas ivede a
                System.out.println("Iveskite krastine b");//patikrina ka vartotojas ivede b
                int b = getCorrectNumber(sc);
                System.out.println("trikampio plotas yra"+ triagleS(a, b) );//isspauzdina rezultata
            break;
            case 2:
                System.out.println("Iveskite krastine a");
                int a1 = getCorrectNumber(sc);
                System.out.println("Iveskite krastine b");
                int b1 = getCorrectNumber(sc);
                System.out.println("trikampio plotas yra"+StaciakS (a1, b1) );

                break;
            case 3:
                System.out.println("Iveskite krastine a");
                int a2 = getCorrectNumber(sc);
                System.out.println("Iveskite krastine b");
                int b2 = getCorrectNumber(sc);
                System.out.println("trikampio plotas yra"+kvadratS (a2, b2) );
                break;
            case 4:
                System.out.println("Iveskite krastine a");
                int a3 = getCorrectNumber(sc);
                System.out.println("Iveskite krastine b");
                int b3 = getCorrectNumber(sc);
                System.out.println("trikampio plotas yra"+ApskritS (a3, b3) );
                break;
                default:
                    System.out.println("nera tokio veiksmo");
        }





    }
    private static double triagleS(int a, int b){//sukuria salygas kurias naudos nuskaitant a ir b
        double rezult1 = (a*b)/2;
        return rezult1;
    }
    private static double StaciakS(int a, int b){
        double rezult2 = a*b;
        return rezult2;
    }
    private static double kvadratS(int a, int b){
        double rezult3 = a^2;
        return rezult3;
    }
    private static double ApskritS (int a, int b){
        double pi = 3.1415;
        double rezult4 =pi*(a^2);
        return rezult4;
    }

 private static int getCorrectNumber(Scanner sc) // issikvieciam skaneri is virsaus
 {    int numb = 0;
      while (true) {
          System.out.println("Iveskite skaicius");
          try {
              sc.nextInt();
              numb = sc.nextInt();
              break;
          } catch (InputMismatchException e)
          {
              System.out.println("Juk sakiau kad ivesti skaiciu!!!!");
              sc.nextLine();
          }
      }
     return numb;
    }

    private static double getCorrectNumberDouble (Scanner sc){
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
}
