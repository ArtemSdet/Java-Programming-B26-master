package day06_05_16_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class P03_RemoveAllTheZeroToEnd {
    /*
    Write a program that can move all the zeros to the end of the List of integers
    input: [0, 2, 0, 0, 0, 3, 4, 5]
    output: [2, 3, 4, 5, 0, 0, 0, 0]
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 2, 2, 0, 0, 0, 3, 4, 5));
        int number = 0 ;

        System.out.println(moveToEnd(list, number));

    }
    public static ArrayList<Integer> moveToEnd(ArrayList<Integer> list, Integer number){

        int originalSize = list.size();

        list.removeIf(zero -> zero == number);

        //list.removeAll(Arrays.asList(number));

        int newSize = list.size();

        int totalNumOfRemoved = originalSize - newSize ;

        for (int i = 0; i < totalNumOfRemoved; i++) {
            list.add(number);
        }
        return list;
    }
}
