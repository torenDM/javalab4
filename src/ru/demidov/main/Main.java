package ru.demidov.main;

import ru.demidov.task1.*;
import ru.demidov.task2.*;
//import ru.demidov.task3.*;

import java.util.ArrayList;
import java.util.List;

import static ru.demidov.task1.Storage.getValueFromStorage;
import static ru.demidov.task2.PointBox.addPointToBox;

// Основной класс для тестирования
public class Main {
    public static void main(String[] args) {
        // Задача 1.1: Обобщенная коробка
        System.out.println("\nЗадача 1.1: Обобщенная коробка");
        Box<Integer> integerBox = new Box<>();         // Создаем коробку, которая может хранить целочисленные значения
        integerBox.put(3);         // Размещаем число 3 в коробке
        Integer value = integerBox.get();         // Извлекаем значение из коробки
        System.out.println("Извлеченное значение: " + value);         // Выводим значение на экран
        System.out.println("Коробка пустая? " + integerBox.isEmpty());         // Проверяем, пустая ли коробка

        try {         // Пробуем положить сразу два значения
            integerBox.put(3);
            integerBox.put(5); // Это должно вызвать исключение
        } catch (IllegalStateException e) {
            System.out.println("Перехваченная ошибка: " + e.getMessage());
        }

        // Задача 1.2: Без null
        System.out.println("\nЗадача 1.2: Без null");
        System.out.print("Хранилище чисел с <null>: ");
        Storage<Integer> numberStorageNull = new Storage<>(null);
        System.out.println(getValueFromStorage(numberStorageNull, 0)); // Ожидается 0
        System.out.print("Хранилище чисел с <99>: ");
        Storage<Integer> numberStorage99 = new Storage<>(99);
        System.out.println(getValueFromStorage(numberStorage99, -1)); // Ожидается 99
        System.out.print("Хранилище строк с <null>: ");
        Storage<String> stringStorageNull = new Storage<>(null);
        System.out.println(getValueFromStorage(stringStorageNull, "default")); // Ожидается "default"
        System.out.print("Хранилище строк с <hello>: ");
        Storage<String> stringStorageHello = new Storage<>("hello");
        System.out.println(getValueFromStorage(stringStorageHello, "hello world")); // Ожидается "hello"

        // Задача 2.3: Начало отсчета
        System.out.println("\nЗадача 2.3: Начало отсчета");
        Box<Point3D> pointBox = new Box<>();         // Создаем коробку для трехмерных точек
        Point3D point = new Point3D(1.0, 2.0, 3.0);         // Создаем трехмерную точку
        addPointToBox(pointBox, point);         // Добавляем точку в коробку
        System.out.println("Коробка: "+pointBox); // Проверяем содержимое коробки
        Point3D retrievedPoint = pointBox.get();         // Получаем точку из коробки и выводим ее
        System.out.print("Извлеченная точка: ");
        System.out.println(retrievedPoint); // Ожидается вывод: {1.0;2.0;3.0}
        try {         // Пробуем положить сразу два значения
            Point3D point1 = new Point3D(1.0, 2.0, 3.0);
            addPointToBox(pointBox, point1);
            Point3D point2 = new Point3D(1.0, 2.0, 3.0);
            addPointToBox(pointBox, point2);
        } catch (IllegalStateException e) {
            System.out.println("Перехваченная ошибка: " + e.getMessage());
        }

        // Задача 3.1: Функция
        System.out.println("\nЗадача 3.1: Функция");


        // Задача 3.2: Фильтр
        System.out.println("\nЗадача 3.2: Фильтр");

        // Задача 3.3: Сокращение
        System.out.println("\nЗадача 3.3: Сокращение");

        // Задача 3.4: Коллекционирование
        System.out.println("\nЗадача 3.4: Коллекционирование");
    }
}