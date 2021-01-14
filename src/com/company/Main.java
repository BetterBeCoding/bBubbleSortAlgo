package com.company;

import java.util.*;

public class Main {
    static int a[] =new int[10] ;
    static boolean detailAnsicht = true;
    public static void main(String[] args) {
        bubbleSortAusgabe();
        }
    public static void bubbleSortAusgabe(){
        arrayRandomNumbers();
        leerZeile();
        System.out.println("Eingangswerte:");
        leerZeile();
        screenOutput();
        leerZeile();
        leerZeile();
        System.out.println("BubbleSort Algorithmus am Arbeiten:");
        bubbleSort(a);
        leerZeile();
        System.out.println("Fertig Sortiertes Array:");
        screenOutput();
    }
    public static void arrayRandomNumbers(){
        Random generator = new Random();
        for(int i=0;i<a.length; i++){
            a[i] = generator.nextInt(1000) + 1;
        }
    }

    public static void bubbleSort(int[] a ){
        boolean sorted=false;
        int temp;
        while(!sorted){
            sorted = true ;
            for(int i = 0; i <a.length -1;i++){
                if(a[i] > a[i+1]) {
                    if(detailAnsicht){
                        screenOutput();
                        leerZeile();
                    }
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static void screenOutput(){
        for(int i = 0; i < a.length  ;i++){
            System.out.print(a[i] + "|");
        }
    }
    public static void leerZeile(){
        System.out.println("");
    }
}
