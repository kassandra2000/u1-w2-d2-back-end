package entities;

import java.util.*;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int num = Integer.parseInt(sc.nextLine());

        Set<String> words = new HashSet<>();
        List<String> duplicatedWord = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("inserisci una parola ");
            String word = sc.nextLine();
            boolean add = words.add(word);
            if (!add) {
                System.out.println("parola duplicata");
                duplicatedWord.add(word);
            }
        }

        System.out.println("elenco parole "+words);
        System.out.println("elenco parole duplicate "+duplicatedWord);
        System.out.println("elenco parole ha "+words.size()+" parole");

        sc.close();
    }
}
