package kendilistem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class  MyList<T extends Object>{
    public T[] liste;
    int capacity;
    int pointerPosition;
    public MyList() {
        liste = (T[]) Array.newInstance(Object.class, 10);
        pointerPosition=0;
    }

    public MyList( int capacity){
        liste = (T[]) Array.newInstance(Object.class, capacity);
        pointerPosition=0;
    }
    public void add(T t){
        if(t!=null){
            if(pointerPosition<liste.length){
                liste[pointerPosition]=t;
                pointerPosition++;
            } else{
                liste=Arrays.copyOf(liste,liste.length*2);
                add(t);
            }

        }
    }

    @Override
    public String toString() {
        return "{" +
                "liste=" + Arrays.toString(liste) +
                '}';
    }
    public int size(){
        return pointerPosition;
    }
    public int getCapacity(){
        return liste.length;
    }
}
