package maceraoyunu;

import java.util.Scanner;

public class Game {
    private Scanner sc= new Scanner(System.in);

    public void start(){

        System.out.print("Input your name:");
        String nameOfPlayer=sc.next();
        System.out.println(nameOfPlayer+ " Welcome to the Adventure Game !");
    }
}
