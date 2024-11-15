package ru.demidov.task3;

// Интерфейс для маппинга
public interface Mapper1<T, P> {
    P map(T item);
}
