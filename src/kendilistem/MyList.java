package kendilistem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class  MyList<T>{
    public T[] Liste;
    int capacity;
    int pointerPosition;
    public MyList(Class<T> clazz) {
        Liste = (T[]) Array.newInstance(clazz, 10);
        pointerPosition=0;
    }

    public MyList(Class<T> clazz, int capacity){
        Liste = (T[]) Array.newInstance(clazz, capacity);
        pointerPosition=0;
    }
    public void add(T t){
        if(t!=null){
            if(pointerPosition<Liste.length){
                Liste[pointerPosition]=t;
                pointerPosition++;
            } else{
                Liste=Arrays.copyOf(Liste,Liste.length*2);
                add(t);
            }

        }
    }

    @Override
    public String toString() {
        return "Liste{" +
                "Liste=" + Arrays.toString(Liste) +
                '}';
    }
    public int size(){
        return pointerPosition;
    }
    public int getCapacity(){
        return Liste.length;
    }
}
