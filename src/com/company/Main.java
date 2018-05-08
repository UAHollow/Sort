package com.company;
 import java.util.*;

public class Main {
     public static class ComparatorByIndex implements Comparator {
         int index;

         ComparatorByIndex(int index) {
             this.index = index;
         }

         @Override
         public int compare(Object o1, Object o2) {
             String string1 = o1.toString();
             String string2 = o2.toString();
             String[] substrings1 = string1.split(" ");
             String[] substrings2 = string2.split(" ");
             if (substrings1.length >= index && substrings2.length >= index) {
                int wordIdex = index-1;
                return substrings1[wordIdex].compareToIgnoreCase(substrings2[wordIdex]);
             }
             else if (substrings1.length < index) return 1;
             else return -1;
         }
     }

    public static void main(String[] args) {

         if (args.length == 0) {
            System.out.println("There is no arguments to work with. Bye!");
            return;
        }

        if (args.length > 1) {
            System.out.println("Only 1 argument pls");
            return;
        }

        int index;
        try{
           index  = Integer.parseInt(args[0].trim());
         }
        catch (NumberFormatException e) {
            System.out.println("fck u dude. Write number as an argument.");
            return;
        }

        if (index <= 0) {
            System.out.println("That wont work. Bye");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new LinkedList<>();
        while (scanner.hasNextLine()) {
            inputs.add(scanner.nextLine().trim());
        }
        ComparatorByIndex comp = new ComparatorByIndex(index);
            inputs.sort(comp);
            for (String words : inputs) {
                System.out.println(words);

        }
    }
 }


