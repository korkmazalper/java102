package enums;

import java.util.Arrays;

public class GunMain {
    public static void main(String[] args) {
        System.out.println(Gun.CARSAMBA.getDay());
        System.out.println(Day.PAZARTESI.getDay());
        System.out.println(Gun.CUMA);
        System.out.println(Day.PAZARTESI.name());
        Arrays.stream(Day.values()).forEachOrdered(x-> System.out.print(x));
    }
}
