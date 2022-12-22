package generics;

public class GenericPrintTest {
    public static void main(String[] args) {
        Integer[] i={1,3,4,5};
        GenericPrint<Integer[]> gti= new GenericPrint<>(i);
        print(i);
        String[] s={"Selma","Tank","Ninja"};
        print(s);
    }
    public static <T> void print(T[] t){
        for (T type: t) {
            System.out.println(type);
        }
    }
}
