package entities;

import java.util.HashMap;
import java.util.Map;

public class Esercizio3 {
    public static void main(String[] args) {
        Map<String, Integer> tel = new HashMap<>();
        System.out.println("----------esercizio 1----------------");
        addKeyValue(tel, "marco", 345768909);
        addKeyValue(tel, "sonia", 375768401);
        addKeyValue(tel, "giovanni", 385758202);
        System.out.println(tel);
        System.out.println("-------------esercizio 2----------------");
        deleteKeyValue(tel, "marco");
        System.out.println(tel);
        System.out.println("-------------esercizio 3----------------");
        searchKeyValue(tel, 385758202);
        System.out.println("-------------esercizio 4----------------");
        searchKey(tel, "sonia");
        System.out.println("-------------esercizio 5----------------");
        print(tel);
    }

    public static void addKeyValue(Map<String, Integer> tel, String str, Integer num) {
        tel.put(str, num);
    }

    public static void deleteKeyValue(Map<String, Integer> tel, String str) {
        tel.remove(str);
    }

    public static void searchKeyValue(Map<String, Integer> tel, Integer num) {
        for (String name : tel.keySet()) {
            if (num.equals(tel.get(name))) {
                System.out.println("il contatto che cercavi è " + name + " = " + num);
            }
        }
    }

    public static void searchKey(Map<String, Integer> tel, String str) {
        System.out.println("il contatto che cercavi è " + str + " = " + tel.get(str));
    }

    public static void print(Map<String, Integer> tel) {
        System.out.println(tel);
    }
}
