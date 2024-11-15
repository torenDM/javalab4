package ru.demidov.task3;

import java.util.ArrayList;
import java.util.List;

public class FilterMethods {
    public static <T> List<T> filter(List<T> list, Mapper2<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
