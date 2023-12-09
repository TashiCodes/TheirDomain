package org.logic;

public class ChatOperation {
    public static void clearChat() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static void printBorder() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printTitle(Game game) {
        int spaces = 56 / 2 - game.getName().length();

        System.out.println("╔══════════════════════════════════════════════════════╗");
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(game.getName());
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }
}
