import Utils.MyNumberUtils;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class sixtTask
{
    public static void main (String[]args)

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bazinis skaiciuotuvas");
        System.out.println("Iveskite du skaicius ir veiksma tarp ju: '10 +10' ");
        String line = scanner.nextLine();
        // 10_+_10 ivedimas turetu atrodyti taip!!!
        String[] items = line.split(" "); // padalina stringa padaliam line split panaikina tarpus.
        if (items.length==3)
        {
         menu(items, scanner);
        }
        else
            {
                System.out.println("Blogai ivestas formatas");
        }
    }
    private static void menu (String[]items, Scanner sc )// metodas kuriame bus switch ir kvies sumas dalybas ir tt.

    {
        double numb = MyNumberUtils.getCorrectDouble(sc, items[0]);
        double numb1 = MyNumberUtils.getCorrectDouble(sc, items[2]);
      switch(items[1])
      {
          case "+":
              sum(numb, numb1);
          break;
          case "-":
              sum1(numb, numb1);
          break;
          case "*":
              sum2(numb, numb1);
              break;
          case "/":
              sum3(numb, numb1);
              break;
          case "^":
              sum4(numb, numb1);
              break;
          default:
              System.out.println("Nera tokio veiksmo");

      }
    }
    private static void sum(double numb, double numb1){
        double mySum = numb + numb1;
        System.out.println("suma yra :"+ mySum);
    }
    private static void sum1(double numb, double numb1) {
        double mySum1 = numb - numb1;
        System.out.println("suma yra :" + mySum1);
    }
    private static void sum2(double numb, double numb1) {
        double mySum2 = numb * numb1;
        System.out.println("suma yra :" + mySum2);
    }
    private static void sum3(double numb, double numb1) {
        double mySum3 = numb / numb1;
        System.out.println("suma yra :" + mySum3);
    }
    private static void sum4(double numb, double numb1) {
        double mySum4 = numb*numb;
        System.out.println("suma yra :" + mySum4);

    }


}
