package maceraoyunu.gametools;

public class Tools {
    public static String bringClassName(Object o){
        if(o!=null){
            return o.getClass().getName().toString().substring(o.getClass().getName().toString().lastIndexOf('.')+1);
        }
        return null;
    }
}
