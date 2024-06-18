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
        drawGallows(0);
        selectionWord();
        hidingWorld();
    }

    public static void beginGame() {
        System.out.println("Добро пожаловать!");
        System.out.println("Для начала игры нажмите(Н), для выхода из игры(В)");
        Scanner scanner = new Scanner(System.in);
        String button = scanner.nextLine();
        switch (button) {
            case "Н":
                System.out.println("Начинаем новую игру");
                break;

            case "В":
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

    public static void hidingWorld() {
        System.out.println(randomWorld);
    }

}