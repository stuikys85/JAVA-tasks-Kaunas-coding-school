import Utils.homeWorkCollections3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {




        public static void main (String[]args)
        {
            List<homeWorkCollections3> persons = new ArrayList<>();
            homeWorkCollections3 person = new homeWorkCollections3("Andrius", "Baltrunas",22, "Kaunas");
            persons.add(person);
            persons.add(new homeWorkCollections3 ("Tadas", "Tramp",32, "Vilnius"));



            for(homeWorkCollections3 p : persons){
                System.out.println(p.getName());
            }




        }
    }

