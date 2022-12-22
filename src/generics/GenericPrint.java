package generics;

import java.util.Arrays;

public class GenericPrint <T>{
    private T value;
    public GenericPrint() {
    }
    public GenericPrint(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
    public static <T> void print(T[] t){
        for (T type: t) {
            System.out.println(type);
        }
    }
}
