package ru.demidov.task3;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    public static <T, P> List<P> map(List<T> list, Mapper1<T, P> mapper) {
        List<P> result = new ArrayList<>();
        for (T item : list) {
            result.add(mapper.map(item));
        }
        return result;
    }
}