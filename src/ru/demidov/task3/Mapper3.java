package ru.demidov.task3;

// Интерфейс для маппинга
public interface Mapper3<T> {
    T apply(T a, T b);
}
