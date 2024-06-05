package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int num = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        System.out.println("-----------------------funzione1 ----------------------");
        printList(num, list);
        System.out.println("-----------------------funzione2 ----------------------");

        mirrorList(list);
        System.out.println("-----------------------funzione3 ----------------------");

        Boolean(list, true);
        Boolean(list, false);
    }

    public static void printList(int num, List<Integer> list) {
        Random randomNumber = new Random();
        for (int i = 0; i < num; i++) {
            list.add(randomNumber.nextInt(0, 101));
        }
        System.out.println(list);
    }

    public static void mirrorList(List<Integer> list) {
        List<Integer> mirrorArrayList = new ArrayList<>(list);
        int num = list.size();
        for (int i = num - 1; i >= 0; i--) {
            mirrorArrayList.add(list.get(i));
        }
        System.out.println(mirrorArrayList);
    }

    public static void Boolean(List<Integer> list, boolean bool) {
        for (int i = 0; i < list.size(); i++) {
            if (bool) {

                if (list.get(i) % 2 == 0) {
                    System.out.println("pari " + list.get(i));
                }
            } else {
                System.out.println("dispari");
                System.out.println(list.get(i));
            }
        }
    }

}
