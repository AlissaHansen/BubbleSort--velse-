package com.company;

import java.util.List;

public class BubbleSortProg {

    public static <T extends Comparable<T>> void bubbleSort(T[] list){
    boolean performedAswap;
        for(int i = 0; i<list.length-1;i++){
            performedAswap=false;
            for (int j=0; j<list.length-1; j++){
                if (list[j].compareTo(list[j+1])>0){
                    T  temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    performedAswap=true;
                }
            }
            if (!performedAswap){
                System.out.println(" Left at iteration: "+ i);
                return;
            }
        }

    }
    public static <T extends Comparable<T>> void bubbleSort(List<T> list){

        for(int i = 0; i < list.size()-1; i++){

            for (int j = 0; j<list.size()-1-i; j++){
                if (list.get(j).compareTo(list.get(j+1)) > 0){
                    T temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1, temp);

                }

            }

        }
    }
}
