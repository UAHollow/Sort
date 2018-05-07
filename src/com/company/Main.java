package com.company;
 import java.util.*;

public class Main {
     public static class customComparator implements Comparator{
         @Override
         public int compare(Object o1, Object o2) {
             return o1.toString().compareToIgnoreCase(o2.toString());
         }
     }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new LinkedList<>();
        while (scanner.hasNextLine()) {
            inputs.add(scanner.nextLine().trim());
        }
        customComparator comp = new customComparator();
        inputs.sort(comp);
        for(String words:inputs) {
            System.out.println(words);
        }
    }

 }


