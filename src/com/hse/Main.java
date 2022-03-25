package com.hse;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Ввод пользователем числа x
        int x = 0;
        System.out.println("Enter the 'x' value");
        while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                x = in.nextInt();
                break;
            } else {
                System.out.println("Error type!");
                in.next();
            }
        }
        System.out.println("Еhe value 'x' has been saved successfully");
        System.out.println("Enter collection elements or enter 'quit' to stop writing elements to the collection");
        // Ввод новых элементов и их добавление в исходную коллекцию
        LinkedList<Integer> originalList = new LinkedList<>();
        while (!in.hasNext("quit")) {
            if (in.hasNextInt()) {
                int newElem = in.nextInt();
                originalList.add(newElem);
            } else {
                System.out.println("Error type!");
                in.next();
            }
        }
        // Копирование исходной коллекции
        LinkedList<Integer> editedList = (LinkedList<Integer>) originalList.clone();
        // Изменение скопированной коллекции
        int index = 0;
        while (index < editedList.size()) {
            if (editedList.get(index) == x) editedList.remove(index);
            else index++;
        }
        // Вывод на экран исходной коллекции
        System.out.println("The original state of the array");
        for (Integer element : originalList) {
            System.out.print(element + " ");
        }
        System.out.println();
        // Вывод на экран измененной коллекции (без элементов, равных значению 'x')
        System.out.println("The final state of the array");
        for (Integer element : editedList) {
            System.out.print(element + " ");
        }
        System.out.println();
        in.close();
    }
}
