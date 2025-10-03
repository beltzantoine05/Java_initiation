package pgcd;

public class pgcd {
    public static int CalculerPGCD(int a , int b) {
        // Algortithme d'Euclide
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Vérification du format des arguments
        System.out.println(args);
        if (args.length != 2) {
            System.err.println("Usage: java PGCD <nombre1> <nombre2>");
            System.exit(1);
        }
        // Conversion des arguments en type entier
        int nombre1 = Integer.parseInt(args[0]);
        int nombre2 = Integer.parseInt(args[1]);

        // Calcul final du PGCD et affichage
        int résultat = CalculerPGCD(nombre1,nombre2);
        System.out.println(résultat);
    }
}
