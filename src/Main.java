import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int auto;
        String[] marche = new String[auto];
        String[] modelllo = new String[auto];
        double[] prezzo = new double[auto];
        System.out.println("Quante auto vuoi aggiungere?");
        auto = in.nextInt();

        do {
            System.out.println("Premi 1 se vuoi aggiungere una macchina");
            System.out.println("Premi 2 se vuoi visualizzare le auto che hai inserito");
            System.out.println("Premi 3 se vuoi cercare un'auto inserendo marca e modello");
            System.out.println("Premi 4 se vuoi cancellare un'auto");
            System.out.println("Premi 5 se vuoi modificare i dati di un auto");
            System.out.println("Premi 6 se vuoi visualizzare le auto in ordine crescente");
            System.out.println("Premi 7 se vuoi visualizzare tutti i modelli disel");
            System.out.println("Premi 8 se vuoi uscire");
        } while ();
    }

}