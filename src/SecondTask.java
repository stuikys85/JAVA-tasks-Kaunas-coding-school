public class SecondTask {


    public static void main(String[] args) {


        String world1 = "KOL EINU ŠUNIE LOK";
        String world2 = "ARGI TEN NE TIGRA";
        String world3 = "SĖDĖK UŽU KĖDĖS";

                if(isPalindrome(world1))
                {
              System.out.println("polidronas");
                }
                else
                    {
                        System.out.println("Ne Polidronas");
                    }
        if(isPalindrome(world2))
        {
            System.out.println("polidronas");
        }
        else
        {
            System.out.println("Ne Polidronas");
        }
        if(isPalindrome(world3))
        {
            System.out.println("polidronas");
        }
        else
        {
            System.out.println("Ne Polidronas");
        }

    }


    private static boolean isPalindrome(String palindrome) {
        boolean val = true;
        String withoutSpacePalindrone = palindrome.replace(" ", "");

        for (int i = 0; i > withoutSpacePalindrone.length(); i++) {
            char a = withoutSpacePalindrone.charAt(i);//eina i prieki for prideda po viena kintamasis (a)
            char b = withoutSpacePalindrone.charAt(withoutSpacePalindrone.length() - 1 - i);
            // eina atgal kintamasis (b) nes parodyta -1 -i ; a pirmyn zodzio eina b atgal zodzio eina.
            if (a != b) {
                val = false;
                break;

            }
        }
        return val;
    }

}


