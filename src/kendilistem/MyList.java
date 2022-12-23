package kendilistem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class  MyList<T extends Object>{
    T[] liste;
    T[] subListe;
    int capacity;
    int pointerPosition;

    public MyList() {
        liste = (T[]) Array.newInstance(Object.class, 10);
        pointerPosition=0;
    }

    public MyList( int capacity){
        liste = (T[]) Array.newInstance(Object.class, capacity);
        this.pointerPosition=0;
    }
    public String showList(T[] t){
        String str="";
        for (int i=0;i<t.length;i++) {
            if(t[i]!=null){
                str+=t[i];
                if(i!=t.length-1){
                    str+=",";
                }
            }

        }
        return "["
                + str +
                "]";
    }
    public T[] subList(int start, int end){
        this.subListe =  (T[]) Array.newInstance(Object.class, end-start);
        int p=0;
        for(int i=start; i<end;i++){
            subListe[p]=this.liste[i];
            p++;
        }
        return subListe;
    }
    public void clear(){
        for (T t:liste ) {
            t=null;
        }
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public int lastIndexOf(T t){
        int returnValue=-1;
        for (int i = 0; i <size() ; i++) {
            if(t.equals(liste[i])){
                returnValue=i;
            }
        }
        return returnValue;
    }

    public int indexOf(T t){
        for (int i = 0; i <size() ; i++) {
            if(t.equals(liste[i])){
                return i;
            }
        }
        return -1;
    }
    public String set(int index,T t){
        if(isValid(index)){
            liste[index]=t;
        }
        return null;
    }
    public String remove(int index){
        if(isValid(index)){
            for (int i = index; i <size() ; i++) {
                liste[i]=liste[i+1];
            }
            pointerPosition--;
            liste[size()]=null;
            return "";
        }
        return null;
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

    public T getIndex(int index){
        if(isValid(index)){
            return liste[index];
        }
        return null;
    }


    public String toString() {
        String str="";
        for (int i=0;i<size();i++) {
            if(liste[i]!=null){
                str+=liste[i];
                if(i!=size()-1){
                    str+=",";
                }
            }

        }
        return "["
                + str +
                "]";
    }
    public int size(){
        return pointerPosition;
    }
    public int getCapacity(){
        return liste.length;
    }
    public boolean isValid(int i){
        return (i>=0 && i<liste.length);
    }
}
