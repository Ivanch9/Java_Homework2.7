package com.company;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Vvedite stroky: ");
        str = input.nextLine();
        String[] words = str.split(" ");
        //for (String word : words) {
        //    System.out.println(word);
        //}
        HashSet<String> myHashSet = new HashSet<>();
        for (String word : words) {
            myHashSet.add(word);
        }
        for (String word : myHashSet) {
            int kolvo = 0;
            for(int i = 0; i < words.length; i++) {
                if (word.equals(words[i])) kolvo++;
            }
            System.out.println(word + " : " + kolvo);
        }
    }
}
