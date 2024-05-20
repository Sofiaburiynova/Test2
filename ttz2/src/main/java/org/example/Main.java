package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла и его расширение. Пример: /Users/sofyaburianova/Desktop/numbers.txt:");
        String file_path = sc.next();

        // Считываем числа из файла
        List<Double> numbers = read_numbers(file_path);

        // Находим минимальное, максимальное число, сумму и произведение
        double min = _min(numbers);
        double max = _max(numbers);
        double sum = _sum(numbers);
        double mult = _mult(numbers);

        // Выводим результаты
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Произведение чисел: " + mult);
    }

    // Считывание чисел из файла
    public static List<Double> read_numbers(String filePath) {
        List<Double> numberList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextDouble()) {
                numberList.add(scanner.nextDouble());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        return numberList;
    }

    // функция поиска минимального числа
    public static double _min(List<Double> numbers) {
        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            min = Math.min(min, num);
        }
        return min;
    }

    // функция поиска максимального числа
    public static double _max(List<Double> numbers) {
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            max = Math.max(max, num);
        }
        return max;
    }

    // функция поиска суммы
   public static double _sum(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    // функция поиска произведения
    public static double _mult(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        double product = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            product *= numbers.get(i);
        }
        return product;
    }
}