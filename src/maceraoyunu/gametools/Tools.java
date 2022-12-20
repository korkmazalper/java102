package maceraoyunu.gametools;

import java.util.Random;

public class Tools {
    public static String bringClassName(Object o){
        if(o!=null){
            return o.getClass().getName().toString().substring(o.getClass().getName().toString().lastIndexOf('.')+1);
        }
        return null;
    }
    public static double chanceRandomizer(double min, double max){
        Random r= new Random();
        return min+r.nextDouble()*(max-min);
    }
}
