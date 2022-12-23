package kendilistem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class  MyList<T>{
    public T[] arr;
    public MyList(Class<T> clazz) {
        arr = (T[]) Array.newInstance(clazz, 10);
    }

    public MyList(Class<T> clazz, int capacity){
        arr = (T[]) Array.newInstance(clazz, capacity);
    }
    public void add(T t){
        if(t!=null){
            if(this.size()!=arr.length){
                arr[this.size()]=t;
            } else{
                T[] arr1= (T[]) Array.newInstance(arr.getClass(),arr.length);
                arr1=copy(arr,arr1);
                arr=null;
                arr=arr1;
                this.add(t);
            }

        }
    }

    private T[] copy(T[] arr, T[] arr1) {
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }

    @Override
    public String toString() {
        return "Liste{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
    public int size(){
        int numberOfElements=0;
        for (T tElement:this.arr) {
            if(tElement!=null){
                numberOfElements++;
            }
        }
        return numberOfElements;
    }
    public int getCapacity(){
        return arr.length;
    }
}
