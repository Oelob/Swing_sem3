package org.example;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, 
 * если они одинаковые, и false в противном случае. 
 * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать 
 * элементы одного типа по парно по индексам.
 */
public class CompareArrays <T extends Object>{
    private boolean result = false;
    private T [] arr1;
    private T [] arr2;

    public CompareArrays(T[] arr1, T[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public <T> boolean compareArrays(){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length-1; i++) {
                if (arr1[i].equals(arr2[i])){
                    result = true;
                }
            }
        }
            return result;
    }
    
}
