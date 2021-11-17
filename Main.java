package com.learnup.lesson3;
import java.util.Random;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }
        System.out.println(Arrays.toString(array)); //исходный массив с рандомными значениями
        System.out.println(arraySum(array));    //сумма массива

        System.out.println((arraySum(array) % 2) == 0 ? "ЧЕТНО" : "НЕЧЕТНО"); //четность суммы массива
         
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


}













