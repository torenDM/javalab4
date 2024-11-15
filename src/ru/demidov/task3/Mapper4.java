package ru.demidov.task3;

import java.util.Collection;
import java.util.List;

@FunctionalInterface
public interface Mapper4<T, P extends Collection<T>> {
    P apply(List<T> items);
}