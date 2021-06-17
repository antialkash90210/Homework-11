package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {
        int N = 10;
        int mas[] = new int[N];
        int min;


        Scanner input = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            mas[i] = random.nextInt(100);
        }

        System.out.println("До сортировки: ");

        for (int i = 0; i < N; i++) {
            System.out.printf("%-5d", mas[i]);
        }

        System.out.println();

        for (int i = 0; i < N - 1; i++) {
            min = i;
            for (int j = i; j < N; j++) {
                if (mas[j] < mas[min]) {
                    min = j;


                }
                if (mas[min] != mas[i]) {

                    int temp;

                    temp=mas[min];
                    mas[min]=mas[i];
                    mas[i]=temp;


                }
            }
        }

        System.out.println("После сортировки: ");

        for (int i = 0; i < N; i++) {
            System.out.printf("%-5d", mas[i]);
        }


    }


}