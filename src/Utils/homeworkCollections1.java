package Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class homeworkCollections1 {

    public static void main(String[]args) {



        List<String> names = new ArrayList<>();
        names.add("petras");
        names.add("Antanas");
        names.add("Vladas");
        names.add("Vycka");
        names.add("Vitalijus");
        System.out.println("Pirmas vardas yra:"+pirmasListoElementas(names));
        System.out.println("Paskutinis vardas yra:"+ paskutinisListoElementas(names));

        for (String name : names) {
            if (name.length() > 6) {
                System.out.println("Jusu vardas ilgesnis negu 6 simboliai" + name);
            }

        }
        Collections.sort(names);
        for(String name : names){
            System.out.println(names);
        }

    }
        public static String  pirmasListoElementas (List<String>names){
            String name  = names.get(0);
            return name;

            }
            public static String paskutinisListoElementas (List<String>names){
            String name1 = names.get (4);
            return name1;


            }






}
