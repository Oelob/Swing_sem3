package org.example;

import java.util.HashMap;
/**
 *Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 * Работу сдать в виде ссылки на гит репозиторий.
 * @param <T>
 * @param <E>
 */
public class Pair <T, E> {

    private final T first;
    private final E second;
    private HashMap<T, E> pair;


    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
        pair = new HashMap<>();
        pair.put(first, second);

    }

    public T getFirst() {

        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        String res = "[ " + getFirst().toString() + " : " + getSecond().toString() + " ]";
        return  res;
    }
}
