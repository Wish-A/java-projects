import java.util.Scanner;

public class rekenmachine {
    /* Deze applicatie zorgt ervoor dat de gebruiker twee getallen kan:
   -Optellen
   -Aftrekken
   -Vermenigvuldigen
   -Delen
   -Modulo
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Begroeten van de gebruiker en de opties weergeven voor de operators
        System.out.print("Welkom de rekenmachine! Wat is jouw naam?: ");
        String userName = input.nextLine();
        System.out.println("Beste " + userName + ", voer een geldige operator in om verder te gaan");
        System.out.println(" ");
        System.out.println("Je kunt kiezen uit diverse opties: " +
                "\n" + "Optellen-------------------> +" +
                "\n" + "Aftrekken------------------> -" +
                "\n" + "Vermenigvuldigen-----------> *" +
                "\n" + "Delen----------------------> /" +
                "\n" + "Modulo---------------------> %" +
                "\n" + "Stoppen--------------------> S");
        System.out.println("");
        System.out.print("Keuze: ");
        char chooseOperator;

        /*De operator wordt ingevuld, daarna wordt er gekeken of de operator klopt.
          Als de operator niet klopt, krijgt de gebruiker de gelegenheid om nog een keer in te voeren.
          Als er 'S' wordt ingetypt, stopt de applicatie.
         */
        do {
            chooseOperator = input.next().charAt(0);
            if (!isGeldigeOperator(chooseOperator)) {
                System.out.println(isGeldigeOperator(chooseOperator) + ", je hebt een ongeldige operator ingevoerd, probeer opnieuw!");
                System.out.println("");

            } else if (chooseOperator == 'S')  {
                //Applicatie stopt bij het invoeren van 'S'
                System.out.println("Programma gestopt! ");
            }
            else {
                //De gebruiker vragen om twee getallen in te voeren.
                System.out.println(isGeldigeOperator(chooseOperator) + ", voer twee getallen in ");
                System.out.print("Getal1: ");
                double eersteGetal = input.nextDouble();
                System.out.print("Getal2: ");
                double tweedeGetal = input.nextDouble();

                //Hier worden de twee gekozen getallen opgeteld, afgetrokken, gedeeld, vermenigvuldigd of modulo. Dit wordt gedaan in de methode printBerekening
                printBerekening(chooseOperator, eersteGetal, tweedeGetal);
            }
            System.out.println("");
            System.out.print("Keuze: ");
        } while (chooseOperator != 'S'); //Applicatie gaat door tot dat er een S wordt ingevoerd.
    }

    public static boolean isGeldigeOperator(char karakter) {
        //Als er een +, -, *, / of % wordt ingevoerd geeft deze methode 'true' terug. Anders geeft het false terug
        if (karakter == '+' || karakter == '-' || karakter == '*' || karakter == '/' || karakter == '%' || karakter == 'S') {
            return true;
        } else {
            return false;
        }
    }

    public static void printBerekening(char operator, double getal1, double getal2) {
        //Per operator hoort een berekening. Deze operator combineert de twee getallen door optellen, aftrekken, vermenigvuldigen, delen of modulo.
        switch (operator) {
            case '+':
                System.out.println(getal1 + " + " + getal2 + " = " + (getal1 + getal2));
                break;
            case '-':
                System.out.println(getal1 + " - " + getal2 + " = " + (getal1 - getal2));
                break;
            case '*':
                System.out.println(getal1 + " * " + getal2 + " = " + (getal1 * getal2));
                break;
            case '/':
                System.out.println(getal1 + " / " + getal2 + " = " + (getal1 / getal2));
                break;
            case '%':
                System.out.println(getal1 + " % " + getal2 + " = " + (getal1 % getal2));
                break;
        }
    }
}
