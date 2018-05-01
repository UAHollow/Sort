package com.company;
 import java.util.Comparator;
 import java.util.Scanner;
 import java.util.Arrays;

 public class Main {
     public static class customComparator implements Comparator{
         @Override
         public int compare(Object o1, Object o2) {
             return o1.toString().compareToIgnoreCase(o2.toString());
         }
     }
    public static void main(String[] args) {
        customComparator comp = new customComparator();
        Arrays.sort(args, comp);
        for(String i:args) {
            System.out.println(i);
        }
    }

 }


