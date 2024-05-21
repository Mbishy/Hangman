package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;



public class Main {
    public static void main(String[] args) {
        selectionWord();
    }

    public static void beginGame(){

    }

    public static void drawGallows(){

    }

    public static void turnUser(){

    }

    public static void selectionWord(){
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("list1.txt"))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(lines);
        System.out.println(lines.get(3));
    }

}