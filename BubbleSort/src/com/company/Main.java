package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    

    public static void main(String[] args) {
        Integer intarr[] = {10, 7, 8, 1, 5, 4, 3, 2, 9, 6};
        List<String> StringNames = new ArrayList<String>();
        StringNames.add("Alexander");
        StringNames.add("Alissa");
        StringNames.add("Misser");
        StringNames.add("Klumper");
        StringNames.add("Chloe");
        StringNames.add("Alice");
        List<Integer> IntegerList = new ArrayList<Integer>();
        IntegerList.add(10);
        IntegerList.add(6);
        IntegerList.add(7);
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(8);
        IntegerList.add(3);
        IntegerList.add(5);
        IntegerList.add(9);


        BubbleSortProg.bubbleSort(intarr);
        // Print out sortedList
        System.out.println("Printing intarr");
        for (int i = 0; i < intarr.length; i++) {
            System.out.println("Item " + i + " is " + intarr[i]);
        }
        BubbleSortProg.bubbleSort(StringNames);
        System.out.println("Printing StringNames");
        for (String s : StringNames) {
            System.out.println(s);
        }

        // Print out sortedList

        BubbleSortProg.bubbleSort(IntegerList);
        // Print out sortedList

        for (Integer j : IntegerList) {
            System.out.println(j);
        }

        List<Student> StudentList = new ArrayList<Student>();
        StudentList.add(new Student("Alissa", 22, "F"));
        StudentList.add(new Student("Alexander", 21, "M"));
        StudentList.add(new Student("Klumber", 11, "M"));
        StudentList.add(new Student("Chloe", 32, "F"));


        StudentList.sort(new AgeComparator());
        for (Student s : StudentList) {
            System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getSex());
        }
    }

    static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getAge() > o2.getAge())
                return 1;
            if (o1.getAge() < o2.getAge())
                return -1;
            return 0;
        }
    }
}