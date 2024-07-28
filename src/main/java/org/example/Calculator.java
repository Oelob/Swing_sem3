package org.example;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические
 * методы: sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 * Методы должны возвращать результат своей работы.
 */

public class Calculator {

//    private static Number a;
//    private static Number b;
//
//    public Calculator(Number a, Number b) {
//        this.a = a;
//        this.b = b;
//    }

    public static Number sum(Number a, Number b) {
        if (a instanceof Long | b instanceof Long) {
            return a.longValue() + b.longValue();
        } else if (a instanceof Float | b instanceof Float) {
            return a.floatValue() + b.floatValue();
        } else if (a instanceof Double | b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        } else {
            return a.intValue() + b.intValue();
        }
    }

    public static Number multiply(Number a, Number b) {
        if (a instanceof Long | b instanceof Long) {
            return a.longValue() * b.longValue();
        } else if (a instanceof Float | b instanceof Float) {
            return a.floatValue() * b.floatValue();
        } else if (a instanceof Double | b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        } else {
            return a.intValue() * b.intValue();
        }
    }

    public static Number divide(Number a, Number b) {

        if ((b instanceof Integer & b.intValue() == 0 ||
                b instanceof Long & b.longValue() == 0 ||
                b instanceof Float & b.floatValue() == 0 ||
                b instanceof Double & b.doubleValue() == 0)) {

            throw new RuntimeException("Делить на ноль нельзя");

        }

        if (a instanceof Long | b instanceof Long) {
            return a.longValue() / b.longValue();
        } else if (a instanceof Float | b instanceof Float) {
            return a.floatValue() / b.floatValue();
        } else if (a instanceof Double | b instanceof Double) {
            return a.doubleValue() / b.doubleValue();
        } else {
            return a.intValue() / b.intValue();
        }
    }

    public static Number subtract(Number a, Number b) {
        if (a instanceof Long | b instanceof Long) {
            return a.longValue() - b.longValue();
        } else if (a instanceof Float | b instanceof Float) {
            return a.floatValue() - b.floatValue();
        } else if (a instanceof Double | b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        } else {
            return a.intValue() - b.intValue();
        }
    }

}
