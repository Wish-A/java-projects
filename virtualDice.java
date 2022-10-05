import java.util.Scanner;

public class Dobbelsteen {
    /*
    Hier wordt aan de gebruiker gevraagd om een karakter te kiezen (char)
    waarmee willekeurig een getal gooit tot dat er zes is gegooid.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Alle variablen voor dit practicum.
        String Dobbel;
        int Random;
        char x;

        //Vragen aan de gebruiker om een symbool naar keuze in te vullen
        System.out.print("Fill in your symbol of preferance and push ENTER: ");

        //Dit is de command voor het invullen van symbool
        Dobbel = input.nextLine();

        //Het converteren van char naar String
        x = Dobbel.charAt(0);


        do {
            //Hier worden er een random hoeveelheid dobbels gegenereerd
            Random = (int) (1 + (Math.random() * (6)));
            //cases voor de mogelijke dobbels (1 t/m 6)

            switch (Random) {
                case 1:
                    System.out.printf("\n\t    %C\n\n\n\n\n", x);
                    break;
                case 2:
                    System.out.printf("\t%C\n\n\t\t%C\n\n", x, x);
                    break;
                case 3:
                    System.out.printf("%C\n    %C\n\t\t%C\n\n", x, x, x);
                    break;
                case 4:
                    System.out.printf("\t%C\t%C\n\n\t%C\t%C\n\n\n", x, x, x, x);
                    break;
                case 5:
                    System.out.printf("\t%C\t%C\n\t    %C\n\t%C\t%C\n\n", x, x, x, x, x);
                    break;
                case 6:
                    System.out.printf("\t%C\t%C\n\t%C\t%C\n\t%C\t%C\n\n", x, x, x, x, x, x);
                    break;
            }
            System.out.println("------------");
        } while (Random < 6);

    }

}