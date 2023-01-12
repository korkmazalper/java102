package abbreviationcreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class AbbreviationCreator {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Jenny");
        names.add("Emily");
        names.add("Human");
        names.add("Right");
        names.add("Record");
        names.add("Academy");
        names.add("Freedom");
        AtomicReference<String> firstLetters= new AtomicReference<>("");
        names.stream().map(x->x.charAt(0)).forEach(x-> {
            firstLetters.updateAndGet(v -> v + x);
        });
        System.out.println(firstLetters);

        System.out.println(createCombinations(firstLetters.toString()));


    }

    private static List<String> createCombinations(String firstLetters) {
        List<String> combinations=new ArrayList<>();
        List<String> c = new ArrayList<>();
        c=Arrays.asList(firstLetters.split(""));
        int sizeOfString=1;
        for (int i = 0; i < c.size(); i++) {
            combinations.addAll(createWords(c,i));
        }
        return combinations;
    }

    private static List<String> createWords(List<String> c, int i) {
        String s= c.get(i);
        List<String> createdWords=new ArrayList<>();

        for (int j = 0; j <c.size() ; j++) {
            if(i!=j){
                createdWords.add(s+c.get(j));
            }
        }
        return createdWords;
    }


}
