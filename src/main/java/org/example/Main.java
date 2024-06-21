package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.lang.Math;

import static java.lang.Math.random;


public class Main {

    public static String randomWorld;
    int errorPionts;

    public static void main(String[] args) {
        beginGame();
        selectionWord();
        hidingWorld(randomWorld);
    }

    public static void beginGame() {
        System.out.println("Добро пожаловать!");
        System.out.println("Для начала игры нажмите(y), для выхода из игры(e)");
        Scanner scanner = new Scanner(System.in);
        String button = scanner.nextLine();
        switch (button) {
            case "y":
                System.out.println("Начинаем новую игру");
                startGame();
                break;
            case "e":
                System.out.println("Выходим из игры");
                break;

            default:
                System.out.println("Вы ввели не тот символ");
        }

    }

    public static void drawGallows(int errorPoints) {
        switch (errorPoints) {
            case 0:
                System.out.println("\n------" +
                        "\n| " +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n~~~~~~~~\n");
                break;

            case 1:
                System.out.println("\n------" +
                        "\n|   | " +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n~~~~~~~~\n");
                break;

            case 2:
                System.out.println("\n------" +
                        "\n|   | " +
                        "\n|   0" +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n~~~~~~~~\n");
                break;

            case 3:
                System.out.println("\n------" +
                        "\n|   | " +
                        "\n|   0" +
                        "\n|  /|\\ " +
                        "\n|" +
                        "\n|" +
                        "\n|" +
                        "\n~~~~~~~~\n");
                break;

            case 4:
                System.out.println("\n------" +
                        "\n|   | " +
                        "\n|   0" +
                        "\n|  /|\\ " +
                        "\n|   |" +
                        "\n|" +
                        "\n|" +
                        "\n~~~~~~~~\n");
                break;

            case 5:
                System.out.println("\n------" +
                        "\n|   | " +
                        "\n|   0" +
                        "\n|  /|\\ " +
                        "\n|   |" +
                        "\n|  / \\ " +
                        "\n|" +
                        "\n~~~~~~~~\n");
                break;
        }
    }

    public static void turnUser() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите букву:");
        String simbol = userInput.nextLine();
    }

    public static void startGame(){
        turnUser();
    }

    public static void selectionWord() {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("list1.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        randomWorld = (lines.get((int) (Math.random() * lines.size())));

    }

    public static void hidingWorld(String randomWorld) {
        //System.out.println(randomWorld);
        StringBuilder mask = new StringBuilder();
        for (int i = 0; i < randomWorld.length(); i++){
            mask.append('*');
        }
        System.out.println(mask);
    }

}