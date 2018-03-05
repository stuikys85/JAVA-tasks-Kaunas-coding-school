package collection.exemples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples
{
    public static void main (String[]args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Andrius");
        names.add("Antanas");
        names.add("Petras");
        names.add(3, "Blala");

        for(int i = 0; i <names.size(); i ++)
        {
            System.out.println(names.get(i));
        }


        List<Integer> numbers = new LinkedList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(34);
        numbers.add(1);
        numbers.add(6);

        if (!numbers.isEmpty()){
            for(Integer numb : numbers){
                System.out.println(numb);
            }
        }

    }

}
