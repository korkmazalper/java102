import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.
 * Take your input from System.in.
 *
 * Sample Input
 *
 * 5  <--- Number of lines
 * 5 41 77 74 22 44   <-- Number of entries and entries
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5         <-- number of queries
 * 1 3      <-- query 1
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 * Sample Output
 *
 * 74
 * 52
 * 37
 * ERROR!
 * ERROR!
 */
public class ArrayListHR {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numberOfLines=sc.nextInt();
        List<ArrayList<Integer>> lines=new ArrayList<>();
        int entry;
        int posx,posy;
        int numberOfEntries=0;
        for (int i = 0; i < numberOfLines; i++) {
            numberOfEntries=sc.nextInt();
            lines.add(new ArrayList<>(numberOfEntries));
            for (int j = 0; j < numberOfEntries; j++) {
                entry=sc.nextInt();
                lines.get(i).add(entry);
            }
        }
        int query=sc.nextInt();
        for (int i = 0; i <query ; i++) {
            posx=sc.nextInt()-1;
            posy=sc.nextInt()-1;
            if(posx<0 || posx>numberOfLines || posy<0 || posy>numberOfEntries){
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(posx).get(posy));
            }
        }
        /* the for loop given above is also correct but Hackerrank accepts only the following part*/
        for (int i = 0; i <query ; i++) {
            posx=sc.nextInt()-1;
            posy=sc.nextInt()-1;
            try{
                System.out.println(lines.get(posx).get(posy));
            }catch(Exception e){
                System.out.println("ERROR!");
            }

        }
    }
}
