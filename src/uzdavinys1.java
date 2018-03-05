import java.util.Scanner;

public class uzdavinys1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // objekta nuskaito is konsoles
        String name = "";
        do {
            System.out.println("iveskite savo varda");
            name = sc.nextLine(); // nuskaito visa eilute ivesta vartotojo
            //String name = sc. next(); // nuskaito iki tarpo
            System.out.println("Jusu vardas yra" + name);
            int lenght = name.length();

            uzdavinys1 scannerExample = new uzdavinys1();
            int countChar = scannerExample.countChars(name);
            if (lenght % 2 == 0) {
                System.out.println("Ivestas skaicius " + name + " yra lyginis, ilgis" + name.length()
                        + lenght + "rasta raidziu" + countChar);

            } else {

                System.out.println("Ivestas zodis" + name + "Nelyginis, ilgis" + name.length()
                        + lenght + "rasta raidziu" + countChar);
            }
        } while (!name.equals("pabaiga"));
    }








// komentaras
    private int countChars(String name) {
        int numb = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == 'a' || letter == 'A') {
                numb++;

            }
        }
        return numb;
    }


}

