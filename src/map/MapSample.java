package map;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map<String,String> countries= new HashMap<>();

        countries.put("TR", "Turkey");
        countries.put("GR", "Germany");
        countries.put("UK","United Kingdom");
        countries.put("UK", "England");
        countries.put("US", "United States");
        countries.put("FR", "France");

        System.out.println(countries);
        System.out.println(countries.size());
        System.out.println(countries.get("US"));
        for (String countriesKey: countries.keySet()) {
            System.out.print(countriesKey+",");
        }
        System.out.println("????????????????????????????");
        for (String countriesValues: countries.values()) {
            System.out.print(countriesValues+",");
        }
        System.out.println("=======================");
        for (String countriesKey: countries.keySet()) {
            System.out.print(countries.get(countriesKey));
        }

    }

}
