package Homeworks.L4HW_Classes_Intro_Prepelita_Natalia;

public class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;
        Help helpobj = new Help();

        for (;; ) {

            do {
                helpobj.showmenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!helpobj.isvalid(choice));

            if (choice == 'q') break;

            System.out.printf("\n");
            helpobj.helpon(choice);

        }

    }
}

