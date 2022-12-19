package maceraoyunu.gametools;

public class Tools {
    public static String bringClassName(Object o){
        return o.getClass().getName().toString().substring(o.getClass().getName().toString().lastIndexOf('.')+1);
    }
}
