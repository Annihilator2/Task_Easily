package com.example.task_1;

import java.util.ArrayList;
import java.util.List;

public class Evelon {
    public static void main(String[] args) {
        int start = 2000;// Границы поиска исходя из марки автомобиля
        int end = 6999;

        List<String> Cars = new ArrayList<>();//Список для номеров подходящих под условия
        for (int i = start; i <= end; i++) {
            if (i >= start && i <= end && i % 2 != 0) {//Условия занесения в список
                Cars.add(String.valueOf(i));// Занесение в список
            }
        }

        System.out.println("Number of vehicles matching the description: " + Cars.size());// Вывод длины списка (кол номеров)
        System.out.println("The numbers of these cars:");//Вывод всего списка
        for (String carNumber : Cars) {
            System.out.println(carNumber);
        }
    }
}