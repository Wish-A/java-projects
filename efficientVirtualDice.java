import java.util.Scanner;

public class dobbelsteenVervolg {
    public static void main(String[] args) {
        /*Het doel van dit programma is om de main methode korter te maken door een method toe te voegen.
         */
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

        for (int i = 0; i <= 200 ; i++) {
            int worp = gooiDobbelsteen(i);
            System.out.println(worp);
            if ( i % 25 == 0) {
                System.out.println("");
            }
        }

    }
    public static int gooiDobbelsteen(int random){
       return random = (int) (1 + (Math.random() * (6)));
    }
    public static void toonDobbelsteen(int aantalOgen, char karakter) {

    }
}

